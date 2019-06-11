package dados.estrutura.estudos.fila;

public class Fila {
	
	public Pessoa[] filaPessoas;
	public int Inicio, Fim;
	
	public void filaArray(int tamanhoFila) {
		this.filaPessoas = new Pessoa[tamanhoFila];
		this.Inicio =0;
		this.Fim =0;
	}
	
	public boolean push(Pessoa novaPessoa) {
		if(this.filaPessoas[this.Fim]==null) {
			
			this.filaPessoas[this.Fim]= novaPessoa;
			this.Fim++;
			
			return true;
			
		}
			return false;
		
	}
	
	public Pessoa pop() {
		Pessoa auxPessoa =null;
		
		if(this.filaPessoas[this.Inicio]!=null) {
			auxPessoa =this.filaPessoas[this.Inicio]; //this.filaPessoas[this.Inicio].nome;
			this.filaPessoas[this.Inicio] = null;
			this.Inicio++;
			return auxPessoa;
		}
		return auxPessoa;
	}
	
	public boolean empty() {
		if(this.Inicio ==0 && this.Fim == 0) {
			return true;
		}
		return false;
		
	}
	
	public Pessoa mostrarNome() {
		return null;
	}
	
	public static void main(String[] args) {
		Fila fila1 = new Fila();
		fila1.filaArray(5);
	
		
		System.out.println("Pessoa:"+fila1.push(new Pessoa("Jose")));
		
		System.out.println("Pessoa:"+fila1.push(new Pessoa("Maria")));
		
		System.out.println("Pessoa:"+fila1.push(new Pessoa("Pedro")));
		
		
		System.out.println("Fila de Pessoas:"+fila1.filaPessoas[0].nome);
		System.out.println("Fila de Pessoas:"+fila1.filaPessoas[1].nome);
		
		System.out.println("Pessoa:"+fila1.pop());
		
		System.out.println("Fila de Pessoas:"+fila1.filaPessoas[0]);
		
		
		
		
		
	}

}
