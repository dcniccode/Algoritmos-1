package uni.aed.arboles;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(12);
        tree.insert(19);
        tree.insert(7);
        tree.insert(3);
        tree.insert(9);
        tree.insert(5);
        tree.insert(15);
        
        System.out.println("\n***********RECORRIDO INORDEN*****************");
        tree.inorder();
        System.out.println("\n\n**************RECORRIDO PREORDEN**************");
        tree.preorder();
        System.out.println("\n\n**************RECORRIDO POSTORDEN***************");
        tree.postorder();
    }
    
}
