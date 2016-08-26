package br.com.fainor.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fainor.model.Aluno;

public class AlunoDao {

	public List<Aluno> todos(){
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno(1L, "Rodrigo" ,"055.854.478-87", "072227732")); 
		alunos.add(new Aluno(2L, "Joao","964.745.854-72", "0754587145"));
		alunos.add(new Aluno(3L, "Marcos","874.455.254-89", "0758087145"));
		alunos.add(new Aluno(4L, "Ricardo","455.254.789-78","0754707145"));
		return alunos; 
	}
	
	
	public Aluno porId(Long id){
		for(Aluno aluno: todos()){ 
			if(aluno.getId()== id){
				return aluno;
			}
		}
		return null;
	}
	public void salva(Aluno aluno){  
		System.out.println("O aluno:" + aluno.getNome() + " foi salvo com sucesso.");
	}
}
