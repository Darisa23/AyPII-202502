package Processing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class circuloConJava extends JPanel implements MouseMotionListener {
    private int x = 100, y = 100;

    public circuloConJava() {
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x - 25, y - 25, 50, 50); // círculo
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circulo con Java");
        circuloConJava panel = new circuloConJava();
        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
