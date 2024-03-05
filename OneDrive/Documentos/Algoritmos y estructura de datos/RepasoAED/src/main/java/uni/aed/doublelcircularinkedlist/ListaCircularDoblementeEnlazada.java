package uni.aed.doublelcircularinkedlist;

public class ListaCircularDoblementeEnlazada {
    Nodo head;
    Nodo tail;
    
    public void add(int data){
        Nodo newNodo = new Nodo(data);
        if(head == null){
            newNodo.prev = newNodo.next = newNodo;
            head = tail = newNodo;
        }
        else{
            Nodo current = head;
            while(current != tail){
                current = current.next;
            }
            newNodo.next = head;
            newNodo.prev = current;
            current.next = newNodo;
            tail = newNodo;
            head.prev = tail;
        }
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
            while(current.data != data && current.next != head)
                current = current.next;
            if(current.data == data){
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }
    
    public void clean(){
        head = tail = null;
    }
    
    @Override
    public String toString(){
        Nodo current = head;
        String lista = "";
        do{            
            if(current.prev == tail){
                lista = "Inicio: " + tail.data + "<-" + current.data + "->" + current.next.data;
            }else if (current.next == head) {
                lista = lista + "||" + current.prev.data + "<-" + current.data + "->" + head.data; 
            }else{
                lista = lista + "||" + current.prev.data + "<-" + 
                        current.data + "->" + current.next.data;
            }
            current = current.next;
        }while (current != tail);
        
        return lista + "||" +
                tail.prev.data + "<-" + tail.data + "->" + tail.next.data;
    }
    
}
