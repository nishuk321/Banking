import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class pinchange extends JFrame implements ActionListener{
	JPasswordField pin,repin;
	JButton change,back;
	String pinnumber;
	public pinchange(String pinnumber) {
		setLayout(null);
		this.pinnumber=pinnumber;
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
	
	JLabel text=new JLabel("CHANGE YOUR PIN");
	text.setBounds(250, 280, 500, 35);
	text.setForeground(Color.WHITE);
	text.setFont(new Font("System",Font.BOLD,17));
	image.add(text);
	
	JLabel pintext=new JLabel("NEW PIN");
	pintext.setBounds(165, 320, 180, 25);
	pintext.setForeground(Color.WHITE);
	pintext.setFont(new Font("System",Font.BOLD,17));
	image.add(pintext);
	
	pin=new JPasswordField();
	pin.setBounds(330,320 , 180, 25);
	pin.setFont(new Font("Raleway",Font.BOLD,25));
	image.add(pin);
	
	
	JLabel repintext=new JLabel("RE-Enter NEW PIN");
	repintext.setBounds(165, 360, 180, 25);
	repintext.setForeground(Color.WHITE);
	repintext.setFont(new Font("System",Font.BOLD,17));
	image.add(repintext);
	
	repin=new JPasswordField();
	repin.setBounds(330,360 , 180, 25);
	repin.setFont(new Font("Raleway",Font.BOLD,25));
	image.add(repin);
	
	change=new JButton("CHANGE");
	change.setBounds(355, 485, 150, 30);
	change.addActionListener(this);
	image.add(change);
	
	back=new JButton("Back");
	back.setBounds(355, 520, 150, 30);
	back.addActionListener(this);
	image.add(back);
	}
public static void main(String[] args) {
	new pinchange("");
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==change)
	{
	
	try {
		String npin=pin.getText();
		String rpin=repin.getText();
		if(!npin.equals(rpin))
		{
			JOptionPane.showMessageDialog(null, "Entered PIn does not match");
			return;
		}
		else if(npin.equals(""))
		{
			JOptionPane.showMessageDialog(null, "Please Enter new pin");
			return;
		}
		else if(rpin.equals(""))
		{
			JOptionPane.showMessageDialog(null, "Please Re-Enter new PIN");
			return;
		}
		else {
			System.out.println(rpin);
			
		conn conn=new conn();
		String query="update bank set pin = '"+rpin+"'where pin='"+pinnumber+"'";
		String query1="update login set pin = '"+rpin+"'where pin='"+pinnumber+"'";
	    String query2="update signupthree set pin = '"+rpin+"'where pin='"+pinnumber+"'";
	    conn.s.executeUpdate(query);
	    conn.s.executeUpdate(query1);
	    conn.s.executeUpdate(query2);
	    
	    JOptionPane.showMessageDialog(null, "Pin change successfully");
	    setVisible(false);
	    new Transition(rpin);
		}}
		catch (Exception e2) {
			System.out.println(e2);
		}}
	    else {
		setVisible(false);
		new Transition(pinnumber).setVisible(true);
	
}}
}
