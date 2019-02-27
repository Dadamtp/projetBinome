package controleur;

import dao.I_ProduitDAO;
import dao.ProduitDAOFactory;
import metier.Catalogue;

public class ctrlAchat {
	private Catalogue cat = Catalogue.getInstance();
	private I_ProduitDAO dao;
	
	public ctrlAchat() {
		dao = ProduitDAOFactory.getInstance().createProduitDAOInterface();
	}
	
	public  boolean acheterStock(String nomProduit, int qteAchetee) {
		//dao.update(produit);
		return cat.acheterStock(nomProduit, qteAchetee);
	}
	public  boolean vendreStock(String nomProduit, int qteVendue) {
		//dao.update(produit);
		return cat.vendreStock(nomProduit, qteVendue);
	}
	public String[] getStockInTab() {
		return Catalogue.getInstance().getNomProduits();
	}
}
