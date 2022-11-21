/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.triqui.mundo;

/**
 *
 * @author gilberto-pedraza
 */
public class JugadorPC {
    
    //Atributos
    private String miMarca;
    private Triqui juego;

    public JugadorPC(String miMarca, Triqui juego) {
        this.miMarca = miMarca;
        this.juego = juego;
    }

    public String getMiMarca() {
        return miMarca;
    }

    public void setMiMarca(String miMarca) {
        this.miMarca = miMarca;
    }
    
    
    
    
}
