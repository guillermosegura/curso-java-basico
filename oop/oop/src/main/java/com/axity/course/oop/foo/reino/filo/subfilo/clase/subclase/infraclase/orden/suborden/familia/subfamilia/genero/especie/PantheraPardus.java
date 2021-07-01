package com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie;

import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.Panthera;

public class PantheraPardus extends Panthera {

	public PantheraPardus() {
		super();
		super.especie = "Panthera pardus";
		super.nombreComun = "Leopardo";
	}
	
	public PantheraPardus(String nombre) {
		this();
		super.nombre = nombre;
	}
}
