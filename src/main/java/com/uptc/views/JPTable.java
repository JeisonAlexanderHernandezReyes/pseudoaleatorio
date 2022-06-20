package com.uptc.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JPTable extends JPanel {

	private static final long serialVersionUID = 1L;
	private DefaultTableModel dtmElements;
	private JTable table;
	private JScrollPane scroll;

	public JPTable() {
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(Color.decode("#30373D"));
		this.setPreferredSize(new Dimension(600, 600));
		initComponents();
	}

	private void initComponents() {
		dtmElements = new DefaultTableModel() {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		dtmElements.setColumnIdentifiers(new String[] { "Xi", "Ri", "Ni" });

		table = new JTable();
		table.setGridColor(Color.decode("#30373D"));
		table.setModel(dtmElements);
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(50);
		table.setBackground(Color.WHITE);
		table.setFillsViewportHeight(true);
		scroll = new JScrollPane(table);
		scroll.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(scroll, BorderLayout.PAGE_END);
		this.setBorder(null);

	}

	public void addRow(Object[] row) {
		dtmElements.addRow(row);
	}

	public void changeTableHeader(String[] header) {
		dtmElements.setColumnIdentifiers(header);
	}

	public void deleteTable() {
		dtmElements.setRowCount(0);
	}

	public void setHeader(String[] header) {
		dtmElements.setColumnIdentifiers(header);
	}
}