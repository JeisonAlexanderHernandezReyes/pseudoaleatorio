package com.uptc.models.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JEISON ALEXANDER HERNANDEZ REYES
 */

public class Linear {

    private int x;
    private int a;
    private int c;
    private int m;
    private int quantity;
    private List<Double> aleatory;
    private List<Integer> seeds;

    /**
     * 
     * @param x
     * @param k
     * @param c
     * @param g
     * @param quantity
     */
    public Linear(int x, int k, int c, int g, int quantity) {
        this.x = x;
        this.a = (1 + 2 * k);
        this.c = c;
        this.m = (int) Math.pow(2, g);
        this.aleatory = new ArrayList<>();
        this.quantity = quantity;
        this.seeds = new ArrayList<>();
    }


    /**
     * 
     * @return Numeros Aleatorios
     */
    public List<Double> getAleatory() {
        generateRandom(calculateSeed(this.x));
        return aleatory;
    }

    /**
     * 
     * @param seed Semilla para la generacion de Ri y otras semillas
     */
    private void generateRandom(int seed) {
        if (aleatory.size() < quantity) {
            aleatory.add(calculateNumber(seed));
            int newSeed = calculateSeed(seed);
            seeds.add(seed);
            generateRandom(newSeed);
        }
    }

    /**
     * 
     * @param seed Semilla para la generacion de Ri
     * @return numero aleatorio
     */
    private Double calculateNumber(int seed) {
        return (double) seed / (m - 1);
    }

    /**
     * 
     * @param xi Semilla para la generacion de Nuevas Semillas
     * @return nueva semilla
     */
    private int calculateSeed(int xi) {
        return (a * xi + c) % m;
    }

    /**
     * 
     * @return Lista de Semillas
     */
    public List<Integer> getSeeds() {
        return seeds;
    }
}