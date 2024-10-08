import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public  class Signupone extends JFrame implements ActionListener{
	
	
	JTextField nametext,fname,emailtext,addtext,citytext,statetext,pintext;
	JRadioButton male,female,singleButton,marriedButton;
	JButton next;
	JDateChooser date;
	int num;
	
	
	
	public Signupone() {
		setLayout(null);
		
		setSize(800,900);
		setLocation(300, 10);
		setVisible(true);
		Random ran=new Random();
	    num=ran.nextInt(100000);
		System.out.println(num);
		
		JLabel formno=new JLabel("APPLICATION FORM NO: "+num);
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setBounds(140, 20, 600, 40);
		add(formno);

		JLabel persondetails=new JLabel("Page 1: Personal Details");
		persondetails.setFont(new Font("Raleway",Font.BOLD,25));
		persondetails.setBounds(260, 70, 600, 35);
		add(persondetails);
		
		JLabel name=new JLabel("Name:");
		name.setFont(new Font("Raleway",Font.BOLD,25));
	    name.setBounds(140, 140, 100, 30);
		add(name);
		
		nametext=new JTextField();
		nametext.setFont(new Font("Raleway",Font.BOLD,15));
		nametext.setBounds(360, 140, 300, 20);
		add(nametext);
		
		JLabel fathername=new JLabel("Father's:");
		fathername.setFont(new Font("Raleway",Font.BOLD,30));
	    fathername.setBounds(140, 190, 200, 30);
		add(fathername);
		
		 fname=new JTextField();
		fname.setFont(new Font("Raleway",Font.BOLD,15));
		fname.setBounds(360, 190, 300, 20);
		add(fname);
		
		JLabel dob=new JLabel("DOB:");
		dob.setFont(new Font("Raleway",Font.BOLD,30));
	   dob.setBounds(140, 240, 100, 35);
		add(dob);
		
		 date=new JDateChooser();
		date.setBounds(360, 240, 100,20);
		add(date);
		
		JLabel gender=new JLabel("Gender:");
		gender.setFont(new Font("Raleway",Font.BOLD,30));
	    gender.setBounds(140, 340, 200, 30);
		add(gender);
		
	    male=new JRadioButton("Male");
		male.setBounds(360, 340, 100, 20);
		add(male);
				
		 female=new JRadioButton("Female");
		female.setBounds(500, 340, 100, 20);
		add(female);
		ButtonGroup gendergroup=new ButtonGroup();
		gendergroup.add(female);
		gendergroup.add(male);

		JLabel email=new JLabel("Email:");
		email.setFont(new Font("Raleway",Font.BOLD,30));
	    email.setBounds(140, 290, 100, 35);
		add(email);
		
		 emailtext=new JTextField();
		emailtext.setFont(new Font("Raleway",Font.BOLD,15));
		emailtext.setBounds(360, 290, 300, 20);
		add(emailtext);
		
		JLabel status=new JLabel("Marital Status:");
		status.setFont(new Font("Raleway",Font.BOLD,30));
		status.setBounds(140, 390, 250, 30);
		add(status);
		
	    singleButton=new JRadioButton("Single");
		singleButton.setBounds(360, 390, 100, 30);
		add(singleButton);
		
		 marriedButton=new JRadioButton("Married");
		marriedButton.setBounds(500, 390, 100, 30);
		add(marriedButton);
		
		ButtonGroup statusgroup=new ButtonGroup();
		statusgroup.add(singleButton);
		statusgroup.add(marriedButton);
		
		
		JLabel add=new JLabel("Address:");
		add.setFont(new Font("Raleway",Font.BOLD,30));
		add.setBounds(140, 440, 250, 30);
		add(add);
		
		 addtext=new JTextField();
		addtext.setFont(new Font("Raleway",Font.BOLD,15));
		addtext.setBounds(360, 440, 300, 20);
		add(addtext);
		
		JLabel city=new JLabel("City:");
		city.setFont(new Font("Raleway",Font.BOLD,30));
		city.setBounds(140, 490, 250, 30);
		add(city);
		
		 citytext=new JTextField();
		citytext.setFont(new Font("Raleway",Font.BOLD,15));
		citytext.setBounds(360, 490, 300, 20);
		add(citytext);
		
		
		JLabel state=new JLabel("State:");
		state.setFont(new Font("Raleway",Font.BOLD,30));
		state.setBounds(140, 540, 250, 30);
		add(state);
		

	    statetext=new JTextField();
		statetext.setFont(new Font("Raleway",Font.BOLD,15));
		statetext.setBounds(360, 540, 300, 20);
		add(statetext);
		
		
		JLabel pin=new JLabel("Pin Code:");
		pin.setFont(new Font("Raleway",Font.BOLD,30));
		pin.setBounds(140, 590, 250, 30);
		add(pin);
		
		pintext=new JTextField();
	    pintext.setFont(new Font("Raleway",Font.BOLD,15));
		pintext.setBounds(360, 590, 300, 20);
		add(pintext);
		
		 next=new JButton("Next");
		next.setBounds(670, 620, 90, 20);
		next.setBackground(Color.blue);
		next.setForeground(Color.WHITE);
		next.addActionListener(this);
		add(next);
		
		
		getContentPane().setBackground(Color.WHITE);
	}
	
	public static void main(String[] args) {
		new signuptwo("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String form=""+num;
		
		
		String name=nametext.getText();
		String fathername=fname.getText();
		String Email=emailtext.getText();
		String address=addtext.getText();
		String city=citytext.getText();
		String pin=pintext.getText();
		String state=statetext.getText();
		String datec=((JTextField)date.getDateEditor().getUiComponent()).getText();
		String gender=null;
		if(male.isSelected())
		{
			gender="Male";
		}
		else if (female.isSelected()) {
			gender="Female";
			
		}
		String status=null;
		if(singleButton.isSelected())
		{
			status="Single";
			
		}
		else if (marriedButton.isSelected()) {
			status="Married";
			
		}
		try 
		{if(nametext.equals("")){
			JOptionPane.showMessageDialog(null, "Name is  Requried");
			
		}
		else{
			conn c = new conn();
			String query = "insert into Signupone values('" + form + "','" + name + "','" + fathername + "','" + datec + "','" + Email + "','" + gender + "','" + status + "','" + address + "','" + city + "','" + state + "','" + pin + "')";
			System.out.println(query); // Add this line to print the SQL query
			c.s.executeUpdate(query);
			setVisible(false);
			new signuptwo(form).setVisible(true);

		}
		}
		catch (Exception e1) {
			System.out.println(e1);
		}
	}

}
