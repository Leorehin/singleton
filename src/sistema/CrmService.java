package sistema;

public class CrmService {
    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente gravado no CRM");
        System.out.println(nome);
        System.out.println(cidade);
        System.out.println(estado);
    }

}
