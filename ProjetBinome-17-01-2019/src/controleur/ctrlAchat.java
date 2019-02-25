package controleur;

import metier.Catalogue;

public class ctrlAchat {
	private Catalogue cat = Catalogue.getInstance();
	
	public  boolean acheterStock(String nomProduit, int qteAchetee) {
		return cat.acheterStock(nomProduit, qteAchetee);
	}
	public  boolean vendreStock(String nomProduit, int qteVendue) {
		return cat.vendreStock(nomProduit, qteVendue);
	}
}
