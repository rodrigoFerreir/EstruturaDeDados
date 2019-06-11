package binaria.arvore;

public class Carro {

	   public String placa;
	   public String modelo;
	   public String cor;
	   public int  ano;
	   public Carro(String placa, String modelo, String cor, int ano){
	    
	       this.placa = placa;
	       this.modelo = modelo;
	       this.cor=cor;
	       this.ano=ano;
	   }
	   public Carro( int ano){      
	       this.ano=ano;
	   }
	}

