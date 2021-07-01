package com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie;

import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.Ursus;

public class UrsusMaritimus extends Ursus {

	public UrsusMaritimus() {
		super();
		super.especie = "Ursus maritimus";
		super.nombreComun = "Oso polar";
	}

	public UrsusMaritimus(String nombre) {
		this();
		super.nombre = nombre;
	}
}
