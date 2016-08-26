package br.com.fainor.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fainor.model.Disciplina;

public class DisciplinaDao {

	public List<Disciplina> todos() {
		List<Disciplina> disciplinas = new ArrayList<>();
		disciplinas.add(new Disciplina(1L, "Mecanica", "ENG-450"));
		disciplinas.add(new Disciplina(2L, "Fisica 3", "ENG-449"));
		disciplinas.add(new Disciplina(3L, "Equacoes Diferenciais", "ENG-470"));
		return disciplinas;
	}

	public Disciplina porId(Long id) {
		for (Disciplina disciplinas : todos()) {
			if (disciplinas.getId() == id) {
				return disciplinas;
			}
		}
		return null;
	}
}
