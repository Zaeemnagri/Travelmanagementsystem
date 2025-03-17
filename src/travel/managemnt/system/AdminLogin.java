package travel.managemnt.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AdminLogin extends JFrame implements ActionListener {

    JButton login, back;
    JTextField tfusername,tfemail, tfpassword;

    AdminLogin() {
        setSize(900, 400);
        setLocation(250, 200);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(72, 201, 176));
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 400, 400);
        p1.add(image);

        JPanel p2 = new JPanel();
        p2.setLayout(null);

        p2.setBounds(400, 30, 450, 300);

        add(p2);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 20, 100, 25);
        p2.add(lblusername);
        lblusername.setFont(new Font("SAN_SERIF", Font.PLAIN, 19));

        tfusername = new JTextField();
        tfusername.setBounds(60, 60, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(60, 100, 100, 25);
        p2.add(lblemail);
        lblemail.setFont(new Font("SAN_SERIF", Font.PLAIN, 19));

        tfemail = new JTextField();
        tfemail.setBounds(60, 130, 300, 30);
        tfemail.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfemail);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 170, 100, 25);
        p2.add(lblpassword);
        lblpassword.setFont(new Font("SAN_SERIF", Font.PLAIN, 19));

        tfpassword = new JTextField();
        tfpassword.setBounds(60, 200, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);

        login = new JButton("Login");
        login.setBounds(60, 250, 130, 30);
        login.setBackground(new Color(72, 201, 176));
        login.setForeground(Color.WHITE);
        login.setBorder(BorderFactory.createEmptyBorder());
        login.addActionListener(this);
        p2.add(login);

        back = new JButton("Back");
        back.setBounds(230, 250, 130, 30);
        back.setBackground(new Color(72, 201, 176));
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        p2.add(back);

        /*password = new JButton("Forget Password");
        password.setBounds(230, 250, 130, 30);
        password.setBackground(new Color(72, 201, 176));
        password.setForeground(Color.WHITE);
        password.setBorder(BorderFactory.createEmptyBorder());
        password.addActionListener(this);
        p2.add(password);
        
        admin = new JButton("Admin");
        admin.setBounds(60, 250, 130, 30);
        admin.setBackground(new Color(72, 201, 176));
        admin.setForeground(Color.WHITE);
        admin.setBorder(BorderFactory.createEmptyBorder());
        admin.addActionListener(this);
        p2.add(admin);*/


        /*JLabel text = new JLabel("Trouble Logging in..");
        text.setBounds(300, 250, 150, 19);
        text.setForeground(Color.red);
        p2.add(text);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 12));*/

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            try {

                String username = tfusername.getText();
                String email = tfemail.getText();
                String pass = tfpassword.getText();

                String query = "select * from admin where username ='" + username + "'AND email = '"+email+"'AND password = '" + pass + "' ";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()) {
                    setVisible(false);
                    new AdminDashboard("");
                    

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username,email or password");
                }
            } catch (Exception e) {
                e.printStackTrace();

            }

        } 
            
         else {
            setVisible(false);
            new Login();

        }
    }

    public static void main(String[] args) {
        new AdminLogin();

    }

}
