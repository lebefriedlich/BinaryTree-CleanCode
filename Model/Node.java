package Tugas_FunJava.Model;

public class Node {
    public int id;
    public String name, address;
    public Node leftChild;
    public Node rightChild;

    public void displayEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address );
    }
}
