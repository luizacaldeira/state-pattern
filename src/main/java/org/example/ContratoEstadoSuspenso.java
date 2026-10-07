package org.example;

public class ContratoEstadoSuspenso extends ContratoEstado {

    private ContratoEstadoSuspenso() {};
    private static ContratoEstadoSuspenso instance = new ContratoEstadoSuspenso();
    public static ContratoEstadoSuspenso getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Suspenso";
    }

    public boolean reativar(Contrato contrato) {
        contrato.setEstado(ContratoEstadoAtivo.getInstance());
        return true;
    }

    public boolean cancelar(Contrato contrato) {
        contrato.setEstado(ContratoEstadoCancelado.getInstance());
        return true;
    }
}