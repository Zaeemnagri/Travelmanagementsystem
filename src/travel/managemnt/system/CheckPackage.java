
package travel.managemnt.system;
import javax.swing.*;
import java.awt.*;


public class CheckPackage  extends JFrame{
    CheckPackage(){
        setBounds(450,150,900,600);
        
        String[] package1= {"GOLD PACKAGE","-->6 Days and 7 Nights","-->Airport Assistance","-->Half Day Village Tour","-->Daily Buffet","-->Welcome Drink on Arrival","-->Full Day Island Cruise","-->English Speaking Guide" ,"BOOK NOW","***Summer Special***","RS 15000/-","package1.jpg"};
        String[] package2= {"SILVER PACKAGE","-->5 Days and 6 Nights","-->Entrance Free Tickets","-->Meet and Greet at Airport","-->Free Horse Ridding" ,"-->Welcome Drinks on Arrival","-->Night Safari","-->Cruise with Dinner","BOOK PACKAGE","***Winter Special***" ,"RS 25000/-","Winterpackage.jpg"};
        String[] package3= {"BRONZE PACKAGE","-->4 Days and 5 Nights","-->Return AirFare","-->Free Horse Ridding","-->Free Soft Drinks","-->Free Lunch" ,"-->Daily Buffet","-->BBQ Dinner","BOOK NOW","***Spring Special***" ,"RS 35000/-","Springpackage.jpg"};
        
        JTabbedPane tab= new JTabbedPane();
        
        
        JPanel p1 = createpackages(package1);
        tab.addTab("Package 1",null,p1);
        JPanel p2 = createpackages(package2);
        tab.addTab("Package 2",null,p2);
        JPanel p3 = createpackages(package3);
        tab.addTab("Package 3",null,p3);
        
        add(tab);
        
        
        setVisible(true);
    }
    
    public JPanel createpackages(String[] pack){
    JPanel p1= new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setLayout(null);
        //p1.setBackground(Color.WHITE);
        
        JLabel l1= new JLabel(pack[0]);
        l1.setBounds(50,5,300,30);
        l1.setForeground(Color.black);
        l1.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l1);
        
        JLabel l2= new JLabel(pack[1]);
        l2.setBounds(0,60,300,30);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Tahoma",Font.BOLD,17));
        p1.add(l2);
        
        JLabel l3= new JLabel(pack[2]);
        l3.setBounds(0,115,300,30);
        l3.setForeground(Color.black);
        l3.setFont(new Font("Tahoma",Font.BOLD,17));
        p1.add(l3);
        
        JLabel l4= new JLabel(pack[3]);
        l4.setBounds(0,170,300,30);
        l4.setForeground(Color.black);
        l4.setFont(new Font("Tahoma",Font.BOLD,17));
        p1.add(l4);
        
        JLabel l5= new JLabel(pack[4]);
        l5.setBounds(0,220,300,30);
        l5.setForeground(Color.black);
        l5.setFont(new Font("Tahoma",Font.BOLD,17));
        p1.add(l5);
        
        JLabel l6= new JLabel(pack[5]);
        l6.setBounds(0,270,300,30);
        l6.setForeground(Color.black);
        l6.setFont(new Font("Tahoma",Font.BOLD,17));
        p1.add(l6);
        
        JLabel l7= new JLabel(pack[6]);
        l7.setBounds(0,320,300,30);
        l7.setForeground(Color.black);
        l7.setFont(new Font("Tahoma",Font.BOLD,17));
        p1.add(l7);
        
        JLabel l8= new JLabel(pack[7]);
        l8.setBounds(0,370,300,30);
        l8.setForeground(Color.black);
        l8.setFont(new Font("Tahoma",Font.BOLD,17));
        p1.add(l8);
        
        JLabel l9= new JLabel(pack[8]);
        l9.setBounds(50,420,300,30);
        l9.setForeground(Color.black);
        l9.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l9);
        
        JLabel l10= new JLabel(pack[9]);
        l10.setBounds(0,470,300,30);
        l10.setForeground(Color.black);
        l10.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l10);
        
        JLabel l11= new JLabel(pack[10]);
        l11.setBounds(500,420,300,30);
        l11.setForeground(Color.black);
        l11.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l11);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 500, 300);
        p1.add(image);
        
        return p1;
    }
    
    public static void main(String[]args){
    new CheckPackage();
    
    }
    
}
