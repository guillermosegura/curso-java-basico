package com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie;

import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.Felis;

public class FelisCatus extends Felis {

	public FelisCatus() {
		super();
		super.especie = "Felis catus";
		super.nombreComun = "Gato común";
	}
	
	public FelisCatus(String nombre) {
		this();
		super.nombre = nombre;
	}
}
