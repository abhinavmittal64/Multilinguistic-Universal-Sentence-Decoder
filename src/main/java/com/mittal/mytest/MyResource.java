package com.mittal.mytest;

import com.mittal.mytest.Model.MultilinguisticUniversalSentenceDecoder;
import com.mittal.mytest.Model.RequestPayload;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("Encoder")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String getScore(String input) {
        MultilinguisticUniversalSentenceDecoder multilinguisticUniversalSentenceDecoder= new MultilinguisticUniversalSentenceDecoder();
        String ans = multilinguisticUniversalSentenceDecoder.getScore(input);
        return "The score is : "+ans;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getScoreRunningPythonScript() {
        MultilinguisticUniversalSentenceDecoder multilinguisticUniversalSentenceDecoder= new MultilinguisticUniversalSentenceDecoder();
        multilinguisticUniversalSentenceDecoder.runScript();
        //TODO: Try it out.
        return "Done";
    }
}
