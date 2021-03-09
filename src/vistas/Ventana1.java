package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Ventana1 extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public Ventana1() {
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
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelSuperior, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panelIzquierdo, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panelDerecho, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelSuperior, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panelDerecho, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelIzquierdo, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		panelDerecho.setLayout(new GridLayout(2, 0, 0, 2));
		
		panel = new JPanel();
		panelDerecho.add(panel);
		panel.setLayout(new GridLayout(2, 0, 2, 2));
		
		btnPlus = new JButton("+");
		panel.add(btnPlus);
		
		btnMinus = new JButton("-");
		panel.add(btnMinus);
		
		panel_1 = new JPanel();
		panelDerecho.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		button = new JButton("=");
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
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addNumber(1);
			}
		});
		panelIzquierdo.add(btn1);
		
		btnPlusMinus = new JButton("+/-");
		panelIzquierdo.add(btnPlusMinus);
		
		btn0 = new JButton("0");
		panelIzquierdo.add(btn0);
		
		btnDot = new JButton(".");
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
	
	private void addNumber(int number) {
		
		
	}
}









