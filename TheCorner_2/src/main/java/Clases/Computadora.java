/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Tony Medina
 */
public class Computadora extends Electrodomestico implements IIngles, ListaMetodo{
    private int tipoComputadora;
    private String computadora;
    
    
    //constantes
    private static final String COLOR_POR_DEFECTO = "blanco";
     private static final char CONSUMOE_POR_DEFECTO = 'f';
     private static final float PESO_POR_DEFECTO = 5;
     private static final float PRECIO_POR_DEFECTO = 100;
    
    
    // Array de colores
    private static final String[] colorDisponible = {"blanco","negro","rojo","azul","gris"};
    
    public Computadora(){
        super();
    }
    public Computadora(float precioBase, float peso){
        super();
        this.precioBase = precioBase;
        this.peso = peso;
    }
    public Computadora(int computadora, float precioBase, String color, char consumoEner, float peso){
        super(precioBase, color, consumoEner, peso);
       this.tipoComputadora = computadora;
    }
    //Metodos setters
    public void setTipoComputadora(int computadora){
        this.tipoComputadora = computadora;
    }
   
    //Metodos getters
    
    @Override
    public void setPrecioBase(float precioBase){
        //Operador ternario
       this.precioBase = (precioBase != 0)? precioBase: PRECIO_POR_DEFECTO;
        /*if(precioBase != 0){
        this.precioBase = precioBase;
       }else{
        this.precioBase = PRECIO_POR_DEFECTO;
       }*/
    }
    @Override
    public void setColor(String color){
        this.color = color;
         
    }
    
    @Override
    public void setConsumoEnergetico(char consumoEner){
        this.consumoEner = consumoEner;
    }
    @Override
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
        public String tipoConso(){
                switch (this.tipoComputadora){
                    case 1:
                        return this.computadora = "Pc Escritorio";
                    case 2:
                         return this.computadora = "Laptop";
                    case 3:
                         return this.computadora = "Mini Pc";
                    case 4:
                         return this.computadora = "Cuantica";
                        default:
                            this.computadora = "Consola todavia creada :')' ";
            }           return this.computadora;
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
    public String lista() {
            return String.format("""
                                  Base price: %.2f
                                  Color: %s
                                  Weight: %.2f
                                  Energy consumption: %s
                                  Test final price: %.2f""", 
                         this.getPrecioBase(), 
                         this.getColor(), 
                         this.getPeso(), 
                         this.getConsuEnergetico(), 
                         this.precioFinal());
        }
    @Override
    public String aIngles() {
            return String.format("""
                                  Base price: %.2f
                                  Color: %s
                                  Weight: %.2f
                                  Energy consumption: %s
                                  Test final price: %.2f""", 
                         this.getPrecioBase(), 
                         this.getColor(), 
                         this.getPeso(), 
                         this.getConsuEnergetico(), 
                         this.precioFinal());
        }
    @Override
        public String toString() {
            return String.format("""
                                  Modelo de computadora: %s
                                  Precio base: %.2f
                                  El color: %s
                                  El peso: %.2f
                                  El consumo energetico: %s
                                  Prueba precio final: %.2f""",
                         this.tipoConso(),
                         this.getPrecioBase(), 
                         this.getColor(), 
                         this.getPeso(), 
                         this.getConsuEnergetico(), 
                         this.precioFinal());
        }
        

    
}
