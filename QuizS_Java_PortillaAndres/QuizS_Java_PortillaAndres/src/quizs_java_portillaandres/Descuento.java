/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizs_java_portillaandres;

/**
 *
 * @author LENOVO
 */
public enum Descuento {
    Basico(0.11),Platino(0.15),Diamante(0.18);
    private final double porcentaje()
        Descuento double porcentajes {
        this.porcentaje=porcentaje;
    }
        public double getValorDescontado(doubleMonto){
            return monto * (1-porcentaje);
        }
}
    
}
