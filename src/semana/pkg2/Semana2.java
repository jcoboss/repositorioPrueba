/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.pkg2;

/**
 *
 * @author Josue
 */
public class Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        jugar();
    }
    
    public static void jugar(){
        
        Ahorcado a = new Ahorcado();
        while(!a.gano()){
            a.imprimirTablero();
            String s = a.recogerIntento();
            a.intentar(s);
        }
        
    }
    
}
