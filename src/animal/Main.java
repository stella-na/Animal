package animal;
import java.util.Scanner;

//métodp
public class Main {
	//função
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ColecaoDeAnimais colecao = new ColecaoDeAnimais();
		for( int i = 0; i < 10; i=i+1) {
			
		
//		System.out.println("Digite seu nome:");
//		
//		String nome = scanner.next();
//		String sobrenome = scanner.next();
//		
//		System.out.println("Digite sua idade:");
//		int idade = scanner.nextInt();
//		
//		System.out.println(nome + " " + sobrenome + " - " + idade);
		
				
		System.out.println("Qual o tipo de seu animal?");
		System.out.println("Digite:\n 1 para cachorro\n 2 para gato\n 3 para pássaro\n");
		int tipo = scanner.nextInt();
		if(tipo == 1) {
			//Cachorro escolhido
			System.out.println("1-Adicionar\n2-Remover");
			int operacao = scanner.nextInt();
			
			if(operacao == 1) {
				// Se operação igual a 1 --> adicionar escolhido
				//Eu preciso criar um objeto para chamar a classe Cachorro
				Cachorro c = new Cachorro();
				System.out.println("Digite o nome de seu cachorro?");
				c.nome = scanner.next();
				c.raca = "Cachorro";
				
				System.out.println("Digite a idade de seu cachorro?");
				c.idade = scanner.nextInt();
				
				System.out.println("Digite o peso de seu cachorro:");
				c.peso = scanner.nextFloat();
				
				colecao.adicionar(c);
				colecao.listar();
				
			} else if(operacao == 2) {
				//Se operação igual a 2 --> remover escolhido
				System.out.println("Digite o número do índice");
				int indice = scanner.nextInt();
				colecao.remover(indice);
				colecao.listar();
			}
				
		}
		else if(tipo == 2) {
			//Gato escolhido
			System.out.println("1-Adicionar\n2-Remover");
			int operacao = scanner.nextInt();
			
			if(operacao ==1) {
				Gato g = new Gato();
				System.out.println("Digite o nome de seu gato?");
				g.nome = scanner.next();
				g.raca = "Gato";
				
				System.out.println("Digite a idade de seu gato?");
				g.idade = scanner.nextInt();
				
				System.out.println("Digite o peso de seu gato:");
				g.peso = scanner.nextFloat();
				
				colecao.adicionar(g);
				colecao.listar();
				
			} else if(operacao == 2) {
				System.out.println("Digite o número do índice");
				int indice = scanner.nextInt();
				colecao.remover(indice);
				colecao.listar();
			}
		}
		else if(tipo == 3) {
			System.out.println("1-Adicionar\n2-Remover");
			int operacao = scanner.nextInt();
			
			if(operacao ==1) {
				Passaro p = new Passaro();
				System.out.println("Digite o nome de seu pássaro?");
				p.nome = scanner.next();
				p.raca = "Passaro";
				
				System.out.println("Digite a idade de seu pássaro?");
				p.idade = scanner.nextInt();
				
				System.out.println("Digite o peso de seu pássaro:");
				p.peso = scanner.nextFloat();
				
				colecao.adicionar(p);
				colecao.listar();
				
			} else if(operacao == 2) {
				System.out.println("Digite o número do índice");
				int indice = scanner.nextInt();
				colecao.remover(indice);
				colecao.listar();
						
		} 
			
		}else {
			System.out.println("ERROR: Animal Não Encontrado\n    ");		
		}
		
	}	
		
}	
}

			
		
		
		
		
//		System.out.println("Digite o peso do animal:");
//		float peso = scanner.nextFloat();
//		System.out.println("Peso = " + peso);
//		
//		System.out.println("Digite a idade de seu animal:");
//		int idade = scanner.nextInt();
		
		
		
//		Animal a = new Animal();
//		Cachorro c = new Cachorro();
//		c.nome = "Tobby";
//		c.qtdPatas = 4;
//		
//		Gato g = new Gato();
//		g.nome = "Bruce";
//		g.qtdPatas = 4;
//		
//		Passaro p = new Passaro();
//		p.nome = "piu-piu";
//		p.qtdPatas = 2;
//		
//		//c.comer();
//		  c.comunicar();
//		  g.comunicar();
//		  p.comunicar();
//		//g.dormir();
//		//p.mover();
//		  ColecaoDeAnimais colecao = new ColecaoDeAnimais();
//		  
//		  colecao.adicionar(c);
//		  colecao.adicionar(g);
//		  colecao.adicionar(p);
//		  
//		  colecao.listar();
		  
