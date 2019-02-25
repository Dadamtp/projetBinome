package controleur;

import metier.Catalogue;
import metier.Produit;
import dao.*;

public class ctrlProduit {
	private Catalogue cat = Catalogue.getInstance();
	private I_ProduitDAO dao;
	
	public ctrlProduit() {
		dao = ProduitDAOFactory.getInstance().createProduitDAOInterface();
	}
	
	public  boolean addProduit(String nom, double prix, int qte) {
		Produit p = new Produit(nom, prix, qte);
		dao.create(p);
		return cat.addProduit(nom, prix, qte);
	}
	
	public  boolean removeProduit(String nom) {
		dao.delete(nom);
		return cat.removeProduit(nom);
	}
	
	
}
