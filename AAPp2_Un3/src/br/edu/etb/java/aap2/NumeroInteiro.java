/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.etb.java.aap2;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
*
*    @Author: Acenilto
*/
public class NumeroInteiro {
    String padrao = "###,###.##";
    DecimalFormat df = new DecimalFormat(padrao);
    int n1, n2, n3, n4, soma;
boolean loop = true;
    public void receber() {
        
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Entre com o primeiro número para realizar a soma : ");
        n1 = sc.nextInt();
        df.applyPattern("0,000");
        df.format(n1);
        System.out.println("Entre com o Segundo número para realizar a soma : ");
        n2 = sc.nextInt();
        df.format(n2);
        System.out.println("Entre com o Terceiro número para realizar a soma : ");
        n3 = sc.nextInt();
        df.format(n3);
        System.out.println("Entre com o Quarto número para realizar a soma : ");
        n4 = sc.nextInt();
        df.format(n4);
         
    
    }
    public void somar() {
        soma = (n1 + n2 + n3 + n4);
        df.format(soma);
    }

    public void mostrar() {
        System.out.println("RESULTADO :" + soma);
        System.out.println("***********Soma concluída com sucesso!***********");
    }
    
    } 

