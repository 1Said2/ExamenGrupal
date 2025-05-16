/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examengrupal;

/**
 *
 * @author SAID-WINDOWS
 */
public class ExamenGrupal {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static void ordenarPorMetodoBurbuja(int[] arregloNumeros) {
        int cantidadElementos = arregloNumeros.length;
        for (int pasada = 0; pasada < cantidadElementos - 1; pasada++) {
            for (int indiceActual = 0; indiceActual < cantidadElementos - 1; indiceActual++) {
                int indiceSiguiente = indiceActual + 1;
                if (arregloNumeros[indiceActual] > arregloNumeros[indiceSiguiente]) {
                    int valorTemporal = arregloNumeros[indiceActual];
                    arregloNumeros[indiceActual] = arregloNumeros[indiceSiguiente];
                    arregloNumeros[indiceSiguiente] = valorTemporal;
                }
            }
        }
    }
}
