package br.com.fiap.teste;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.beans.Cargo;

public class TesteMap {

	public static void main(String[] args) {
		Cargo cargo1 = new Cargo("Estagiario", "Pleno", 2500);
		Cargo cargo2 = new Cargo("Estagiario", "Junior", 2000);

		Map<String, Cargo> mapaCargos = new HashMap<String, Cargo>();
		// adicionando
		mapaCargos.put("1", cargo1);
		mapaCargos.put("2", cargo2);

		// retornando um objeto atraves da chave
		Cargo objCargo = mapaCargos.get("1");
		System.out.println(objCargo.getCargo());

		// exibir chaves [1, 2]
		System.out.println(mapaCargos.keySet());
		
		// exibino os valores dos objetos
		for(Cargo c: mapaCargos.values())
			System.out.println(c.getTudo());
	}

}