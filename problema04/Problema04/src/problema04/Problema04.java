/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS-A15G
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombreCliente;
        double precioCPU;
        double precioTeclado;
        double precioRaton;
        double precioPantalla;
        double costoBase;
        double costoAdicional;
        double costoFinal;
        
        System.out.println("Ingrese el nombre del Cliente");
        nombreCliente = entrada.nextLine();
        System.out.println("Ingrese el valor del CPU");
        precioCPU = entrada.nextDouble();
        System.out.println("Ingrese el Valor del Teclado");
        precioTeclado = entrada.nextDouble();
        
        System.out.println("Ingrese el Valor del Raton");
        precioRaton = entrada.nextDouble();
        System.out.println("Ingrese el Valor de la Pantalla");
        precioPantalla = entrada.nextDouble();
        entrada.nextLine();
        
        costoBase = (precioCPU + precioTeclado + precioRaton + precioPantalla);
        costoAdicional = (0.15 * costoBase);
        costoFinal = (costoBase + costoAdicional);
        
        System.out.printf("Nombre del Cliente: %s\nPrecio de la CPU: %.2f\nPrecio del Teclado: %.2f\n"
                + "Precio del Raton: %.2f\nPrecio de la Pantalla: %.2f\n"
                + "Costo Base: %.2f\nCosto Adicional: %.2f\nCosto Final: %.2f\n",
                nombreCliente,
                precioCPU,
                precioTeclado,
                precioRaton,
                precioPantalla,
                costoBase,
                costoAdicional,
                costoFinal);
    }
    
}
