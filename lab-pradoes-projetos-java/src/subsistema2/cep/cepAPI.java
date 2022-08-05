package subsistema2.cep;



public class cepAPI {

    private static cepAPI instancia = new cepAPI();

    private cepAPI(){
        super();
    }

    public static cepAPI getInstance(){
        return instancia;
    }


    public String recuperarCidade(String cep){
        return "Altamira";
    }
}
