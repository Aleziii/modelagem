package br.com.fainor.model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
	private String matricula;
	private List<Aula> aulas = new ArrayList<>();
	private String Senha;

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public Professor(Long id, String nome, String cpf, String email) {
		super(id, nome, cpf);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

}
