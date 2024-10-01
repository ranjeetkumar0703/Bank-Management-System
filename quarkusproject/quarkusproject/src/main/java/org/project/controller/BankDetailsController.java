package org.project.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.project.entity.BankDetails;
import org.project.service.BankDetailsService;

import java.util.List;

@Path("/bankDetails")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BankDetailsController {

    @Inject BankDetailsService bankDetailsService;

    @Inject
    BankDetailsService bankService;

    @GET
    @Path("/{bankAccountNumber}")
    public Response getBankDetails(@PathParam("bankAccountNumber") Long bankAccountNumber) {
        BankDetails bankDetails = bankService.fetchBankDetails(bankAccountNumber);

        if (bankDetails == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Bank details not found").build();
        }

        return Response.ok(bankDetails).build();
    }


    @GET
    public List<BankDetails> getAll() {
        return bankDetailsService.listAll();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id) {
        BankDetails bankDetails = bankDetailsService.findById(id);
        if (bankDetails == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(bankDetails).build();
    }

    @POST
    @Transactional
    public Response create(@Valid BankDetails bankDetails) {
        bankDetailsService.persist(bankDetails);
        return Response.status(Response.Status.CREATED).entity(bankDetails).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response update(@PathParam("id") Long id, @Valid BankDetails updatedDetails) {
        BankDetails existingDetails = bankDetailsService.findById(id);
        if (existingDetails == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        existingDetails.setId(updatedDetails.getId());
        existingDetails.setBankName(updatedDetails.getBankName());
        existingDetails.setIfscCode(updatedDetails.getIfscCode());
        existingDetails.setAccountHolderName(updatedDetails.getAccountHolderName());
        existingDetails.setBankAccountNumber(updatedDetails.getBankAccountNumber());
        existingDetails.setBalance(updatedDetails.getBalance());
        existingDetails.setBankEmail(updatedDetails.getBankEmail());
        return Response.ok(existingDetails).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        BankDetails bankDetails = bankDetailsService.findById(id);
        if (bankDetails == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        bankDetailsService.delete(bankDetails);
        return Response.noContent().build();
    }
}
