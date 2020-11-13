/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.pkg2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Ahorcado {
    
    private final Random random;
    private final Scanner scanner;
    private String[] diccionario;
    private String palabraSeleccionada;
    private String[] arregloIntentos;
    private int aciertos;
    
    public Ahorcado(){
        this.diccionario = new String[]{"perro", "tigre", "elefante", "rinoceronte", "ballena"};
        this.random = new Random();
        this.scanner = new Scanner(System.in,StandardCharsets.UTF_8.name());
        this.palabraSeleccionada = diccionario[random.nextInt(diccionario.length)];
        this.arregloIntentos = new String[palabraSeleccionada.length()];
        this.aciertos = 0;
    }
    
    public void intentar(String letra){
        String [] arregloLetras = palabraSeleccionada.split("");
        for(int i = 0; i<arregloLetras.length; i++){
            String l = arregloLetras[i];
            String espacio = arregloIntentos[i];
            if(espacio == null && l.equals(letra)){
                arregloIntentos[i] = letra;
                aciertos++;
            }
        }
    }
    
    public void imprimirTablero(){
        
        StringBuilder sb = new StringBuilder();
        for(String letra: this.arregloIntentos){
            if(letra == null){
                sb.append(" _ ");
            }else{
                sb.append(" ").append(letra).append(" ");
            }
        }
        sb.append("\n");
        System.out.println(sb);
    }
    
    public String recogerIntento(){
        return scanner.nextLine();
    }
    
    public boolean gano(){
        return aciertos == this.palabraSeleccionada.length();
    }
    
}
