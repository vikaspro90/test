package com.jerseytest.main;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class TestClient {
    // We will make a request to http://www.omdbapi.com/?i=tt3896198&apikey=
    private Client client;
    public TestClient(){
        client = ClientBuilder.newClient();
    }
    public void getData(){
        WebTarget target = client.target("http://www.omdbapi.com/?i=tt3896198&apikey=");
        Response response = target.path("").request().get();
        System.out.println(response.readEntity(String.class));
    }

    public static void main(String[] args){
        TestClient tc = new TestClient();
        tc.getData();
    }
}