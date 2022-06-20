package com.uptc.models.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JEISON ALEXANDER HERNANDEZ REYES
 */

public class Multiplicative {

    private int x;
    private int a;
    private int m;
    private int quantity;
    private List<Double> aleatory;
    private List<Integer> seeds;

    public Multiplicative(int x, int t, int g, int quantity) {
        this.x = x;
        this.a = (8 * t) + 3;
        this.m = (int) Math.pow(2, g);
        this.aleatory = new ArrayList<>();
        this.quantity = quantity;
        this.seeds = new ArrayList<>();
    }

    /**
     * 
     * @return Lista de Numeros Aleatorios
     */
    public List<Double> getAleatory() {
        generateRandom(calculateSeed(this.x));
        return aleatory;
    }

    /**
     * 
     * @param seed Semilla
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
     * @param seed Semilla para generar Ri
     * @return Numero Aleatorio
     */
    private Double calculateNumber(int seed) {
        return (double) seed / (m - 1);
    }

    /**
     * 
     * @param xi Semilla para generar nueva semilla
     * @return Nueva semilla
     */
    private int calculateSeed(int xi) {
        return (xi * a) % m;
    }

    /**
     * 
     * @return Lista de Semillas
     */
    public List<Integer> getSeeds() {
        return seeds;
    }
}
