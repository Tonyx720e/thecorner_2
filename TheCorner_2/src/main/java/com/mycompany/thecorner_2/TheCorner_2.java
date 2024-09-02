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

        List<Electrodomestico> listaElectro = new ArrayList<>();
        /*List<Television> listaTelevisor = new ArrayList<>();
        List<Consola> listaConsola = new ArrayList<>();
        List<Computadora> listaComputadora = new ArrayList<>();*/

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

                                listaElectro.add(new Television(pulgadas, tdt, precioBaseTv, colorTv, consumoEnergeticoTv, pesoTv));
                                for (Electrodomestico televisores : listaElectro) {
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
                                listaElectro.add(new Consola(tipoConsola, precioBaseConsola, colorConsola, consumoEnergeticoConsola, pesoConsola));
                                for (Electrodomestico cons : listaElectro) {
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

                                listaElectro.add(new Computadora(tipoComputadora, precioBaseComputadora, colorComputadora, consumoEnergeticoComputadora, pesoComputadora));
                                for (Electrodomestico compu : listaElectro) {
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
                    /*Electrodomestico miElectro = new Electrodomestico();
                    Television miTv = new Television();
                    Consola miConsola = new Consola();
                    Computadora miCompu = new Computadora();*/
                    
                    /*System.out.println(listaElectro);
                    System.out.println(miTv.lista());
                    System.out.println(miConsola.lista());
                    System.out.println(miCompu.lista());*/
                    
                    for(Electrodomestico electro: listaElectro){
                        System.out.println(electro.lista()); 
                        System.out.println("-----------------------");
                    }
                    
            }
        } while (op != 4);

    }
}
