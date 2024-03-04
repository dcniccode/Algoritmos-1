package uni.aed.repasoaed;

import uni.aed.linkedlist.ListaEnlazada;

public class RepasoAED {

    public static void main(String[] args) {
        ListaEnlazada list = new ListaEnlazada();
        list.addFirst(2);
        list.addFirst(24);
        list.addLast(12);
        list.delete(2);
        System.out.println(list.toString());
    }
}
