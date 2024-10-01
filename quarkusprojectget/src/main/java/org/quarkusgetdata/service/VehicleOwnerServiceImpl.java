package org.quarkusgetdata.service;


import jakarta.inject.Inject;
import org.quarkusgetdata.entity.VehicleOwner;
import org.quarkusgetdata.repository.VehicleRepository;

public class VehicleOwnerServiceImpl implements VehicleOwnerService {

    @Inject VehicleRepository vehicleRepository;

    @Override
    public VehicleOwner findPersonalDetails(Integer vehicleNumber) {
        return vehicleRepository.findByVehicleNumber(vehicleNumber);
    }
}
