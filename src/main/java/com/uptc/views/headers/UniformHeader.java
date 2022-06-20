package com.uptc.views.headers;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import com.uptc.views.Command;
import com.uptc.views.Header;
import com.uptc.views.JButtonRounded;
import java.awt.*;
import java.awt.event.ActionListener;

public class UniformHeader extends Header {
    private JTextField quantity;
    private JSpinner max;
    private JSpinner min;
    private JButton generate;

    public UniformHeader(ActionListener listener) {
        this.quantity = new JTextField();
        this.max = new JSpinner();
        this.min = new JSpinner();
        this.generate = new JButtonRounded(5, 5, "Generar Numeros");
        this.setLayout(new GridLayout(2, 2, 5, 2));
        initComponents(listener);
    }

    private void initComponents(ActionListener listener) {
        max.setBorder(BorderFactory.createTitledBorder("Maximo"));
        max.setBackground(Color.WHITE);
        max.setValue(1);
        this.add(max);

        quantity.setBorder(BorderFactory.createTitledBorder("Cantidad"));
        this.add(quantity);

        min.setBorder(BorderFactory.createTitledBorder("Minimo"));
        min.setBackground(Color.WHITE);
        this.add(min);

        generate.addActionListener(listener);
        generate.setActionCommand(Command.GENERATE_UNIFORM.name());
        this.add(generate);

    }

    @Override
    public int getQuantity() {
        return Integer.parseInt(quantity.getText());
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