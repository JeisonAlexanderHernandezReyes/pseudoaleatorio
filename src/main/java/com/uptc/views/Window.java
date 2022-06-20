package com.uptc.views;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;

public class Window extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 1200;
    private static final int HEIGHT = 580;
    private TabPanel tabs;

    public Window(ActionListener listener) {
        this.setTitle("Pseudo-aleatory Generator");
        // this.setIconImage(new
        // ImageIcon(getClass().getResource(ConstantsGUI.PATH_ICON_FRAME)).getImage());
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // this.setExtendedState(MAXIMIZED_BOTH);
        initComponents(listener);
    }

    private void initComponents(ActionListener listener) {
        this.tabs = new TabPanel(listener);
        this.add(tabs);
    }

    public Header getMidSrtHeader() {
        return tabs.getMidSrtHeader();
    }

    public Header getLinearHeader() {
        return tabs.getLinHeader();
    }

    public Header getMultHeader() {
        return tabs.getMultHeader();
    }

    public Header getNormalHeader() {
        return tabs.getNormHeader();
    }

    public Header getUniformHeader() {
        return tabs.getUniHeader();
    }

    // Middle
    public void setMiddTableRow(Object[] element) {
        tabs.setMiddSTableRow(element);
    }

    public void resetMiddleTable() {
        tabs.resetMiddleTable();
    }

    public void setGraphicData(List<Double> ri) {
        tabs.setGraphicData(ri);
    }

    public void resetMiddleGraphic() {
        tabs.resetMiddleGraphic();
    }

    // Linear
    public void resetLinearGraphic() {
        tabs.resetLinearGraphic();
    }

    public void resetLinearTable() {
        tabs.resetLinearTable();
    }

    public void setLinearGraphicData(List<Double> interval) {
        tabs.setLinearGraphicData(interval);
    }

    public void setLinearTableRow(Object[] element) {
        tabs.setLinearTableRow(element);
    }

    // Multiplicative
    public void resetMultiplicativeTable() {
        tabs.resetMultiplicativeTable();
    }

    public void resetMultiplicativeGraphic() {
        tabs.resetMultiplicativeGraphic();
    }

    public void setMultiplicativeGraphicData(List<Double> interval) {
        tabs.setMultiplicativeGraphicData(interval);
    }

    public void setMultiplicativeTableRow(Object[] element) {
        tabs.setMultiplicativeTableRow(element);
    }

    // Uniform
    public void resetUniformTable() {
        tabs.resetUniformTable();
    }

    public void resetUniformGraphic() {
        tabs.resetUniformGraphic();
    }

    public void setUniformGraphicData(List<Double> interval) {
        tabs.setUniformGraphicData(interval);
    }

    public void setUniformTableRow(Object[] element) {
        tabs.setUniformTableRow(element);
    }


    //Normal
    public void setNormalTableRow(Object[] element) {
        tabs.setNormalTableRow(element);
    }

    public void resetNormalTable() {
        tabs.resetNormalTable();
    }

    public void resetNormalGraphic() {
        tabs.resetNormalGraphic();
    }

    public void setNormalGraphicData(List<Double> interval) {
        tabs.setNormalGraphicData(interval);
    }
}
