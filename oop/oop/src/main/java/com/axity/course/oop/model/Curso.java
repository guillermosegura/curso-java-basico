package com.axity.course.oop.model;

import java.util.List;

public class Curso {

	private String name;
	private Academia academia;
	private Profesor professor;

	private List<Estudiante> estudiantes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Academia getAcademia() {
		return academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
	}

	public Profesor getProfessor() {
		return professor;
	}

	public void setProfessor(Profesor professor) {
		this.professor = professor;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
