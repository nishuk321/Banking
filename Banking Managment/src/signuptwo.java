import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public  class signuptwo extends JFrame implements ActionListener{
	
	
	JTextField addhartext,pantext;
	JRadioButton male,female,yes,no,yes1,no1,yes11,no11;
	JButton next;
	JComboBox incometext,religiontext,categorietext,educationtext,occuptiontext;
    String form;
	
	public signuptwo(String form) {
		
		setLayout(null);
		this.form=form;
		
		setSize(800,900);
		setLocation(300, 10);
		setVisible(true);
		
		JLabel additionaldetails=new JLabel("Page 2 : Additional Details");
		additionaldetails.setFont(new Font("Raleway",Font.BOLD,25));
		additionaldetails.setBounds(260, 50, 600, 35);
		add(additionaldetails);
		
		JLabel religion=new JLabel("Religion:");
		religion.setFont(new Font("Raleway",Font.BOLD,25));
		religion.setBounds(100, 120, 180, 30);
		add(religion);
		
		String religionname[]= {"Hindu","Muslim","Sikh","Christian","other"};
		 religiontext=new JComboBox<>(religionname);
		religiontext.setBounds(460, 120, 300, 20);
		religiontext.setBackground(Color.WHITE);
		religiontext.setForeground(Color.BLACK);
		add(religiontext);
		
		
		JLabel categories=new JLabel("Categories:");
		categories.setFont(new Font("Raleway",Font.BOLD,30));
		categories.setBounds(100, 170, 200, 30);
		add(categories);
		
		String cato[]= {"General","OBC","SC","ST","Other"};
		
		 categorietext=new JComboBox(cato);
		 categorietext.setFont(new Font("Raleway",Font.BOLD,15));
		 categorietext.setBounds(460, 170, 300, 20);
		 categorietext.setBackground(Color.WHITE);
		 categorietext.setForeground(Color.BLACK);
		add(categorietext);
		
		JLabel income=new JLabel("Income:");
		income.setFont(new Font("Raleway",Font.BOLD,30));
		income.setBounds(100, 220, 200, 35);
		add(income);
		
		String sal[]= {"null","< 1,50,000","< 2,50,00","< 5,00,000","Upto 10,00,000"};
		incometext=new JComboBox<>(sal);
		 incometext.setBounds(460, 220, 300, 20);
		 incometext.setBackground(Color.WHITE);
		 incometext.setForeground(Color.BLACK);
		add( incometext);
		
		JLabel education=new JLabel("Educational:");
		education.setFont(new Font("Raleway",Font.BOLD,30));
		education.setBounds(100, 320, 200, 30);
		add(education);
		
		String edu[]= {"10th","12Th","Graduate","Post-Graduate","Doctrate","Other"};
		educationtext=new JComboBox(edu);
		educationtext.setBounds(460, 320, 300, 20);
		educationtext.setBackground(Color.WHITE);
		educationtext.setForeground(Color.BLACK);
		add( educationtext);
	   

		JLabel working=new JLabel("Currently Working:");
		working.setFont(new Font("Raleway",Font.BOLD,30));
		working.setBounds(100, 270, 300, 35);
		add(working);
		
		 yes=new JRadioButton("YES");
		 yes.setBounds(460, 270, 100, 30);
			add(yes);
			
	     no=new JRadioButton("NO");
		 no.setBounds(600, 270, 100, 30);
			add(no);
			
			ButtonGroup statusgroup=new ButtonGroup();
			statusgroup.add(yes);
			statusgroup.add(no);

		
		JLabel occuption=new JLabel("Occupation:");
		occuption.setFont(new Font("Raleway",Font.BOLD,30));
		occuption.setBounds(100, 370, 250, 30);
		add(occuption);
		
		String occ[]= {"Salaried","Self-Employed","Bussiness","Student","Other"};
		occuptiontext=new JComboBox(occ);
		occuptiontext.setBounds(460, 370, 300, 20);
		occuptiontext.setBackground(Color.WHITE);
		occuptiontext.setForeground(Color.BLACK);
		add( occuptiontext);
	   
		
		
		JLabel pan=new JLabel("PAN Number:");
		pan.setFont(new Font("Raleway",Font.BOLD,30));
		pan.setBounds(100, 420, 250, 30);
		add(pan);
		
		 pantext=new JTextField();
		 pantext.setFont(new Font("Raleway",Font.BOLD,15));
		 pantext.setBounds(460, 420, 300, 20);
		add(pantext);
		
		JLabel addhar=new JLabel("Addhar Number:");
		addhar.setFont(new Font("Raleway",Font.BOLD,30));
		addhar.setBounds(100, 470, 250, 30);
		add(addhar);
		
		 addhartext=new JTextField();
		 addhartext.setFont(new Font("Raleway",Font.BOLD,15));
		 addhartext.setBounds(460, 470, 300, 20);
		add( addhartext);
		
		
		JLabel senior=new JLabel("Senior citizen:");
		senior.setFont(new Font("Raleway",Font.BOLD,30));
		senior.setBounds(100, 520, 250, 30);
		add(senior);
		 yes1=new JRadioButton("YES");
		 yes1.setBounds(460, 520, 100, 30);
			add(yes1);
			
	     no1=new JRadioButton("NO");
		 no1.setBounds(600, 520, 100, 30);
			add(no1);
			
			
			ButtonGroup statusgroup11=new ButtonGroup();
			statusgroup11.add(yes1);
			statusgroup11.add(no1);

		JLabel account=new JLabel("Existing Account:");
		account.setFont(new Font("Raleway",Font.BOLD,30));
		account.setBounds(100, 570, 350, 30);
		add(account);
		
		yes11=new JRadioButton("YES");
		 yes11.setBounds(460, 570, 100, 30);
			add(yes11);
			
	     no11=new JRadioButton("NO");
		 no11.setBounds(600, 570, 100, 30);
			add(no11);
			ButtonGroup statusgroup12=new ButtonGroup();
			statusgroup12.add(yes11);
			statusgroup12.add(no11);
			
		 next=new JButton("Next");
		next.setBounds(670, 610, 90, 20);
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
		
		System.out.println(form);
		String formno=form;
		String sreligion=(String) religiontext.getSelectedItem();
		String scategories=(String)categorietext.getSelectedItem();
		String sincome=(String)incometext.getSelectedItem();
		String sworking=null;
		if(yes.isSelected())
		{
			sworking="Yes";
		}
		else if (no.isSelected()) {
			sworking="No";
			
		}
		
		String seducation=(String)educationtext.getSelectedItem();
		String soccupation=(String)educationtext.getSelectedItem();
		String span=pantext.getText();
		String saddhar=addhartext.getText();
		String senior=null;
		if(yes1.isSelected())
		{
			senior="Yes";
		}
		else if (no1.isSelected()) {
			senior="No";
			
		}
		
		String existingaccount=null;
		if(yes11.isSelected())
		{
			existingaccount="Yes";
		}
		else if (no11.isSelected()) {
			existingaccount="No";
			
		}
		try {
		
			conn c = new conn();
			String query = "insert into signuptwo values('" + form + "','" + sreligion + "','" + scategories + "','" + sincome + "','" + sworking + "','" + seducation + "','" + soccupation + "','" + span + "','" + saddhar + "','" + senior+ "','" + existingaccount + "')";
			System.out.println(query); // Add this line to print the SQL query
			c.s.executeUpdate(query);
            
			setVisible(false);
			new signupthree(form);
			//setVisible(true);
		
		}
		catch (Exception e1) {
			System.out.println(e1);
		}
	}

}
