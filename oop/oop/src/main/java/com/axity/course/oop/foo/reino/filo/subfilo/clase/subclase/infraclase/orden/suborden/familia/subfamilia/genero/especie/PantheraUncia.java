package com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie;

import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.Panthera;

public class PantheraUncia extends Panthera {

	public PantheraUncia() {
		super();
		super.especie = "Panthera uncia";
		super.nombreComun = "Leopardo de las nieves";
	}

	public PantheraUncia(String nombre) {
		this();
		super.nombre = nombre;
	}
}
