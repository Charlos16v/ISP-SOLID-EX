package edu.pingpong.isp;

public class App {

    public static void main(String[] args) {

        

        ProcesadorTexto procesador = new ProcesadorTexto();

        procesador.nueva("Aguila");
        procesador.nueva("laureada");
        procesador.nueva("sobrevuela");
        procesador.nueva("el");
        procesador.nueva("mar");

        System.out.println(procesador.texto());


    }
}
