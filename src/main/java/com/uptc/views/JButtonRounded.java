package com.uptc.views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class JButtonRounded extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int arcW;
	private int arcH;

	public JButtonRounded(int arcW, int arcH, String text) {
		super(text);
		this.arcW = arcW;
		this.arcH = arcH;
		this.setFocusPainted(false);
		this.setForeground(Color.BLACK);
		this.setContentAreaFilled(false);

	}

	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(getBackground());
		if (getModel().isArmed()) {
			g2.setColor(Color.RED);
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2.fillRoundRect(0, 0, getWidth() - 2, getHeight() - 1, arcW, arcH);
			super.paintComponent(g);
		} else {
			g2.setColor(getBackground());
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2.fillRoundRect(0, 0, getWidth() - 2, getHeight() - 1, arcW, arcH);
			super.paintComponent(g);
		}
	}

	protected void paintBorder(Graphics g) {
		g.setColor(getForeground());
		g.drawRoundRect(0, 0, getWidth() - 2, getHeight() - 1, arcW, arcH);
	}
}