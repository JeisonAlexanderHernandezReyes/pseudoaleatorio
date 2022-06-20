package com.uptc.utils;

import java.util.ArrayList;
import java.util.List;

public class Ulitities {
    public static ArrayList<Object[]> toObjectArrayList(List<Double> aleatory, List<Double> interval) {
        ArrayList<Object[]> objects = new ArrayList<>();
        for (int i = 0; i < interval.size(); i++) {
            objects.add(new Object[] { aleatory.get(i), interval.get(i) });
        }
        return objects;
    }

    public static List<Object[]> toObjectArrayList(List<Integer> xi, List<Double> ri, List<Double> ni) {
        ArrayList<Object[]> objects = new ArrayList<>();
        for (int i = 0; i < xi.size(); i++) {
            objects.add(new Object[] { xi.get(i), ri.get(i), ni.get(i) });
        }
        return objects;
    }
}