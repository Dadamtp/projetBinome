package controleur;

import graphique.FenetreAffichage;
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
		if (cat.addProduit(nom, prix, qte))
		{
			dao.create(p);
			return true;
		}
		else
		{
			new FenetreAffichage("Création Impossible.");
			return false;
		}
	}
	
	public  boolean removeProduit(String nom) {
		dao.delete(nom);
		return cat.removeProduit(nom);
	}

	public  String[] getStockInTab() {
		return Catalogue.getInstance().getNomProduits();
	}
}
