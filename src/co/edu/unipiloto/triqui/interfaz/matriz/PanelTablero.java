/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.triqui.interfaz.matriz;

import co.edu.unipiloto.triqui.interfaz.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author USUARIO
 */
public class PanelTablero extends JPanel implements ActionListener {

    //Declarar referencia al contenedor
    private InterfazTriqui principal;

    //Declarar las casillas del triqui
    private JButton[][] botones;

    //Declarar jugador
    String jugador = "X";

    //Declarar constructor del panel
    public PanelTablero(InterfazTriqui principal) {
        this.principal = principal;
        //Asignar el layout
        this.setLayout(new GridLayout(3, 3));
        //Definir tamano venta
        setPreferredSize(new Dimension(0, 200));
        //Adicionar un titulo
        TitledBorder border = BorderFactory.createTitledBorder("Tablero");
        border.setTitleColor(Color.darkGray);
        this.setBorder(border);
        //Inicializar los botenes + adicionar la escucha del evento Click
        botones = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j] = new JButton("F:"+i+" C:"+j);
                botones[i][j].addActionListener(this);
                this.add(botones[i][j]);
            }
        }

        // 
//Inicializar los botones
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento " + e.getActionCommand());
        int fila=e.getActionCommand().charAt(2)-48;
        System.out.println("fila "+fila);
        int col=e.getActionCommand().charAt(6)-48;
        System.out.println("columna "+col);
        botones[fila][col].setText(jugador);
        
        /*if (e.getActionCommand().equals("SI")) {
            cambiarEstadoCasilla(botonSI);
        }
        if (e.getActionCommand().equals("SC")) {
            cambiarEstadoCasilla(botonSC);
        }

        if (e.getActionCommand().equals("SD")) {
            cambiarEstadoCasilla(botonSD);
        }
        if (e.getActionCommand().equals("CI")) {
            cambiarEstadoCasilla(botonCI);
        }
        if (e.getActionCommand().equals("CC")) {
            cambiarEstadoCasilla(botonCC);
        }
        if (e.getActionCommand().equals("CD")) {
            cambiarEstadoCasilla(botonCD);
        }
        if (e.getActionCommand().equals("II")) {
            cambiarEstadoCasilla(botonII);
        }
        if (e.getActionCommand().equals("IC")) {
            cambiarEstadoCasilla(botonIC);
        }
        if (e.getActionCommand().equals("ID")) {
            cambiarEstadoCasilla(botonID);
        }
*/

    }

    //Cambiar jugador
    public void cambiarJugador() {

        if (jugador.equals("X")) {
            jugador = "O";
        } else if (jugador.equals("O")) {
            jugador = "X";
        }
        System.out.println("Jugador " + jugador);
    }

    private void cambiarEstadoCasilla(JButton boton) {
        if ((!boton.getText().equals("X")) || (!boton.getText().equals("O"))) {
            boton.setText(jugador);
            cambiarJugador();
        }
    }

}
