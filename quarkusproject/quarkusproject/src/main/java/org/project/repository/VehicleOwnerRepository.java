package org.project.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.project.entity.VehicleOwner;

@ApplicationScoped
public class VehicleOwnerRepository implements PanacheRepository<VehicleOwner> {
    // Custom query methods can be added here
}