package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import padroescriacao.factorymethod.IServico;
import padroescriacao.factorymethod.ServicoFactory;

import static org.junit.jupiter.api.Assertions.*;

class ServicoContratoTest {

    @Test
    void deveExecutarContrato() {
        IServico servico = ServicoFactory.obterServico("Contrato");
        assertEquals("Contrato efetivada", servico.executar());
    }

    @Test
    void deveCancelarContrato() {
        IServico servico = ServicoFactory.obterServico("Contrato");
        assertEquals("Contrato cancelada", servico.cancelar());
    }

}