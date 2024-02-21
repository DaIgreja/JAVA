
package br.edu.etb.java.aap2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Acenilto
 */
public class nascimento {
     public float anonasc,anoatual,idadeatual,idade2080;
    DecimalFormat df = new DecimalFormat("000");
    Scanner sc = new Scanner (System.in);
     public void receber(){
         System.out.println("Qual o ano de nascimento?");
         anonasc= sc.nextFloat();
      System.out.println("Qual o ano atual?");
         anoatual= sc.nextFloat();
     
     }
     public void calcularatual(){
        idadeatual= Float.parseFloat(df.format(anoatual-anonasc));
    }
     public void calcular2080(){
        idade2080= Float.parseFloat(df.format((2080-anoatual)+idadeatual));
    }
     public void mostrar(){
        System.out.println("**********CALCULO DE IDADES ********CALCIDA******"+
    "\n O ano de Nascimento é :"+anonasc+"\n O ano de Atual é :"+anoatual+
   "\n Sua idade atual é :"+idadeatual+"\n Sua idade em 2080 :"+idade2080);
    }
}
