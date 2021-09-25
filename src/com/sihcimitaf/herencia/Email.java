package com.sihcimitaf.herencia;

import com.sihcimitaf.interfaces.Imprimible;

public class Email extends Mensaje implements Imprimible {
	@Override
	public void enviar() {
		System.out.println("Se envia el mensaje");
	}

	@Override
	public void imprimir() {
		System.out.println("imprimiendo email");
		System.out.println(this.getMensaje());
	}
}
