package org.quarkusgetdata;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.quarkusgetdata.Dto.BankDetailsDto;
import org.quarkusgetdata.Dto.VehicleResponseDto;
import org.quarkusgetdata.entity.VehicleOwner;
import org.quarkusgetdata.service.BankDetailsClient;
import org.quarkusgetdata.service.VehicleOwnerService;

@Path("/hello")
public class VehicleResource {
    @Inject VehicleOwnerService vehicleOwnerService;

    @Inject @RestClient BankDetailsClient bankDetailsClient;

    @GET
    @Path("/{vehicleNumber}")
    public Response getBankBalance(@PathParam("vehicleNumber") Integer vehicleNumber) {

        VehicleOwner vehicleOwner = vehicleOwnerService.findPersonalDetails(vehicleNumber);
        if (vehicleOwner == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Person not found for vehicle number: " + vehicleNumber).build();
        }

        Long bankAccountNumber = VehicleOwner.getbankAccountNumber();
        if (bankAccountNumber == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("No bank account associated with the person.").build();
        }
        // Fetch bank details using the bank account number
        BankDetailsDto bankDetails = bankDetailsClient.getBankDetailsByAccountNumber(bankAccountNumber);
        if (bankDetails == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("No bank details found for account number: " + bankAccountNumber).build();
        }

        // Create a response DTO with both person and bank details
        VehicleResponseDto responseDto = new VehicleResponseDto(VehicleOwner, bankDetails);
        return Response.ok(responseDto).build();
    }



    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";

    }
}
