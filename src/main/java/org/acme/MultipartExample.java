package org.acme;

import java.io.InputStream;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.providers.multipart.PartType;

@Path("/v2")
@RegisterRestClient
public interface MultipartExample {


    @POST
    @Produces("multipart/mixed")
    @FormParam("file")
    @PartType(MediaType.APPLICATION_OCTET_STREAM)
    void put(InputStream data);

}