package dados.estrutura.estudos.fila;

public class FilaCircular {
	
	public FilaCircular VizinhoEsquerda;
	boolean inicio = false;
	boolean fim = false;
	
	Pessoa pessoa;
	

	public static void main(String[] args) {
		FilaCircular fc1 = new FilaCircular();//pessoa1
		fc1.pessoa = new Pessoa("C");
		fc1.inicio = true;
		fc1.fim = true;
		fc1.VizinhoEsquerda = null;
		
		FilaCircular fc2 = new FilaCircular();//pessoa2
		fc2.pessoa = new Pessoa("D");
		fc2.inicio = false;
		fc2.fim = true;
		fc2.VizinhoEsquerda = null;
		
		fc1.fim = false;//fim pessoa1
		fc1.VizinhoEsquerda = fc2;//vizinho pessoa1
		
		FilaCircular fc3 = new FilaCircular();//pessoa3
		fc3.pessoa = new Pessoa("E");
		fc3.inicio = false;
		fc3.fim = true;
		fc3.VizinhoEsquerda = fc1;
		
		fc2.fim=false;
		fc2.VizinhoEsquerda = fc3;
		
		
		
		
		System.out.println(fc1.VizinhoEsquerda.pessoa.nome);
		System.out.println(fc2.VizinhoEsquerda.pessoa.nome);
		System.out.println(fc3.VizinhoEsquerda.pessoa.nome);
		
		
		
	}

}
