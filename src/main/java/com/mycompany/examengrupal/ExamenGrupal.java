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
    
    public static void ordenarPorConteo(int[] arregloNumeros) {  
        if (arregloNumeros.length == 0) return;

        int minimo = arregloNumeros[0];
        int maximo = arregloNumeros[0];

        for (int indice = 1; indice < arregloNumeros.length; indice++) {
            if (arregloNumeros[indice] < minimo) 
                minimo = arregloNumeros[indice];
            if (arregloNumeros[indice] > maximo) 
                maximo = arregloNumeros[indice];
        }

        int rango = maximo - minimo + 1;
        int[] contador = new int[rango];

        for (int indice = 0; indice < arregloNumeros.length; indice++) {
            contador[arregloNumeros[indice] - minimo]++;
        }

        int posicion = 0;
        for (int valor = 0; valor < rango; valor++) {
            while (contador[valor] > 0) {
                arregloNumeros[posicion] = valor + minimo;
                posicion++;
                contador[valor]--;
            }
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

    public static ArrayList<Integer> buscarPrimos(int[] arreglo) {
        ArrayList<Integer> primos = new ArrayList<>();
        for (int numero : arreglo) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
        }
        return primos;
    }

    private static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

        public static Integer mayoritario(int[] arr) {
        int candidato = 0, contador = 0;
        for (int n : arr) {
            if (contador == 0) {
                candidato = n;
                contador = 1;
            } else if (n == candidato) {
                contador++;
            } else {
                contador--;
            }
        }
        contador = 0;
        for (int n : arr) if (n == candidato) contador++;
        if (contador > arr.length / 2) return candidato;
        return null;
    }
}
