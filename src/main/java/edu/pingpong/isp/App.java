package edu.pingpong.isp;

public class App {

    public static void main(String[] args) {

        System.out.println("========EJEMPLO PROCESADOR TEXTO========" + '\n');

        ProcesadorTexto procesador = new ProcesadorTexto();

        procesador.nueva("Aguila");
        procesador.nueva("laureada");
        procesador.nueva("sobrevuela");
        procesador.nueva("el");
        procesador.nueva("mar");

        System.out.println(procesador.texto());


    }
}
