package listaEncadeada.atividadePessoa;

import java.util.Scanner;

public class VisinhosDoPeito {
	
	public static ListadeVisinhos percorrer(ListadeVisinhos listE){
		
		if(listE.visinho != null) {
			System.out.println(listE.visinho.nome);
			System.out.println(listE.visinho.Ncasa);
			System.out.println(listE.visinho.Rua);
			}
		
		if(listE.visinhoDaDireita != null) {
			percorrer(listE.visinhoDaDireita);
		}
		 return null;
	}
	
	public static Pessoa cadastrarPessoa() {
		@SuppressWarnings("resource")// remove warn
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite nome:");
		String nome = sc.nextLine();
		
		System.out.println("Digite Numero da casa:");
		String Ncasa = sc.nextLine();
		
		System.out.println("Digite a Rua:");
		String Rua = sc.nextLine();
		
		return new Pessoa(nome, Ncasa, Rua);
	}
	
	public static void addVisinho(ListadeVisinhos listE) {
		
		if(listE.visinhoDaDireita == null) {
			ListadeVisinhos novoVisi = new ListadeVisinhos();
			novoVisi.visinho = cadastrarPessoa();
			listE.visinhoDaDireita = novoVisi;
		}else {
			addVisinho(listE.visinhoDaDireita);
		}
	}
	

	public static void main(String[] args) {
		ListadeVisinhos list = new ListadeVisinhos();
		
		addVisinho(list);
		percorrer(list);
	
	}

}
