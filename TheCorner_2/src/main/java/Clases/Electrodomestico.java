
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
    private String color;
    private char consumoEner;
    private float peso;
    
    public Electrodomestico(){
    }
    public Electrodomestico(float precioBase, float peso){
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
        this.precioBase = precioBase;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setConsumoEnergetico(char consumoEner){
        this.consumoEner = consumoEner;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    // Metodos Funcionales
    public char comprobarConsumoEnergetico(char consumoEner){
        if(consumoEner == 'A' || consumoEner == 'a'){
             return consumoEner;
            }else if(consumoEner == 'B' || consumoEner == 'b'){
                return consumoEner;
            }else if(consumoEner == 'C' || consumoEner == 'c'){
                return consumoEner;
            }else if(consumoEner == 'D' || consumoEner == 'd'){
                return consumoEner;
            }else if(consumoEner == 'E' || consumoEner == 'e'){
                return consumoEner;
            }else if(consumoEner == 'F' || consumoEner == 'f'){
                return consumoEner;
            }else{
                       consumoEner = 'A';
                return consumoEner;
            }
    }
        public String comprobarColor(String color){
        switch (color) {
            case "Blanco":
                return color;
            case "Negro":
                return color;
            case "Rojo":
                return color;
            case "Azul":
                return color;
            case "Gris":
                return color;
            default:
                color = "Blanco";
                return color;
        }
    } 
    @Override
    public String toString(){
    return " El precio: " + this.precioBase+
            "\n El color: " + this.color+
            "\n El peso: "  + this.peso+
            "\n El Consumo Energetico: " + this.consumoEner + 
            "\n Prueba del metodo consumo electrico: " + comprobarConsumoEnergetico(consumoEner) +
            "\n Comprobar Color prueba: " + comprobarColor(color) ;
    }

        
}
