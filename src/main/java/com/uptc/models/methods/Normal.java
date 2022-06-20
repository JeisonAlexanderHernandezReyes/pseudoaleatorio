package com.uptc.models.methods;

import java.util.ArrayList;
import java.util.List;
import com.uptc.IO_Utils.Interval;
import org.apache.commons.math3.distribution.NormalDistribution;

/**
 * @author JEISON ALEXANDER HERNANDEZ REYES
 */

public class Normal {

    private double average;
    private double deviation;
    private List<Double> aleatory;
    private List<Double> seeds;

    /**
     * 
     * @param quantity
     * @param inte
     * @param aleatoryXi
     */
    public Normal(int quantity, Interval inte, List<Double> aleatoryXi) {
        this.average = inte.getAverage();
        System.out.println(average);
        this.deviation = inte.getDeviation();
        System.out.println(deviation);
        this.seeds = aleatoryXi;
    }

    /**
     * 
     * @return Lista de Numeros Aleatorios
     */
    public List<Double> getAleatory() {
        aleatory = new ArrayList<>();
        generateRandom();
        return aleatory;
    }

    private void generateRandom() {
        for (Double x : seeds) {
            aleatory.add(new NormalDistribution(average, deviation).inverseCumulativeProbability(x));
        }
    }
}