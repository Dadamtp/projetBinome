package dao;

import java.sql.*;
import java.util.List;

import metier.I_Produit;

public class ProduitDAO implements I_ProduitDAO {
	private Statement st;
	private ResultSet rs;
	private Connection cn;

	public ProduitDAO() {
		
	}
	
	@Override
	public boolean create(I_Produit produit) {
		// TODO Auto-generated method stub
		return false;
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
