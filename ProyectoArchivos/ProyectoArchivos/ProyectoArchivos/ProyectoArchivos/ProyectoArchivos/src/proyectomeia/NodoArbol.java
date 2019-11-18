/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomeia;

/**
 *
 * @author carlo
 */
public class NodoArbol {
     int dato;
    String nombre;
    NodoArbol hijoIzquierdo, hijoDerecho;

    public NodoArbol(int d, String nom) {
        this.dato = d;
        this.nombre = nom;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }

    public String toString() {
        return "El NOMBRE Del Nodo Es: " + nombre + " y DATO-VALOR Es: " + dato;
    }
}
