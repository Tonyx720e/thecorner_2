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
        
        System.out.println("Introduce el precio general: ");
        float precioBase = sc.nextFloat();
        System.out.println("Introduce peso: ");
        float peso = sc.nextFloat();
        System.out.println("Introduce Color: ");
        
        String color = sc.next();
        
        
        System.out.println("Introduce consumo energetico: ");
        char consumoEnergetico = sc.next().charAt(0);
        
        // Intancia de mi clase padre
        Electrodomestico ObjetoElectroD;
        // inicializacion de objeto
        ObjetoElectroD = new Electrodomestico();
        ObjetoElectroD.setPrecioBase(precioBase);
        ObjetoElectroD.setPeso(peso);
        ObjetoElectroD.setColor(color);
        ObjetoElectroD.setConsumoEnergetico(consumoEnergetico);
        System.out.println(ObjetoElectroD.toString());
        System.out.println("Esto es prueba de color: " + ObjetoElectroD.getColor());
        //esto es una prueba        
        //electroD.setConsumoEnergetico(consumoEnergetico);
       
       //float precioFinal = electroD.precioFinal();
        //System.out.println("Precio Final: " + precioFinal);
        // Television
         System.out.println("Introduce el precio Tv: ");
        float precioBaseTv = sc.nextFloat();
        System.out.println("Introduce pulgadas");
        int pulgadas = sc.nextInt();
        System.out.println("Introduce (S) si tiene sintonizador y (N)");
        String tdtEntrada = sc.next();
        boolean tdt = tdtEntrada.equalsIgnoreCase("S");
        
        System.out.println("Introduce peso: ");
        float pesoTv = sc.nextFloat();
        System.out.println("Introduce Color: ");
        
        String colorTv = sc.next();
        
        System.out.println("Introduce consumo energetico: ");
        char consumoEnergeticoTv = sc.next().charAt(0);
        
        
        Television ObjetoTelevision;
        ObjetoTelevision = new Television();
        ObjetoTelevision.setPrecioBase(precioBaseTv);
        ObjetoTelevision.setPulgada(pulgadas);
        ObjetoTelevision.setTdt(tdt);
        ObjetoTelevision.setPeso(pesoTv);
        ObjetoTelevision.setColor(colorTv);
        ObjetoTelevision.setConsumoEnergetico(consumoEnergeticoTv);
        System.out.println(ObjetoTelevision.toString());
        
        //sc.close();
    }
}
