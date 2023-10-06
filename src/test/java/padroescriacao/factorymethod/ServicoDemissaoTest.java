package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDemissaoTest {

    @Test
    void deveExecutarDemissao() {
        IServico servico = ServicoFactory.obterServico("Demissao");
        assertEquals("Demissao efetivado", servico.executar());
    }

    @Test
    void deveCancelarDemissao() {
        IServico servico = ServicoFactory.obterServico("Demissao");
        assertEquals("Demissao cancelado", servico.cancelar());
    }

}