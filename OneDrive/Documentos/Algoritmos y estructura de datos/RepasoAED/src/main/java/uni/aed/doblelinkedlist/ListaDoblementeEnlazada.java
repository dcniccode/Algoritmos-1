package uni.aed.doblelinkedlist;

public class ListaDoblementeEnlazada {
    Nodo head;
    Nodo tail;
    
    public void addFirst(int data){
        Nodo newNodo = new Nodo(data);
        if(head == null){
            head = tail = newNodo;
        }else{
            newNodo.next = head;
            head.prev = newNodo;
            head = newNodo;
        }        
    }
    
    public void addLast(int data){
        Nodo newNodo = new Nodo(data);
        if(tail == null){
            head = tail = newNodo;
        }else{
            newNodo.prev = tail;
            tail.next = newNodo;
            tail = newNodo;
        }
    }
    
    public void clear(){
        head = tail = null;
    }
    
    public void delete(int data){
        if(head.data == data){
            head = head.next;
        }
        else if(tail.data == data){
            tail = tail.prev;
        }
        else{
            Nodo current = head;
            while (current.next != null && current.data != data) {                
                current = current.next;
            }
            if(current.data == data){
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }
    
    @Override
    public String toString(){
        Nodo current = head;
        String lista = "";
        while (current != null) {            
            if(current.prev == null){
                lista = "null<-" + current.data + "->" + current.next.data;
            }else if (current.next == null) {
                lista = lista + "||" + current.prev.data + "<-" + current.data + "->null"; 
            }else{
                lista = lista + "||" + current.prev.data + "<-" + 
                        current.data + "->" + current.next.data;
            }
            current = current.next;
        }
        return lista;
    }
}
