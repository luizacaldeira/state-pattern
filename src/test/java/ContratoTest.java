import org.example.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContratoTest {

    Contrato contrato;

    @BeforeEach
    public void setUp() {
        contrato = new Contrato();
    }

    @Test
    public void deveAtivarContratoPendente() {
        contrato.setEstado(ContratoEstadoPendente.getInstance());
        assertTrue(contrato.ativar());
        assertEquals(ContratoEstadoAtivo.getInstance(), contrato.getEstado());
    }

    @Test
    public void naoDeveSuspenderContratoPendente() {
        contrato.setEstado(ContratoEstadoPendente.getInstance());
        assertFalse(contrato.suspender());
    }

    @Test
    public void naoDeveReativarContratoPendente() {
        contrato.setEstado(ContratoEstadoPendente.getInstance());
        assertFalse(contrato.reativar());
    }

    @Test
    public void deveCancelarContratoPendente() {
        contrato.setEstado(ContratoEstadoPendente.getInstance());
        assertTrue(contrato.cancelar());
        assertEquals(ContratoEstadoCancelado.getInstance(), contrato.getEstado());
    }

    @Test
    public void naoDeveAtivarContratoAtivo() {
        contrato.setEstado(ContratoEstadoAtivo.getInstance());
        assertFalse(contrato.ativar());
    }

    @Test
    public void deveSuspenderContratoAtivo() {
        contrato.setEstado(ContratoEstadoAtivo.getInstance());
        assertTrue(contrato.suspender());
        assertEquals(ContratoEstadoSuspenso.getInstance(), contrato.getEstado());
    }

    @Test
    public void naoDeveReativarContratoAtivo() {
        contrato.setEstado(ContratoEstadoAtivo.getInstance());
        assertFalse(contrato.reativar());
    }

    @Test
    public void deveCancelarContratoAtivo() {
        contrato.setEstado(ContratoEstadoAtivo.getInstance());
        assertTrue(contrato.cancelar());
        assertEquals(ContratoEstadoCancelado.getInstance(), contrato.getEstado());
    }

    @Test
    public void naoDeveAtivarContratoSuspenso() {
        contrato.setEstado(ContratoEstadoSuspenso.getInstance());
        assertFalse(contrato.ativar());
    }

    @Test
    public void naoDeveSuspenderContratoSuspenso() {
        contrato.setEstado(ContratoEstadoSuspenso.getInstance());
        assertFalse(contrato.suspender());
    }

    @Test
    public void deveReativarContratoSuspenso() {
        contrato.setEstado(ContratoEstadoSuspenso.getInstance());
        assertTrue(contrato.reativar());
        assertEquals(ContratoEstadoAtivo.getInstance(), contrato.getEstado());
    }

    @Test
    public void deveCancelarContratoSuspenso() {
        contrato.setEstado(ContratoEstadoSuspenso.getInstance());
        assertTrue(contrato.cancelar());
        assertEquals(ContratoEstadoCancelado.getInstance(), contrato.getEstado());
    }

    @Test
    public void naoDeveAtivarContratoCancelado() {
        contrato.setEstado(ContratoEstadoCancelado.getInstance());
        assertFalse(contrato.ativar());
    }

    @Test
    public void naoDeveSuspenderContratoCancelado() {
        contrato.setEstado(ContratoEstadoCancelado.getInstance());
        assertFalse(contrato.suspender());
    }

    @Test
    public void naoDeveReativarContratoCancelado() {
        contrato.setEstado(ContratoEstadoCancelado.getInstance());
        assertFalse(contrato.reativar());
    }

    @Test
    public void naoDeveCancelarContratoCancelado() {
        contrato.setEstado(ContratoEstadoCancelado.getInstance());
        assertFalse(contrato.cancelar());
    }
}