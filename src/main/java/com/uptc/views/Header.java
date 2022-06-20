package com.uptc.views;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public abstract class Header extends JPanel {

    public Header() {
        this.setBorder(BorderFactory.createTitledBorder("Presets"));
        this.setBackground(Color.WHITE);
    }

    public int getSeed() {
        return 0;
    }

    public int getDigits() {
        return 0;
    }

    public int getQuantity() {
        return 0;
    }

    public int getMin() {
        return 0;
    }

    public int getMax() {
        return 0;
    }

    public int getK() {
        return 0;
    }

    public int getG() {
        return 0;
    }

    public int getC() {
        return 0;
    }

    public int getXi() {
        return 0;
    }

    public int getT(){
        return 0;
    }
}