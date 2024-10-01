package org.quarkusgetdata.service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.quarkusgetdata.Dto.BankDetailsDto;

@Path("/bank")
@RegisterRestClient(baseUri = "http://localhost:8080/bank")
public interface BankDetailsClient {
    @GET
    @Path("/{bankAccountNumber}")
    @Produces(MediaType.APPLICATION_JSON)
    BankDetailsDto getBankDetailsByAccountNumber(@PathParam("bankAccountNumber") Long bankAccountNumber);

}
