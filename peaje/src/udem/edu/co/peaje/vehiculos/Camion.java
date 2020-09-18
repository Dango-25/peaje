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
public class Camion extends Vehiculo {
    
    
    private int Numejes;
    
    public Camion(String Placa, String Marca, int Valorpeaje,int Numejes) {
        super(Placa, Marca, Valorpeaje);
        this.Numejes = Numejes;        
    }    
    
    //getter Numejes

    public int getNumejes() {
        return Numejes;
    }
    
    //setter Numejes

    public void setNumejes(int Numejes) {
        this.Numejes = Numejes;
    }
    @Override
    public String toString() {
        return "Moto : " + "  Placa  "+this.getPlaca()+ "  Marca  "+this.getMarca()+"  Valor Peaje  "+this.getValorpeaje()+"  Numero Ejes  "+this.getNumejes();
    }
    
}
