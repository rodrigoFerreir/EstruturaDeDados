package listaEncadeada;

public class ListaCarrosEncadeada {

	public static void main(String[] args) {
		ListaSimplismenteEncadeada list = new ListaSimplismenteEncadeada();
		Carro c1 = new Carro("gol", 2017, 17.000);
		Carro c2 = new Carro("Uno", 2001, 6.000);
		Carro c3 = new Carro("BMW", 2019, 120.000);
		
		list.carroEncadeado = c1;
		ListaSimplismenteEncadeada list2 = new ListaSimplismenteEncadeada();
		list2.carroEncadeado = c3;
		
		list.NoDireita =list2;
		
		ListaSimplismenteEncadeada list3 = new ListaSimplismenteEncadeada();
		list3.carroEncadeado =c2;
		
		list2.NoDireita=list3;
		
		list3.NoDireita = list2;
		
		list3.NoDireita= list;
		
		System.out.println(list.carroEncadeado.modelo);
		System.out.println(list.NoDireita.carroEncadeado.modelo);
		System.out.println(list.NoDireita.NoDireita.carroEncadeado.modelo);
	}

}
