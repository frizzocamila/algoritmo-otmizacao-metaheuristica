/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmootmizacaocaminhao;

/**
 *
 * @author frizz
 */
public class Objeto implements Comparable<Objeto>{
    
    private int id;
    private double peso;
    private double lucro;
    private double relacaoLucroPeso;

    public Objeto() {
    }

    public Objeto(int id, double peso, double lucro) {
        this.id = id;
        this.peso = peso;
        this.lucro = lucro;
        this.relacaoLucroPeso = this.lucro/this.peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getRelacaoLucroPeso() {
        return relacaoLucroPeso;
    }

    public void setRelacaoLucroPeso(double relacaoLucroPeso) {
        this.relacaoLucroPeso = relacaoLucroPeso;
    }

    @Override
    public int compareTo(Objeto o) {
        return id;
    }
}