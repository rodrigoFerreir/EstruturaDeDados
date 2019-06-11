package dados.estrutura.estudos;


public class Prato {
	int id = 0;
	int topo;
	int base;
	int[] ArrayPilha;
	
	
	public Prato() {
		ArrayPilha = new int[10];
		topo = 0;
		base = 0;
	}
	
	public int push(int id) {
		if(empty() == false) {
			ArrayPilha[topo] = id;
			topo = topo++;
		}
		System.out.println("ok");
		return id;
	}
	
	public void pop() {
		if(empty() == true) {
		ArrayPilha[topo] = 0;
		topo = topo--;
		}
		
	}
	
	public int size() {
		if(topo == ArrayPilha.length) {
			return topo;
		}
		return 0;
	}
	
	public void stackpop() {
		
		System.out.println(ArrayPilha[topo]);		
	}
	
	public boolean empty() {
		if(ArrayPilha[topo] == 0) {
			return true;	
		}
		return false;
		
	}
	public void mostrarpilha() {
		for(int i=0; i<=ArrayPilha.length; i++ ) {
			if(i == ArrayPilha[i]) {
				System.out.println(ArrayPilha[topo]);
			}
			
		}
			
	}
}
