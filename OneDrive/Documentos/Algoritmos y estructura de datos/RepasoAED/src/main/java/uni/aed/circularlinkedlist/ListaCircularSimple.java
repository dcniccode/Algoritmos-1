package uni.aed.circularlinkedlist;

public class ListaCircularSimple {
    Nodo head;
    
    public void add(int data){
        Nodo newNodo = new Nodo(data);
        if(head == null){
            head = newNodo;
            head.next = head;
            return;
        }
        Nodo current = head;
        while (current.next != head) {            
            current = current.next;
        }
        current.next = newNodo;
        newNodo.next = head;
    }
    
    public void delete(int data){
        if(head == null)
            return;
        if(head.data == data){
            head = head.next;
            return;
        }
        Nodo current = head;
        while(current.next.data != data && current.next != head)
            current = current.next;
        if(current.next.data == data){
            current.next = current.next.next;
        }
    }
    
    public void clean(){
        head = null;
    }
    
    @Override
    public String toString(){
        String lista="";
        Nodo current = head;
        if(lista.length()==0)
                lista = "" + current.data;
        current = current.next;
        while(current != head){
            lista=lista + "->" + current.data;
            current = current.next;
        }
        return lista;
    }
}
