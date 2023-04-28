package ma.enset.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWs")
public class BanqueService {

    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "montant") double mt){
        return  mt*11.08;
    }

    @WebMethod
    public Compte getCompt(@WebParam(name = "code")int code){
        return new Compte(code,Math.random(),new Date());
    }

    @WebMethod
    public List<Compte> compteList(){
        return List.of(new Compte(1,Math.random(),new Date()),
        new Compte(2,Math.random(),new Date()),
        new Compte(3,Math.random(),new Date()));
    }

}
