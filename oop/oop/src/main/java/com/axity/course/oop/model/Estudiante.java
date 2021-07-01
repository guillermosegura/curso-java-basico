package com.axity.course.oop.model;

import java.util.List;

public class Estudiante extends Persona {

	private String matricula;

	private List<Curso> cursos;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

}
