package com.axity.course.oop;

import com.axity.course.oop.foo.reino.Animalia;
import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.Carnivora;
import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie.CanisLupus;
import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie.FelisCatus;
import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie.UrsusAmericanus;
import com.axity.course.oop.foo.reino.filo.subfilo.clase.subclase.infraclase.orden.suborden.familia.subfamilia.genero.especie.subespecie.CanisLupusFamiliaris;

public class HerenciaApp {

	private void ejemplos() {
		CanisLupus loboFidencio = new CanisLupus("Fidencio");

		System.out.println(loboFidencio);

		System.out.println("---------");

		FelisCatus gatoFelix = new FelisCatus("Felix");

		System.out.println(gatoFelix);

		System.out.println("---------");

		CanisLupusFamiliaris valentin = new CanisLupusFamiliaris("Valentín");
		System.out.println(valentin);
	}

	public static void main(String[] args) {

		HerenciaApp app = new HerenciaApp();
//		app.ejemplos();
//		app.esUn();
		app.overriding();

	}

	private void overriding() {
		Hija hija = new Hija();
		hija.doSomething();
		
		
		Padre padre = new Padre();
		padre.doSomething();
		
		Object o = padre;
		
		Padre p = hija;
		p.name = "Hola";
		((Hija)p).name="Hello";
		p.doSomething();
		
		Hija h = new Hija();
		h.name = "Hija";
		
		((Padre)h).name = "Padre";
		
		int a = 1;
	}

	private void esUn() {
		CanisLupus loboFidencio = new CanisLupus("Fidencio");
		FelisCatus gatoFelix = new FelisCatus("Felix");
		CanisLupusFamiliaris valentin = new CanisLupusFamiliaris("Valentín");
		UrsusAmericanus yogi = new UrsusAmericanus("Yogi");

		System.out.println(loboFidencio instanceof Animalia);
		System.out.println(loboFidencio instanceof Carnivora);
	}
}
