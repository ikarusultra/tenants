package de.ikarus.devops.tenants.service;


import de.ikarus.devops.tenants.model.Tenant;
import java.util.List;

/**
 * @author Niclas Wolff (n.wolff@micromata.de)
 */
public interface DeviceService {
  List<Tenant> findAll();

  String greet(String name);
}
