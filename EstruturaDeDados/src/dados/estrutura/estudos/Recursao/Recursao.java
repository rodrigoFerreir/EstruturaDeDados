package dados.estrutura.estudos.Recursao;

public class Recursao {
	int num1;
	int numN=  0;
	
	public void Somanumero(int numN) {
		int soma = 0;
		int mult = 1;
		for(int i = 1 ; i <= numN; i++) {
			soma +=i;
			mult *=i;
		}
		
		System.out.println(soma);
		System.out.println(mult);
	}
	
	public int SomaRecursao(int numero) {
		if(numero > 1) {
			return numero + SomaRecursao(numero - 1);
			}else {
				return 1;
			}
		}
	
	public long MultRecursao(long numero) {
		
		if(numero >= 1) {
		
			return numero * MultRecursao(numero - 1);
		}
		return 1;
		
	}
}
