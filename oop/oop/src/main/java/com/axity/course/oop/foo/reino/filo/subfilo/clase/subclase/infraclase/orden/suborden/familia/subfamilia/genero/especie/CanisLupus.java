package com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie;

import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.Canis;

public class CanisLupus extends Canis {

	public CanisLupus() {
		super();
		super.especie = "Canis lupus";
		super.nombreComun = "Lobo";
	}
	
	public CanisLupus(String nombre) {
		this();
		super.nombre = nombre;
	}
}
