package com.uptc.views;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.List;

public class MethodPanel extends JPanel {

    private Header header;
    private JPTable table;
    private GraphicPanel graphic;

    public MethodPanel(Header header) {
        this.header = header;
        this.setLayout(new BorderLayout());
        initComponents();
    }

    private void initComponents() {
        this.add(header, BorderLayout.NORTH);

        table = new JPTable();
        this.add(table, BorderLayout.WEST);

        graphic = new GraphicPanel();
        this.add(graphic, BorderLayout.CENTER);
    }

    public Header getHeader() {
        return header;
    }

    public void setTableRow(Object[] row) {
        table.addRow(row);
    }

    public void resetTable() {
        table.deleteTable();
    }

    public void setGraphicData(List<Double> data) {
        graphic.setData(data);
    }

    public void resetGraphic() {
        graphic.resetGraphic();
    }

    public void setTableHeader(String[] header) {
        table.setHeader(header);
    }
}