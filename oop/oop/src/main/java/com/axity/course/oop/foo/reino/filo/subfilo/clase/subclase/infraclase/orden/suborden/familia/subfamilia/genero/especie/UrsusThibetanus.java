package com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie;

import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.Ursus;

public class UrsusThibetanus extends Ursus {

	public UrsusThibetanus() {
		super();
		super.especie = "Ursus Thibetanus";
		super.nombreComun = "Oso negro asiático";
	}
	
	public UrsusThibetanus(String nombre) {
		this();
		super.nombre = nombre;
	}
}
