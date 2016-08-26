package br.com.fainor.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.fainor.model.Professor;

public class ProfessorDao {
	public List<Professor> todos(){
	List<Professor> professores = new ArrayList<>();
	professores.add(new Professor(1L,"Milton", "888.877.778-45","milton@fainor.com.br"));
	professores.add(new Professor(2L,"Aparecido", "888.899.996-54","aparecido@fainor.com.br"));
	professores.add(new Professor(3L,"Stenio", "888.988.883-34","stenio@fainor.com.br"));
	return professores;
	}
	
	public Professor porId(Long id){
		for(Professor professores: todos()){
			if(professores.getId()== id){
				return professores;
			}
		}
		return null;
	}
}
