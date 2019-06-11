package binaria.arvore;

import java.util.Scanner;

public class ArvoreServico {

	public static Carro criarCarro() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Digite a placa:");
		 * String placa= sc.nextLine();
		 * System.out.println("Digite o modelo:");
		 * String modelo= sc.nextLine();
		 * System.out.println("Digite a cor:");
		 * String cor= sc.nextLine();
		 */
		System.out.println("Digite o ano:");
		int ano = sc.nextInt();
		return new Carro(ano);
	}

	public static Arvore addNo(Arvore arvore, Carro novoCarro) {
		if (arvore == null) {

			System.out.println("Add Raiz");
			arvore = new Arvore();
			arvore.Carro = novoCarro;
		} // quando noEsquerda esta vago
		else if (arvore.Carro.ano >= novoCarro.ano && arvore.NoEsquerda == null) {

			System.out.println("add NoEsquerda");
			Arvore novoNo = new Arvore();
			novoNo.Carro = novoCarro;
			arvore.NoEsquerda = novoNo;
			// quando noEsquerda esta ocupado
		} else if (arvore.Carro.ano > novoCarro.ano && arvore.NoEsquerda != null) {

			System.out.println("NoEsquerda Ocupado");

			arvore.NoEsquerda = addNo(arvore.NoEsquerda, novoCarro);

		} // quando noDireita esta vago

		else if (arvore.Carro.ano < novoCarro.ano && arvore.Carro == null) {

			System.out.println("Add NoDIreita");

			Arvore novoNo = new Arvore();
			novoNo.Carro = novoCarro;
			arvore.NoDireita = novoNo;
		} // quando noDireita nao esta vago
		else if (arvore.Carro.ano < novoCarro.ano && arvore.Carro != null) {
			System.out.println("NoDireita Ocupado");
			arvore.NoDireita = addNo(arvore.NoDireita, novoCarro);
		}
		return arvore;
	}

	public static void Pesquisar(Arvore arvore, int ano) {
		if (arvore == null) {
			System.out.println("Sem informacao");
		} else if (ano >= arvore.Carro.ano && arvore.NoEsquerda != null) {
			System.out.println(arvore.Carro.ano);
			Pesquisar(arvore.NoDireita, ano);
		} else if (ano < arvore.Carro.ano && arvore.Carro != null) {
			System.out.println(arvore.Carro.ano);
			Pesquisar(arvore.NoEsquerda, ano);
		}
	}

	public static void PercorrerPreOrdem(Arvore arvore) { // visita o no e depois percorre o lado esquerdo.
		if (arvore != null) {
			System.out.println(arvore.Carro.ano);
			PercorrerPreOrdem(arvore.NoEsquerda);
			PercorrerPreOrdem(arvore.NoDireita);
		}
	}

	public static void PercorrerInOrdem(Arvore arvore) { // visita o no enquanto percorre o lado esquerdo.
		if (arvore != null) {
			PercorrerInOrdem(arvore.NoEsquerda);
			System.out.println(arvore.Carro.ano);
			PercorrerInOrdem(arvore.NoDireita);
		}
	}

	public static void PercorrerPosOrdem(Arvore arvore) { // percorre o lado esquerdo e depois visita o nó.
		if (arvore != null) {
			PercorrerPosOrdem(arvore.NoEsquerda);
			PercorrerPosOrdem(arvore.NoDireita);
			System.out.println(arvore.Carro.ano);

		}
	}

}
