package de.ikarus.devops.tenants.service;


import de.ikarus.devops.tenants.model.Tenant;
import de.ikarus.devops.tenants.repository.TenantRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Niclas Wolff (n.wolff@micromata.de)
 */
@Service("default")
public class DefaultDeviceServiceImpl implements DeviceService {

  @Autowired
  private TenantRepository repository;

  @Override
  public List<Tenant> findAll() {

    List<Tenant> cities = (List<Tenant>) repository.findAll();

    return cities;
  }

  @Override
  public String greet(String name) {
    System.out.println("I am the default Tenant Service Impl");
    return String.format("Hello %s from Tenant Service Impl", name);
  }
}
