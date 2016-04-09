package modelos;

public class ListaAluno {
	
	private Aluno[] alunos;
	
	public ListaAluno(){		
		alunos = new Aluno[0];
	}
	
	public void listar(){
		for(int i = 0; i < alunos.length; i++)
			System.out.println(alunos[i].getNome());
	}
	
	private Aluno[] setListaAlunos(Aluno[] listaVelha, Aluno novoAluno){
		Aluno[] novaLista = new Aluno[listaVelha.length + 1];
		
		for(int i = 0; i < listaVelha.length; i++)
			novaLista[i] = listaVelha[i];
		
		novaLista[novaLista.length - 1] = novoAluno;
		
		return novaLista;
	}
	
	public void ordenar(){
		for(int i = 0; i < alunos.length; i++){			
			for(int j = i + 1; j < alunos.length; j++){				
				Aluno temp = new Aluno();				
				if(alunos[i].getNome().compareTo(alunos[j].getNome()) > 0){
					temp.setNome(alunos[i].getNome());
					alunos[i].setNome(alunos[j].getNome());
					alunos[j].setNome(temp.getNome());
				}				
			}			
		}
	}

	public void addAluno(Aluno novoAluno){
		alunos = setListaAlunos(alunos, novoAluno);
	}
	
	public void addAluno(Aluno[] listaVelha, Aluno novoAluno){
		alunos = setListaAlunos(listaVelha, novoAluno);
	}	
		
	public Aluno[] getListaAlunos(){
		return this.alunos;
	}

}
