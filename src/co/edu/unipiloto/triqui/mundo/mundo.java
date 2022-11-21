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
public class mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triqui miTriqui=new Triqui();
        
        
        for (int i=0;i<3;i++)
            miTriqui.getTablero()[i][i].setMarca("X");
        
        miTriqui.mostrarTablero();
    }
    
}
