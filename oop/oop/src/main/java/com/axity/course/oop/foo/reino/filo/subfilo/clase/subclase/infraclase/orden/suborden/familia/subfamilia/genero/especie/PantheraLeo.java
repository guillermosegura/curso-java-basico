package com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie;

import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.Panthera;

public class PantheraLeo extends Panthera {

	public PantheraLeo() {
		super();
		super.especie = "Panthera leo";
		super.nombreComun = "León";
	}

	public PantheraLeo(String nombre) {
		this();
		super.nombre = nombre;
	}
}
