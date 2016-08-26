package br.com.fainor.model;

import java.util.Date;

public class Frequencia {
	private Long id;
	private Aluno aluno;
	private Disciplina disciplina;
	private Date dateFrequencia;
	private Professor professor;
	private Boolean faltou;

	public Frequencia(Professor professor, Disciplina disciplina, Aluno aluno, Date data,
			 Boolean faltou) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.professor = professor;
		this.faltou = faltou;
		this.dateFrequencia = data;
	}

	public Frequencia(Date dateFrequencia) {
		super();
		this.dateFrequencia = dateFrequencia;
	}

	public Boolean getFaltou() {
		return faltou;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public void setFaltou(Boolean faltou) {
		this.faltou = faltou;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Date getDateFrequencia() {
		return dateFrequencia;
	}

	public void setDateFrequencia(Date dateFrequencia) {
		this.dateFrequencia = dateFrequencia;
	}

	public void gera_relatorio() {

	}
}
