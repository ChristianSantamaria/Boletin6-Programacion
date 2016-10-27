/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta CuentaOrigen = new Conta("Paco", "1", 100);
        Conta CuentaDestino = new Conta("Jose", "2", 200);
        
        CuentaOrigen.Ingreso(150);
        CuentaOrigen.Reintegro(50);
        
        CuentaOrigen.Transferencia(CuentaDestino, 200);
        
        CuentaDestino.Visualizar();
        CuentaOrigen.Visualizar();
    }
    
}
