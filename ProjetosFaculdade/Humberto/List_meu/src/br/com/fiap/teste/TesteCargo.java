package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.com.fiap.beans.Cargo;

public class TesteCargo {

	public static void main(String[] args) {
		Cargo c1 = new Cargo("DBA", "Junior", 3500);
		Cargo c2 = new Cargo("Estagiário", "Pleno", 5500);
		Cargo c3 = new Cargo("Analista", "Junior", 3000);
		List<Cargo> cargos = new ArrayList<Cargo>(Arrays.asList(c1, c2, c3));

		// cargos.add(c1);
		// cargos.add(c2);
		// cargos.add(c3);

		Collections.sort(cargos, (Cargo a, Cargo b) -> Double.compare(a.getSalario(), b.getSalario()));

		// System.out.println(cargos);

		/*
		 * for(Cargo c : cargos){ System.out.println(c.getTudo()); }
		 */

		cargos.forEach(x -> System.out.println(x.getCargo()));

		/*
		 * Iterator<Cargo> c = cargos.iterator(); while (c.hasNext()) {
		 * System.out.println(c.next().getTudo()); }
		 */

	}

}
