package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudenteDAO {
	
	public List<String> getNomeECognome(Integer matricola) {
		
		List<String> lista = new ArrayList<String>();
		final String sql="SELECT nome FROM studenti WHERE matricola = ?";
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);

			ResultSet rs = st.executeQuery();
	
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				
				lista.add(nome);
				lista.add(cognome);

			conn.close();	
			return lista;
			
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
		
	}

}
