package com.ferromex.examen.animales;

public class Perro {
	public String raza;

	/*Constructor*/
	public Perro(String raza) {
		super();
		this.raza = raza;
	}
	
	/*Agregar Getters y Setters*/
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	/*Metodos*/
	public void cuidaVacas(){
		System.out.println("Perro cuidando vacas");
	}	
}
