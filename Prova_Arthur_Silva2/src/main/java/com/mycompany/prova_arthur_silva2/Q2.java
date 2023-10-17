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
public class Q2 {
      
    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String escolha = "";
        float ano=0, mes=0, dia=0, total = 0;
        
        
        System.out.println("Digite o ano");
         dado = new DataInputStream(System.in); 
         escolha = dado.readLine();
         ano = Float.parseFloat(escolha);
        
        System.out.println("Digite o mes");
         dado = new DataInputStream(System.in); 
         escolha = dado.readLine();
         mes = Float.parseFloat(escolha);
         
        System.out.println("Digite o dia");
         dado = new DataInputStream(System.in); 
         escolha = dado.readLine();
         dia = Float.parseFloat(escolha);
         
         
         total = ((ano*365) + (mes*30) + dia);
         
         System.out.println("total :"+ total);
        
    }
    
}
