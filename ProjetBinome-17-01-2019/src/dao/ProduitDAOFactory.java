package dao;

public class ProduitDAOFactory {
	public ProduitDAOFactory() {
		
	}
	
	public I_ProduitDAO createProduitDAOInterface() {
		return new ProduitDAO();
	}
}
