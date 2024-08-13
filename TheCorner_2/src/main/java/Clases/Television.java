/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Tony Medina
 */
public class Television extends Electrodomestico {
    private int pulgadas;
    private boolean tdt = false;
    
    //constantes
    private static final String COLOR_POR_DEFECTO = "blanco";
     private static final char CONSUMOE_POR_DEFECTO = 'f';
     private static final float PESO_POR_DEFECTO = 5;
     private static final float PRECIO_POR_DEFECTO = 100;
    
    private static final int PULGADA_POR_DEFECTO = 20;
    private static final boolean TDT_POR_DEFECTO = false;
    
    // Array de colores
    private static final String[] colorDisponible = {"blanco","negro","rojo","azul","gris"};
    
    public Television(){
        super();
    }
    public Television(float precioBase, float peso){
        super();
        this.precioBase = precioBase;
        this.peso = peso;
    }
    public Television(int pulgada, boolean tdt, float precioBase, String color, char consumoEner, float peso){
        super();
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }
    //Metodos setters
    public void setPulgada(int pulgada){
        this.pulgadas = pulgada;
    }
    public void setTdt(boolean tdt){
        this.tdt = tdt;
    }
    //Metodos getters
    public int getPulgada(){
        return this.pulgadas;
    }
    public boolean getTdt(){
        return this.tdt;
    }
    public void setPrecioBase(float precioBase){
        //Operador ternario
       this.precioBase = (precioBase != 0)? precioBase: PRECIO_POR_DEFECTO;
        /*if(precioBase != 0){
        this.precioBase = precioBase;
       }else{
        this.precioBase = PRECIO_POR_DEFECTO;
       }*/
    }
    public void setColor(String color){
        this.color = color;
         
    }
    
    public void setConsumoEnergetico(char consumoEner){
        this.consumoEner = consumoEner;
    }
    public void setPeso(float peso){
        //Operador ternario
        this.peso = (peso >5)? peso: PESO_POR_DEFECTO;
        /*if(peso > 5){
        this.peso = peso;
        }else this.peso = PESO_POR_DEFECTO;*/
    }
    // getter

    /**
     *
     * @return
     */
    @Override
    public float getPrecioBase(){
        return this.precioBase;
    }
    @Override
    public float getPeso(){
        return this.peso;
    }
    @Override
    public String getColor(){
        return this.color;
    }
    @Override
    public char getConsuEnergetico(){
        return this.consumoEner;
    }
    // Metodos Funcionales
    @Override
    public char comprobarConsumoEnergetico(){
        switch (consumoEner) {
            case 'A', 'a' -> {
                return consumoEner;
            }
            case 'B', 'b' -> {
                return consumoEner;
            }
            case 'C', 'c' -> {
                return consumoEner;
            }
            case 'D', 'd' -> {
                return consumoEner;
            }
            case 'E', 'e' -> {
                return consumoEner;
            }
            case 'F', 'f' -> {
                return consumoEner;
            }
            default -> {
                this.consumoEner = CONSUMOE_POR_DEFECTO;
                return consumoEner;
            }
        }
        }
    
    @Override
        public String comprobarColor(){
            
        String colorMinuscula = this.color.toLowerCase();
            for(String cd: colorDisponible){
            if(cd.equals(colorMinuscula)){
            this.color = colorMinuscula;
            return color;
        }
    }
        color = COLOR_POR_DEFECTO;
        return color;
    }
    @Override
        public float precioFinal(){
            
                switch (consumoEner) {
                    case 'A', 'a' -> precioMinimo = precioBase + 100;
                    case 'B', 'b' -> precioMinimo = precioBase + 80;
                    case 'C', 'c' -> precioMinimo = precioBase + 60;
                    case 'D', 'd' -> precioMinimo = precioBase + 50;
                    case 'E', 'e' -> precioMinimo = precioBase + 30;
                    case 'F', 'f' -> precioMinimo = precioBase + 10;
                    default -> {
                    }
                }
                //************Television
                precioMinimo = (pulgadas > 40)? ((precioMinimo*30)/100 +precioMinimo): PULGADA_POR_DEFECTO;
                /*if(pulgadas > 40){
                    
                    precioMinimo += (precioMinimo*30)/100;
                }else{
                    this.pulgadas = PULGADA_POR_DEFECTO;
                }*/
                if(tdt){
                    precioMinimo = precioMinimo + 50;
                }else{
                    this.tdt = TDT_POR_DEFECTO;
                }
                if(peso > 0 & peso <= 19){
                    precioFinal = precioMinimo + 10;
                } else if(peso > 20 & peso <= 49){
                    precioFinal = precioMinimo + 50;
                }else if(peso > 50 & peso <= 79){
                    precioFinal = precioMinimo + 80;
                }else if(peso > 80){
                    precioFinal = precioMinimo + 100;
                }
                return precioFinal;
            }
        
    @Override
        public String toString() {
            return String.format("El precio Base: %.2f\n "
                    + "El color: %s\n "
                    + "El peso: %.2f\n "
                    + "El consumo energetico: %s\n "
                    + "Prueba precio final: %.2f", 
                         this.getPrecioBase(), 
                         this.getColor(), 
                         this.getPeso(), 
                         this.getConsuEnergetico(), 
                         this.precioFinal());
        }
        /*public String toString(){
        return " El precio base: " + this.precioBase+ " $"+
            "\n El color: " + this.color+
            "\n El peso: "  + this.peso+ " Kg" +
            "\n El Consumo Energetico: " + this.getConsuEnergetico() + 
            "\n Prueba de precio Final " + this.precioFinal()+ " $" +  
                "\n---------------------------------------------";
        }*/
}
