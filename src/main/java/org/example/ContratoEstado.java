package org.example;

public abstract class ContratoEstado {

    public abstract String getEstado();

    public boolean ativar(Contrato contrato) {
        return false;
    }

    public boolean suspender(Contrato contrato) {
        return false;
    }

    public boolean reativar(Contrato contrato) {
        return false;
    }

    public boolean cancelar(Contrato contrato) {
        return false;
    }
}