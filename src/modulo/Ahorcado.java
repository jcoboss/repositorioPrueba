/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ahorcado {
    
    private String [] arregloIntentos;//[_, , , a, e]
    private String [] diccionario;
    private int aciertos;
    private String palabraSel;
    private Random random;
    private Scanner scanner;
    
    public Ahorcado(){
        this.diccionario = new String[]{"perro", "tigre", "elefante", "rinoceronte", "ballena"};
        this.aciertos = 0;
        this.random = new Random();
        this.palabraSel = diccionario[random.nextInt(diccionario.length)];
        this.arregloIntentos = new String[palabraSel.length()];
        this.scanner = new Scanner(System.in);
    }
    
    public void mostrarCasillas(){
        // _ o _ u e
        StringBuilder sb = new StringBuilder();
        for(String letra: this.arregloIntentos){
            if( letra == null){
                sb.append(" _ ");
            }else{
                sb.append(" ").append(letra).append(" ");
            }
        }
        System.out.println(sb);
    }
    
    public String recogerIntento(){
        return scanner.nextLine();
    }
    
    public boolean gano(){
        return aciertos == palabraSel.length();
    }
    
    public void intentar(String intento){//intento tiene longitud 1
        String [] arregloLetras = palabraSel.split("");
        for(int i = 0; i < arregloLetras.length; i++){
            String letraIterada = arregloLetras[i];
            String espacioIterado = arregloIntentos[i];
            if(espacioIterado == null && letraIterada.equals(intento)){
                arregloIntentos[i] = letraIterada;
                aciertos++;
            }
            
        }
        
    }
    
}
