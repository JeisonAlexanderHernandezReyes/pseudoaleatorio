package com.uptc.views.headers;

import javax.swing.BorderFactory;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

import com.uptc.views.Command;
import com.uptc.views.Header;
import java.awt.*;
import com.uptc.views.JButtonRounded;

public class LinearHeader extends Header {

    private JTextField x;
    private JTextField k;
    private JTextField c;
    private JTextField g;
    private JSpinner max;
    private JSpinner min;
    private JTextField quantity;
    private JButtonRounded generate;

    public LinearHeader(ActionListener listener) {
        this.x = new JTextField();
        this.k = new JTextField();
        this.c = new JTextField();
        this.g = new JTextField();
        this.max = new JSpinner();
        this.min = new JSpinner();
        this.quantity = new JTextField();
        this.generate = new JButtonRounded(5, 5, "Generar Numeros");
        this.setLayout(new GridLayout(2, 4, 5, 2));
        initComponents(listener);
    }

    private void initComponents(ActionListener listener) {

        x.setBorder(BorderFactory.createTitledBorder("Valor de X"));
        this.add(x);

        c.setBorder(BorderFactory.createTitledBorder("Valor de C"));
        this.add(c);

        max.setBorder(BorderFactory.createTitledBorder("Maximo"));
        max.setBackground(Color.WHITE);
        max.setValue(1);
        this.add(max);

        quantity.setBorder(BorderFactory.createTitledBorder("Cantidad"));
        this.add(quantity);

        k.setBorder(BorderFactory.createTitledBorder("Valor de K"));
        this.add(k);

        g.setBorder(BorderFactory.createTitledBorder("Valor de G"));
        g.setBackground(Color.WHITE);
        this.add(g);

        min.setBorder(BorderFactory.createTitledBorder("Minimo"));
        min.setBackground(Color.WHITE);
        this.add(min);

        generate.addActionListener(listener);
        generate.setActionCommand(Command.GENERATE_LINEAS.name());
        this.add(generate);
    }

    @Override
    public int getXi() {
        return Integer.valueOf(x.getText());
    }

    @Override
    public int getK() {
        return Integer.valueOf(k.getText());
    }

    @Override
    public int getC() {
        return Integer.valueOf(c.getText());
    }

    @Override
    public int getG() {
        return Integer.valueOf(g.getText());
    }

    @Override
    public int getQuantity() {
        return Integer.valueOf(quantity.getText());
    }

    @Override
    public int getMax() {
        return Integer.valueOf(max.getValue().toString());
    }

    @Override
    public int getMin() {
        return Integer.valueOf(min.getValue().toString());
    }
}
