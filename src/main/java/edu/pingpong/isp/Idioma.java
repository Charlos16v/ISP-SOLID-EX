package edu.pingpong.isp;

import java.util.Arrays;
import java.util.List;

public enum Idioma {
	
	EN ("I","am","angry"), 
	ES ("el","camino"),
	CA ("el", "cami");
	
	List<String> diccionario;

	private Idioma(String ... palabras) {
		this.diccionario = Arrays.asList(palabras);
	}
	

}
