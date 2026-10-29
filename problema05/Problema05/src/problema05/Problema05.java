/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS-A15G
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombreCliente;
        double precioNetflix;
        double precioYoutube;
        double precioDropbox;
        double precioSpotify;
        double descuentoNetflix;
        double descuentoYoutube;
        double descuentoDropbox;
        double descuentoSpotify;
        double precioFinalNetflix;
        double precioFinalYoutube;
        double precioFinalDropbox;
        double costoMensualTotal;
        double ahorroMensual;
        double valorTotalConPromocion;
        
        
        System.out.println("Ingrese el nombre del Cliente");
        nombreCliente = entrada.nextLine();
        System.out.println("Ingrese el valor de Netflix");
        precioNetflix = entrada.nextDouble();
        System.out.println("Ingrese el Valor de Youtube Premium");
        precioYoutube = entrada.nextDouble();
        
        System.out.println("Ingrese el Valor de Dropbox");
        precioDropbox = entrada.nextDouble();
        System.out.println("Ingrese el Valor de Spotify");
        precioSpotify = entrada.nextDouble();
        entrada.nextLine();
        
        descuentoNetflix = (0.23 * precioNetflix);
        descuentoYoutube = (0.23 * precioYoutube);
        descuentoDropbox = (0.45 * precioDropbox);
        descuentoSpotify = (0.00 * precioSpotify);
        
        precioFinalNetflix = (precioNetflix - descuentoNetflix);
        precioFinalYoutube = (precioYoutube - descuentoYoutube);
        precioFinalDropbox = (precioDropbox - descuentoDropbox);
        
        costoMensualTotal = (precioNetflix + precioYoutube + precioDropbox + 
                precioSpotify);
        
        ahorroMensual = (descuentoNetflix + descuentoYoutube + descuentoDropbox);
        
        valorTotalConPromocion = (precioFinalNetflix + precioFinalYoutube + 
                precioFinalDropbox + precioSpotify);
        
        System.out.printf("Nombre del Cliente: %s\nPrecio de Netflix: %.2f\n"
                + "Precio de Youtube Premium: %.2f\nPrecio de Dropbox: %.2f\n"
                + "Precio de Spotify: %.2f\nDescuento de Netflix: %.2f\n"
                + "Descuento de Youtube Premium: %.2f\nDescuento de Dropbox: %.2f\n"
                + "Descuento de Spotify: %.2f\nCosto Final Netflix: %.2f\n"
                + "Costo Final Youtube Premium: %.2f\nCosto Final Dropbox: %.2f\n"
                + "Costo Mensual Total: %.2f\nAhorro Mensual: %.2f\n"
                + "Valor Total con Promociones: %.2f\n",
                nombreCliente,
                precioNetflix,
                precioYoutube,
                precioDropbox,
                precioSpotify,
                descuentoNetflix,
                descuentoYoutube,
                descuentoDropbox,
                descuentoSpotify,
                precioFinalNetflix,
                precioFinalYoutube,
                precioFinalDropbox,
                costoMensualTotal,
                ahorroMensual,
                valorTotalConPromocion);
        
    }
    
}
