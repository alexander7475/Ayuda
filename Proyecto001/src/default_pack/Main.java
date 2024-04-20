package default_pack;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Cristian Lechon
 * Titulo: Contenedores JAVA
 *
 */



public class Main {
    public static void main(String[] args) {
		/*
		 * JFrame frame = new JFrame("Mi JFrame"); // Crea un nuevo JFrame con título
		 * "Mi JFrame" frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra
		 * la aplicación cuando se cierra el JFrame frame.setSize(800, 600); //
		 * Establece el tamaño del JFrame frame.setVisible(true); // Hace visible el
		 * JFrame
		 */        
        JFrame ventana = new JFrame("División en dos partes");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 400);

        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setBackground(Color.RED);

        JPanel panelDerecho = new JPanel();
        panelDerecho.setBackground(Color.BLUE);

        ventana.setLayout(new GridLayout(1, 2));
        ventana.add(panelIzquierdo);
        ventana.add(panelDerecho);

        ventana.setVisible(true);

    }
}

