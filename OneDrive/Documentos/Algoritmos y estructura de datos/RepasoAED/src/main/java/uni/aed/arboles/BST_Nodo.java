package uni.aed.arboles;

public class BST_Nodo {
    int key;
    BST_Nodo left, right;
    
    public BST_Nodo() {
        left = right = null;
    }
    
    public BST_Nodo(int key){
        this.key = key;
    }

    public BST_Nodo(int key, BST_Nodo left, BST_Nodo right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }    
}
