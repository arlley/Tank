package com.arlley.tank;


public class App {
    public static void main(String[] args) throws InterruptedException {
        TankFrame frame = new TankFrame();
        while (true){
            Thread.sleep(50);
            frame.repaint();
        }
    }
}
