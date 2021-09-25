package com.sihcimitaf.herencia;

import com.sihcimitaf.interfaces.Imprimible;
import com.sihcimitaf.interfaces.Dibujable;

public class Rectangulo extends Figura implements Imprimible,  Dibujable {

	public Rectangulo(double dim1, double dim2) {
		super(dim1, dim2);
		this.nombre = "Rectangulo";
	}

	@Override
	public double area() {
		return this.getDim1() * this.getDim2();
	}

	@Override
	public double perimetro() {
		return 0;
	}

	@Override
	public void imprimir() {
		System.out.println("Imprime Rectangulo");
	}

	@Override
	public void dibujar() {
		System.out.println(String.format("Se dibuja %s", this.nombre, Dibujable.COLOR));
	}
}
