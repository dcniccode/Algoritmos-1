package uni.aed.repasoaed;

import uni.aed.circularlinkedlist.ListaCircularSimple;
import uni.aed.doblelinkedlist.ListaDoblementeEnlazada;
import uni.aed.doublelcircularinkedlist.ListaCircularDoblementeEnlazada;
import uni.aed.linkedlist.ListaEnlazada;

public class RepasoAED {

    public static void main(String[] args) {
        ListaEnlazada list = new ListaEnlazada();
        list.addFirst(2);
        list.addFirst(24);
        list.addLast(12);
        list.delete(2);
        System.out.println(list.toString() + "\n***********************************\n");
        
        ListaCircularSimple cirlist = new ListaCircularSimple();
        cirlist.add(3);
        cirlist.add(5);
        cirlist.add(8);
        cirlist.add(123);
        cirlist.add(154);
        cirlist.add(123);
        cirlist.delete(123);
        cirlist.delete(5);
        System.out.println(cirlist.toString() + "\n***********************************\n");
        
        ListaDoblementeEnlazada doublelist = new ListaDoblementeEnlazada();
        doublelist.addFirst(10);
        doublelist.addFirst(15);
        doublelist.addLast(18);
        doublelist.addLast(23);
        doublelist.addFirst(42);
        doublelist.delete(15);
        System.out.println(doublelist.toString() + "\n***********************************\n");
        
        ListaCircularDoblementeEnlazada douCirc = new ListaCircularDoblementeEnlazada();
        douCirc.add(4);
        douCirc.add(9);
        douCirc.add(6);
        douCirc.add(31);
        douCirc.delete(6);
        System.out.println(douCirc.toString()+ "\n***********************************\n");
    }
}
