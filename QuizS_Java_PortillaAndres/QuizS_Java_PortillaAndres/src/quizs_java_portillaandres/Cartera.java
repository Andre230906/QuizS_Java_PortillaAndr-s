/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizs_java_portillaandres;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Cartera implements PatronCartera {
    private String anho;
    private List<Tarjeta> tarjetas;
    public Cartera(String anho){
        this.anho=anho;
        this.tarjetas=new ArrayList <> ();
    }

    @Override
    public void imprimirListaDeTarjetas() {
        for (Tarjeta tarjeta: tarjetas){
            System.out.println("numero cuenta:" + tarjeta.getNumeroDeCuenta()+
                    "Cuota de manejo:" + tarjeta.CuotaDeManejo() +
                    "Nombre:" tarjeta.getClass().getSimpleName() +
                    "año" + anho;
        }

    }

    @Override
    public void agregarTarjeta(Tarjeta t) {
        tarjetas.add(t);
    }
    
}
