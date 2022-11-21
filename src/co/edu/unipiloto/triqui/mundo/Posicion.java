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
class Posicion {
    //Atributos
    private int fila;
    private int columna;
    
    //Constructor

    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }
    //Metodos get y set

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
    
}
