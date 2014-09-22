package com.ferromex.examen.animales;

public class Pato {
	/*Atributos*/
	public String granja;

	/*constructor*/
	public Pato(String granja) {
		super();
		this.granja = granja;
	}

	/*Getters y Setters*/
	public String getGranja() {
		return granja;
	}

	public void setGranja(String granja) {
		this.granja = granja;
	}
	
	/*Metodos*/
	public void volar(){
		System.out.println("Pato volando");
	}
	
}

