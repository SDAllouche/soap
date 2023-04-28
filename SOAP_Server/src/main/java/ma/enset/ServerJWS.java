package ma.enset;

import jakarta.xml.ws.Endpoint;
import ma.enset.ws.BanqueService;

public class ServerJWS {

    public static void main(String[] args) {

        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("The Web Service deployed in http://0.0.0.0:9191/");
    }
}
