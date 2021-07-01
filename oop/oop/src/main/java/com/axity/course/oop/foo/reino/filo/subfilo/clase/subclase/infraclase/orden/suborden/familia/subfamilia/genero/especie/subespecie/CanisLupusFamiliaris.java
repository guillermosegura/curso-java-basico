package com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie.subespecie;

import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie.CanisLupus;

public class CanisLupusFamiliaris extends CanisLupus {
	public CanisLupusFamiliaris() {
		super();
		super.nombreComun = "Perro";
		super.subespecie = "Canis lupus familiaris";

	}

	public CanisLupusFamiliaris(String nombre) {
		this();
		super.nombre = nombre;
	}
}
