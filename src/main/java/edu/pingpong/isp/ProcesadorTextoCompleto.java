package edu.pingpong.isp;

import java.util.ArrayList;
import java.util.List;

public class ProcesadorTextoCompleto extends ProcesadorTexto implements Compleja {

    private final List<String> texto = new ArrayList<>();

    @Override
    public boolean correcto (Idioma idioma) {
        for (String palabra: texto) {
            if (! idioma.diccionario.contains(palabra.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
