import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;

public class Login extends JFrame implements ActionListener{
	JButton login,signup,clear;
	JTextField cardfield;
	JPasswordField field;
	 Login() {
		 setLayout(null);
		 setTitle("ATM");
		 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		 Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		 ImageIcon i3=new ImageIcon(i2);
		 JLabel lable =new JLabel(i3);
		 lable.setBounds(150, 10, 100, 100);
		 add(lable);
		 getContentPane().setBackground(Color.WHITE);
		 
		 JLabel text=new JLabel("Welcome to ATM");
		 text.setFont(new Font("Osward",Font.BOLD,38));
		 text.setBounds(300, 40, 400, 40);
		 add(text);
		 
		 JLabel cardno=new JLabel("Card NO:");
		 cardno.setFont(new Font("Raleway",Font.BOLD,28));
		 cardno.setBounds(200, 150, 200, 40);
		 add(cardno);
		 
		 JLabel pinno=new JLabel("Pin No:");
		 pinno.setFont(new Font("Raleway",Font.BOLD,28));
		 pinno.setBounds(200, 220, 220, 40);
		 add(pinno);
		 
		 field=new JPasswordField();
		 field.setBounds(400,220,220,30);
		 add(field);
		 
		 cardfield=new JTextField();
		 cardfield.setBounds(400,150,220,40);
		 add(cardfield);
		 
		 login=new JButton("SIGN IN");
		 login.setBounds(400, 300, 100, 30);
		 login.setBackground(Color.black);
		 login.setForeground(Color.WHITE);
		 login.addActionListener(this);
		 add(login);
		 
		 clear=new JButton("CLEAR");
		 clear.setBounds(520, 300, 100, 30);
		 clear.setBackground(Color.black);
		 clear.setForeground(Color.WHITE);
		 clear.addActionListener(this);
		 add(clear);
		 
		 signup=new JButton("SIGN UP");
		 signup.setBounds(400, 350, 220, 30);
		 signup.setBackground(Color.black);
		 signup.setForeground(Color.WHITE);
		 signup.addActionListener(this);
		 add(signup);
		 
		 
		setSize(800,480);
		setVisible(true);
		setLocation(350, 170);
		
	}
	 public void actionPerformed(ActionEvent ae)
	 {if(ae.getSource()== clear) {
		 field.setText("");
		 cardfield.setText("");
	 }
	 else if (ae.getSource()==login) {
		conn conn =new conn();
		String cardnumber=cardfield.getText();
		String pinnumber=field.getText();
		System.out.println(pinnumber);
		String query="select * from Login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
		try {
			ResultSet rs=conn.s.executeQuery(query);
			if(rs.next())
			{
				setVisible(false);
				new Transition(pinnumber);
				//setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Incorrect Card number or Pin");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	 else if (ae.getSource()== signup) {
		setVisible(false);
		new Signupone().setVisible(true);
	}
		 
	 }
	
	public static void main(String[] args) {
		new Login();
	}

}
