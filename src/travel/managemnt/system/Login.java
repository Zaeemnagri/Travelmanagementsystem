package travel.managemnt.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JButton login, signup, password,admin;
    JTextField tfusername, tfpassword;

    Login() {
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

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 110, 100, 25);
        p2.add(lblpassword);
        lblpassword.setFont(new Font("SAN_SERIF", Font.PLAIN, 19));

        tfpassword = new JTextField();
        tfpassword.setBounds(60, 150, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);

        login = new JButton("Login");
        login.setBounds(60, 200, 130, 30);
        login.setBackground(new Color(72, 201, 176));
        login.setForeground(Color.WHITE);
        login.setBorder(BorderFactory.createEmptyBorder());
        login.addActionListener(this);
        p2.add(login);

        signup = new JButton("Signup");
        signup.setBounds(230, 200, 130, 30);
        signup.setBackground(new Color(72, 201, 176));
        signup.setForeground(Color.WHITE);
        signup.setBorder(BorderFactory.createEmptyBorder());
        signup.addActionListener(this);
        p2.add(signup);

        password = new JButton("Forget Password");
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
        p2.add(admin);


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
                String pass = tfpassword.getText();

                String query = "select * from account where username ='" + username + "'AND password = '" + pass + "' ";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()) {
                    setVisible(false);
                    new Loading(username);
                    

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }
            } catch (Exception e) {
                e.printStackTrace();

            }

        } else if (ae.getSource() == signup) {
            setVisible(false);
            new Signup();
        
        } else if (ae.getSource() == admin) {
            setVisible(false);
            new AdminLogin();
            
        } else {
            setVisible(false);
            new ForgetPassword();

        }
    }

    public static void main(String[] args) {
        new Login();

    }

}
