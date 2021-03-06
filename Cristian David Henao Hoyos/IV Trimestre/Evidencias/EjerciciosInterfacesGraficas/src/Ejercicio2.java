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
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Ejercicio2 extends JFrame implements ActionListener {

	private JPanel ventanaPrincipal;
	private JPanel panelContenido;
	private JPanel panelLbl;
	private JPanel panelAcciones;
	private JLabel lblTitulo;
	private JLabel etiTexto2;
	private JLabel etiTexto1;
	private JButton btnTraspasa2;
	private JButton btnTraspasa1;
	private JPanel panelBtn;
	private JTextField txtTexto;

	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(650, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		ventanaPrincipal = new JPanel();
		ventanaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		ventanaPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(ventanaPrincipal);
		addWindowListener(new Ventana());
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		lblTitulo = new JLabel("Ejercicio 2");
		lblTitulo.setFont(new Font("Verdana", Font.BOLD, 50));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		ventanaPrincipal.add(lblTitulo, BorderLayout.NORTH);

		panelContenido = new JPanel();
		panelContenido.setLayout(new GridLayout(2, 1));
		ventanaPrincipal.add(panelContenido, BorderLayout.CENTER);

		panelLbl = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelLbl.getLayout();
		flowLayout.setVgap(50);
		flowLayout.setHgap(500);
		panelContenido.add(panelLbl);

		etiTexto1 = new JLabel("");
		etiTexto1.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto1.setFont(new Font("Arial", Font.PLAIN, 24));
		panelLbl.add(etiTexto1);

		etiTexto2 = new JLabel("");
		etiTexto2.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto2.setFont(new Font("Arial", Font.PLAIN, 24));
		panelLbl.add(etiTexto2);

		panelAcciones = new JPanel();
		panelContenido.add(panelAcciones);
		panelAcciones.setLayout(new GridLayout(2, 1, 100, 0));

		panelBtn = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelBtn.getLayout();
		flowLayout_1.setVgap(25);
		flowLayout_1.setHgap(100);
		panelAcciones.add(panelBtn);

		btnTraspasa1 = new JButton("Traspasa 1");
		panelBtn.add(btnTraspasa1);
		btnTraspasa1.setFont(new Font("Arial", Font.PLAIN, 20));

		btnTraspasa2 = new JButton("Traspasa 2");
		panelBtn.add(btnTraspasa2);
		btnTraspasa2.setFont(new Font("Arial", Font.PLAIN, 20));

		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Arial", Font.PLAIN, 22));
		txtTexto.setColumns(10);
		panelAcciones.add(txtTexto);

		btnTraspasa2.addActionListener(this);
		btnTraspasa1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnTraspasa1) {
			etiTexto1.setText(txtTexto.getText());
		} else if (e.getSource() == btnTraspasa2) {
			etiTexto2.setText(txtTexto.getText());
		}
	}
}