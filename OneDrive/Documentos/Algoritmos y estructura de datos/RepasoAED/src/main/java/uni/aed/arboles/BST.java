package uni.aed.arboles;

public class BST {
    BST_Nodo root;

    public BST() {
        root = null;
    }
    
    public void insert(int value){
        BST_Nodo p = root, prev = null;
        if(root == null){
            root = new BST_Nodo(value);
        }else{
            while(p != null){
                prev = p;
                if(p.key < value)
                    p = p.right;
                else
                    p = p.left;
            }
            if(prev.key < value)
                prev.right = new BST_Nodo(value);
            else
                prev.left = new BST_Nodo(value);
        }
    }
    
    /**************RECORRIDOS EN PROFUNDIDAD*****************/
    
    private void visit(BST_Nodo p) {
        if (p!=null)
            System.out.print(p.key+" ");
        else
            System.out.print("Nodo no existe");
    }
    
    public void inorder(){
        inorder(root);
    }
    
    public void inorder(BST_Nodo p){
        if (p != null) {            
            inorder(p.left);
            visit(p);
            inorder(p.right);
        }
    }
    
    public void preorder(){
        preorder(root);
    }
    
    public void preorder(BST_Nodo p){
        if(p != null){
            visit(p);
            preorder(p.left);
            preorder(p.right);
        }
    }
    
    public void postorder(){
        postorder(root);
    }
    
    public void postorder(BST_Nodo p){
        if(p != null){
            postorder(p.left);
            postorder(p.right);
            visit(p);
        }
    }
    /**********************************************************************/
}
