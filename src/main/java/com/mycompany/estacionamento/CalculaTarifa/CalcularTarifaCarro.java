/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estacionamento.CalculaTarifa;

import com.mycompany.estacionamento.model.Veiculo;

/**
 *
 * @author Mario
 */
public class CalcularTarifaCarro implements ICalculaTarifa{

    @Override
    public void calcular(Veiculo veiculo) {
        if (veiculo.getTipo().equalsIgnoreCase("carro")) {
            if (veiculo.getVaga().getHora() == 4) {
                veiculo.getVaga().setValorTarifa(5.0);
            } else if (veiculo.getVaga().getHora() >= 5 && veiculo.getVaga().getHora() <= 12) {
                veiculo.getVaga().setValorTarifa(20.0);
            } else if (veiculo.getVaga().getHora() >= 13 && veiculo.getVaga().getHora() <= 24) {
                veiculo.getVaga().setValorTarifa(40.0);
            }

            if (veiculo.isClientePreferencia()) {
                veiculo.getVaga().setValorTarifa(veiculo.getVaga().getValorTarifa() * 0.3);
            }
        }
    }
    
}
