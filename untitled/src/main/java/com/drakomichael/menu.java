package com.drakomichael;

import com.drakomichael.models.ItemModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {
    public static void exibirMenu() {
        List<ItemModel> itemsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean appStatus = true;

        while (appStatus) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - ver todos os itens");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do item: ");
                    String nome = scanner.nextLine();
                    itemsList.add(new ItemModel(nome, itemsList));
                    System.out.println("--------------");
                    System.out.println(">>> Item '" + nome + "' adicionado!");
                    System.out.println("--------------");
                    break;
                case 2:
                    System.out.println("--------------");
                    new listAllCase(itemsList);
                    System.out.println("--------------");
                    break;
                case 0:
                    appStatus = false;
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
}
