/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.peaje;

import java.util.ArrayList;
import udem.edu.co.peaje.vehiculos.Automovil;
import udem.edu.co.peaje.vehiculos.Camion;
import udem.edu.co.peaje.vehiculos.Moto;
import udem.edu.co.peaje.vehiculos.abstrac.Vehiculo;

/**
 *
 * @author gomez
 */
public class Principal {
    
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        vehiculos.add(new Automovil("XYZ789","BMW",10000));
        vehiculos.add(new Moto("ABC123","AKT",3000));
        vehiculos.add(new Camion("ABC456","Chevrolet",30000,2));
        
        for(Vehiculo vehiculo:vehiculos){
            System.out.println(vehiculo);
        }
        
    }
    
}
