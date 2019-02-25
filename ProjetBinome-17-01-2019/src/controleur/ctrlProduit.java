package controleur;

import metier.Catalogue;

public class ctrlProduit {
	private Catalogue cat = Catalogue.getInstance();
	
	public  boolean addProduit(String nom, double prix, int qte) {
		return cat.addProduit(nom, prix, qte);
	}
	
	public  boolean removeProduit(String nom) {
		return cat.removeProduit(nom);
	}
}
