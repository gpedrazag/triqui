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
class Casilla {
    //Constantes
    public static final String CASILLA_VACIA=" ";
    
    //C
    private String marca;
    private Posicion pos;

    public Casilla(Posicion pos) {
        this.pos=pos;
        this.marca=CASILLA_VACIA;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }
    
    //Metodos
    public boolean estaVacia(){
        if (marca.equals(CASILLA_VACIA))
            return true;
        return false;
    }
    
}
