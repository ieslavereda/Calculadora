package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vistas.VistaPrincipal;

public class Controlador implements ActionListener{
	
	private VistaPrincipal vista;
		
	public Controlador(VistaPrincipal vista) {
		
		this.vista = vista;
		
		inicializar();
	}
	
	private void inicializar() {
		
		// Añadir ActionListener
		vista.getBtn0().addActionListener(this);
		vista.getBtn1().addActionListener(this);
		
		// Añadimos los ActionCommand
		vista.getBtn0().setActionCommand("0");
		vista.getBtn1().setActionCommand("1");
		
	}
	
	public void go() {		
		vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String comando = arg0.getActionCommand();
		
		if(comando.equals("0")) {
			addNumber(0);
		}
		
	}
	
	private void addNumber(int number) {

		if (vista.getTxtFieldDisplay().getText().equals("0")) {
			vista.getTxtFieldDisplay().setText(String.valueOf(number));
		} else {
			vista.getTxtFieldDisplay().setText(vista.getTxtFieldDisplay().getText() + number);
		}
	}

}







