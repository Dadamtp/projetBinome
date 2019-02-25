package controleur;

import metier.Catalogue;

public class ctrlStock {
	private Catalogue cat = Catalogue.getInstance();

	public String getStock() {
		return cat.toString();
	}
}
