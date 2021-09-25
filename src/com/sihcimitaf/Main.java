package com.sihcimitaf;

import com.sihcimitaf.herencia.Email;
import com.sihcimitaf.herencia.Figura;
import com.sihcimitaf.herencia.Rectangulo;
import com.sihcimitaf.herencia.Triangulo;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Aqui vamos a usar polimorfismo
        Figura[] figuras = {new Rectangulo(12,12), new Triangulo(26,6)};
        for (Figura figura: figuras) {
            System.out.println("\n ** Figuras ** \n"); //\n son saltos de linea
            System.out.println(figura);
            System.out.println("area :: " + figura.area());

            // cast es un apuntador para tomar las implementacions de clases hijas
            if(figura instanceof Rectangulo){
                ((Rectangulo) figura).imprimir();
                ((Rectangulo) figura).dibujar();
            }
            if(figura instanceof Triangulo){
                Triangulo triangulo = (Triangulo) figura;  //Hacerla hijo por un momento
                triangulo.imprimir();
                triangulo.dibujar();
            }
        }

        System.out.println("\n\n ** Email **");
        Email email = new Email();
        //El string buffer es para concatenaciones
        StringBuffer mensaje = new StringBuffer();
        mensaje.append("Este es un mensaje \n");
        mensaje.append("Este s otro mensaje de concatenacion \n");
        mensaje.append("uyyy muchos mensajes  ");
        email.setMensaje(mensaje.toString());
        System.out.println("\n ** Se imprime mensaje **");
        email.imprimir();
        System.out.println(" \n ** Se envia mensaje **");
        email.enviar();
    }
}
