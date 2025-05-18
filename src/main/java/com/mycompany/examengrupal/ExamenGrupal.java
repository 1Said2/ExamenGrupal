/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.examengrupal;

import java.util.ArrayList;

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

    public static void ordenarPorMetodoSeleccion(int[] arregloNumeros) {
        int cantidadElementos = arregloNumeros.length;
        for (int posicionActual = 0; posicionActual < cantidadElementos - 1; posicionActual++) {
            int indiceMinimo = posicionActual;
            for (int indiceBusqueda = posicionActual + 1; indiceBusqueda < cantidadElementos; indiceBusqueda++) {
                if (arregloNumeros[indiceBusqueda] < arregloNumeros[indiceMinimo]) {
                    indiceMinimo = indiceBusqueda;
                }
            }
            int valorTemporal = arregloNumeros[indiceMinimo];
            arregloNumeros[indiceMinimo] = arregloNumeros[posicionActual];
            arregloNumeros[posicionActual] = valorTemporal;
        }
    }

    public static void ordenarPorMetodoInsercion(int[] arregloNumeros) {
        int cantidadElementos = arregloNumeros.length;
        for (int i = 1; i < cantidadElementos; i++) {
            int valorActual = arregloNumeros[i];
            int j = i - 1;
            while (j >= 0) {
                if (arregloNumeros[j] < valorActual) {
                    arregloNumeros[j + 1] = arregloNumeros[j];
                    j--;
                } else {
                    break;
                }
            }
            arregloNumeros[j + 1] = valorActual;
        }
    }

    public static ArrayList<Integer> buscar(int[] arreglo, int valorBuscado) {
        ArrayList<Integer> posiciones = new ArrayList<>();

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                posiciones.add(i);
            }
        }

        return posiciones;
    }
}
