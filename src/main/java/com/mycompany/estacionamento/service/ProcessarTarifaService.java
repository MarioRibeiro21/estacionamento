/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estacionamento.service;

import com.mycompany.estacionamento.CalculaTarifa.ICalculaTarifa;
import com.mycompany.estacionamento.CalculaTarifa.CalculaTarifaMoto;
import com.mycompany.estacionamento.CalculaTarifa.CalcularTarifaCarro;
import com.mycompany.estacionamento.model.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class ProcessarTarifaService {
    private ArrayList<ICalculaTarifa> metodos;

    public ProcessarTarifaService(ArrayList<ICalculaTarifa> metodos) {
          metodos = new ArrayList<>();
         this.metodos.add(new CalculaTarifaMoto());
         this.metodos.add(new CalcularTarifaCarro());
    }
    
    public void processarTarifa(Veiculo veiculo){
        for(ICalculaTarifa calculo: metodos){
            calculo.calcular(veiculo);
        }
    }
}
