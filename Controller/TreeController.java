package Tugas_FunJava.Controller;

import Tugas_FunJava.Model.Node;
import Tugas_FunJava.Service.TreeService;

public class TreeController {
    TreeService treeService = new TreeService();
    public void insert(int id, String name, String address){
        if (id > 0 && !name.isEmpty() && !address.isEmpty()){
            treeService.insert(id, name, address);
            System.out.println("\nBerhasil Ditambahkan\n");
        } else {
            System.out.println("\nData Harus terisi\n");
        }
    }

    public void displayTree(){
        treeService.displayTree();
    }

    public void find(int key){
        Node found = treeService.find(key);
        if (found != null) {
            System.out.print("Found: ");
            found.displayEmployee();
            System.out.print("\n");
        } else {
            System.out.println("Could not find " + key);
        }
    }

    public void delete(int key){
        boolean didDelete = treeService.delete(key);
        System.out.println(didDelete);
        if (didDelete) {
            System.out.println("Deleted " + key);
        } else {
            System.out.println("Could not delete " + key);
        }
    }

    public void traverse(int key){
        if (key > 0 && key <= 3){
            treeService.traverse(key);
        } else {
            System.out.println("Pilihan anda salah!");
        }
    }
}
