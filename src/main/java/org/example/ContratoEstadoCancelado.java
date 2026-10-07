package org.example;

public class ContratoEstadoCancelado extends ContratoEstado {

    private ContratoEstadoCancelado() {};
    private static ContratoEstadoCancelado instance = new ContratoEstadoCancelado();
    public static ContratoEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }
}