/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.triqui.interfaz;

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
    private JButton botonSI;
    private JButton botonSC;
    private JButton botonSD;
    private JButton botonCI;
    private JButton botonCC;
    private JButton botonCD;
    private JButton botonII;
    private JButton botonIC;
    private JButton botonID;
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
        botonSI = new JButton("SI");
        botonSI.addActionListener(this);
        botonSC = new JButton("SC");
        botonSC.addActionListener(this);
        botonSD = new JButton("SD");
        botonSD.addActionListener(this);
        botonCI = new JButton("CI");
        botonCI.addActionListener(this);
        botonCC = new JButton("CC");
        botonCC.addActionListener(this);
        botonCD = new JButton("CD");
        botonCD.addActionListener(this);
        botonII = new JButton("II");
        botonII.addActionListener(this);
        botonIC = new JButton("IC");
        botonIC.addActionListener(this);
        botonID = new JButton("ID");
        botonID.addActionListener(this);

        this.add(botonSI);
        this.add(botonSC);
        this.add(botonSD);
        this.add(botonCI);
        this.add(botonCC);
        this.add(botonCD);
        this.add(botonII);
        this.add(botonIC);
        this.add(botonID);

        // 
//Inicializar los botones
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento " + e.getActionCommand());
        if (e.getActionCommand().equals("SI")) {
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
        }if (e.getActionCommand().equals("II")) {
            cambiarEstadoCasilla(botonII);
        }
        if (e.getActionCommand().equals("IC")) {
            cambiarEstadoCasilla(botonIC);
        }
        if (e.getActionCommand().equals("ID")) {
            cambiarEstadoCasilla(botonID);
        }
        
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
        if ((!boton.getText().equals("X"))|| (!boton.getText().equals("O")) ) {
            boton.setText(jugador);
            cambiarJugador();
        } 
    }

}
