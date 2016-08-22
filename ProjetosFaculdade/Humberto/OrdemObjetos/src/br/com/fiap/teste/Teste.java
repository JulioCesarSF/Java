package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fiap.beans.Cargo;

public class Teste {

	public static void main(String[] args) {
		Cargo c1 = new Cargo("DBA", "Junior", 3500);
		Cargo c2 = new Cargo("Estagiario", "Pleno", 5500);
		Cargo c3 = new Cargo("Analista", "Junior", 3000);
		
		List<Cargo> cargos = new ArrayList<>();
		cargos.add(c1);
		cargos.add(c2);
		cargos.add(c3);	
		
		Collections.sort(cargos);
				
	//	Collections.sort(cargos);
		
		for(Cargo c : cargos)
			System.out.println(c.getTudo());
		
		//System.out.println(cargos);

	}

}
