package com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie;

import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.Panthera;

public class PantheraTigris extends Panthera {

	public PantheraTigris() {
		super();
		super.especie = "Panthera tigris";
		super.nombreComun = "Tigre";
	}
	
	public PantheraTigris(String nombre) {
		this();
		super.nombre = nombre;
	}
}
