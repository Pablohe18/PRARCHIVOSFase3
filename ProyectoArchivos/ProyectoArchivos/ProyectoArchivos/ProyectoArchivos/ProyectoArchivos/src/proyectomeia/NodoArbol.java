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
    int indice;
    int izquierdo;
    int derecho;
    String material;
    String tipo;
    String pathimg;
    int tiempodeg;
    String UsuarioTrans;
    String Fechacreacion;
    int estado;
    NodoArbol hijoIzquierdo, hijoDerecho;

    public NodoArbol(int indice, int izquierdo, int derecho, String material, int estado, String pathimg, String tipo, int tiempodeg, String UsuarioTrans, String Fechacreacion) {
        this.Fechacreacion = Fechacreacion;
        this.UsuarioTrans = UsuarioTrans;
        this.tiempodeg = tiempodeg;
        this.tipo = tipo;
        this.pathimg =  pathimg;
        this.indice =  indice;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
        this.material = material;
        this.estado = estado;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
        
    }

    public int toStrings() {
        return  hijoIzquierdo.indice;
    }
    
    public int obtenerizquierdo(NodoArbol s){
        int izquierdo = 0;
        izquierdo = s.toStrings();
        return izquierdo;
    }
}
