package com.uptc.views;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;

public class Window extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final int WIDTH = 1920;
    private static final int HEIGHT = 1080;
    private TabPanel tabs;

    public Window(ActionListener listener) {
        this.setTitle("GENERADOR");
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
