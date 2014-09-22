package com.ferromex.examen.animales;

public class Animal {
	/*Atributos*/
	private String nombre;
	private int edad;
	private boolean enfermo;
		
	/*Constructores*/
	public Animal(){
		this.nombre = "Animalito";
		this.edad = 0;
		this.enfermo = false;
	};
	
	public Animal(String nombre, int edad, boolean enfermo) {
		this.nombre = nombre;
		this.edad = edad;
		this.enfermo = enfermo;
	}

	/*Getters y Setters*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEnfermo() {
		return enfermo;
	}

	public void setEnfermo(boolean enfermo) {
		this.enfermo = enfermo;
	}
	
	/*Métodos de funcionalidad*/
	public void mostrarInformacion(){
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Esta enfermo: " + this.enfermo);
	}
	
	/*Declarar método abstracto hacerRuido()*/
}
