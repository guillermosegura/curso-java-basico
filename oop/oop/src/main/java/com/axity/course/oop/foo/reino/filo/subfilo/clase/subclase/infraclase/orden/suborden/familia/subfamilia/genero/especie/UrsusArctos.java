package com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie;

import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.Ursus;

public class UrsusArctos extends Ursus {

	public UrsusArctos() {
		super();
		super.especie = "Ursus arctos";
		super.nombreComun = "Oso pardo";
	}
	
	public UrsusArctos(String nombre) {
		this();
		super.nombre = nombre;
	}
}
