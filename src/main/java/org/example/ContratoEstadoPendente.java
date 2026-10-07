package org.example;

public class ContratoEstadoPendente extends ContratoEstado {

    private ContratoEstadoPendente() {};
    private static ContratoEstadoPendente instance = new ContratoEstadoPendente();
    public static ContratoEstadoPendente getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pendente";
    }

    public boolean ativar(Contrato contrato) {
        contrato.setEstado(ContratoEstadoAtivo.getInstance());
        return true;
    }

    public boolean cancelar(Contrato contrato) {
        contrato.setEstado(ContratoEstadoCancelado.getInstance());
        return true;
    }
}