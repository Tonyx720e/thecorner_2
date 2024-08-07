
package Clases;

/**
 *
 * @author maria
 */
/**
 *
 * @author Tony Medina
 */

public class Electrodomestico{
    private float precioBase;
    //static final String color = "Blanco";
    private String color;
    private char consumoEner;
    private float peso;
    
    public float precioMinimo;
    public float precioFinal;
    
    // Constantes
     private static final String color_por_defecto = "blanco";
     private static final char consumoE_por_defecto = 'f';
     private static final float peso_por_defecto = 5;
     private static final float precio_por_defecto = 100;
    
     // Colores disponibles
    private static final String[] colorDisponible = {"Blanco","Negro","Rojo","Azul","Gris"};
    public Electrodomestico(){
        this.color = color_por_defecto;
        this.consumoEner = consumoE_por_defecto;
        this.peso = peso_por_defecto;
        this.precioBase = precio_por_defecto;
    }
    public Electrodomestico(float precioBase, float peso){
    this();
    this.precioBase = precioBase;
    this.peso = peso;
    }
    public Electrodomestico(float precioBase, String color, char consumoEner, float peso){
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEner = consumoEner;
        this.peso = peso;
    }
    // getter

    /**
     *
     * @return
     */
    public float getPrecioBase(){
        return this.precioBase;
    }
    public float getPeso(){
        return this.peso;
    }
    public String getColor(){
        return this.color;
    }
    public char getConsuEnergetico(){
        return this.consumoEner;
    }
    // Setters
   public void setPrecioBase(float precioBase){
       if(precioBase != 0){
        this.precioBase = precioBase;
       }else{
        this.precioBase = precio_por_defecto;
       }
    }
    public void setColor(String color){
        for(String cd: colorDisponible){
        if(cd.equalsIgnoreCase(color)){
        this.color = color;
        }else{
        this.color = color_por_defecto;
        }
        
       }
    }
    public void setConsumoEnergetico(char consumoEner){
        this.consumoEner = consumoEner;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    // Metodos Funcionales
    public char comprobarConsumoEnergetico(){
        if(consumoEner == 'A' || consumoEner == 'a'){
             return consumoEner;
            }else if(consumoEner == 'B' || consumoEner == 'b'){
                return consumoEner;
            }else if(consumoEner == 'C' || consumoEner == 'c'){
                return consumoEner;
            }else if(consumoEner == 'D' || consumoEner == 'd'){
                return consumoEner;
            }else if(consumoEner == 'E' || consumoEner == 'e'){
            } else if(consumoEner == 'F' || consumoEner == 'f'){
                return consumoEner;
            }else if(consumoEner == 'F' || consumoEner == 'f'){
                return consumoEner;
            }else{
                this.consumoEner = consumoE_por_defecto;
                return consumoEner;
            }
        return 0;
    }
        public String comprobarColor(){
        switch (color) {
            case "Blanco", "blanco":
                return color;
            case "Negro", "negro":
                return color;
            case "Rojo":
                return color;
            case "Azul":
                return color;
            case "Gris":
                return color;
            default:
                this.color = color_por_defecto;
                return color;
        }
    }
        public float precioFinal(){
            for(int i = 1; i <= 6; i++){
                if(consumoEner == 'A' || consumoEner == 'a'){
                    precioMinimo = this.precioBase + 100;
                }else if(consumoEner == 'B' || consumoEner == 'b'){
                     precioMinimo = precioBase + 80;
                }else if(consumoEner == 'C' || consumoEner == 'c'){
                     precioMinimo = precioBase + 60;
                }else if(consumoEner == 'D' || consumoEner == 'd'){
                     precioMinimo = precioBase + 50;
                }else if(consumoEner == 'E' || consumoEner == 'e'){
                     precioMinimo = precioBase + 30;
                }else if(consumoEner == 'F' || consumoEner == 'f'){
                     precioMinimo = precioBase + 10;
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
            }
        return precioFinal;
        }
        
    @Override
    public String toString(){
    return " El precio: " + this.precioBase+
            "\n El color: " + this.color+
            "\n El peso: "  + this.peso+
            "\n El Consumo Energetico: " + this.consumoEner + 
            "\n Prueba del metodo consumo electrico: " + this.comprobarConsumoEnergetico() +
            "\n Comprobar Color prueba: " + comprobarColor()+ 
            "\n Prueba de precio Final " + this.precioFinal();
    }

        
}
