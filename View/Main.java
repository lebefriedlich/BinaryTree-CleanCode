package Tugas_FunJava.View;

import Tugas_FunJava.Controller.TreeController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int id;
        String name, address;
        Scanner scanner = new Scanner(System.in);
        TreeController treeController = new TreeController();

        while (true) {
            System.out.print("Enter first letter of show, insert, find, delete, or traverse: ");
            String input = scanner.nextLine();
            char choice = input.charAt(0);
            switch (choice) {
                case 's':
                    treeController.displayTree();
                    break;
                case 'i':
                    System.out.print("Input ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Input Nama: ");
                    name = scanner.nextLine();
                    System.out.print("Input Address: ");
                    address = scanner.nextLine();
                    treeController.insert(id, name, address);
                    break;
                case 'f':
                    System.out.print("Enter id to find: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    treeController.find(id);
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    treeController.delete(id);
                    break;
                case 't':
                    System.out.print("Enter type 1, 2 or 3: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    treeController.traverse(id);
                    break;
                default:
                    System.out.println("Invalid entry ");
            }
        }
    }
}
