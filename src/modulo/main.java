/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

/**
 *
 * @author Josue
 */
public class main {
    
    public static void main(String [] args){
        
        Ahorcado instanciaJugo = new Ahorcado();
        instanciaJugo.mostrarCasillas();
        while(!instanciaJugo.gano()){
            
            String intento = instanciaJugo.recogerIntento();
            instanciaJugo.intentar(intento);
            instanciaJugo.mostrarCasillas();
        }
        
    }
}
