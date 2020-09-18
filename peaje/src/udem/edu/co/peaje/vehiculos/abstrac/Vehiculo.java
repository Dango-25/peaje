/**
 *
 * @author gomez
 * @version 1.0
 * @since 18-09-2020
 * 
 * Se definen los atributos de la superclase Vehiculo, se hace el constructor 
 * se definen los setter y los getters
 */
package udem.edu.co.peaje.vehiculos.abstrac;

public class Vehiculo {
    
    //Se definen los atributos de la clase     
    private String Placa;     
    private String Marca;   
    private int Valorpeaje;
        
    //Se Define el constructor

    public Vehiculo(String Placa, String Marca, int Valorpeaje) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Valorpeaje = Valorpeaje;
    }
    
    //Definicion de Getters

    public String getPlaca() {
        return Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public int getValorpeaje() {
        return Valorpeaje;
    }

    //Setter

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setValorpeaje(int Valorpeaje) {
        this.Valorpeaje = Valorpeaje;
    }
    
    
    }
     
    
    
    
    

