package padroescriacao.factorymethod;

public class ServicoDemissao implements IServico {

    public String executar() {
        return "Demissao efetivado";
    }

    public String cancelar() {
        return "Demissao cancelado";
    }
}