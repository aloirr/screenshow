package classes.model;

import classes.repository.Menu;

public class SelectMenu {


	public void selectmenu(String opcaoMenu) {
		Menu menu = new Menu();
	
		switch (opcaoMenu) {
		case "1":
			String conexao = null;
			while (conexao != "true") {
		
				}
			menu.menu();
			break;
		case "2":
		
			menu.menu();
			break;
		case "3":
			System.out.println("Programa finalizado com sucesso!");
			break;
		default:
			System.out.println("Opção inválida! Tente novamente!");
			menu.menu();
			break;
		}
	}
}
