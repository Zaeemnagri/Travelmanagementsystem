
package travel.managemnt.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame  implements ActionListener{
    JButton addpersonaldetails,viewpersonaldetails,updatepersonaldetails,deletepersonaldetails,viewbookedhotel,checkpackages,bookpackage,about,destinations,logout,viewpackages,viewhotels,bookhotel;
    String username;
    Dashboard(String username){
        this.username = username;
        //setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(104,0,139));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,20,120));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addpersonaldetails = new JButton("Add Personal Details");
        addpersonaldetails.setBackground(new Color(104,0,139));
        addpersonaldetails.setForeground(Color.WHITE);
        addpersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addpersonaldetails.setBounds(0, 0, 300, 50);
        addpersonaldetails.setMargin(new Insets(0,0,0,60));
        addpersonaldetails.addActionListener(this);
        p2.add(addpersonaldetails);
        
        updatepersonaldetails = new JButton("Update Personal Details");
        updatepersonaldetails.setBackground(new Color(104,0,139));
        updatepersonaldetails.setForeground(Color.WHITE);
        updatepersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatepersonaldetails.setBounds(0, 45, 300, 50);
        updatepersonaldetails.setMargin(new Insets(0,0,0,30));
        updatepersonaldetails.addActionListener(this);
        p2.add(updatepersonaldetails);
        
        viewpersonaldetails = new JButton("View  Details");
        viewpersonaldetails.setBackground(new Color(104,0,139));
        viewpersonaldetails.setForeground(Color.WHITE);
        viewpersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpersonaldetails.setBounds(0, 90, 300, 50);
        viewpersonaldetails.setMargin(new Insets(0,0,0,130));
        viewpersonaldetails.addActionListener(this);
        p2.add(viewpersonaldetails);
        
        
        deletepersonaldetails = new JButton("Delete Personal Details");
        deletepersonaldetails.setBackground(new Color(104,0,139));
        deletepersonaldetails.setForeground(Color.WHITE);
        deletepersonaldetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletepersonaldetails.setBounds(0, 135, 300, 50);
        deletepersonaldetails.addActionListener(this);
        deletepersonaldetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletepersonaldetails);
        
        checkpackages = new JButton("Check Package");
        checkpackages.setBackground(new Color(104,0,139));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setBounds(0, 180, 300, 50);
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackage = new JButton("Book Package");
        bookpackage.setBackground(new Color(104,0,139));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackage.setBounds(0, 225, 300, 50);
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackages = new JButton("View Package");
        viewpackages.setBackground(new Color(104,0,139));
        viewpackages.setForeground(Color.WHITE);
        viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackages.setBounds(0, 270, 300, 50);
        viewpackages.addActionListener(this);
        viewpackages.setMargin(new Insets(0,0,0,120));
        p2.add(viewpackages);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBackground(new Color(104,0,139));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setBounds(0, 315, 300, 50);
        viewhotels.addActionListener(this);
        viewhotels.setMargin(new Insets(0,0,0,140));
        p2.add(viewhotels);
        
        bookhotel = new JButton("Book Hotels");
        bookhotel.setBackground(new Color(104,0,139));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setBounds(0, 360, 300, 50);
        bookhotel.addActionListener(this);
        bookhotel.setMargin(new Insets(0,0,0,140));
        p2.add(bookhotel);
        
        viewbookedhotel = new JButton("View Booked Hotels");
        viewbookedhotel.setBackground(new Color(104,0,139));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookedhotel.setBounds(0, 405, 300, 50);
        viewbookedhotel.addActionListener(this);
        viewbookedhotel.setMargin(new Insets(0,0,0,70));
        p2.add(viewbookedhotel);
        
        destinations = new JButton("Destinations");
        destinations.setBackground(new Color(104,0,139));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setBounds(0, 450, 300, 50);
        destinations.addActionListener(this);
        destinations.setMargin(new Insets(0,0,0,130));
        p2.add(destinations);
        
        JButton payments = new JButton("Payments");
        payments.setBackground(new Color(104,0,139));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setBounds(0, 495, 300, 50);
        payments.setMargin(new Insets(0,0,0,155));
        p2.add(payments);
        
        about = new JButton("About");
        about.setBackground(new Color(104,0,139));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setBounds(0, 540, 300, 50);
        about.addActionListener(this);
        about.setMargin(new Insets(0,0,0,190));
        p2.add(about);
        
        logout = new JButton("Logout");
        logout.setBackground(new Color(104,0,139));
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma", Font.PLAIN, 20));
        logout.setBounds(0, 585, 300, 50);
        logout.setMargin(new Insets(0,0,0,180));
        logout.addActionListener(this);
        p2.add(logout);
        
        JButton blank = new JButton("");
        blank.setBackground(new Color(104,0,139));
        blank.setBounds(0, 630, 300, 50);
        p2.add(blank);
        
       
        
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/dash-.png"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(330, 70, 1000, 70);
        text.setForeground(Color.BLACK);
        text.setFont(new Font("Raleway", Font.BOLD, 43));
        image.add(text);
        
        
        
        

        
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
    if (ae.getSource()==addpersonaldetails){
        new AddCustomer(username);
    
    }
    else if(ae.getSource()==viewpersonaldetails){
        new ViewCustomer(username);   
    }
    else if(ae.getSource()==updatepersonaldetails){
        new UpdateCustomer(username);   
    }
    else if(ae.getSource()==checkpackages){
        new CheckPackage();   
    }
    else if(ae.getSource()==bookpackage){
        new BookPackage(username);   
    }
    else if(ae.getSource()==viewpackages){
        new ViewPackage(username);
    }
    else if(ae.getSource()==viewhotels){
        new CheckHotels();
    }
    else if(ae.getSource()==destinations){
        new Destinations();
    }
    else if(ae.getSource()==bookhotel){
        new BookHotel(username);
    }
    else if(ae.getSource()==viewbookedhotel){
        new ViewBookedHotel(username);
    }
    else if(ae.getSource()==deletepersonaldetails){
        new DeleteDetails(username);
    }
    else if(ae.getSource()==about){
        new About();
    }
    else  {
        setVisible(false);
        new Login();
    
    }
    
    }
    
    public static void main(String []args){
        new Dashboard("");
    
    }
    
    
}
