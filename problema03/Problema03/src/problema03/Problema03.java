/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS-A15G
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombreCliente;
        String direccion;
        double costoMinuto;
        int minutosConsumidos;
        double totalPagar;
        
        System.out.println("Ingrese el Nombre del Cliente");
        nombreCliente = entrada.nextLine();
        System.out.println("Ingrese la Direccion");
        direccion = entrada.nextLine();
        
        System.out.println("Ingrese el costo por Minuto");
        costoMinuto = entrada.nextDouble();
        System.out.println("Ingrese los minutos Consumidos");
        minutosConsumidos = entrada.nextInt();
        entrada.nextLine();
        
        totalPagar = (costoMinuto * minutosConsumidos);
        
        System.out.printf("Nombre del Cliente: %s\nDireccion %s\n"
                + "Costo por Minuto: %.2f\nMinutos Consumidos: %s\nTotal a Pagar: %.2f\n",
                nombreCliente,
                direccion,
                costoMinuto,
                minutosConsumidos,
                totalPagar);
    }
    
}
