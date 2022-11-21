/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.triqui.mundo;

import co.edu.unipiloto.triqui.mundo.Posicion;

/**
 *
 * @author gilberto-pedraza
 */
public class Triqui {

    //Atributos
    private Casilla tablero[][];

    public Triqui() {
        //inicializar el tablero
        tablero = new Casilla[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j]=new Casilla(new Posicion (i,j));
                
            }
        }
    }

    // Metodos get y set
    public Casilla[][] getTablero() {
        return tablero;
    }

    public void setTablero(Casilla[][] tablero) {
        this.tablero = tablero;
    }

    //Inicializar tablero
    public void limpiarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j].setMarca(Casilla.CASILLA_VACIA);
            }
        }

    }
    //Imprimir tablero

    public void mostrarTablero() {
        System.out.println("+---+---+---+");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+tablero[i][j].getMarca() + " |");
            }
            System.out.println("");
            System.out.println("+---+---+---+");
        }
       
    }

//asignar marca a una casilla del tablero
public void asignarMarca(Posicion pos, String marca){
            tablero[pos.getFila()][pos.getColumna()].setMarca(marca);
  
    
            }
}
