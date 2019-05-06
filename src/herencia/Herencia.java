/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;
import java.util.*;
public class Herencia {

    public static void main(String[] args) {
        
        Empresa Hyundai = new Empresa();
        Auto_compacto auto1=new Auto_compacto(4, "GUD-123", 150, "Hyundai",2010 , 700000);
        Camioneta auto2=new Camioneta(3, "ANN-456", 240, "Hyundai" ,2013 , 1000000);
        Vagoneta auto3=new Vagoneta(500, 3, 3, "LOL-569", 502, "Hyundai", 2005, 500000);
        Hyundai.registrarAuto(auto1);
        Hyundai.registrarAuto(auto2);
        Hyundai.registrarAuto(auto3);
        
        HashMap<String,Auto> autos=Hyundai.listarAutos();
        int i=0;
        for(Auto auto: autos.values()){
            System.out.println("Auto"+" "+(i+1));
            System.out.println("Placa:"+auto.getPlaca());
            System.out.println("Marca:"+auto.getMarca());
            System.out.println("Año:"+auto.getAnnio());
            System.out.println("Precio:"+auto.getPrecio());
            System.out.println("Numero de Serie:"+auto.getNumerosSerie());
            i++;
        }
    }
    
}
