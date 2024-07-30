
package Clases;

/**
 *
 * @author Tony Medina
 */
public class Electrodomestico{
    private float precioBase;
    private String color;
    private String consumoEner;
    private float peso;
    
    public Electrodomestico(){
    }
    public Electrodomestico(float precioBase, float peso){
    this.precioBase = precioBase;
    this.peso = peso;
    }
    public Electrodomestico(float precioBase, String color, String consumoEner, float peso){
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
    public float getPrecioB(){
        return this.precioBase;
    }
    public float getPeso(){
        return this.peso;
    }
    public String getColor(){
        return this.color;
    }
    public String getConsuEnergetico(){
        return this.consumoEner;
    }
    // Setters
    public void setPrecioB(float precioBase){
    this.precioBase = precioBase;
    }
    public void setPeso(float peso){
    this.peso = peso;
    }
    public void setColor(String color){
    this.color = color;
    }
    public void setConsumoE(String consumoEner){
    this.consumoEner = consumoEner;
    }
    
    public String toString(){
    return "El precio: " + this.precioBase+
            "El color: " + this.color+
            "El peso: "  + this.peso+
            "el Consumo Energetico: " + this.consumoEner;
    }

        
}
