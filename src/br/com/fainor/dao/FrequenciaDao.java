package br.com.fainor.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fainor.model.Frequencia;

public class FrequenciaDao {
	ProfessorDao professor = new ProfessorDao();
	DisciplinaDao disciplina = new DisciplinaDao();
	AlunoDao aluno = new AlunoDao();
	Frequencia frequencia = new Frequencia(new Date());

	public List<Frequencia> todos() {
		Date df = new Date();
		List<Frequencia> caderneta = new ArrayList<>();
		caderneta.add(new Frequencia(this.professor.porId(1L), this.disciplina.porId(1L), this.aluno.porId(1L),df, true));
		caderneta.add(new Frequencia(this.professor.porId(1L), this.disciplina.porId(1L), this.aluno.porId(2L),df, false));
		caderneta.add(new Frequencia(this.professor.porId(1L), this.disciplina.porId(1L), this.aluno.porId(3L),df, false));
		caderneta.add(new Frequencia(this.professor.porId(1L), this.disciplina.porId(1L), this.aluno.porId(4L),df, false));
		
		return caderneta;
	}
}