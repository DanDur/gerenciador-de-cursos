package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	
	public static void main(String[] args) {
		//Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>();

		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Stepat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Sagio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		
		System.out.println(pauloEstaMatriculado);

		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			
			System.out.println(aluno);
			
		}
		
		alunos.forEach(aluno -> {
			
			System.out.println(aluno);
		});



		System.out.println(alunos);
		
		
		//assim pegamos a lista e podemos modifica-la usando o metodo get, por exemplo
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
	}

}
