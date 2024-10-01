package org.project.controller;


import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.project.entity.VehicleOwner;
import org.project.service.VehicleOwnerService;
import java.util.List;


@Path("/vehicles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class VehicleController {


    @Inject VehicleOwnerService vehicleOwnerService;

    @GET
    public List<VehicleOwner> getAll() {
        return vehicleOwnerService.listAll();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id) {
        VehicleOwner owner = vehicleOwnerService.findById(id);
        if (owner == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(owner).build();
    }

    @POST
    @Transactional
    public Response create(VehicleOwner vehicleOwner) {
        vehicleOwnerService.persist(vehicleOwner);
        return Response.status(Response.Status.CREATED).entity(vehicleOwner).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response update(@PathParam("id") Long id, VehicleOwner vehicleOwner) {
        VehicleOwner existingOwner = vehicleOwnerService.findById(id);
        if (existingOwner == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        vehicleOwner.setId(id);  // Assuming you have a setter for ID
        vehicleOwnerService.update(vehicleOwner);
        return Response.ok(vehicleOwner).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        VehicleOwner existingOwner = vehicleOwnerService.findById(id);
        if (existingOwner == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        vehicleOwnerService.delete(existingOwner);
        return Response.noContent().build();
    }
}

