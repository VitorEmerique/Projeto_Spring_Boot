package one.digitalinovation.gof.Facede;

import subsistema1.crm.CrmService;
import subsistema2.cep.cepAPI;

public class facede {
    public void migrarCliente(String nome, String cep){
        String cidade = cepAPI.getInstance().recuperarCidade(cep);
        String estado =cepAPI.getInstance().recuperarCidade(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
