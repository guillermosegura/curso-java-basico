package com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie;

import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.Ursus;

public class UrsusAmericanus extends Ursus {

	public UrsusAmericanus() {
		super();
		super.especie = "Ursus americanus";
		super.nombreComun = "Oso americano";
	}

	public UrsusAmericanus(String nombre) {
		this();
		super.nombre = nombre;
	}
}
