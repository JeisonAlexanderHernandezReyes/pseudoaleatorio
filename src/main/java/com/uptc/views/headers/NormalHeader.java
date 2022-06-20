package com.uptc.views.headers;

import com.uptc.views.Command;
import com.uptc.views.Header;
import com.uptc.views.JButtonRounded;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class NormalHeader extends Header {
    private JTextField quantity;
    private JTextField sampleQuantity;
    private JSpinner max;
    private JSpinner min;
    private JButton generate;

    public NormalHeader(ActionListener listener) {
        this.quantity = new JTextField();
        this.sampleQuantity = new JTextField();
        this.max = new JSpinner();
        this.min = new JSpinner();
        this.generate = new JButtonRounded(5, 5, "Generar Numeros");
        this.setLayout(new GridLayout(2, 2, 5, 2));
        initComponents(listener);
    }

    private void initComponents(ActionListener listener) {
        sampleQuantity.setBorder(BorderFactory.createTitledBorder("Cantidad de Xo"));
        this.add(sampleQuantity);

        max.setBorder(BorderFactory.createTitledBorder("Maximo"));
        max.setBackground(Color.WHITE);
        max.setValue(1);
        this.add(max);

        this.add(Box.createGlue());

        quantity.setBorder(BorderFactory.createTitledBorder("Cantidad de Numeros"));
        this.add(quantity);

        min.setBorder(BorderFactory.createTitledBorder("Minimo"));
        min.setBackground(Color.WHITE);
        this.add(min);

        generate.addActionListener(listener);
        generate.setActionCommand(Command.GENERATE_NORMAL.name());
        this.add(generate);
    }

    @Override
    public int getMax() {
        return Integer.valueOf(max.getValue().toString());
    }

    @Override
    public int getMin() {
        return Integer.valueOf(min.getValue().toString());
    }

    @Override
    public int getQuantity() {
        return Integer.valueOf(quantity.getText());
    }

    @Override
    public int getXi() {
        return Integer.parseInt(sampleQuantity.getText());
    }
}