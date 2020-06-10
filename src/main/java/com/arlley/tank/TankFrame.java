package com.arlley.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {

    int x = 200, y = 200;
    public TankFrame() throws HeadlessException {
        this.setVisible(true);
        this.setSize(800, 600);
        this.setResizable(false);
        this.setTitle("Tank War");
        this.addKeyListener(new TankKeyListener());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect( x, y, 50, 50);
    }

    class TankKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            x += 30;
            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("key released");
        }
    }
}
