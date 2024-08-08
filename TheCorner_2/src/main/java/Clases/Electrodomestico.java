
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
     private static final String COLOR_POR_DEFECTO = "blanco";
     private static final char CONSUMOE_POR_DEFECTO = 'f';
     private static final float PESO_POR_DEFECTO = 5;
     private static final float PRECIO_POR_DEFECTO = 100;
    
     // Colores disponibles
    private static final String[] colorDisponible = {"blanco","negro","rojo","azul","gris"};
    
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
    
    // Setters
   public void setPrecioBase(float precioBase){
       if(precioBase != 0){
        this.precioBase = precioBase;
       }else{
        this.precioBase = PRECIO_POR_DEFECTO;
       }
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
    // Metodos Funcionales
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
    
        public String comprobarColor(){
            
        String colorMin = this.color.toLowerCase();
            for(String cd: colorDisponible){
            if(cd.equals(colorMin)){
            this.color = colorMin;
            return color;
        }
    }
        color = COLOR_POR_DEFECTO;
        return color;
    }
        public float precioFinal(){
            
                switch (consumoEner) {
                    case 'A', 'a' -> precioMinimo = this.precioBase + 100;
                    case 'B', 'b' -> precioMinimo = precioBase + 80;
                    case 'C', 'c' -> precioMinimo = precioBase + 60;
                    case 'D', 'd' -> precioMinimo = precioBase + 50;
                    case 'E', 'e' -> precioMinimo = precioBase + 30;
                    case 'F', 'f' -> precioMinimo = precioBase + 10;
                    default -> {
                    }
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
    public String toString(){
    return " El precio: " + this.precioBase+
            "\n El color: " + this.color+
            "\n El peso: "  + this.peso+
            "\n El Consumo Energetico: " + this.getConsuEnergetico() + 
            "\n Prueba del metodo consumo Energetico: " + this.comprobarConsumoEnergetico() +
            "\n Comprobar Color prueba: " + this.comprobarColor()+ 
            "\n Prueba de precio Final " + this.precioFinal();
    }

        
}
