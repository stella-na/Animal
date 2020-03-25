package animal;
import java.util.ArrayList;

public class ColecaoDeAnimais {
	
	
	ArrayList<Animal> listaTodosAnimais = new ArrayList<Animal>();
	
	void listar() {
		
		
		for(int i = 0; i < listaTodosAnimais.size(); i++) {
				System.out.println(i + " - " + listaTodosAnimais.get(i).raca + " " +
									listaTodosAnimais.get(i).nome + " - " 
									+ listaTodosAnimais.get(i).idade + " anos " 
									+ "/" + listaTodosAnimais.get(i).peso + "Kg");
			}
				System.out.println("-----------------");
			}
			
	
	void adicionar(Animal a) {
		//Iria salvar no banco de dados
		listaTodosAnimais.add(a);
		System.out.println("Adicionando animal na lista.");
		System.out.println("Tamanho da Lista = " + listaTodosAnimais.size());
		
	}
	
	void remover (int indice) {
		listaTodosAnimais.remove(indice);
		System.out.println("Removendo animal na lista.");
		System.out.println("Tamanho da Lista = " + listaTodosAnimais.size());
		
	}
}
