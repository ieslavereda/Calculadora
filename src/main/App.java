package main;

import java.awt.EventQueue;

import controlador.Controlador;
import vistas.VistaPrincipal;

public class App {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaPrincipal frame = new VistaPrincipal();
					Controlador controlador = new Controlador(frame);
					controlador.go();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
