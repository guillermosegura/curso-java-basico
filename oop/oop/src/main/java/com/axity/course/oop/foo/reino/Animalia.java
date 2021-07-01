package com.axity.course.oop.foo.reino;

import com.axity.course.oop.foo.SerVivo;

public class Animalia extends SerVivo {

	protected String filo;
	protected String subfilo;
	protected String subclase;
	protected String infraclase;
	protected String suborden;

	protected String nombre;

	public Animalia() {
		super("Animalia");
	}

	public void mueve() {
		System.out.println("Mueve");
	}

	public String getFilo() {
		return filo;
	}

	public String getSubfilo() {
		return subfilo;
	}

	public String getSubclase() {
		return subclase;
	}

	public String getInfraclase() {
		return infraclase;
	}

	public String getSuborden() {
		return suborden;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {

		String str;
		if (this.nombre != null && !this.nombre.isEmpty()) {
			str = "[" + this.nombre + "]";
			str += "\nNombre común:" + this.nombreComun;
		} else {
			str = "Nombre común:" + this.nombreComun;
		}

		str += "\nReino:" + this.reino;
		str += "\nFilo:" + this.filo;
		str += "\nSubfilo:" + this.subfilo;
		str += "\nClase:" + this.clase;
		str += "\nSubclase:" + this.subclase;
		str += "\nInfraclase:" + this.infraclase;
		str += "\nOrden:" + this.orden;
		str += "\nSuborde:" + this.suborden;
		str += "\nFamilia:" + this.familia;
		str += "\nSubfamilia:" + this.subfamilia;
		str += "\nGenero:" + this.genero;
		str += "\nEspecie:" + this.especie;
		if (this.subespecie != null) {
			str += "\nSubespecie:" + this.subespecie;
		}
		return str;
	}
}
