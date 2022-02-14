package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso curso1 = new Curso(); 
		curso1.setTitulo("Spring boot");
		curso1.setDescricao("Aprenda a criar uma REST Api com Spring Boot");
		curso1.setCargaHoraria(6);
		
		
		Curso curso2 = new Curso(); 
		curso2.setTitulo("POO");
		curso2.setDescricao("Desvende os segredos basico das programacao orientada objetos");
		curso2.setCargaHoraria(5);
		
		Mentoria mentoria1 = new Mentoria();
		Mentoria mentoria2 = new Mentoria();
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Desenvolva habilidades em Java");
		mentoria1.setData(LocalDate.now());
		
		mentoria2.setTitulo("Mentoria Back-End");
		mentoria2.setDescricao("Veja as principais necessidadas de um profissional Back-End");
		mentoria2.setData(null);
		
		Conteudo conteudo = new Curso();
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Desenvolva habilidades em Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev dev1 = new Dev();
		dev1.setNome("Joao");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + dev1.getConteudosInscritos());
		System.out.println("--------------------------------------------------");
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteudos Inscritos" + dev1.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + dev1.getConteudosConcluidos());
		System.out.println("Xp:"+ dev1.calcularTotalXp());
		
		
		System.out.println("_______________________________________________________");
		
		
		
		Dev dev2 = new Dev();
		dev2.setNome("Ana");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos" + dev2.getConteudosInscritos());
		System.out.println("-----------------------------------------------------");
		dev2.progredir();
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteudos Inscritos" + dev2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + dev2.getConteudosConcluidos());
		System.out.println("Xp:"+ dev2.calcularTotalXp());
		
		
		
		
		
		
	 /* System.out.println(curso1); 
	  System.out.println(curso2);
	  System.out.println(mentoria1);
	  System.out.println(mentoria2);
	  System.out.println(conteudo); */
		
		
		
		
		
		
		
		
	}

}
