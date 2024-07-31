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
        
        System.out.println("Introduce el precion: ");
        float precioBase = sc.nextFloat();
        System.out.println("Introduce peso: ");
        float peso = sc.nextFloat();
        System.out.println("Introduce Color: ");
        String color = sc.nextLine();
        System.out.println("Introduce consumo energetico: ");
        String consumoEnergetico = sc.nextLine();
        
        Electrodomestico electroD;
        electroD = new Electrodomestico();
        electroD.setPrecioBase(precioBase);
        electroD.setPeso(peso);
        electroD.setColor(color);
        electroD.setConsumoEnergetico(consumoEnergetico);
        
        System.out.println(electroD.toString());
        
        
        
        
        
    }
}
