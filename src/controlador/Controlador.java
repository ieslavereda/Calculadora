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
		vista.getBtnPlusMinus().addActionListener(this);
		
		// Añadimos los ActionCommand
		vista.getBtn0().setActionCommand("0");
		vista.getBtn1().setActionCommand("1");
		vista.getBtnPlusMinus().setActionCommand("+/-");
		
	}
	
	public void go() {		
		vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String comando = arg0.getActionCommand();
		
		if(comando.equals("0")) {
			addNumber(0);
		} else if (comando.equals("1")) {
			addNumber(1);
		} else if (comando.equals("+/-")) {
			cambioSigno();
		}
			
		
	}
	
	private void cambioSigno() {
		if (!vista.getTxtFieldDisplay().getText().equals("0")) {
			if (vista.getTxtFieldDisplay().getText().startsWith("-")) {
				vista.getTxtFieldDisplay().setText(vista.getTxtFieldDisplay().getText().substring(1));
			} else {
				vista.getTxtFieldDisplay().setText("-" + vista.getTxtFieldDisplay().getText());
			}
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







