import javax.swing.*;
public class app {
    public static void main(String[] args) throws Exception { 
        int boardWidth = 360;
        int boardHeight = 640;


        System.out.println("project is running in background......");


        JFrame frame = new JFrame("Flappy Bird");
        //frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        flappybird fb = new flappybird();
        frame.add(fb);
        frame.pack();
        fb.requestFocus();      
        frame.setVisible(true);
    }
}
