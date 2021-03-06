package graphique;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import controleur.ctrlAchat;

public class FenetreVente extends JFrame implements ActionListener {

	private JButton btVente;
	private JTextField txtQuantite;
	private JComboBox<String> combo;
	private ctrlAchat controleurAchat;

	public FenetreVente() {
		
		controleurAchat = new ctrlAchat();
		
		setTitle("Vente");
		setBounds(500, 500, 200, 125);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		btVente = new JButton("Vente");
		txtQuantite = new JTextField(5);
		txtQuantite.setText("0");

		combo = new JComboBox<String>(controleurAchat.getStockInTab());
		combo.setPreferredSize(new Dimension(100, 20));
		contentPane.add(new JLabel("Produit"));
		contentPane.add(combo);
		contentPane.add(new JLabel("Quantité vendue"));
		contentPane.add(txtQuantite);
		contentPane.add(btVente);

		btVente.addActionListener(this);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btVente ) {
			controleurAchat.vendreStock(combo.getSelectedItem().toString(),
					Integer.valueOf(txtQuantite.getText()));
		}
		this.dispose();
	}

}
