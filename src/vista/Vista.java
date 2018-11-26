package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import coche.Coche;

import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class Vista extends JFrame {

	public JPanel contentPane;
	public JTextField tfMarca;
	public JTextField tfKM;
	public JTextField tfConsumo;
	
	public JComboBox<Coche.Combustible> cbCombustible;
	public JComboBox<Coche.Puertas> cbPuertas;
	public JComboBox<Coche.Tipo> cbTipo;
	
	public JButton btnNuevo;
	public JButton btnModificar;
	public JButton btnEliminar;
	public JButton btnCancelar;
	public JButton btnGuardar;
	
	public JList listaCoches;
	
	public JLabel lblImagen;
	
	public Vista() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblImagen = new JLabel("");
		lblImagen.setBorder(new TitledBorder(null, "Imagen", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblImagen.setBounds(10, 23, 244, 244);
		contentPane.add(lblImagen);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 278, 72, 14);
		contentPane.add(lblMarca);
		
		JLabel lblCombustible = new JLabel("Combustible");
		lblCombustible.setBounds(10, 313, 72, 14);
		contentPane.add(lblCombustible);
		
		JLabel lblPuertas = new JLabel("N\u00BAPuertas");
		lblPuertas.setBounds(10, 346, 72, 14);
		contentPane.add(lblPuertas);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 377, 72, 14);
		contentPane.add(lblTipo);
		
		JLabel lblKm = new JLabel("KM");
		lblKm.setBounds(10, 410, 72, 14);
		contentPane.add(lblKm);
		
		JLabel lblConsumo = new JLabel("Consumo");
		lblConsumo.setBounds(10, 435, 72, 14);
		contentPane.add(lblConsumo);
		
		tfMarca = new JTextField();
		tfMarca.setBounds(104, 278, 137, 20);
		contentPane.add(tfMarca);
		tfMarca.setColumns(10);
		
		cbCombustible = new JComboBox<>();
		cbCombustible.setBounds(103, 310, 138, 20);
		contentPane.add(cbCombustible);
		
		cbPuertas = new JComboBox<>();
		cbPuertas.setBounds(104, 343, 137, 20);
		contentPane.add(cbPuertas);
		
		cbTipo = new JComboBox<>();
		cbTipo.setBounds(104, 374, 137, 20);
		contentPane.add(cbTipo);
		
		tfKM = new JTextField();
		tfKM.setBounds(104, 405, 137, 20);
		contentPane.add(tfKM);
		tfKM.setColumns(10);
		
		tfConsumo = new JTextField();
		tfConsumo.setBounds(104, 432, 137, 20);
		contentPane.add(tfConsumo);
		tfConsumo.setColumns(10);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setActionCommand("nuevo");
		btnNuevo.setBounds(267, 291, 89, 23);
		contentPane.add(btnNuevo);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setActionCommand("modificar");
		btnModificar.setBounds(267, 342, 89, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setActionCommand("eliminar");
		btnEliminar.setBounds(408, 342, 89, 23);
		contentPane.add(btnEliminar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setActionCommand("cancelar");
		btnCancelar.setBounds(338, 406, 89, 23);
		contentPane.add(btnCancelar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(498, 256, -200, -219);
		contentPane.add(scrollPane);
		
		listaCoches = new JList();
		listaCoches.setBounds(296, 36, 200, 231);
		contentPane.add(listaCoches);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setActionCommand("guardar");
		btnGuardar.setBounds(408, 291, 89, 23);
		contentPane.add(btnGuardar);
		
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
