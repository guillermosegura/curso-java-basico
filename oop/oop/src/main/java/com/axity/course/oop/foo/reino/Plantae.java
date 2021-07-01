package com.axity.course.oop.foo.reino;

import com.axity.course.oop.foo.SerVivo;

public class Plantae extends SerVivo {

	protected String subreino;
	protected String division;

	protected String tribu;
	protected String subtribu;

	public Plantae() {
		super("Plantae");
	}

	public String getSubreino() {
		return subreino;
	}

	public String getDivision() {
		return division;
	}

	public String getTribu() {
		return tribu;
	}

	public String getSubtribu() {
		return subtribu;
	}

	@Override
	public String toString() {

		String str;

		str = "Nombre común:" + this.nombreComun;

		str += "\nReino:" + this.reino;
		str += "\nSubreino:" + this.subreino;
		str += "\nDivision:" + this.division;
		str += "\nClase:" + this.clase;
		str += "\nOrden:" + this.orden;
		str += "\nFamilia:" + this.familia;
		str += "\nSubfamilia:" + this.subfamilia;
		str += "\nTribu:" + this.tribu;
		str += "\nSubtribu:" + this.subtribu;
		str += "\nGenero:" + this.genero;
		str += "\nEspecie:" + this.especie;
		if (this.subespecie != null) {
			str += "\nSubespecie:" + this.subespecie;
		}
		return str;
	}
}
