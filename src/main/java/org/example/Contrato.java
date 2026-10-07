package org.example;

public class Contrato {

    private String numero;
    private ContratoEstado estado;

    public Contrato() {
        this.estado = ContratoEstadoPendente.getInstance();
    }

    public void setEstado(ContratoEstado estado) {
        this.estado = estado;
    }

    public boolean ativar() {
        return estado.ativar(this);
    }

    public boolean suspender() {
        return estado.suspender(this);
    }

    public boolean reativar() {
        return estado.reativar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ContratoEstado getEstado() {
        return estado;
    }
}