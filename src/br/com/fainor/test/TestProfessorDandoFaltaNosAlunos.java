package br.com.fainor.test;

import java.text.SimpleDateFormat;

import br.com.fainor.dao.FrequenciaDao;
import br.com.fainor.model.Frequencia;

public class TestProfessorDandoFaltaNosAlunos {

	public static void main(String[] args) {
		FrequenciaDao frequencia = new FrequenciaDao();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		for(Frequencia a: frequencia.todos()){
			System.out.println("Aluno: " + a.getAluno().getNome() + "\nFaltou? " + a.getFaltou() + "\nData: " +  df.format(a.getDateFrequencia()) + "\nProfessor: " + a.getProfessor().getNome() + "\n");
		}
	}
}
