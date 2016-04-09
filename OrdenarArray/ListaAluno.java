package modelos;

/**
 * Classe responsável pelo gerenciamento de alunos.
 *
 */
public class ListaAluno {
	
	private Aluno[] alunos;
	
	/**
	 * Construtor para instanciar o array de alunos.
	 */
	public ListaAluno(){		
		alunos = new Aluno[0];
	}	
	
	/**
	 * 
	 * Adicionar aluno sem precisar indicar lista.
	 * Sem opção de ordem.
	 * 
	 * @param novoAluno
	 * 
	 */
	public void addAluno(Aluno novoAluno){
		alunos = setListaAlunos(alunos, novoAluno);
	}	
	
	/**
	 * 
	 * Adicionar aluno indicando o objeto do Aluno e se quer ordenar a lista.
	 * 
	 * @param novoAluno
	 * @param colocarEmOrdem
	 */
	public void addAluno(Aluno novoAluno, boolean colocarEmOrdem){
		alunos = setListaAlunos(alunos, novoAluno);
		if(colocarEmOrdem)
			ordenar();
	}
	
	/**
	 * 
	 * Adicionar o aluno indicando o array antigo de alunos e o novo objeto Aluno.
	 * 
	 * @param listaVelha
	 * @param novoAluno
	 */
	public void addAluno(Aluno[] listaVelha, Aluno novoAluno){
		alunos = setListaAlunos(listaVelha, novoAluno);
	}	
	
	/**
	 * 
	 * Print de todos os nomes dos objetos Aluno.
	 * Com indice.
	 */
	public void listar(){
		for(int i = 0; i < alunos.length; i++)
			System.out.println(alunos[i].getNome());
	}	
	
	/**
	 * 
	 * Ordenar o array de objetos Aluno pelo nome usando "compareTo"
	 * 
	 */
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
	
	/**
	 * 
	 * Função para gerar novo array de objetos Aluno contento um novo Aluno.
	 * Função interna(private)
	 * 
	 * @param listaVelha
	 * @param novoAluno
	 * @return um novo array com o novo objeto Aluno
	 */
	private Aluno[] setListaAlunos(Aluno[] listaVelha, Aluno novoAluno){
		Aluno[] novaLista = new Aluno[listaVelha.length + 1];
		
		for(int i = 0; i < listaVelha.length; i++)
			novaLista[i] = listaVelha[i];
		
		novaLista[novaLista.length - 1] = novoAluno;
		
		return novaLista;
	}	
		
	public Aluno[] getListaAlunos(){
		return this.alunos;
	}

}
