/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thecorner_2;
import Clases.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Tony Medina
 */
public class TheCorner_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el precio: ");
        float precioBase = sc.nextFloat();
        System.out.println("Introduce peso: ");
        float peso = sc.nextFloat();
        System.out.println("Introduce Color: ");
        
        String color = sc.next();
        
        
        System.out.println("Introduce consumo energetico: ");
        char consumoEnergetico = sc.next().charAt(0);
        
        // Intancia de mi clase padre
        Electrodomestico electroD;
        // inicializacion de objeto
        electroD = new Electrodomestico();
        electroD.setPrecioBase(precioBase);
        electroD.setPeso(peso);
        electroD.setColor(color);
        System.out.println(electroD.toString());
        System.out.println("Esto es prueba de color: " + electroD.getColor());
        //electroD.setConsumoEnergetico(consumoEnergetico);
        
        // llamar metodos
       //float precioFinal = electroD.precioFinal();
        //System.out.println("Precio Final: " + precioFinal);
        
        
    }
}
