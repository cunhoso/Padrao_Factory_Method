package padroescriacao.factorymethod;

public class ServicoContrato implements IServico {

    public String executar() {
        return "Contrato efetivada";
    }

    public String cancelar() {
        return "Contrato cancelada";
    }
}