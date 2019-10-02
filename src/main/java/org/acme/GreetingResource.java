package org.acme;

import java.io.ByteArrayInputStream;
import java.util.Collections;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInputImpl;

@Path("/hello")
public class GreetingResource {

    @Inject
    @RestClient
    MultipartExample example;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws Exception {
        FormDataBean bean = new FormDataBean();
        bean.setFile(new ByteArrayInputStream("HELLO WORLD".getBytes()));
        bean.setName("foo.txt");
        example.put(bean);

        return "hello";
    }
}