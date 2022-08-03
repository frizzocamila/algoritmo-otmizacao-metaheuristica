/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmootmizacaocaminhao;

import java.util.ArrayList;

/**
 *
 * @author frizz
 */
public class Veiculo {
    private double capacidade;
    private ArrayList<Objeto> objetos;

    public Veiculo() {
    }

    public Veiculo(double capacidade) {
        this.capacidade = capacidade;
        this.objetos = new ArrayList<>();
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<Objeto> objetos) {
        this.objetos = objetos;
    }
    
    public void inserirObjetoNoVeiculo(Objeto obj) {
        this.objetos.add(obj);
    }
    
    public void mostrarObjetosNoVeiculo(){
        System.out.println("\nLista de Objetos dentro do Veículo:");
        for (int i=0; i<this.objetos.size();i++){
            System.out.print(" | " + objetos.get(i).getId() + "(" + objetos.get(i).getRelacaoLucroPeso() + ")");
        }
        System.out.println("\n");
    }
    
    public double pesoTotalDosObjetosInseridos(){
        double pesoTotal = 0;
        for (int i=0; i<this.objetos.size();i++){
            pesoTotal += objetos.get(i).getPeso();
        }
        return pesoTotal;
    }
}
