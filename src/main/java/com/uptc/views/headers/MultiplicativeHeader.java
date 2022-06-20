package com.uptc.views.headers;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

import com.uptc.views.Command;
import com.uptc.views.Header;
import java.awt.*;
import com.uptc.views.JButtonRounded;

public class MultiplicativeHeader extends Header {

    private JTextField x;
    private JTextField t;
    private JTextField g;
    private JSpinner max;
    private JSpinner min;
    private JTextField quantity;
    private JButtonRounded generate;

    public MultiplicativeHeader(ActionListener listener) {
        this.x = new JTextField();
        this.t = new JTextField();
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

        t.setBorder(BorderFactory.createTitledBorder("Valor de T"));
        this.add(t);

        max.setBorder(BorderFactory.createTitledBorder("Maximo"));
        max.setBackground(Color.WHITE);
        max.setValue(1);
        this.add(max);

        this.add(Box.createGlue());

        g.setBorder(BorderFactory.createTitledBorder("Valor de G"));
        g.setBackground(Color.WHITE);
        this.add(g);

        quantity.setBorder(BorderFactory.createTitledBorder("Cantidad"));
        this.add(quantity);

        min.setBorder(BorderFactory.createTitledBorder("Minimo"));
        min.setBackground(Color.WHITE);
        this.add(min);

        generate.addActionListener(listener);
        generate.setActionCommand(Command.GENERATE_MULT.name());
        this.add(generate);
    }

    @Override
    public int getXi() {
        return Integer.valueOf(x.getText());
    }

    @Override
    public int getT() {
        return Integer.valueOf(t.getText());
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
