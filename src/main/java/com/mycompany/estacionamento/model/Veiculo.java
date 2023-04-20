/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estacionamento.model;

/**
 *
 * @author Mario
 */
public class Veiculo {
    private String tipo;
    private boolean clientePreferencia;
    private VagaEstacionamento vaga;

    public Veiculo(String tipo, boolean clientePreferencia, VagaEstacionamento vaga) {
        this.tipo = tipo;
        this.clientePreferencia = clientePreferencia;
        this.vaga = vaga;
    }

    public VagaEstacionamento getVaga() {
        return vaga;
    }

    public void setVaga(VagaEstacionamento vaga) {
        this.vaga = vaga;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isClientePreferencia() {
        return clientePreferencia;
    }

    public void setClientePreferencia(boolean clientePreferencia) {
        this.clientePreferencia = clientePreferencia;
    }
    
    
    
}
