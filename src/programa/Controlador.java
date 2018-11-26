package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import coche.Coche;
import coche.Coche.Combustible;
import coche.Coche.Puertas;
import coche.Coche.Tipo;
import vista.Vista;

public class Controlador implements ActionListener, MouseListener {

	private Vista vista;
	private Modelo modelo;
	
	private File ficheroSeleccionado;
	
	public Controlador(Vista vista, Modelo modelo) {
		this.vista=vista;
		this.modelo=modelo;
		
		poblarTipo();
		poblarPuertas();
		poblarCombustible();
		addListeners();
	}
	
	public void poblarTipo() {
		
		for (Tipo tipo: Tipo.values()) {
			vista.cbTipo.addItem(tipo);
		}
	}
	
	public void poblarPuertas() {
		
		for(Puertas puertas : Puertas.values()) {
			vista.cbPuertas.addItem(puertas);
		}
	}
	
	public void poblarCombustible() {
		
		for (Combustible combustible : Combustible.values()) {
			vista.cbCombustible.addItem(combustible);
		}
	}
	
	public void addListeners() {
		
		vista.btnNuevo.addActionListener(this);
		vista.btnModificar.addActionListener(this);
		vista.btnEliminar.addActionListener(this);
		vista.btnCancelar.addActionListener(this);
		
		vista.lblImagen.addMouseListener(this);
		vista.listaCoches.addMouseListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		
		case "nuevo":
			
			vista.tfMarca.requestFocus();
			
			break;
		case "modificar":
			
			break;
		case "guardar":
			
			if(vista.tfMarca.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Tienes que introducir la marca",
						"Error",JOptionPane.ERROR_MESSAGE);
				vista.tfMarca.selectAll();
				vista.tfMarca.requestFocus();
				return;
			}
			
			if(vista.tfConsumo.getText().equals("")) {
				vista.tfConsumo.setText("No especificado");
			}
			
			if(vista.tfKM.getText().equals("")) {
				vista.tfKM.setText("No especificado");
			}
			
			if(!vista.tfConsumo.getText().matches("[0-9]*")) {
				JOptionPane.showMessageDialog(null,
						"Tienes que introducir numeros en Consumo.", "Error", 
						JOptionPane.ERROR_MESSAGE);
				vista.tfConsumo.selectAll();
				vista.tfConsumo.requestFocus();
				return;
			}
			
			if(!vista.tfKM.getText().matches("[0-9]*")) {
				JOptionPane.showMessageDialog(null,
						"Tienes que introducir numeros en KM.", "Error",
						JOptionPane.ERROR_MESSAGE);
				vista.tfKM.selectAll();
				vista.tfKM.requestFocus();
				return;
			}
			
			String marca = vista.tfMarca.getText();
			Tipo tipo = (Tipo) vista.cbTipo.getSelectedItem();
			Combustible combustible =  (Combustible) vista.cbCombustible.getSelectedItem();
			Puertas puertas = (Puertas) vista.cbPuertas.getSelectedItem();
			float km = Float.parseFloat(vista.tfKM.getText());
			float consumo = Float.parseFloat(vista.tfConsumo.getText());
			String imagen = null;
			
			if(ficheroSeleccionado != null)
				imagen = ficheroSeleccionado.getName();
			else
				imagen = "nopicture.png";
			
			Coche coche = new Coche();
			coche.setMarca(marca);
			coche.setTipo(tipo);
			coche.setCombustible(combustible);
			coche.setPuertas(puertas);
			coche.setKm(km);
			coche.setConsumo(consumo);
			coche.setImagen(imagen);
			
			try {
				modelo.guardar(coche);
			} catch (IOException e1) {
				
				e1.printStackTrace();				
			}
			
			break;
		case "eliminar":
			
			break;
		case "cancelar":
			
			break;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource() == vista.lblImagen) {
			
			JFileChooser jfc = new JFileChooser();
			if(jfc.showOpenDialog(null) == JFileChooser.CANCEL_OPTION)
				return;
			
			ficheroSeleccionado =jfc.getSelectedFile();
			vista.lblImagen.setIcon(
					new ImageIcon(ficheroSeleccionado.getAbsolutePath()));
		}	
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
