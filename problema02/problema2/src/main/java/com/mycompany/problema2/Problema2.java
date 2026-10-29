/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema2;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        int base;
        int altura;
        int area;
        
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextInt();
        
        
        area = (base * altura) / 2;
        
        System.out.printf("Base: %s\nAltura: %s\nArea: %s\n",
                base,
                altura,
                area);
    }
}
