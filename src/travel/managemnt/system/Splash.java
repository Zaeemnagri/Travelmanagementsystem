package travel.managemnt.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread thread;

    Splash() {
        //setSize(1200 , 1200);
        //setLocation(100,100);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/traveling.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1366, 768, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        setVisible(true);
        thread = new Thread(this);
        thread.start();
    }
    public void run(){
        try{
            
            Thread.sleep(4000);
            setVisible(true);
            new Login();
            
            
        }catch (Exception e){}
        
    }

    public static void main(String[] args) {
        //Splash frame = new Splash();
        new Splash();
        //int x = 1;
        
        //for (int i = 1; i <= 500; x+=7, i+=6) {
            //frame.setLocation(750-x, 350-(i/2));
            //frame.setSize(x+i, i);
            //try{
            //    Thread.sleep(7);
            //}catch(Exception e){}
        }
    }


