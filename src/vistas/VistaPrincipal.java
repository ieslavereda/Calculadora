package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VistaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldDisplay;
	private JButton btn0;
	private JButton btnPlusMinus;
	private JButton btnDot;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btn9;
	private JButton btn8;
	private JButton btn7;
	private JPanel panel;
	private JPanel panel_1;
	private JButton button;
	private JButton btnPlus;
	private JButton btnMinus;

	private float operandoA;
	private float operandoB;
	private Operacion operacion;

	private enum Operacion {
		SUMA, RESTA
	}

	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panelSuperior = new JPanel();

		JPanel panelIzquierdo = new JPanel();

		JPanel panelDerecho = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panelSuperior, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(panelIzquierdo, GroupLayout.PREFERRED_SIZE, 232,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(panelDerecho,
												GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addComponent(panelSuperior, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panelDerecho, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelIzquierdo, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
				.addContainerGap(16, Short.MAX_VALUE)));
		panelDerecho.setLayout(new GridLayout(2, 0, 0, 2));

		panel = new JPanel();
		panelDerecho.add(panel);
		panel.setLayout(new GridLayout(2, 0, 2, 2));

		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				operacion = Operacion.SUMA;
				operandoA = Float.parseFloat(txtFieldDisplay.getText());
				txtFieldDisplay.setText("0");

			}
		});
		panel.add(btnPlus);

		btnMinus = new JButton("-");
		panel.add(btnMinus);

		panel_1 = new JPanel();
		panelDerecho.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		button = new JButton("=");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				switch (operacion) {
				case SUMA:
					operandoB = Float.parseFloat(txtFieldDisplay.getText());
					txtFieldDisplay.setText(String.valueOf(operandoA+operandoB));
					operandoA = Float.parseFloat(txtFieldDisplay.getText());
					break;
				case RESTA:
					break;
				default:
					break;

				}
			}
		});
		panel_1.add(button, BorderLayout.CENTER);
		panelIzquierdo.setLayout(new GridLayout(4, 3, 2, 2));

		btn9 = new JButton("9");
		panelIzquierdo.add(btn9);

		btn8 = new JButton("8");
		panelIzquierdo.add(btn8);

		btn7 = new JButton("7");
		panelIzquierdo.add(btn7);

		btn6 = new JButton("6");
		panelIzquierdo.add(btn6);

		btn5 = new JButton("5");
		panelIzquierdo.add(btn5);

		btn4 = new JButton("4");
		panelIzquierdo.add(btn4);

		btn3 = new JButton("3");
		panelIzquierdo.add(btn3);

		btn2 = new JButton("2");
		panelIzquierdo.add(btn2);

		btn1 = new JButton("1");
		panelIzquierdo.add(btn1);

		btnPlusMinus = new JButton("+/-");
		panelIzquierdo.add(btnPlusMinus);

		btn0 = new JButton("0");
		panelIzquierdo.add(btn0);

		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtFieldDisplay.getText().endsWith(".")) {
					txtFieldDisplay
							.setText(txtFieldDisplay.getText().substring(0, txtFieldDisplay.getText().length() - 1));
				} else if (!txtFieldDisplay.getText().contains(".")) {
					txtFieldDisplay.setText(txtFieldDisplay.getText() + ".");
				}
			}
		});
		panelIzquierdo.add(btnDot);

		panelSuperior.setLayout(new BorderLayout(0, 0));

		txtFieldDisplay = new JTextField();
		txtFieldDisplay.setEditable(false);
		txtFieldDisplay.setHorizontalAlignment(SwingConstants.TRAILING);
		txtFieldDisplay.setFont(new Font("Dialog", Font.PLAIN, 24));
		txtFieldDisplay.setText("0");
		panelSuperior.add(txtFieldDisplay, BorderLayout.CENTER);
		txtFieldDisplay.setColumns(10);
		contentPane.setLayout(gl_contentPane);
	}

	public JTextField getTxtFieldDisplay() {
		return txtFieldDisplay;
	}

	public JButton getBtn0() {
		return btn0;
	}

	public JButton getBtnPlusMinus() {
		return btnPlusMinus;
	}

	public JButton getBtnDot() {
		return btnDot;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public JButton getBtn1() {
		return btn1;
	}

	public JButton getBtn6() {
		return btn6;
	}

	public JButton getBtn5() {
		return btn5;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public JButton getBtn9() {
		return btn9;
	}

	public JButton getBtn8() {
		return btn8;
	}

	public JButton getBtn7() {
		return btn7;
	}

	public JButton getButton() {
		return button;
	}

	public JButton getBtnPlus() {
		return btnPlus;
	}

	public JButton getBtnMinus() {
		return btnMinus;
	}

	
}
