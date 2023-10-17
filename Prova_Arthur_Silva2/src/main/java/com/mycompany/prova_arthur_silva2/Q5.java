/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_arthur_silva2;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author aoliveira
 */
public class Q5 {
    
    public static void main(String[] args) throws IOException {
        
       DataInputStream dado; 
       String escolha = "";
       float Uresp=0, Sresp=0;
       int aux = 0;
       
       while (aux == 0){
           
        System.out.println("Digite o usuário: ");
            dado = new DataInputStream(System.in); 
            escolha = dado.readLine();
            Uresp = Float.parseFloat(escolha); 
            
           if (Uresp == 1234){ 
               
               aux = 1;
               
           } else {
               
               System.out.println("Usuário invalido");
               
           }
            
            
       }  
       
       while (aux == 1){
           
           System.out.println("Digite a senha: ");
            dado = new DataInputStream(System.in); 
            escolha = dado.readLine();
            Sresp = Float.parseFloat(escolha); 
            
            if (Sresp == 9999){ 
               
                System.out.println("Acesso Permitido"); 
               aux = 0;
               
           } else {
               
               System.out.println("Senha invalido");
               
           }           
            
       }
        
    }    
    
    
}
