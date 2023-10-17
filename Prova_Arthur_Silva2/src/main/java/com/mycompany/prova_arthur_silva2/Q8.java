/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_arthur_silva2;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author aoliveira
 */
public class Q8 {
    
    public static void main(String[] args) throws IOException {
    
        DataInputStream dado;
        String escolha = "";
        float numero;
        float total;
        

        
        System.out.println("Digite um numero para fazer a tabuada: ");
        dado = new DataInputStream(System.in); 
        escolha = dado.readLine();
        numero = Float.parseFloat(escolha);
        
        FileWriter arq = new FileWriter("C:\\Users\\aoliveira\\Desktop\\prova_resp\\tabuada do "+numero+".txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        
        gravarArq.printf("-------------------- \n");
        gravarArq.printf("TABUADA DO "+ numero);   
        gravarArq.printf("\n-------------------- \n");
        
        for (int i=0; i<10; i++){
            total = numero*(i+1);    
            gravarArq.printf(numero + "*" + (i+1) + " = " + total + "\n");
        }
        
        arq.close();
        
        System.out.println("Gravou com sucesso!!");
        
    }
               
}
