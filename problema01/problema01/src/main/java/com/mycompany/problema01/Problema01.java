/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema01;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema01 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombreProyecto1;
        String nombreProyecto2;
        String nombreProyecto3;
        double gasto1;
        double gasto2;
        double gasto3;
        double gastoMensual;
        
        System.out.println("Ingrese el nombre del Proyecto 1");
        nombreProyecto1 = entrada.nextLine();
        System.out.println("Ingrese el valor del Proyecto 1");
        gasto1 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del Proyecto 2");
        nombreProyecto2 = entrada.nextLine();
        System.out.println("Ingrese el valor del Proyecto 2");
        gasto2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del Proyecto 3");
        nombreProyecto3 = entrada.nextLine();
        
        System.out.println("Ingrese el valor del Proyecto 3");
        gasto3 = entrada.nextDouble();
        
        gastoMensual = (gasto1 + gasto2 + gasto3);
        
        System.out.printf("Proyecto1: %s\nGasto Mensual1: %.2f\nProyecto2: %s\n"
                + "Gasto Mensual2: %.2f\nProyecto3: %s\n Gasto Mensual3: %.2f\n"
                + "Gasto Mensual Total: %.2f\n",
                nombreProyecto1,
                gasto1,
                nombreProyecto2,
                gasto2,
                nombreProyecto3,
                gasto3,
                gastoMensual);
        
    }
}
