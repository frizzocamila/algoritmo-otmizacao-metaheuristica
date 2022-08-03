/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmootmizacaocaminhao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author frizz
 */
public class MaximizaLucro {
    private int[] solucao;
    private ArrayList<Objeto> listaDeObjetos;
    private Veiculo veiculo;

    public MaximizaLucro(Veiculo v) {
        this.veiculo = v; 
        
        Objeto obj1 = new Objeto(1, 400, 200);
        Objeto obj2 = new Objeto(2, 500, 200);
        Objeto obj3 = new Objeto(3, 700, 300);
        Objeto obj4 = new Objeto(4, 900, 400);
        Objeto obj5 = new Objeto(5, 600, 400);
        
        this.listaDeObjetos = new ArrayList<>();
        listaDeObjetos.add(obj1);
        listaDeObjetos.add(obj2);
        listaDeObjetos.add(obj3);
        listaDeObjetos.add(obj4);
        listaDeObjetos.add(obj5);
        
        this.solucao = new int[listaDeObjetos.size()];
        
        imprimirListaObjetos();
    }
    
    public void imprimirListaObjetos() {
        System.out.println("\nLista de Objetos:");
        for (int i = 0; i < this.listaDeObjetos.size(); i++) {
            System.out.print(" | " + listaDeObjetos.get(i).getId() + "(" + listaDeObjetos.get(i).getRelacaoLucroPeso() + ")");
        }
        System.out.println("\n");
    }
    
    public void imprimirVetorSolucao(){
        System.out.println("\nVetor solução:\n");
        System.out.println(Arrays.toString(solucao));
        /*System.out.print("[");
        for (int i = 0; i < listaDeObjetos.size(); i++) {
            System.out.print(solucao[i] + ",");
        }
        System.out.print("]");*/
    }
    
    public void lucroTotal(){
        double soma=0;
        for(int i=0; i<veiculo.getObjetos().size(); i++){
            soma += veiculo.getObjetos().get(i).getLucro();
        }
        System.out.println("\nLucro total = R$" + soma);
    }
    
    public void otimizacaoSolucao(){
        Collections.sort(listaDeObjetos,Comparator.comparingDouble(Objeto::getRelacaoLucroPeso));
        imprimirListaObjetos();
        int n= listaDeObjetos.size()-1;
        for(int i=n; i>=0; i--){
            if((veiculo.pesoTotalDosObjetosInseridos() + listaDeObjetos.get(i).getPeso()) <= veiculo.getCapacidade()){
                veiculo.inserirObjetoNoVeiculo(listaDeObjetos.get(i));
                solucao[listaDeObjetos.get(i).getId() - 1]=1;
            }            
        }
        
        veiculo.mostrarObjetosNoVeiculo();
        imprimirVetorSolucao();
        lucroTotal();
    }
    
}
