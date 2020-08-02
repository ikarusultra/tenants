FROM node:12 as frontend-builder

COPY ./ ./

WORKDIR frontend


RUN npm i

RUN npm run build


FROM maven:3.6-jdk-8 as builder

COPY --from=frontend-builder ./ ./

RUN mvn clean package -U -DskipTests

FROM openjdk:8

ENV TENANTS_SPRING_PROFILE default

EXPOSE 8080

WORKDIR /app


COPY --from=builder /target/tenants-0.0.1-SNAPSHOT.jar ./tenants.jar



CMD java -jar tenants.jar --spring.profiles.active=$TENANTS_SPRING_PROFILE


