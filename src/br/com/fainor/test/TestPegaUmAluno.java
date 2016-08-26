package br.com.fainor.test;

import br.com.fainor.dao.AlunoDao;

public class TestPegaUmAluno {
	public static void main(String[] args) {
		AlunoDao dao = new AlunoDao();
		System.out.println("O aluno é " + dao.porId(4L).getNome());
	}
}