import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Ejercicio1 extends JFrame implements ActionListener {

	private JPanel ventanaPrincipal;
	private JPanel panelContenido;
	private JPanel panelLbl;
	private JPanel panelBtn;
	private JLabel lblTitulo;
	private JLabel etiCiudad;
	private JLabel etiNombre;
	private JButton btnVisuCiudad;
	private JButton btnOcultarNombre;
	private JButton btnOcultarCiudad;
	private JButton btnVisuNombre;

	public static void main(String[] args) {
		Ejercicio1 frame = new Ejercicio1();
		frame.setVisible(true);
	}

	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(723, 521);
		setLocationRelativeTo(null);
		ventanaPrincipal = new JPanel();
		ventanaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		ventanaPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(ventanaPrincipal);

		iniciarComponentes();
	}

	private void iniciarComponentes() {
		lblTitulo = new JLabel("Ejercicio 1");
		lblTitulo.setFont(new Font("Arial Black", Font.PLAIN, 32));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		ventanaPrincipal.add(lblTitulo, BorderLayout.NORTH);

		panelContenido = new JPanel();
		panelContenido.setLayout(new GridLayout(2, 1));
		ventanaPrincipal.add(panelContenido, BorderLayout.CENTER);

		panelLbl = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelLbl.getLayout();
		flowLayout.setVgap(100);
		flowLayout.setHgap(100);
		panelContenido.add(panelLbl);

		etiNombre = new JLabel("Alejandro");
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setFont(new Font("Arial", Font.PLAIN, 24));
		panelLbl.add(etiNombre);

		etiCiudad = new JLabel("Armenia");
		etiCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		etiCiudad.setFont(new Font("Arial", Font.PLAIN, 24));
		panelLbl.add(etiCiudad);

		panelBtn = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelBtn.getLayout();
		flowLayout_1.setVgap(50);
		flowLayout_1.setHgap(100);
		panelContenido.add(panelBtn);

		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		btnOcultarNombre.addActionListener(this);
		panelBtn.add(btnOcultarNombre);

		btnVisuNombre = new JButton("Visualizar Nombre");
		btnVisuNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVisuNombre.addActionListener(this);
		panelBtn.add(btnVisuNombre);

		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setFont(new Font("Arial", Font.PLAIN, 20));
		btnOcultarCiudad.addActionListener(this);
		panelBtn.add(btnOcultarCiudad);

		btnVisuCiudad = new JButton("Visualizar Ciudad");
		btnVisuCiudad.setFont(new Font("Arial", Font.PLAIN, 20));
		btnVisuCiudad.addActionListener(this);
		panelBtn.add(btnVisuCiudad);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOcultarNombre) {
			etiNombre.setVisible(false);
		} else if (e.getSource() == btnOcultarCiudad) {
			etiCiudad.setVisible(false);
		} else if (e.getSource() == btnVisuNombre) {
			etiNombre.setVisible(true);
		} else if (e.getSource() == btnVisuCiudad) {
			etiCiudad.setVisible(true);
		}
	}
}