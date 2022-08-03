/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmootmizacaocaminhao;

import java.util.Scanner;

/**
 *
 * @author frizz
 */
public class OtimizaTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Veiculo caminhao = new Veiculo(2000);
        
        MaximizaLucro otimiza_transporte = new MaximizaLucro(caminhao);
        
        
        otimiza_transporte.otimizacaoSolucao();
        
    }
    
}
