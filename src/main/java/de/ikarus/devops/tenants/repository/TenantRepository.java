package de.ikarus.devops.tenants.repository;


import de.ikarus.devops.tenants.model.Tenant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Niclas Wolff (n.wolff@micromata.de)
 */
@Repository
public interface TenantRepository extends CrudRepository<Tenant, Long> {

}
