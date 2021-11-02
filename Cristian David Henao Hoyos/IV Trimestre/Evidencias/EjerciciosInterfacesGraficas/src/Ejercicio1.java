import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextPane;
import java.awt.FlowLayout;


public class Ejercicio1 extends JFrame implements MouseListener{

	private JPanel ventanaPrincipal;
	private JPanel panelNumeros;
	private JLabel lblTitulo;
	private JLabel etiCero;
	private JLabel etiUno;
	private JLabel etiDos;
	private JLabel etiTres;
	private JLabel etiCuatro;
	private JLabel etiCinco;
	private JLabel etiSeis;
	private JLabel etiSiete;
	private JLabel etiOcho;
	private JLabel etiNueve;
	private JButton btnEliminar;
	private JTextPane txtNumeros;
	
	public static void main(String[] args) {
		Ejercicio1 frame = new Ejercicio1();
		frame.setVisible(true);
	}

	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 300);
		ventanaPrincipal = new JPanel();
		ventanaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ventanaPrincipal);
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		ventanaPrincipal.setLayout(new BorderLayout(0, 0));
		lblTitulo = new JLabel("Ejercicio 1");
		lblTitulo.setFont(new Font("Arial Black", Font.PLAIN, 26));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		ventanaPrincipal.add(lblTitulo, BorderLayout.NORTH);		
		
		panelNumeros = new JPanel();
		ventanaPrincipal.add(panelNumeros, BorderLayout.CENTER);
		
		etiCero = new JLabel("0");
		etiCero.setIconTextGap(10);
		etiCero.setHorizontalAlignment(SwingConstants.CENTER);
		etiCero.setFont(new Font("Arial", Font.PLAIN, 24));
		etiCero.addMouseListener(this);
		panelNumeros.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelNumeros.add(etiCero);
		
		etiUno = new JLabel("1");
		etiUno.setIconTextGap(10);
		etiUno.setHorizontalAlignment(SwingConstants.CENTER);
		etiUno.setFont(new Font("Arial", Font.PLAIN, 24));
		etiUno.addMouseListener(this);
		panelNumeros.add(etiUno);
		
		etiDos = new JLabel("2");
		etiDos.setIconTextGap(10);
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setFont(new Font("Arial", Font.PLAIN, 24));
		etiDos.addMouseListener(this);
		panelNumeros.add(etiDos);
		
		etiTres = new JLabel("3");
		etiTres.setIconTextGap(10);
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setFont(new Font("Arial", Font.PLAIN, 24));
		etiTres.addMouseListener(this);
		panelNumeros.add(etiTres);
		
		etiCuatro = new JLabel("4");
		etiCuatro.setIconTextGap(10);
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setFont(new Font("Arial", Font.PLAIN, 24));
		etiCuatro.addMouseListener(this);
		panelNumeros.add(etiCuatro);
		
		etiCinco = new JLabel("5");
		etiCinco.setIconTextGap(10);
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setFont(new Font("Arial", Font.PLAIN, 24));
		etiCinco.addMouseListener(this);
		panelNumeros.add(etiCinco);
		
		etiSeis = new JLabel("6");
		etiSeis.setIconTextGap(10);
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setFont(new Font("Arial", Font.PLAIN, 24));
		etiSeis.addMouseListener(this);
		panelNumeros.add(etiSeis);
		
		etiSiete = new JLabel("7");
		etiSiete.setIconTextGap(10);
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setFont(new Font("Arial", Font.PLAIN, 24));
		etiSiete.addMouseListener(this);
		panelNumeros.add(etiSiete);
		
		etiOcho = new JLabel("8");
		etiOcho.setIconTextGap(10);
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setFont(new Font("Arial", Font.PLAIN, 24));
		etiOcho.addMouseListener(this);
		panelNumeros.add(etiOcho);
		
		etiNueve = new JLabel("9");
		etiNueve.setIconTextGap(10);
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setFont(new Font("Arial", Font.PLAIN, 24));
		etiNueve.addMouseListener(this);
		panelNumeros.add(etiNueve);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFocusPainted(false);
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnEliminar.setBackground(UIManager.getColor("ToggleButton.light"));
		btnEliminar.setForeground(Color.BLACK);
		btnEliminar.setFont(new Font("Arial", Font.PLAIN, 20));
		btnEliminar.addMouseListener(this);
		ventanaPrincipal.add(btnEliminar, BorderLayout.AFTER_LINE_ENDS);
		
		txtNumeros = new JTextPane();
		txtNumeros.setEditable(false);
		ventanaPrincipal.add(txtNumeros, BorderLayout.SOUTH);
		btnEliminar.setFont(new Font("Arial", Font.PLAIN, 20));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnEliminar) {
			txtNumeros.setText("");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		try {
			JLabel elemento = (JLabel) e.getSource();
			txtNumeros.setText(txtNumeros.getText() + elemento.getText());			
		} catch (Exception exe) {}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
