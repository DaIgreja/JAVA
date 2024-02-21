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
 * @author Acenilto
 */
public class carro {
      public float valorcar,precofab,perclucro,percimp;
    DecimalFormat df = new DecimalFormat("0,000");
     public void receber(){
        Scanner sc= new Scanner (System.in);
        System.out.println("Qual o preço de Fábrica do Carro?");
        precofab= sc.nextFloat();
        System.out.println("Qual o percentual de lucro?");
        perclucro= sc.nextFloat();
        System.out.println("Qual o percentual de Impostos?");
        percimp= sc.nextFloat();
     
        
        
    }
    
     public void valordocarro(){
        valorcar=Float.parseFloat((df.format((precofab*perclucro)-(precofab*percimp)+precofab)));
    }
     public void mostrar(){
        System.out.println("*********CONCESSIONÁRIA BRASILINHA AUTOS*********"+
                "\n O valor do Lucro do distribuidor é :"+perclucro/100f
                +"\n O valor correspondente aos impostos é :"+percimp/100f+
                "\n O valor total do Carro Novo é : "+valorcar);
        
    }
}
