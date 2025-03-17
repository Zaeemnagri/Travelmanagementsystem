
package travel.managemnt.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class BookPackage extends JFrame implements ActionListener{
    Choice cpackage;
    JTextField tfpersons;
    String username;
    JLabel labelusername,labelnumber,labelphone,labelid,labelprice;
    JButton checkprice,bookpackage,back;
    BookPackage(String username){
        this.username= username;
        setBounds(350,200,1000,500);
        setLayout(null);
        getContentPane().setBackground( Color.WHITE);
        
        JLabel text = new JLabel("BOOK PACKAGE");
        text.setBounds(100, 10, 200, 30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.BOLD,16));
        lblusername.setBounds(40, 70, 100, 20);
        add(lblusername);
        
        labelusername = new JLabel(username);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        labelusername.setBounds(250, 70, 200, 20);
        add(labelusername);
        
        
        JLabel lblselectpackage = new JLabel("Select Package");
        lblselectpackage.setFont(new Font("Tahoma",Font.BOLD,16));
        lblselectpackage.setBounds(40, 110, 150, 20);
        add(lblselectpackage);
        
        cpackage= new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(250,110,200,20);
        add(cpackage);
        
        JLabel lblperson = new JLabel("Total Persons");
        lblperson.setFont(new Font("Tahoma",Font.BOLD,16));
        lblperson.setBounds(40, 150, 150, 25);
        add(lblperson);
        
        tfpersons = new JTextField("1");
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        
        
        
        
        JLabel lblid = new JLabel("Id");
        lblid.setFont(new Font("Tahoma",Font.BOLD,16));
        lblid.setBounds(40, 190, 150, 20);
        add(lblid);
        
        labelid = new JLabel();
        labelid.setBounds(250, 190, 150, 25);
        add(labelid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.BOLD,16));
        lblnumber.setBounds(40, 230, 150, 25);
        add(lblnumber);
        
        labelnumber = new JLabel();
        labelnumber.setBounds(250, 230, 150, 25);
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma",Font.BOLD,16));
        lblphone.setBounds(40, 270, 150, 20);
        add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(250, 270, 150, 25);
        add(labelphone);
        
        JLabel lblprice = new JLabel("Total Price");
        lblprice.setFont(new Font("Tahoma",Font.BOLD,16));
        lblprice.setBounds(40, 310, 150, 25);
        add(lblprice);
        
        labelprice = new JLabel();
        labelprice.setBounds(250, 310, 150, 25);
        add(labelprice);
        
        try{ 
            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs= conn.s.executeQuery(query);while(rs.next()){
            labelid.setText(rs.getString("id"));
            labelnumber.setText(rs.getString("number"));
            labelphone.setText(rs.getString("phone"));
            
            }
            
        
        }catch(Exception c){
            c.printStackTrace();
        
        }
        
        checkprice = new JButton("Check Price");
        checkprice.setBackground(new Color(104,0,139));
        checkprice.setForeground(Color.WHITE);
        //back.setFont(new Font("Tahoma", Font.BOLD, 14));
        checkprice.setBounds(60, 380, 120, 25);
        checkprice.addActionListener(this);
        add(checkprice);
        
        bookpackage = new JButton("Book Package");
        bookpackage.setBackground(new Color(104,0,139));
        bookpackage.setForeground(Color.WHITE);
        //back.setFont(new Font("Tahoma", Font.BOLD, 14));
        bookpackage.setBounds(190, 380, 140, 25);
        bookpackage.addActionListener(this);
        add(bookpackage);
        
        back = new JButton("Back");
        back.setBackground(new Color(104,0,139));
        back.setForeground(Color.WHITE);
        
        back.setBounds(340, 380, 120, 25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(480, 50, 500, 350);
        add(image);
        
        
        
        
        setVisible(true);
    
    
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
        String pack= cpackage.getSelectedItem();
        int cost =0;
        
        if(pack.equals("Gold Package")){
        cost +=15000;
        }
        else if(pack.equals("Silver Package")){
        cost += 25000;
        }
        else{
        cost = cost+35000;
        }
        int persons= Integer.parseInt(tfpersons.getText());
        cost = cost*persons;
        labelprice.setText("RS."+cost+"/-");
        
        }
        else if (ae.getSource()==bookpackage){
            try{
            Conn c = new Conn();
            c.s.executeUpdate("insert into bookpackage values('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfpersons.getText()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
            JOptionPane.showMessageDialog(null, "Package Booked Successfully");
            setVisible(false);
            }catch(Exception e){
            e.printStackTrace();}
        
        }
        else if (ae.getSource()==back){
            setVisible(false);
        
        }
    
    }
    
    public static void main(String []args){
        new BookPackage("");
    
    }
    
}
