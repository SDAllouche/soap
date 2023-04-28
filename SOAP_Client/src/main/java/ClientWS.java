import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

import java.util.List;

public class ClientWS {

    public static void main(String[] args) {
        BanqueService stub=new BanqueWs().getBanqueServicePort();
        System.out.println("Montant converti : "+stub.convert(100));
        Compte compte=stub.getCompt(5);
        System.out.println("Create Compte : ");
        System.out.println("\tId : "+compte.getId()+"\t|\tSolde : "+compte.getSolde());
        List<Compte> comptes=stub.compteList();
        System.out.println("Liste de comptes : ");
        int i=1;
        for (Compte c:comptes) {
            System.out.println("\tCompte "+i+" :");
            System.out.println("\t\tId : "+c.getId()+"\t|\tSolde : "+c.getSolde());
            i++;
        }

    }
}
