package classes.repository;

import java.util.ArrayList;
import java.util.Scanner;

import classes.model.SelectMenu;

public class Menu {
	private String opcao;
	SelectMenu selectmenu = new SelectMenu();
	private Scanner scanner = new Scanner(System.in);

	public void menu() {
		opcao = "0";
		ArrayList<String> menuOpcoes = new ArrayList<>();
		menuOpcoes.add("1");
		menuOpcoes.add("2");
		menuOpcoes.add("3");
		while (menuOpcoes.lastIndexOf(opcao) == -1) {
			System.out.println("+++ BEM VINDO AO SCREEN SHOW+++");
			System.out.println("MENU DE OPÇÕES:");
			System.out.println(("1) LISTAR TELAS DISPONÍVEIS"));
			System.out.println(("2) RESETAR CONFIGURAÇÃO DE TODAS AS TELAS"));
			System.out.println(("3) SAIR"));
			System.out.println("++DIGITE O NÚMERO DA OPÇÃO DESEJADA:");
			opcao = scanner.nextLine();
		}
		selectmenu.selectmenu(opcao);

	}

	public String getOpcao() {
		return opcao;
	}

	public Scanner getScanner() {
		return scanner;
	}

}
