/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.triqui.interfaz.matriz;

import co.edu.unipiloto.triqui.interfaz.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author USUARIO
 */
public class InterfazTriqui extends JFrame {

    private PanelTablero panelTablero;
    //Constructor

    public InterfazTriqui() {
        this.setTitle("Juego de triqui");
        this.setSize(320, 360);
        this.setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Definir el distribuir de elementos
        this.setLayout(new BorderLayout());
        panelTablero=new PanelTablero(this);
        this.add(panelTablero, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        //Instanciar un objeto Interfaz triqui
        InterfazTriqui interfazTriqui = new InterfazTriqui();
        interfazTriqui.setVisible(true);
    }

}
