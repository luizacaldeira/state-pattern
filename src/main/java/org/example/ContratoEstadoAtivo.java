package org.example;

public class ContratoEstadoAtivo extends ContratoEstado {

    private ContratoEstadoAtivo() {};
    private static ContratoEstadoAtivo instance = new ContratoEstadoAtivo();
    public static ContratoEstadoAtivo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ativo";
    }

    public boolean suspender(Contrato contrato) {
        contrato.setEstado(ContratoEstadoSuspenso.getInstance());
        return true;
    }

    public boolean cancelar(Contrato contrato) {
        contrato.setEstado(ContratoEstadoCancelado.getInstance());
        return true;
    }
}