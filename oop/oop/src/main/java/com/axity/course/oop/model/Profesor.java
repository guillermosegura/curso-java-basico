package com.axity.course.oop.model;

import java.util.List;

public class Profesor extends Empleado {

	private Academia academia;

	private List<Curso> cursos;

	public Academia getAcademia() {
		return academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

}
