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
public class Q6 {
    
    public static void main(String[] args) throws IOException {
        
       DataInputStream dado; 
       
       float vetor[] = new float [100];
       
       String escolha = "";
       float qtd=0;
       float aux=0, total=0, media=0; 
       
        System.out.println("Digite quantos numeros você gostaria de usar entre (0 a 100): ");
            dado = new DataInputStream(System.in); 
            escolha = dado.readLine();
            qtd = Float.parseFloat(escolha); 
            
        for (int i=0; i<qtd; i++){    
            
            System.out.println("Digite o "+(i+1)+"º numero: ");
            dado = new DataInputStream(System.in); 
            escolha = dado.readLine();
            vetor[i] = Float.parseFloat(escolha); 
            
        }
        
        for (int i=0; i<qtd; i++){
            
            aux = vetor[i];
            total = total + aux;
            media = total/qtd;
            
        }
        
        System.out.println("A media: "+ media);
        System.out.println("A soma: "+ total);
        
        
        
    }
    
}
