package com.sihcimitaf.herencia;

public abstract class Mensaje {

	private String mensaje;

	public abstract void enviar ();

	public void recibir(){
		System.out.println("Se recibe mensaje");
	}
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
