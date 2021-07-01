package com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie;

import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.Panthera;

public class PantheraOnca extends Panthera {

	public PantheraOnca() {
		super();
		super.especie = "Panthera onca";
		super.nombreComun = "Jaguar";
	}
	
	public PantheraOnca(String nombre) {
		this();
		super.nombre = nombre;
	}
}
