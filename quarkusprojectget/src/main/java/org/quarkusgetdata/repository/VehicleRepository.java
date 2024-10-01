package org.quarkusgetdata.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.quarkusgetdata.entity.VehicleOwner;

public class VehicleRepository implements PanacheRepository<VehicleOwner> {

    public VehicleOwner findByVehicleNumber(Integer vehicleNumber) {
        System.out.println("Searching for vehicle number: " + vehicleNumber);
        return find("vehicleNumber", vehicleNumber).firstResult();
    }
}
