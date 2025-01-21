import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Circle extends JFrame {
    public Circle() {


        setTitle("DESSINE UN CERCLE");

        System.out.println("TEST");

        System.out.println("Bonjour Henry");

        // Declare the height and the width of the window.
        setSize(400, 400);

        // Set the visibility as true.
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    // The graphics in Java
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Set the color to be black.
        g2d.setPaint(Color.yellow);

        // Set the axis with height and weight.
        g2d.fillOval(80, 80, 150, 150);

        //////

        // Set the color to be black.
        g2d.setPaint(Color.RED);

        // Set the axis with height and weight.
        g2d.fillOval(200, 200, 500, 500);


    }

    // The main class in Java.
    public static void main(String[] args) {

        // Calling the object created to display the circle.
        Circle frames = new Circle();

        frames.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        // Set the size of the frame.
        frames.setSize(400, 400);

        // Set the visibility of the frame.
        frames.setVisible(true);

    }
}