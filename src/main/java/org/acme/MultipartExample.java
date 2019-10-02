package org.acme;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

@Path("/v2")
@RegisterRestClient
public interface MultipartExample {

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    void put(@MultipartForm FormDataBean data);

}