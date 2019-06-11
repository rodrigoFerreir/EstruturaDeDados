package dados.estrutura.estudos;

public class Teste {
	 static int[] L = new int[5];
	
	public static void criarLista(int[] lista, int valor) {
		for(int i =0; i<=lista.length; i++) {
			if(lista[i]== 0) {
				lista[i]= valor;
				break;
			}
		}
		
		
	}
	
	public static void mostrarLista(int[] lista) {
		
		for(int i = 0; i<=lista.length; i++) {
			if (i == lista.length) {
				System.out.println("fim da lista");
				break;
			}
			System.out.println(lista[i]);
			
		}
		
		
	}
	
	public void buscaDeSentinela(int[] lista, int chave) {
		
		for(int i = 0; i<=lista.length; i++) {
			if(lista[i] == chave) {
				System.out.println("O valor foi encontrado:" + chave);
				break;
			}
		}		
	}


	public static void main(String[] args) {
		
		Teste T = new Teste();
		
		Teste.criarLista(L, 7);
		Teste.criarLista(L, 5);
		Teste.criarLista(L, 8);
		Teste.criarLista(L, 9);
		Teste.criarLista(L, 0);
		Teste.criarLista(L, 12);
		
		Teste.mostrarLista(L);
		
		T.buscaDeSentinela(L, 12);
	}

}
