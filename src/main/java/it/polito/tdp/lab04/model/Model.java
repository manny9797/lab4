package it.polito.tdp.lab04.model;

import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.DAO.StudenteDAO;

public class Model {

	CorsoDAO corsoDao;
	StudenteDAO studenteDao;

	public Model() {
		corsoDao = new CorsoDAO();
		studenteDao = new StudenteDAO();
	}

	public List<Corso> getTuttiICorsi() {
		return corsoDao.getTuttiICorsi();
	}
	
	public List<String> getNomeECognome(Integer matricola) {
	return this.studenteDao.getNomeECognome(matricola);
	}
}
