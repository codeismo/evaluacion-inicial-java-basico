package com.ferromex.examen.animales;

public class Mamifero {
	/*Atributos*/
	private int mesesDeGestacion;
	private int mesesLactancia;

	/*Constructores*/
	public Mamifero() {
		super();
		this.mesesDeGestacion = 7;
		this.mesesLactancia = 4;
	}
	
	public Mamifero(int mesesDeGestacion, int mesesLactancia) {
		super();
		this.mesesDeGestacion = mesesDeGestacion;
		this.mesesLactancia = mesesLactancia;
	}
	
	/*Getters y Setters*/	
	public int getMesesDeGestacion() {
		return mesesDeGestacion;
	}

	public void setMesesDeGestacion(int mesesDeGestacion) {
		this.mesesDeGestacion = mesesDeGestacion;
	}

	public int getMesesLactancia() {
		return mesesLactancia;
	}

	public void setMesesLactancia(int mesesLactancia) {
		this.mesesLactancia = mesesLactancia;
	}

	/*Metodos*/
	public void tomarLeche(){
		System.out.println("Tomando Leche por " + this.mesesLactancia);
	}
	
}
