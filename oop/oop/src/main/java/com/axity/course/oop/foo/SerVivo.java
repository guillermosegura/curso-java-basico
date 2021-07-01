package com.axity.course.oop.foo;

public class SerVivo {
	protected String reino;
	protected String clase;
	protected String orden;
	protected String familia;
	protected String subfamilia;
	protected String genero;
	protected String especie;
	protected String subespecie;
	protected String nombreComun;

	public SerVivo(String reino) {
		this.reino = reino;
	}

	public void come() {
		System.out.println("Come");
	}

	public void respira() {
		System.out.println("Respira");
	}

	public void reproduce() {
		System.out.println("Reproduce");
	}

	public String getReino() {
		return reino;
	}

	public String getClase() {
		return clase;
	}

	public String getOrden() {
		return orden;
	}

	public String getFamilia() {
		return familia;
	}

	public String getSubfamilia() {
		return subfamilia;
	}

	public String getGenero() {
		return genero;
	}

	public String getEspecie() {
		return especie;
	}

	public String getSubespecie() {
		return subespecie;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

}
