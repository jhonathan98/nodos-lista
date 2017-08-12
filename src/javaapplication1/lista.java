/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;
public class lista {

    public nodo1 inicio;

    public lista() {
        inicio = null;
    }
    public lista insertarcabeza(int a) {
        nodo1 nuevo = new nodo1(a);
        nuevo.enlace = inicio;
        inicio = nuevo;
        return this;
    }
    public void visualizar() {
        nodo1 actual;
        actual = inicio;
        while (actual != null) {
            System.out.print(" " + actual.dato + " ");
            actual = actual.enlace;
        }
    } 
    public void add(nodo1 newNodo){
        //puntero temporal para recorreme en la lista
        nodo1 tmp = inicio;
        //nodo1 anterior = inicio;

        //si la lista esta vacia
        if(tmp==null){
            //lo agregamos al root
            inicio = newNodo;
        }else{
            //de lo contrario nos recorremos hasta el ultimo
            while(tmp.enlace!=null)
                tmp = tmp.enlace;
            //en el ultimo hacemos el enlace 
            tmp.enlace = newNodo;
        }
        
    }

    public lista insertar(int dat, nodo1 j) {
        nodo1 nuevo = new nodo1(dat);
        nuevo.enlace = j.enlace;
        j.enlace = nuevo;
        return this;

    }
    public nodo1 buscar(int dat) {
        nodo1 j;
        try {
            for (j = inicio; j != null; j = j.enlace) {
                if (dat == j.dato) {
                    return j;
                } else {
                    JOptionPane.showMessageDialog(null, "el dato buscado no esta en la lista");
                }
            }
        }
        catch (Exception e) {
        }
        return null;
    }
    public void eliminar(int a){
        //puntero temporal para recorreme en la lista
        //nodo1 newNodo = new nodo1(a);
        nodo1 tmp = inicio;
        nodo1 ant = inicio;
        //nodo1 anterior = inicio;

        //si la lista esta vacia
        if(tmp==null){
            //lo agregamos al root
            System.out.println("lista vacia");
        }else{
            //de lo contrario nos recorremos hasta el ultimo
            while(tmp.dato!=a){
                ant = tmp;
                tmp = tmp.enlace;
                
            }                     
            ant.enlace = tmp.enlace;
            System.out.println("Dato eliminado");
        }
        
    }
        public void atender(){
        //puntero temporal para recorreme en la lista
        //nodo1 newNodo = new nodo1(a);
        nodo1 tmp = inicio;
        nodo1 ant = inicio;
        //nodo1 anterior = inicio;

        //si la lista esta vacia
        if(tmp==null){
            //lo agregamos al root
            System.out.println("lista vacia");
        }else{
            //de lo contrario nos recorremos hasta el ultimo
                              
            inicio = inicio.enlace;
            
        }
        
    }
}
