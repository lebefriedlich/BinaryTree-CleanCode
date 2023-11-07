package Tugas_FunJava.Service;

import Tugas_FunJava.Model.Node;
import Tugas_FunJava.Repository.TreeRepository;

public class TreeService {
    TreeRepository treeRepository = new TreeRepository();
    private Node root;

    public void insert(int id, String name, String address){
        treeRepository.insert(id, name, address);
    }

    public void displayTree(){
        treeRepository.displayTree();
    }

    public Node find(int key){
        return treeRepository.find(key);
    }

    public boolean delete(int key){
        return treeRepository.delete(key);
    }

    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1:
                treeRepository.traverse(traverseType);
                break;
            case 2:
                treeRepository.traverse(traverseType);
                break;
            case 3:
                treeRepository.traverse(traverseType);
                break;
        }
        System.out.println();
    }
}
