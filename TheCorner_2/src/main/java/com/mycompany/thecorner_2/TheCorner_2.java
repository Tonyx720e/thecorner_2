/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thecorner_2;
import Clases.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Tony Medina
 */
public class TheCorner_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Intancia de mi clase padre
       /* Electrodomestico ObjetoElectroD;
        // inicializacion de objeto
        ObjetoElectroD = new Electrodomestico();
        ObjetoElectroD.setPrecioBase(precioBase);
        ObjetoElectroD.setPeso(peso);
        ObjetoElectroD.setColor(color);
        ObjetoElectroD.setConsumoEnergetico(consumoEnergetico);
        System.out.println(ObjetoElectroD.toString());
        System.out.println("--------------------------------");*/
        //esto es una prueba        
        //electroD.setConsumoEnergetico(consumoEnergetico);
       
       //float precioFinal = electroD.precioFinal();
        //System.out.println("Precio Final: " + precioFinal);
        // Television
        /*System.out.println("Introduce el precio Tv: ");
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
        System.out.println("-------------------------------------");*/
        //sc.close();
        
        
            // Inicio de Consola    
       
            //System.out.println("El precio Final: " + miElectro.precioFinal());
            //System.out.println("El precio final electro: " + miElectro.precioFinal());
            //System.out.println("El precio final television: " + totalTelevision);
            /*System.out.println("Introduce 1,2,3,4 modelo consola");
            int tipoConsola = sc.nextInt();
            System.out.println("Introduce el precio de consola: ");
            float precioBaseConsola = sc.nextFloat();
       
            System.out.println("Introduce peso: ");
            float pesoConsola = sc.nextFloat();
            System.out.println("Introduce Color: ");
        
            String colorConsola = sc.next();
        
            System.out.println("Introduce consumo energetico: ");
            char consumoEnergeticoConsola = sc.next().charAt(0);
        
            Consola ObjetoConsola;
            ObjetoConsola = new Consola();
            ObjetoConsola.setTipoConsola(tipoConsola);
            ObjetoConsola.setPrecioBase(precioBaseConsola);
            ObjetoConsola.setPeso(pesoConsola);
            ObjetoConsola.setColor(colorConsola);
            ObjetoConsola.setConsumoEnergetico(consumoEnergeticoConsola);
            System.out.println(ObjetoConsola.toString());
            System.out.println("-------------------------------------");
            // Seccion de computadora
            System.out.println(ObjetoConsola.toString());*/
            /*System.out.println("Introduce 1,2,3,4 modelo computadora");
            int tipoComputadora = sc.nextInt();
            System.out.println("Introduce el precio de consola: ");
            float precioBaseComputadora = sc.nextFloat();
       
            System.out.println("Introduce peso: ");
            float pesoComputadora = sc.nextFloat();
            System.out.println("Introduce Color: ");
        
            String colorComputadora = sc.next();
        
            System.out.println("Introduce consumo energetico: ");
            char consumoEnergeticoComputadora = sc.next().charAt(0);
        
            Computadora ObjetoComputadora;
            ObjetoComputadora = new Computadora();
            ObjetoComputadora.setTipoComputadora(tipoComputadora);
            ObjetoComputadora.setPrecioBase(precioBaseComputadora);
            ObjetoComputadora.setPeso(pesoComputadora);
            ObjetoComputadora.setColor(colorComputadora);
            ObjetoComputadora.setConsumoEnergetico(consumoEnergeticoComputadora);
            System.out.println(ObjetoComputadora.toString());
            System.out.println("-------------------------------------");*/
            
        // Creacion de array copiar codigo
            
       /* Electrodomestico[] electrodomesticos = new Electrodomestico[4];
            //
        float totalElectroD = 0;
        float totalTelevision = 0;
        float totalConsola = 0;
        float totalComputadora = 0;
        float precioTotal = 0;
        //Electrodomestico[] electrodomesticos = new Electrodomestico[6];
        electrodomesticos[0] = ObjetoElectroD;
        electrodomesticos[0] = ObjetoTelevision;
        electrodomesticos[1] = ObjetoConsola;
        electrodomesticos[3] = ObjetoComputadora;
        
        //Inicio del for ech
        for(Electrodomestico miElectro: electrodomesticos){
            
            if(miElectro instanceof Television){
                
                totalTelevision = ObjetoTelevision.precioFinal();
                
            }if(miElectro instanceof Consola){
                totalConsola = ObjetoConsola.precioFinal();
                
            }if(miElectro instanceof Computadora){
                totalComputadora = ObjetoConsola.precioFinal();
            }
            precioTotal = totalElectroD + totalTelevision +
                    totalConsola + totalComputadora;
            System.out.println("impresion en Ingles: " + ObjetoTelevision.aIngles());
        }
        // Fin for ech
        // impresion de mis objetos
        System.out.println("El precio eletrodomesticos:-----> " + totalElectroD);
        System.out.println("El precio Television: ----------->" + totalTelevision);
        System.out.println("El precio de consola:-----------> " + totalConsola);
        System.out.println("El precio de computadora:-------->" + totalComputadora);
        System.out.println("Precio total electrodomesticos -> " + precioTotal);*/
        
        List<Electrodomestico> lista = new ArrayList<>();
        int op;
        do{
            System.out.println("1-) Ingres electrodomestico");
            System.out.println("2-) Modificar");
            System.out.println("3-) Borrar");
            System.out.println("4-) Listar");
            op = sc.nextByte();
        switch(op){
            case 1:
                int op2;
        do{
            System.out.println("1-) Para ingresar electrodomestico");
            System.out.println("2-) Para ingresar Televisor");
            System.out.println("3-) Para ingresar Consola");
            System.out.println("4-) Para ingresar Computadora");
            System.out.println("5-) Para salir del menu");
            op2 = sc.nextByte();
        switch(op2){
            case 1:
                System.out.println("Introduce el precio general: ");
                float precioBase = sc.nextFloat();
                System.out.println("Introduce peso: ");
                float peso = sc.nextFloat();
                System.out.println("Introduce Color: ");
                String color = sc.next();
                System.out.println("Introduce consumo energetico: ");
                char consumoEnergetico = sc.next().charAt(0);
               
                // inicializacion de objeto
                Electrodomestico miElectro = new Electrodomestico();
                miElectro.setPrecioBase(precioBase);
                miElectro.setPeso(peso);
                miElectro.setColor(color);
                miElectro.setConsumoEnergetico(consumoEnergetico);
                System.out.println(miElectro.toString());
                //float precioFinal = electroD.precioFinal();
                //System.out.println("Precio Final: " + precioFinal);
                System.out.println("Electrodomestico registrado");
                break;
            case 2:
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
                //System.out.println(ObjetoTelevision.toString());
                System.out.println("-------------------------------------");
                break;
            case 3:
                System.out.println("Introduce 1,2,3,4 modelo consola");
                int tipoConsola = sc.nextInt();
                System.out.println("Introduce el precio de consola: ");
                float precioBaseConsola = sc.nextFloat();
                System.out.println("Introduce peso: ");
                float pesoConsola = sc.nextFloat();
                System.out.println("Introduce Color: ");
                String colorConsola = sc.next();
                System.out.println("Introduce consumo energetico: ");
                char consumoEnergeticoConsola = sc.next().charAt(0);
        
                Consola ObjetoConsola;
                ObjetoConsola = new Consola();
                ObjetoConsola.setTipoConsola(tipoConsola);
                ObjetoConsola.setPrecioBase(precioBaseConsola);
                ObjetoConsola.setPeso(pesoConsola);
                ObjetoConsola.setColor(colorConsola);
                ObjetoConsola.setConsumoEnergetico(consumoEnergeticoConsola);
                //System.out.println(ObjetoConsola.toString());
                System.out.println("-------------------------------------");
                // Seccion de computadora
                System.out.println(ObjetoConsola.toString());
                break;
            case 4:
                System.out.println("Introduce 1,2,3,4 modelo computadora");
                int tipoComputadora = sc.nextInt();
                System.out.println("Introduce el precio de consola: ");
                float precioBaseComputadora = sc.nextFloat();
       
                System.out.println("Introduce peso: ");
                float pesoComputadora = sc.nextFloat();
                System.out.println("Introduce Color: ");
        
                String colorComputadora = sc.next();
        
                System.out.println("Introduce consumo energetico: ");
                char consumoEnergeticoComputadora = sc.next().charAt(0);
        
                Computadora ObjetoComputadora;
                ObjetoComputadora = new Computadora();
                ObjetoComputadora.setTipoComputadora(tipoComputadora);
                ObjetoComputadora.setPrecioBase(precioBaseComputadora);
                ObjetoComputadora.setPeso(pesoComputadora);
                ObjetoComputadora.setColor(colorComputadora);
                ObjetoComputadora.setConsumoEnergetico(consumoEnergeticoComputadora);
                //System.out.println(ObjetoComputadora.toString());
                System.out.println("-------------------------------------");
                break;
            case 5:
                System.out.println("Esto es un cierre");
                break;
            default:
                System.out.println("Introduce una opcion");
        
        
        }
        }while(op2 != 5);
               
        }
        }while(op != 4);
        
    }
}
