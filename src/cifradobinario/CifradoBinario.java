/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradobinario;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CifradoBinario {

    public static void main(String[] args) {
        
        String usuario;
        String mensaje;
        String operacion;
        int clave;
        String cifrado1;
        String cifrado2;
        int  cod, numero=0;
        while (true) {            
 
            System.out.println("Ingrese 1 para cifrar - 2 para descifrar - 3 para salir");
            Scanner menus = new Scanner (System.in);
            int menu = menus.nextInt();
        
            if (menu==1){

                System.out.println("Ingrese el mensaje a cifrar");
                Scanner msg = new Scanner (System.in);
                mensaje = msg.nextLine();
                //mensaje=mensaje.toUpperCase();
                Cifrar cifrado;
                cifrado= new Cifrar (mensaje);
            }
            
            
       else if (menu==2){
          
            System.out.println("Ingrese el mensaje a descifrar");
            Scanner msg = new Scanner (System.in);
            mensaje = msg.nextLine();
            String binario = mensaje.toString();
            int letrastotal = (binario.length())/7;
            //System.out.println("Total de letras que contiene el codigo que ingreso  "+letrastotal);
            System.out.print("el mensaje ha sido descifrado en:   ");
                                    
            for (int i =1; i<letrastotal+1;i++){
                int inicio_substring =0;
                int fin_substring =7;
                fin_substring = 7*i;    
                inicio_substring = fin_substring-7;
                String caracter = binario.substring(inicio_substring,fin_substring);
            for (int j=0; j<caracter.length();j++){
            if (caracter.charAt(j)=='1'){
                numero += Math.pow(2,(caracter.length()-1)-j);
            }
            }
            char c =(char)numero;
            numero = numero-numero;
            System.out.print(c);
            }
            System.out.print("\n");
                       
            //Descifrar descifra;
            //descifra= new Descifrar (mensaje); 
             }
            
             else if (menu==3){
                 break;
             }
        }
    }
}
 
    
    

    