package binaria.arvore;

import java.util.Scanner;

public class TesteArvore {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		ArvoreServico arvoreServico=new ArvoreServico();
        Arvore arvore=null;
        for(int i=0; i<7;i++){
            arvore=arvoreServico.addNo(arvore,arvoreServico.criarCarro());
        }
        System.out.println("Digite o ano a pesquisar:");   
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("-------pesquisar:"); 
        arvoreServico.Pesquisar(arvore,sc.nextInt());
        
        System.out.println("-------PercorrerPreOrdem:"); 
        arvoreServico.PercorrerPreOrdem(arvore);
         
        System.out.println("-------PercorrerInOrdem:");   
        arvoreServico.PercorrerInOrdem(arvore); 
        
        System.out.println("-------PercorrerPosOrdem:");   
        arvoreServico.PercorrerPosOrdem(arvore); 
		

	}

}
