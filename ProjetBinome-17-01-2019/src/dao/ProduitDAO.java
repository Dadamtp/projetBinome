package dao;

import java.sql.*;
import java.util.List;

import metier.I_Produit;

public class ProduitDAO implements I_ProduitDAO {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cn;

	public ProduitDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@gloin:1521:iut", "perezd", "123");
			//st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			//rs = st.executeQuery("SELECT codePersonne, nomPersonne, prenomPersonne, agePersonne FROM Personnes ORDER BY agePersonne DESC NULLS LAST");

		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean create(I_Produit produit) {
		String nom = produit.getNom();
		int quantite = produit.getQuantite();
		double prix = produit.getPrixUnitaireHT();
		
		try {
			ps = cn.prepareStatement("{call ajoutProduits(?, ?, ?}");
			ps.setString(1, nom);
			ps.setInt(2, quantite);
			ps.setDouble(3, prix);
			ps.execute();
		} 
		catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	public boolean update(I_Produit produit) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean delete(I_Produit produit) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public I_Produit read(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<I_Produit> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
