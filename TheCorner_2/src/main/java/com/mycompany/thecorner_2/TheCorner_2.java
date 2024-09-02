/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.thecorner_2;

import Clases.*;
import java.util.ArrayList;
import java.util.Iterator;
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
        List<Electrodomestico> listaElectro = new ArrayList<>();
        List<Television> listaTelevisor = new ArrayList<>();
        List<Consola> listaConsola = new ArrayList<>();
        List<Computadora> listaComputadora = new ArrayList<>();

        int op = 0;
        do {
            System.out.println("1-) Ingres electrodomestico");
            System.out.println("2-) Modificar");
            System.out.println("3-) Borrar");
            System.out.println("4-) Listar");
            op = sc.nextByte();

            sc.nextLine(); // Limpiar el buffer
            switch (op) {
                case 1:
                    int op2;
                    do {
                        System.out.println("1-) Para ingresar electrodomestico");
                        System.out.println("2-) Para ingresar Televisor");
                        System.out.println("3-) Para ingresar Consola");
                        System.out.println("4-) Para ingresar Computadora");
                        System.out.println("5-) Para salir del menu");
                        op2 = sc.nextByte();
                        switch (op2) {
                            case 1:
                                System.out.println("Introduce el precio general: ");
                                float precioBase = sc.nextFloat();
                                System.out.println("Introduce peso: ");
                                float peso = sc.nextFloat();
                                System.out.println("Introduce Color: ");
                                String color = sc.next();
                                System.out.println("Introduce consumo energetico: ");
                                char consumoEnergetico = sc.next().charAt(0);

                                listaElectro.add(new Electrodomestico(precioBase, color, consumoEnergetico, peso));
                                for (Electrodomestico electro : listaElectro) {
                                    electro.precioFinal();
                                    System.out.println("Prueba de la Lista: " + electro.precioFinal());
                                }

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

                                listaTelevisor.add(new Television(pulgadas, tdt, precioBaseTv, colorTv, consumoEnergeticoTv, pesoTv));
                                for (Television televisores : listaTelevisor) {
                                    //televisores.toString();
                                    televisores.precioFinal();
                                    System.out.println("Prueba del ToString" + televisores.toString());
                                    System.out.println("Prueba de la Lista: " + televisores.precioFinal());
                                }
                                System.out.println("Televisor registrado");
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
                                listaConsola.add(new Consola(tipoConsola, precioBaseConsola, colorConsola, consumoEnergeticoConsola, pesoConsola));
                                for (Consola cons : listaConsola) {
                                    System.out.println(cons.toString());
                                }
                                System.out.println("-------------------------------------");
                                // Seccion de computadora

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

                                listaComputadora.add(new Computadora(tipoComputadora, precioBaseComputadora, colorComputadora, consumoEnergeticoComputadora, pesoComputadora));
                                for (Computadora compu : listaComputadora) {
                                    System.out.println(compu.toString());
                                }
                                System.out.println("Coputadora registrada");
                                break;
                            case 5:
                                System.out.println("Esto es un cierre");
                                break;
                            default:
                                System.out.println("Introduce una opcion");
                                break;
                        }
                    } while (op2 != 5);
                    break;
                case 2:
                    System.out.println("Ingrese color a modificar");
                    String colorModificar = sc.nextLine();
                    for (Electrodomestico listaM : listaElectro) {
                        if (listaM.getColor() == null ? colorModificar == null : listaM.getColor().equals(colorModificar)) {
                            System.out.println("El color a modificar es: " + listaM.getColor());
                            System.out.println("Ingrese color para actualizar");
                            colorModificar = sc.nextLine();
                            listaM.setColor(colorModificar);
                            System.out.println("Color actualizado por " + colorModificar);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese color a eliminar");
                    String colorEliminar = sc.nextLine();
                    Iterator<Electrodomestico> iterador = listaElectro.iterator();
                    while (iterador.hasNext()) {
                        Electrodomestico electro = iterador.next();
                        if (electro.getColor().equalsIgnoreCase(colorEliminar)) {
                            iterador.remove();
                            System.out.println("Electrodomestico eliminado");
                            System.out.println("--------------------------");
                        }
                    }
                    break;
                case 4:
                    for(Electrodomestico electro: listaElectro){
                        System.out.println(electro.toString()); 
                        System.out.println("-----------------------");
                    }
                    for(Electrodomestico television: listaTelevisor){
                        System.out.println(television.toString()); 
                        System.out.println("-----------------------");
                    }
                    for(Electrodomestico consola: listaConsola){
                        System.out.println(consola.toString()); 
                        System.out.println("-----------------------");
                    }
                    for(Electrodomestico compu: listaComputadora){
                        System.out.println(compu.toString()); 
                        System.out.println("-----------------------");
                    }
            }
        } while (op != 4);

    }
}
