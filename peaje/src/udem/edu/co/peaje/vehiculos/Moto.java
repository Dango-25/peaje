/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.peaje.vehiculos;

import udem.edu.co.peaje.vehiculos.abstrac.Vehiculo;

/**
 *
 * @author gomez
 */
public class Moto extends Vehiculo{
    
    public Moto(String Placa, String Marca, int Valorpeaje) {
        super(Placa, Marca, Valorpeaje);
    }

    @Override
    public String toString() {
        return "Moto : " + "Placa  "+this.getPlaca()+ "  Marca  "+this.getMarca()+"  Valor Peaje  "+this.getValorpeaje();
    }
  
 
    
  
    
    
}
