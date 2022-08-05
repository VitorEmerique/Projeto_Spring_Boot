package subsistema1.crm;

public class CrmService {

    public CrmService() {
        super();
    }

    public static  void gravarCliente(String nome, String cep, String estado, String cidade){
        System.out.println("Cliente Salvo no Sistema Crm");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(estado);
        System.out.println(cidade);
    }

}
