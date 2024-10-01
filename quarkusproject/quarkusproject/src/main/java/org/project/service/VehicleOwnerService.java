package org.project.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.project.entity.VehicleOwner;
import org.project.repository.VehicleOwnerRepository;

import java.util.List;


@ApplicationScoped
public class VehicleOwnerService {

    @Inject VehicleOwnerRepository vehicleOwnerRepository;

    public List<VehicleOwner> listAll() {
        return vehicleOwnerRepository.listAll();
    }

    public VehicleOwner findById(Long id) {
        return vehicleOwnerRepository.findById(id);
    }

    @Transactional
    public void persist(VehicleOwner vehicleOwner) {
        vehicleOwnerRepository.persist(vehicleOwner);
    }

    @Transactional
    public void update(VehicleOwner vehicleOwner) {
        vehicleOwnerRepository.update(String.valueOf(vehicleOwner));
    }

    @Transactional
    public void delete(VehicleOwner vehicleOwner) {
        vehicleOwnerRepository.delete(vehicleOwner);
    }
}
