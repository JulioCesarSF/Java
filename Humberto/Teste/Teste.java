import com.julio.exception.Excecoes;

public class Teste {
	
	public static void main(String[] args) throws Excecoes {		
		String tmp[] = new String[1];
		
		try {
			tmp[20] = new String("20");	
		} catch (Exception e) {
			throw new Excecoes(e, false);
		}

	}

}
