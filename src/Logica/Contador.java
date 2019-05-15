/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *clase que permite implementar un contador 
 * @author Estudiantes
 */
public class Contador {

    private int valor;

    public Contador() {
        this.valor = 0;
    }
   /**
    * Metodo que retorna el valor del cronometro
    * @return el valor del contador
    */
    public int getValor() {
        return valor;
    }
/**
 * metodo que establece el valor del cronometro
 * @param valor 
 */
    
    public void setValor(int valor) {
        this.valor = valor;
    }
 /**
     * metodo que avanza el valor del cronometro
     *  
     */
    public void Avanzar() {
        this.valor += 1;
    }
/**
 * metodo que retrocede el valor del contador
 */
    public void Retroceder() {
        this.valor -= 1;
    }
/**
 * metodo que reinicia el valor del contador
 */

    public void Borrar() {
        this.valor = 0;
    }
/**
 * 
 */
}
