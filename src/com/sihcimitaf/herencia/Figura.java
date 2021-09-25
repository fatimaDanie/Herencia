package com.sihcimitaf.herencia;

public abstract class Figura {
	//ambitos son public, private y protected
	private double dim1;
	private double dim2; // private solo lo ve la clase
	protected String nombre; // Lo ve el papa y el hijo

	public Figura(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	//Pueden tener metodos smples
	public String colorear(){
		return "se colorea";
	};
	// las clases abstractas deben de tener como minimo un metodo abbstracto y estos
	//deben de ser solo la firma. no debe de terner llaves (no debe de tener cuerpo )
	public abstract double area();
	public abstract double perimetro();
// El encapsulamiento solo va por laspropiedades privada, no por los protegidos
	public double getDim1() {
		return dim1;
	}

	public void setDim1(double dim1) {
		this.dim1 = dim1;
	}

	public double getDim2() {
		return dim2;
	}

	public void setDim2(double dim2) {
		this.dim2 = dim2;
	}

	@Override
	public String toString() {
		return "Figura{" +
				"dim1=" + dim1 +
				", dim2=" + dim2 +
				", nombre='" + nombre + '\'' +
				'}';
	}
}
