package Vista;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Platos extends JFrame implements ComponentListener {

	//Los atributos sobre los que vamos a actuar
	ImageIcon iconOpcion1;
	Image imOpcion1;
	Image im2Opcion1;
	JButton btnOpcion1;
	
	private JPanel contentPane;

	public Platos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//anadimos el ComponentListener para modificar el tamano de las imagenes cuando la pantalla se redimensione
		addComponentListener(this);
		
		JLabel lblTitulo = new JLabel("PLATOS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 21));
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 3, 15, 15));
		
		// Para centrar el app en medio de nuestra pantalla
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = this.getSize();
		int width = (pantalla.width - ventana.width) / 2;
		int height = (pantalla.height - ventana.height) / 2;
		this.setLocation(width, height);
		
		//Anadimos los botones que va a tener esta finestra swing
	
		//Este boton de ejemplo carga una imagen y luego la redimensiona
		btnOpcion1 = new JButton();
		panel.add(btnOpcion1);
		btnOpcion1.setToolTipText("Paella");
		btnOpcion1.setHorizontalTextPosition(AbstractButton.CENTER);
		btnOpcion1.setVerticalTextPosition(AbstractButton.CENTER);
		btnOpcion1.setFont(new Font("Arial", Font.PLAIN, 40));
		btnOpcion1.setForeground(Color.WHITE);
		btnOpcion1.setText("Paella");
		//Seleccionamos una imagen para el boton de la ruta relativa
		iconOpcion1 = new ImageIcon(Platos.class.getResource("/img/paella.jpg"));
	    imOpcion1 = iconOpcion1.getImage();
	

		
		JButton btnOpcion2 = new JButton();
		panel.add(btnOpcion2);
		
		JButton btnOpcion3 = new JButton();
		panel.add(btnOpcion3);
		
		JButton btnOpcion4 = new JButton();
		panel.add(btnOpcion4);
		
		JButton btnOpcion5 = new JButton();
		panel.add(btnOpcion5);
		
		JButton btnOpcion6 = new JButton();
		panel.add(btnOpcion6);
		
		JButton btnOpcion7 = new JButton();
		panel.add(btnOpcion7);
		
		JButton btnOpcion8 = new JButton();
		panel.add(btnOpcion8);
		
		JButton btnOpcion9 = new JButton();
		panel.add(btnOpcion9);
		
		JButton btnOpcion10 = new JButton();
		panel.add(btnOpcion10);
		
		JButton btnOpcion11 = new JButton();
		panel.add(btnOpcion11);
		
		JButton btnOpcion12= new JButton();
		panel.add(btnOpcion12);
		
		
		
		//Hacemos visible el frame y le asignamos un tamaño por defecto de 800x600 pixeles
		this.setSize(800, 600);
		this.setVisible(true);
		
		//Redimensionamos la imagen una vez la ventana se muestra en pantalla y podemos acceder a sus atributos
		im2Opcion1 = imOpcion1.getScaledInstance(btnOpcion1.getWidth(), btnOpcion1.getHeight(), Image.SCALE_SMOOTH);
		btnOpcion1.setIcon(new ImageIcon(im2Opcion1));
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	// componentResized es un metodo del componentListener que ejecutara el codigo que redimensiona 
	// la imagen cada vez que modificamos su tamano
	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		im2Opcion1 = imOpcion1.getScaledInstance(btnOpcion1.getWidth(), btnOpcion1.getHeight(), Image.SCALE_SMOOTH);
		btnOpcion1.setIcon(new ImageIcon(im2Opcion1));
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}





	
}

	