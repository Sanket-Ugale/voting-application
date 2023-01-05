package votingApp;

import java.awt.image.BufferedImage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.Adler32;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.Text;

//import com.mysql.cj.protocol.a.NativeConstants.StringSelfDataType;
//import com.mysql.cj.xdevapi.AddResult;

//import com.sun.tools.javac.Main;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;






@SuppressWarnings("unused")
public class MainPage {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	private JTextField textFieldVMidName;
	private JTextField textFieldVName;
	private JTextField textFieldVLastName;
	@SuppressWarnings("unused")
	private JTextField textField_5;
	private JTextField textFieldVTaluka;
	private JTextField textFieldVPinCode;
	private JTextField textFieldAddarCardNo;
	private JTextField textFieldVUsername;
	private JPasswordField passwordFieldVPassword;
	private JPasswordField passwordFieldVConfPassWo;
	private JTextField textFieldVMobileNo;
	private JTextField CandidateNametextField1;
	private JTextField CandidateNametextField2;
	private JTextField CandidateNametextField3;
	private JTextField CandidateNametextField4;
	private JTextField CandidateNametextField5;
	private JTextField CandidateNametextField6;
	private JTextField CandidateNametextField7;
	private JTextField CandidateNametextField8;
	private JTextField CandidateNametextField9;
	private JTextField CandidateNametextField10;
	private JTextField CandidateNametextField11;
	private JTextField CandidateNametextField12;
	private JTextField CandidateNametextField13;
	private JTextField CandidateNametextField14;
	private JPasswordField VoteridField;
	private JTextField VoterIdtextField2;
	private JTextField VoterFirstNametextField;
	private JTextField VoterLAstNametextField;
	private JComboBox comboBoxVState, WardcomboBox,comboBoxVDistrict, comboBoxVAge, comboBoxVYear, comboBoxVMonth, comboBoxVDay ;
	private JTextArea textAreaAddress;
	ButtonGroup bg2=new ButtonGroup();

//	Strings to get voter Form Data
	String VoterFirstName;
	String VoterMiddleName;
	String VoterLastName;
	String VoterBirthDay;
	String VoterBirthMonth;
	String VoterBirthYear;
	String voterGender;
	String VoterAge;
	String VoterState;
	String VoterDistrict;
	String VoterTaluka;
	String VoterAddress;
	String VoterUsername;
	String VoterPassword;
	String VoterPinCode;
	String MobileNo;
	String voterAddarCard;
	String voterWard;
	String Voterid;
	String voterBirthDate;
	
//	Strings to get Voter table data
	String D_VoterID = null;
	String D_VoterFirstName = null;
	String D_VoterMiddleName = null;
	String D_VoterLastName = null;
	String D_VoterBirtDate = null;
	String D_VoterGender = null;
	String D_VoterAge = null;
	String D_VoterState = null;
	String D_VoterDistrict = null;
	String D_VoterTaluka = null;
	String D_VoterPinCode = null;
	String D_VoterAddress = null;
	String D_VoterMobileNo = null;
	String D_VoterAddarNo = null;
	String D_VoterWard = null;
	String D_VoterVoted = null;
	String D_VoterUsername = null;
	String D_VoterPassword = null;
	
//	Arrays to store voter data
	ArrayList<String> VoterUsernamearr = new ArrayList<String>();
	ArrayList<String> VoterPasswordarr = new ArrayList<String>();
	ArrayList<String> VoterIdarr = new ArrayList<String>();
	ArrayList<String> VoterFirstNamearr = new ArrayList<String>();
	ArrayList<String> VoterLastNamearr = new ArrayList<String>();
	ArrayList<String> VoterVotedarr = new ArrayList<String>();
	
	
	
	//AdminLogin Array and string	
	String AdminUsername = null;
	String AdminPassword = null;
	ArrayList<String> AdminUsernamearr = new ArrayList<String>();
	ArrayList<String> AdminPasswordarr = new ArrayList<String>();

	//Admin Dashboard Login Array and string
	String dashBoardUsernameString = null;
	String dashBoardPasswordString = null;
	ArrayList<String> DashBoardUsernamearr = new ArrayList<String>();
	ArrayList<String> DashBoardPasswordarr = new ArrayList<String>();
		
//	Candidate Arrays and String
	String CandidateName = null;
	String CandidateParty = null;
	String CandidateWard = null;
	String Votes = null;
	int i=0;
	ArrayList<String> CandidateNamearr = new ArrayList<String>();
	ArrayList<String> CandidateWardarr = new ArrayList<String>();
	ArrayList<String> CandidatePartyarr = new ArrayList<String>();
	ArrayList<String> Votesarr = new ArrayList<String>();
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/voting_application";
	static final String USER = "root";
	static final String PASS = "";
	Connection conn = null;
	Connection conn2 = null;
	Statement stmt = null;
	Statement stmt2 = null;
	
	
	private static final JTextField[] CandidateNametextField = null;
	private static final JTextField[] CandidatePartyNametextField = null;
	private static final JButton[] VoteButton = null;
	private static final String Private = null;
	int DataSize=0;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws SQLException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public MainPage() throws IOException {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
//	@SuppressWarnings("rawtypes")
	private void initialize() throws IOException {
		frame = new JFrame();
		frame.setSize(1000,600);
		frame.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("img/logo1.png");
		frame.setIconImage(icon.getImage());
		frame.setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0)); 

//		Get Candidate data from Database
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			String query = "SELECT * FROM candidate_data";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next())
			{
			CandidateName = rs.getString("CandidateName");
			CandidateNamearr.add(CandidateName);
			CandidateParty = rs.getString("PartyName");
			CandidatePartyarr.add(CandidateParty);
			CandidateWard = rs.getString("Ward");
			CandidateWardarr.add(CandidateWard);
			Votes = rs.getString("Votes");
			Votesarr.add(Votes);
			}
			DataSize=CandidateNamearr.size();
		
			st.close();
			conn.close();
			}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
			}catch(Exception e1){
			//Handle errors for Class.forName
			e1.printStackTrace();
			}finally{
			//finally block used to close resources
			try{
			if(stmt!=null)
			conn.close();
			}catch(SQLException se){
			}// do nothing
			try{
			if(conn!=null)
			conn.close();
			}catch(SQLException se){
			se.printStackTrace();
			}//end finally try
			}//end try
		 
//		Get Admin data from Database
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			String query = "SELECT * FROM admin";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next())
			{
			AdminUsername = rs.getString("Username");
			AdminUsernamearr.add(AdminUsername);
			AdminPassword = rs.getString("Password");
			AdminPasswordarr.add(AdminPassword);
			}		
			st.close();
			conn.close();
			}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
			}catch(Exception e1){
			//Handle errors for Class.forName
			e1.printStackTrace();
			}finally{
			//finally block used to close resources
			try{
			if(stmt!=null)
			conn.close();
			}catch(SQLException se){
			}// do nothing
			try{
			if(conn!=null)
			conn.close();
			}catch(SQLException se){
			se.printStackTrace();
			}//end finally try
			}//end try
		
//		Get Voter data from Database
		try 
	    { 
	        Connection con = DriverManager.getConnection(DB_URL, USER, PASS); 
	        String query = "SELECT * FROM voter_data"; 
	      
	    	Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
	        while (rs.next()) {
	      	  
	  		D_VoterID = rs.getString("voter_id");
	  		VoterIdarr.add(D_VoterID);
	  		D_VoterFirstName = rs.getString("First_name");	
	  		VoterFirstNamearr.add(D_VoterFirstName);
	  		D_VoterMiddleName = rs.getString("middle_name");				
	  		D_VoterLastName = rs.getString("Last_name");	
	  		VoterLastNamearr.add(D_VoterLastName);
	  		D_VoterBirtDate= rs.getString("birth_date");				
	  		D_VoterGender = rs.getString("gender");				
	  		D_VoterAge = rs.getString("Age");			
	  		D_VoterState = rs.getString("State");			
	  		D_VoterDistrict = rs.getString("District");			
	  		D_VoterTaluka= rs.getString("Taluka");				
	  		D_VoterPinCode = rs.getString("Pin_code");			
	  		D_VoterAddress = rs.getString("Address");			
	  		D_VoterMobileNo = rs.getString("Mobile_no");				
	  		D_VoterAddarNo= rs.getString("Addar_card_Number");
	  		D_VoterWard = rs.getString("Ward");
	  		D_VoterVoted=rs.getString("voted");
	  		VoterVotedarr.add(D_VoterVoted);
	  		D_VoterUsername=rs.getString("Username");
	  		VoterUsernamearr.add(D_VoterUsername);
	  		D_VoterPassword=rs.getString("Password");
	  		VoterPasswordarr.add(D_VoterPassword);
	      
	        }
	     
	      } 
		catch(SQLException e17) {
	        e17.printStackTrace();	
	      }
	
//		Get AdminDashboard data from Database
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			String query = "SELECT * FROM dashboardlogin";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next())
			{
			dashBoardUsernameString = rs.getString("DashboardUsername");
			DashBoardUsernamearr.add(dashBoardUsernameString);
			dashBoardPasswordString = rs.getString("DashboardPassword");
			DashBoardPasswordarr.add(dashBoardPasswordString);
			}		
			st.close();
			conn.close();
			}catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
			}catch(Exception e1){
			//Handle errors for Class.forName
			e1.printStackTrace();
			}finally{
			//finally block used to close resources
			try{
			if(stmt!=null)
			conn.close();
			}catch(SQLException se){
			}// do nothing
			try{
			if(conn!=null)
			conn.close();
			}catch(SQLException se){
			se.printStackTrace();
			}//end finally try
			}//end try

		

		
//		login panel declaration
		JPanel panel = new JPanel();
		
//		Main Page
		JPanel panel1 = new JPanel();
		frame.getContentPane().add(panel1, BorderLayout.CENTER);
		frame.setTitle("Voting Application");
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel1.setLayout(gbl_panel);
		panel1.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Voting Application");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 24;
		gbc_lblNewLabel.gridy = 0;
		panel1.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Display Admin Login Page

				panel1.setVisible(false);
				
			
//				Admin page
				JPanel panel2 = new JPanel();
				panel2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				panel2.setBackground(new Color(102, 255, 153));
				frame.getContentPane().add(panel2, BorderLayout.CENTER);
				panel2.setLayout(null);
				panel2.setVisible(true);
				
				JLabel lblNewLabel = new JLabel("Admin Login");
				lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
				lblNewLabel.setBounds(428, 11, 186, 41);
				panel2.add(lblNewLabel);
				
				JPanel panel3 = new JPanel();
				panel3.setBackground(new Color(102, 255, 255));
				panel3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				panel3.setBounds(352, 148, 345, 285);
				panel2.add(panel3);
				panel3.setLayout(null);
				
				JLabel lblNewLabel_2 = new JLabel("Username: ");
				lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 19));
				lblNewLabel_2.setBounds(43, 48, 106, 19);
				panel3.add(lblNewLabel_2);
				
				textField_1 = new JTextField(null);
				textField_1.setBounds(182, 44, 124, 33);
				panel3.add(textField_1);
				textField_1.setColumns(10);
				
				JLabel lblNewLabel_3 = new JLabel("Password: ");
				lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 19));
				lblNewLabel_3.setBounds(43, 129, 106, 19);
				panel3.add(lblNewLabel_3);
				
				passwordField_1 = new JPasswordField(null);
				passwordField_1.setBounds(182, 125, 124, 33);
				panel3.add(passwordField_1);
				
				ButtonGroup bg = new ButtonGroup();


				
				JButton btnNewButton2 = new JButton("Login");
				btnNewButton2.setBackground(Color.LIGHT_GRAY);
				btnNewButton2.addActionListener(new ActionListener() {
					String usernameString=null;
					String passwordString=null;
					public void actionPerformed(ActionEvent e) {
						usernameString=  textField_1.getText();
						passwordString= passwordField_1.getText();
						if (textField_1.getText().isEmpty() && passwordField_1.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null,"Please Enter Username and Password","Error",0);
						}
						
						else if (textField_1.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null,"Please Enter Username","Error",0);
						}
			
						else if (passwordField_1.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null,"Please Enter Password","Error",0);
						}
						else {
//							JOptionPane.showMessageDialog(null,"Username: "+usernameString+"\n Password: "+passwordString,"Error",0);
				

								if (AdminUsernamearr.contains(usernameString) && AdminPasswordarr.contains(passwordString)) {
//									JOptionPane.showMessageDialog(null,"Correct","Error",0);
									
									panel2.setVisible(false);
									panel3.setVisible(false);
									JPanel panel4 = new JPanel();
									frame.setTitle("Registration form");
									panel4.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
									panel4.setBackground(new Color(102, 51, 255));
									frame.getContentPane().add(panel4, BorderLayout.CENTER);
									panel4.setLayout(null);
									panel4.setVisible(true);
									
									JLabel JLabelVHeader = new JLabel("Registration Form");
									JLabelVHeader.setFont(new Font("Arial", Font.BOLD, 31));
									JLabelVHeader.setBounds(385, 11, 271, 37);
									panel4.add(JLabelVHeader);
									
									JPanel panel5 = new JPanel();
									panel5.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
									panel5.setBackground(new Color(102, 153, 255));
									panel5.setBounds(10, 59, 966, 493);
									panel4.add(panel5);
									panel5.setLayout(null);
									panel5.setVisible(true);
									
									JLabel JLabelVName = new JLabel("First name: ");
									JLabelVName.setFont(new Font("Arial", Font.PLAIN, 16));
									JLabelVName.setBounds(10, 11, 85, 23);
									panel5.add(JLabelVName);
									
									textFieldVMidName = new JTextField();
									textFieldVMidName.setBounds(493, 12, 110, 20);
									panel5.add(textFieldVMidName);
									textFieldVMidName.setColumns(10);
									
									JLabel JLabelVMidName = new JLabel("Middle name: ");
									JLabelVMidName.setFont(new Font("Arial", Font.PLAIN, 16));
									JLabelVMidName.setBounds(353, 12, 101, 23);
									panel5.add(JLabelVMidName);
									
									textFieldVName = new JTextField();
									textFieldVName.setColumns(10);
									textFieldVName.setBounds(127, 12, 110, 20);
									panel5.add(textFieldVName);
									
									textFieldVLastName = new JTextField();
									textFieldVLastName.setColumns(10);
									textFieldVLastName.setBounds(808, 12, 110, 20);
									panel5.add(textFieldVLastName);
									
									JLabel JLabelVLastName = new JLabel("Last name: ");
									JLabelVLastName.setFont(new Font("Arial", Font.PLAIN, 16));
									JLabelVLastName.setBounds(685, 12, 101, 23);
									panel5.add(JLabelVLastName);
									
									JLabel JLabelVBirthDate = new JLabel("Birth Date: ");
									JLabelVBirthDate.setFont(new Font("Arial", Font.PLAIN, 16));
									JLabelVBirthDate.setBounds(10, 65, 85, 19);
									panel5.add(JLabelVBirthDate);
									
									textFieldVTaluka = new JTextField();
									textFieldVTaluka.setColumns(10);
									textFieldVTaluka.setBounds(766, 138, 126, 24);
									panel5.add(textFieldVTaluka);
									
									JComboBox comboBoxVDay = new JComboBox();
									comboBoxVDay.setMaximumRowCount(5);
									comboBoxVDay.setModel(new DefaultComboBoxModel(new String[] {"Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
									comboBoxVDay.setBounds(105, 65, 51, 22);
									panel5.add(comboBoxVDay);
									
									JComboBox comboBoxVMonth = new JComboBox();
									comboBoxVMonth.setModel(new DefaultComboBoxModel(new String[] {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
									comboBoxVMonth.setMaximumRowCount(5);
									comboBoxVMonth.setBounds(166, 65, 79, 22);
									panel5.add(comboBoxVMonth);
									
									JComboBox comboBoxVYear = new JComboBox();
									comboBoxVYear.setModel(new DefaultComboBoxModel(new String[] {"Year", "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004"}));
									comboBoxVYear.setBounds(255, 65, 60, 22);
									panel5.add(comboBoxVYear);
									
//									ButtonGroup bg2=new ButtonGroup();
									JRadioButton rdbtnVMale = new JRadioButton("Male");
									rdbtnVMale.setBackground(new Color(102, 153, 255));
									rdbtnVMale.setFont(new Font("Arial", Font.PLAIN, 15));
									rdbtnVMale.setBounds(431, 67, 60, 23);
									panel5.add(rdbtnVMale);
									
									JRadioButton rdbtnVFemale = new JRadioButton("Female");
									rdbtnVFemale.setBackground(new Color(102, 153, 255));
									rdbtnVFemale.setFont(new Font("Arial", Font.PLAIN, 15));
									rdbtnVFemale.setBounds(493, 67, 79, 23);
									panel5.add(rdbtnVFemale);
									
									JRadioButton rdbtnVOther = new JRadioButton("Other");
									rdbtnVOther.setFont(new Font("Arial", Font.PLAIN, 15));
									rdbtnVOther.setBackground(new Color(102, 153, 255));
									rdbtnVOther.setBounds(574, 67, 71, 23);
									panel5.add(rdbtnVOther);
									
									bg2.add(rdbtnVMale);
									bg2.add(rdbtnVFemale);
									bg2.add(rdbtnVOther);
									
									JLabel JLabelVGender = new JLabel("Gender: ");
									JLabelVGender.setFont(new Font("Arial", Font.PLAIN, 16));
									JLabelVGender.setBounds(353, 69, 72, 17);
									panel5.add(JLabelVGender);
									
									JLabel Required1 = new JLabel("*");
									Required1.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required1.setForeground(new Color(204, 0, 0));
									Required1.setBackground(new Color(102, 153, 255));
									Required1.setBounds(105, 12, 18, 19);
									panel5.add(Required1);
									
									JLabel Required2 = new JLabel("*");
									Required2.setForeground(new Color(204, 0, 0));
									Required2.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required2.setBackground(new Color(102, 153, 255));
									Required2.setBounds(451, 10, 18, 19);
									panel5.add(Required2);
									
									JLabel Required3 = new JLabel("*");
									Required3.setForeground(new Color(204, 0, 0));
									Required3.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required3.setBackground(new Color(102, 153, 255));
									Required3.setBounds(765, 10, 18, 19);
									panel5.add(Required3);
									
									JLabel Required4 = new JLabel("*");
									Required4.setForeground(new Color(204, 0, 0));
									Required4.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required4.setBackground(new Color(102, 153, 255));
									Required4.setBounds(88, 65, 18, 19);
									panel5.add(Required4);
									
									JLabel Required5 = new JLabel("*");
									Required5.setForeground(new Color(204, 0, 0));
									Required5.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required5.setBackground(new Color(102, 153, 255));
									Required5.setBounds(417, 64, 18, 19);
									panel5.add(Required5);
									
									JComboBox comboBoxVAge = new JComboBox();
									comboBoxVAge.setModel(new DefaultComboBoxModel(new String[] {"Age", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", ">100"}));
									comboBoxVAge.setFont(new Font("Arial", Font.PLAIN, 15));
									comboBoxVAge.setBounds(808, 65, 60, 22);
									panel5.add(comboBoxVAge);
									
									JLabel JLabelVAge = new JLabel("Age: ");
									JLabelVAge.setFont(new Font("Arial", Font.PLAIN, 15));
									JLabelVAge.setBounds(727, 65, 41, 21);
									panel5.add(JLabelVAge);
									
									JLabel Required6 = new JLabel("*");
									Required6.setForeground(new Color(204, 0, 0));
									Required6.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required6.setBackground(new Color(102, 153, 255));
									Required6.setBounds(765, 65, 18, 19);
									panel5.add(Required6);
									
									JLabel JLabelVL1 = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------");
									JLabelVL1.setFont(new Font("Tahoma", Font.BOLD, 16));
									JLabelVL1.setBackground(new Color(102, 153, 255));
									JLabelVL1.setBounds(0, 110, 966, 14);
									panel5.add(JLabelVL1);
									
									JLabel JLabelVState = new JLabel("State: ");
									JLabelVState.setFont(new Font("Arial", Font.PLAIN, 15));
									JLabelVState.setBounds(10, 135, 51, 29);
									panel5.add(JLabelVState);
									
									JComboBox comboBoxVState = new JComboBox();
									comboBoxVState.setModel(new DefaultComboBoxModel(new String[] {"Select State", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal", "Andaman and Nicobar Islands", "Chandigarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Lakshadweep", "Puducherry"}));
									comboBoxVState.setFont(new Font("Arial", Font.PLAIN, 15));
									comboBoxVState.setBounds(88, 138, 149, 22);
									panel5.add(comboBoxVState);
									
									JLabel Required7 = new JLabel("*");
									Required7.setForeground(new Color(204, 0, 0));
									Required7.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required7.setBackground(new Color(102, 153, 255));
									Required7.setBounds(51, 135, 18, 19);
									panel5.add(Required7);
									
									JLabel JLabelVDistrict = new JLabel("District: ");
									JLabelVDistrict.setFont(new Font("Arial", Font.PLAIN, 15));
									JLabelVDistrict.setBounds(365, 135, 60, 29);
									panel5.add(JLabelVDistrict);
									
									JComboBox comboBoxVDistrict = new JComboBox();
									comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District"}));
									comboBoxVDistrict.setFont(new Font("Arial", Font.PLAIN, 15));
									comboBoxVDistrict.setBounds(454, 138, 149, 22);
									panel5.add(comboBoxVDistrict);
									
									JLabel Required8 = new JLabel("*");
									Required8.setForeground(new Color(204, 0, 0));
									Required8.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required8.setBackground(new Color(102, 153, 255));
									Required8.setBounds(431, 135, 18, 19);
									panel5.add(Required8);
									
									JLabel JLabelVTaluka = new JLabel("Taluka: ");
									JLabelVTaluka.setFont(new Font("Arial", Font.PLAIN, 15));
									JLabelVTaluka.setBounds(685, 135, 60, 29);
									panel5.add(JLabelVTaluka);
									
									JLabel Required9 = new JLabel("*");
									Required9.setForeground(new Color(204, 0, 0));
									Required9.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required9.setBackground(new Color(102, 153, 255));
									Required9.setBounds(738, 135, 18, 19);
									panel5.add(Required9);
									
									JLabel JLabelVPinCode = new JLabel("Pin Code: ");
									JLabelVPinCode.setFont(new Font("Arial", Font.PLAIN, 15));
									JLabelVPinCode.setBounds(10, 185, 71, 29);
									panel5.add(JLabelVPinCode);
									
									textFieldVPinCode = new JTextField();
									textFieldVPinCode.setColumns(10);
									textFieldVPinCode.setBounds(88, 188, 149, 24);
									panel5.add(textFieldVPinCode);

//									pin code required label
									JLabel Required10 = new JLabel("*");
									Required10.setForeground(new Color(204, 0, 0));
									Required10.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required10.setBackground(new Color(102, 153, 255));
									Required10.setBounds(73, 172, 22, 35);
									panel5.add(Required10);
									
									JLabel JLabelVAddress = new JLabel("Address: ");
									JLabelVAddress.setFont(new Font("Arial", Font.PLAIN, 15));
									JLabelVAddress.setBounds(364, 182, 71, 35);
									panel5.add(JLabelVAddress);
									
									JTextArea textAreaAddress = new JTextArea();
									textAreaAddress.setBounds(454, 188, 206, 40);
									panel5.add(textAreaAddress);
							
//									Address Required label
									JLabel Required11 = new JLabel("*");
									Required11.setForeground(new Color(204, 0, 0));
									Required11.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required11.setBackground(new Color(102, 153, 255));
									Required11.setBounds(431, 185, 18, 19);
									panel5.add(Required11);
									
									JLabel JLabelVL2 = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------");
									JLabelVL2.setFont(new Font("Tahoma", Font.BOLD, 16));
									JLabelVL2.setBackground(new Color(102, 153, 255));
									JLabelVL2.setBounds(0, 239, 966, 14);
									panel5.add(JLabelVL2);
									
									JLabel JLabelVAddarCardNumber = new JLabel("Addar Card Number:  ");
									JLabelVAddarCardNumber.setFont(new Font("Arial", Font.PLAIN, 15));
									JLabelVAddarCardNumber.setBounds(10, 264, 149, 29);
									panel5.add(JLabelVAddarCardNumber);
									
									textFieldAddarCardNo = new JTextField();
									textFieldAddarCardNo.setColumns(10);
									textFieldAddarCardNo.setBounds(166, 267, 149, 24);
									panel5.add(textFieldAddarCardNo);
									
//									Addhar card no required label
									JLabel Required12 = new JLabel("*");
									Required12.setForeground(new Color(204, 0, 0));
									Required12.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required12.setBackground(new Color(102, 153, 255));
									Required12.setBounds(147, 258, 22, 35);
									panel5.add(Required12);
									
									
									JLabel JLabelVWard = new JLabel("Ward: ");
									JLabelVWard.setFont(new Font("Arial", Font.PLAIN, 15));
									JLabelVWard.setBounds(451, 264, 51, 29);
									panel5.add(JLabelVWard);
									
									JComboBox WardcomboBox = new JComboBox();
									WardcomboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Ward A (NO. 224 TO 227) \u2013 Churchgate, Colaba, and Navy Nagar", "Ward B (NO. 221 TO 223) \u2013 Masjid Bunder, Mohd. Ali Road, Dongri and Bhendi Bazar", "Ward C (NO. 217 TO 220) \u2013 Pydhonie and Bhuleshwar", "Ward D (NO. 210 TO 216) \u2013 Grant Road, Walkeshwar, Malabar Hill, Breach Candy to Haji Ali", "Ward E (NO. 202 TO 209) \u2013 Byculla, Madanpura, Agripada, Nagpada, Dockyard Road, Reay Road, Chichpokli", "Ward F/N (NO. 165 TO 174) \u2013 Matunga, Sion, Wadala, Hindu Colony", "Ward F/S (NO. 195 TO 201) \u2013 Parel", "Ward G/N (NO. 175 TO 185) \u2013 Dharavi, Mahim and Dadar", "Ward G/S (NO. 186 TO 194) \u2013 Worli and Prabhadevi", "Ward H/E (NO. 81 TO 91) \u2013 Bandra East, Khar East and Santacruz East", "Ward H/W (NO. 92 TO 97) \u2013 Bandra West, Khar West, Santacruz West", "Ward K/E (NO. 66 TO 80) \u2013 Andheri East, Jogeshwari East, and Vile Parle East", "Ward K/W (NO. 53 TO 65) \u2013 Andheri West, Jogeshwari West, and Vile Parle West", "Ward L (NO. 150 TO 164) \u2013 Sakinaka, Chandivali, Asalpha, and Kurla", "Ward M/E (NO. 129 TO 141) \u2013 Mankhurd, Anushakti Nagar, Deonar, Cheetah Camp, Shivaji Nagar", "Ward M/W (NO. 142 TO 149) \u2013 Chembur, Sindhi Society, Chheda Nagar and Tilak Nagar", "Ward N (NO. 117 TO 128) \u2013 Ghatkopar, Vidyavihar and Pant Nagar", "Ward P/N (NO. 29 TO 44) \u2013 Malad, Manori, Marve, Aksa, and Madh", "Ward P/S (NO. 45 TO 52) \u2013 Goregaon", "Ward R/C (NO. 8 TO 17) \u2013 Borivali", "Ward R/N (NO. 1 TO 7) \u2013 Dahisar", "Ward R/S (NO. 165 TO 174) \u2013 Kandivali and Charkop", "Ward S (NO. 104 TO 116) \u2013 Bhandup, Powai, Kanjurmarh, Vikhroli and Nahur", "Ward T (NO. 98 TO 103) \u2013 Mulund"}));
									WardcomboBox.setFont(new Font("Arial", Font.PLAIN, 15));
									WardcomboBox.setBounds(525, 268, 431, 22);
									panel5.add(WardcomboBox);
									
//									Ward required label
									JLabel Required13 = new JLabel("*");
									Required13.setForeground(new Color(204, 0, 0));
									Required13.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required13.setBackground(new Color(102, 153, 255));
									Required13.setBounds(504, 264, 18, 19);
									panel5.add(Required13);
									
									JLabel JLabelVL3 = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------");
									JLabelVL3.setFont(new Font("Tahoma", Font.BOLD, 16));
									JLabelVL3.setBackground(new Color(102, 153, 255));
									JLabelVL3.setBounds(0, 306, 966, 14);
									panel5.add(JLabelVL3);
									
									JLabel JLabelVL4 = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------");
									JLabelVL4.setFont(new Font("Tahoma", Font.BOLD, 16));
									JLabelVL4.setBackground(new Color(102, 153, 255));
									JLabelVL4.setBounds(0, 391, 966, 14);
									panel5.add(JLabelVL4);
									
									JLabel JLabelVUsername = new JLabel("Username:");
									JLabelVUsername.setFont(new Font("Arial", Font.PLAIN, 15));
									JLabelVUsername.setBounds(365, 342, 85, 29);
									panel5.add(JLabelVUsername);
									
									JLabel JLabelVPassword = new JLabel("Password: ");
									JLabelVPassword.setFont(new Font("Arial", Font.PLAIN, 15));
									JLabelVPassword.setBounds(735, 340, 85, 34);
									panel5.add(JLabelVPassword);
									
//									JLabel JLabelVConfirmPassword = new JLabel("Confirm Password: ");
//									JLabelVConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 15));
//									JLabelVConfirmPassword.setBounds(685, 365, 132, 29);
//									panel5.add(JLabelVConfirmPassword);
									
									JLabel Required14 = new JLabel("*");
									Required14.setForeground(new Color(204, 0, 0));
									Required14.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required14.setBackground(new Color(102, 153, 255));
									Required14.setBounds(436, 331, 18, 20);
									panel5.add(Required14);
									
//									JLabel Required16 = new JLabel("*");
//									Required16.setForeground(new Color(204, 0, 0));
//									Required16.setFont(new Font("Tahoma", Font.BOLD, 18));
//									Required16.setBackground(new Color(102, 153, 255));
//									Required16.setBounds(808, 361, 28, 19);
//									panel5.add(Required16);
									
									JLabel Required15 = new JLabel("*");
									Required15.setForeground(new Color(204, 0, 0));
									Required15.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required15.setBackground(new Color(102, 153, 255));
									Required15.setBounds(808, 326, 22, 18);
									panel5.add(Required15);
									
									textFieldVUsername = new JTextField();
									textFieldVUsername.setColumns(10);
									textFieldVUsername.setBounds(461, 345, 126, 24);
									panel5.add(textFieldVUsername);
									
									passwordFieldVPassword = new JPasswordField();
									passwordFieldVPassword.setBounds(830, 348, 126, 20);
									panel5.add(passwordFieldVPassword);
									
//									passwordFieldVConfPassWo = new JPasswordField();
//									passwordFieldVConfPassWo.setBounds(830, 369, 126, 20);
//									panel5.add(passwordFieldVConfPassWo);
									
									JLabel JLabelVNote = new JLabel("(Note: Enter Street name/Building Name/ Room Number)");
									JLabelVNote.setForeground(new Color(204, 0, 0));
									JLabelVNote.setFont(new Font("Arial", Font.PLAIN, 15));
									JLabelVNote.setBounds(389, 228, 479, 23);
									panel5.add(JLabelVNote);
									
									JLabel JLabelVMobileNo = new JLabel("Mobile No:");
									JLabelVMobileNo.setFont(new Font("Arial", Font.PLAIN, 15));
									JLabelVMobileNo.setBounds(685, 185, 79, 29);
									panel5.add(JLabelVMobileNo);
									
									JLabel Required17 = new JLabel("*");
									Required17.setForeground(new Color(204, 0, 0));
									Required17.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required17.setBackground(new Color(102, 153, 255));
									Required17.setBounds(750, 185, 18, 19);
									panel5.add(Required17);
									
									textFieldVMobileNo = new JTextField();
									textFieldVMobileNo.setColumns(10);
									textFieldVMobileNo.setBounds(766, 188, 126, 24);
									panel5.add(textFieldVMobileNo);
									
									VoteridField = new JPasswordField();
									VoteridField.setBounds(88, 347, 126, 20);
									panel5.add(VoteridField);
									
									JLabel Required18 = new JLabel("*");
									Required18.setForeground(new Color(204, 0, 0));
									Required18.setFont(new Font("Tahoma", Font.BOLD, 18));
									Required18.setBackground(new Color(102, 153, 255));
									Required18.setBounds(63, 331, 18, 20);
									panel5.add(Required18);
									
									JLabel lblVoterId = new JLabel("Voter id:");
									lblVoterId.setFont(new Font("Arial", Font.PLAIN, 15));
									lblVoterId.setBounds(10, 342, 85, 29);
									panel5.add(lblVoterId);
									
									JButton RegiFormSubmitButton = new JButton("Submit");
									RegiFormSubmitButton.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											
//											Add validation And get alll data
											
											if (textFieldVName.getText().isEmpty() && 
													textFieldVMidName.getText().isEmpty() && 
													textFieldVLastName.getText().isEmpty() &&  
													comboBoxVDay.getSelectedItem() =="Day" && 
													comboBoxVMonth.getSelectedItem() =="Month" && 
													comboBoxVYear.getSelectedItem() =="Year" && 
													textFieldAddarCardNo.getText().isEmpty() &&
													comboBoxVAge.getSelectedItem() =="Age" && 
													comboBoxVState.getSelectedItem() =="Select State" && 
													comboBoxVDistrict.getSelectedItem()=="Select District" && 
													textFieldVTaluka.getText().isEmpty() &&
													textAreaAddress.getText().isEmpty() && 
													textFieldVUsername.getText().isEmpty() && 
													passwordFieldVPassword.getText().isEmpty() && 
													textFieldVPinCode.getText().isEmpty() && 
													textFieldVMobileNo.getText().isEmpty() &&
													VoteridField.getText().isEmpty()
												) 
											{
												JOptionPane.showMessageDialog(null,"Fill all Details","Error",2);
											}
											
											else if (textFieldVName.getText().isEmpty() || 
													textFieldVMidName.getText().isEmpty() ||
													textFieldVLastName.getText().isEmpty() ||  
													comboBoxVDay.getSelectedItem() =="Day" || 
													comboBoxVMonth.getSelectedItem() =="Month" ||
													comboBoxVYear.getSelectedItem() =="Year" || 
													textFieldAddarCardNo.getText().isEmpty() ||
													comboBoxVAge.getSelectedItem() =="Age" || 
													comboBoxVState.getSelectedItem() =="Select State" || 
													comboBoxVDistrict.getSelectedItem()=="Select District" || 
													textFieldVTaluka.getText().isEmpty() ||
													textAreaAddress.getText().isEmpty() || 
													textFieldVUsername.getText().isEmpty() || 
													passwordFieldVPassword.getText().isEmpty() ||  
													textFieldVPinCode.getText().isEmpty() || 
													textFieldVMobileNo.getText().isEmpty() ||
													VoteridField.getText().isEmpty()
													
												) 
											{
												JOptionPane.showMessageDialog(null,"Please Fill All Details","Error",2);
											}
											
											else {
												VoterFirstName = textFieldVName.getText();
												VoterMiddleName = textFieldVMidName.getText();
												VoterLastName = textFieldVLastName.getText();
												VoterBirthDay = (String)comboBoxVDay.getSelectedItem();
												VoterBirthMonth = (String)comboBoxVMonth.getSelectedItem();
												VoterBirthYear = (String)comboBoxVYear.getSelectedItem();
												voterGender=bg2.getSelection().getActionCommand();
												VoterAge = (String)comboBoxVAge.getSelectedItem();
												VoterState = (String)comboBoxVState.getSelectedItem();
												VoterDistrict = (String)comboBoxVDistrict.getSelectedItem();
												VoterTaluka = textFieldVTaluka.getText();
												VoterAddress = textAreaAddress.getText();
												VoterUsername = textFieldVUsername.getText();
												VoterPassword = passwordFieldVPassword.getText();
												VoterPinCode = textFieldVPinCode.getText();
												MobileNo = textFieldVMobileNo.getText();
												voterAddarCard=textFieldAddarCardNo.getText();
												voterWard= (String)WardcomboBox.getSelectedItem();
												Voterid = VoteridField.getText();
												voterBirthDate= VoterBirthDay + VoterBirthMonth + VoterBirthYear;
												
												try
												{
													//STEP 2: Register JDBC driver
													Class.forName("com.mysql.jdbc.Driver");
													
													//STEP 3: Open a connection
//													System.out.println("Connecting to a selected database...");
													conn = DriverManager.getConnection(DB_URL, USER, PASS);
//													System.out.println("Connected database successfully...");
													
													//STEP 4: Execute a query
//													System.out.println("Inserting records into the table...");
													stmt = conn.createStatement();
													
													String sql = "INSERT INTO voter_data(Voter_Id, First_name, Middle_name, Last_name, Birth_Date, Gender, Age, State, District, Taluka, Pin_Code, Address, Mobile_no, Addar_Card_Number, Ward, Username, Password)"+ " values ('"+Voterid+"','"+VoterFirstName+"','"+VoterMiddleName+"','"+VoterLastName+"','"+voterBirthDate+"','"+voterGender+"','"+VoterAge+"','"+VoterState+"','"+VoterDistrict+"','"+VoterTaluka+"','"+VoterPinCode+"','"+VoterAddress+"','"+MobileNo+"','"+voterAddarCard+"','"+voterWard+"','"+VoterUsername+"','"+VoterPassword+"')";

//													String sql = "INSERT INTO voter_data(Voter_Id, First_name, Middle_name, Last_name, Birth_Date, Gender, Age, State, District, Taluka, Pin_Code, Address, Mobile_no, Addar_Card_Number, Ward, Username, Password)"+ " values ('"+textFieldVName.getText()+"','"+textFieldVMidName.getText()+"','"+textFieldVLastName.getText()+"','"+(String)comboBoxVDay.getSelectedItem() + " "+(String)comboBoxVMonth.getSelectedItem() +" "+ (String)comboBoxVYear.getSelectedItem()+"','"+bg2.getSelection().getActionCommand()+"','"+(String)comboBoxVAge.getSelectedItem()+"','"+(String)comboBoxVState.getSelectedItem()+"','"+(String)comboBoxVDistrict.getSelectedItem()+"','"+textFieldVTaluka.getText()+"','"+textAreaAddress.getText()+"','"+textFieldVUsername.getText()+"','"+passwordFieldVPassword.getText()+"','"+passwordFieldVConfPassWo.getText()+"','"+textFieldVPinCode.getText()+"','"+textFieldVMobileNo.getText()+"','"+textFieldAddarCardNo.getText()+"','"+(String)WardcomboBox.getSelectedItem()+"','"+VoteridField.getText()+"')";
													stmt.executeUpdate(sql);
													
													
													// create the java statement
													Statement st = conn.createStatement();
													st.close();
//													conn.close();
												}
												catch(SQLException se)
												{
													//Handle errors for JDBC
													se.printStackTrace();
												}
												catch(Exception e1)
												{
													//Handle errors for Class.forName
													e1.printStackTrace();
												}
//												System.out.println("Goodbye!");
												JOptionPane.showMessageDialog(null,"Form data Submiterd Successfully","Error",2);
												System.exit(0);
//												panel5.setVisible(false);
//												panel2.setVisible(true);
//												panel.setVisible(true);
//												panel1.setVisible(true);
//												frame.setVisible(false);
//												frame.setVisible(true);
//												String sql = "INSERT INTO registration(Voter_Id, First_name, Middle_name, Last_name, Birth_Date, Gender, Age, State, District, Taluka, Pin_Code, Address, Mobile_no, Addar_Card_Number, Ward, Username, Password)"+ " values ('"+textFieldVName.getText()+"','"+textFieldVMidName.getText()+"','"+textFieldVLastName.getText()+"','"+(String)comboBoxVDay.getSelectedItem()+"','"+(String)comboBoxVMonth.getSelectedItem()+"','"+(String)comboBoxVYear.getSelectedItem()+"','"+bg2.getSelection().getActionCommand()+"','"+(String)comboBoxVAge.getSelectedItem()+"','"+(String)comboBoxVState.getSelectedItem()+"','"+(String)comboBoxVDistrict.getSelectedItem()+"','"+textFieldVTaluka.getText()+"','"+textAreaAddress.getText()+"','"+textFieldVUsername.getText()+"','"+passwordFieldVPassword.getText()+"','"+passwordFieldVConfPassWo.getText()+"','"+textFieldVPinCode.getText()+"','"+textFieldVMobileNo.getText()+"','"+textFieldAddarCardNo.getText()+"','"+(String)WardcomboBox.getSelectedItem()+"','"+VoteridField.getText()+"')";
	//
//												
////												JOptionPane.showMessageDialog(null,"OOPs"+VoterFirstName+"\n"+VoterMiddleName+"\n"+VoterLastName+"\n"+VoterBirthDay+"\n"+VoterBirthMonth+"\n"+VoterBirthYear+"\n"+VoterAge+"\n"+VoterState+"\n"+VoterDistrict+"\n"+VoterPinCode+"\n"+VoterAddress+"\n"+VoterUsername+"\n"+VoterPassword+"\n"+VoterConfirmPassword+"\n"+MobileNo+"\n"+Voterid,"Error",2);
////												String sql = "INSERT INTO registration(Voter_Id, First_name, Middle_name, Last_name, Birth_Date, Gender, Age, State, District, Taluka, Pin_Code, Address, Mobile_no, Addar_Card_Number, Ward, Username, Password)"+ " values ('"+Voterid+"','"+VoterFirstName+"','"+VoterMiddleName+"','"+VoterLastName+"','"+voterBirthDate+"','"+voterGender+"','"+VoterAge+"','"+VoterState+"','"+VoterDistrict+"','"+VoterTaluka+"','"+VoterPinCode+"','"+VoterAddress+"','"+MobileNo+"','"+voterAddarCard+"','"+voterWard+"','"+VoterUsername+"','"+VoterPassword+"')";
////												 return sql;
//												try {
//													stmt.executeUpdate(sql);
//													Statement st = conn.createStatement();
//													st.close();
//													conn.close();
//												} catch (SQLException e1) {
//													
//													e1.printStackTrace();
//												}
											}
							
										}
									});
									RegiFormSubmitButton.setBackground(Color.LIGHT_GRAY);
									RegiFormSubmitButton.setFont(new Font("Arial", Font.BOLD, 20));
									RegiFormSubmitButton.setBounds(396, 424, 149, 46);
									panel5.add(RegiFormSubmitButton);
									
									
									
									
									
									comboBoxVState.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											String SelectedState = (String)comboBoxVState.getSelectedItem();
											switch (SelectedState) {
											
//											case "Select State": {
//												comboBox_4_1.setModel(new DefaultComboBoxModel(new String[] {"Select District"}));
//										    }
//										    break;
											
										    case "Andhra Pradesh": {
										        comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District", "Adilabad",	"Anantapur", "Chittoor", "Kakinada", "Guntur", "Hyderabad", "Karimnagar", "Khammam", "Krishna", "Kurnool", "Mahbubnagar", "Medak", "Nalgonda", "Nizamabad", "Ongole", "Hyderabad", "Srikakulam", "Nellore", "Visakhapatnam", "Vizianagaram", "Warangal", "Eluru", "Kadapa"}));
										    }
										    break;
										    
										    
										    case "Arunachal Pradesh": {
										        
										        comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District","Anjaw", "Changlang", "East Siang", "Kurung Kumey", "Lohit", "Lower Dibang Valley", "Lower Subansiri", "Papum Pare", "Tawang", "Tirap", "Dibang Valley", "Upper Siang", "Upper Subansiri", "West Kameng", "West Siang"}));
										        
										        break;
										    }
										    case "Assam": {
										        
										        comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District", "Baksa", "Barpeta", "Bongaigaon", "Cachar", "Chirang", "Darrang", "Dhemaji", "Dima Hasao", "Dhubri", "Dibrugarh", "Goalpara", "Golaghat", "Hailakandi", "Jorhat", "Kamrup", "Kamrup Metropolitan", "Karbi Anglong", "Karimganj", "Kokrajhar", "Lakhimpur", "Marigaon", "Nagaon", "Nalbari", "Sibsagar", "Sonitpur", "Tinsukia", "Udalguri"}));
										        break;
										    }
										    case "Bihar": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"Araria",
										    			"Arwal",
										    			"Aurangabad",
										    			"Banka",
										    			"Begusarai",
										    			"Bhagalpur",
										    			"Bhojpur",
										    			"Buxar",
										    			"Darbhanga",
										    			"East Champaran",
										    			"Gaya",
										    			"Gopalganj",
										    			"Jamui",
										    			"Jehanabad",
										    			"Kaimur",
										    			"Katihar",
										    			"Khagaria",
										    			"Kishanganj",
										    			"Lakhisarai",
										    			"Madhepura",
										    			"Madhubani",
										    			"Munger",
										    			"Muzaffarpur",
										    			"Nalanda",
										    			"Nawada",
										    			"Patna",
										    			"Purnia",
										    			"Rohtas",
										    			"Saharsa",
										    			"Samastipur",
										    			"Saran",
										    			"Sheikhpura",
										    			"Sheohar",
										    			"Sitamarhi",
										    			"Siwan",
										    			"Supaul",
										    			"Vaishali",
										    			"West Champaran",
										    			"Chandigarh",
										    				}));
										        break;
										    }


										    case "Chhattisgarh": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"Bastar",
										    			"Bijapur",
										    			"Bilaspur",
										    			"Dantewada",
										    			"Dhamtari",
										    			"Durg",
										    			"Jashpur",
										    			"Janjgir-Champa",
										    			"Korba",
										    			"Koriya",
										    			"Kanker",
										    			"Kabirdham (Kawardha)",
										    			"Mahasamund",
										    			"Narayanpur",
										    			"Raigarh",
										    			"Rajnandgaon",
										    			"Raipur",
										    			"Surguja",
										    				}));   
										        break;
										    }
										    case "Goa": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"North Goa",
										    			"South Goa"
										    			}));	        
										        break;
										    }
										    case "Gujarat": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"Ahmedabad",
										    			"Amreli district",
										    			"Anand",
										    			"Banaskantha",
										    			"Bharuch",
										    			"Bhavnagar",
										    			"Dahod",
										    			"The Dangs",
										    			"Gandhinagar",
										    			"Jamnagar",
										    			"Junagadh",
										    			"Kutch",
										    			"Kheda",
										    			"Mehsana",
										    			"Narmada",
										    			"Navsari",
										    			"Patan",
										    			"Panchmahal",
										    			"Porbandar",
										    			"Rajkot",
										    			"Sabarkantha",
										    			"Surendranagar",
										    			"Surat",
										    			"Vyara",
										    			"Vadodara",
										    			"Valsad",
										    			}));       
										        break;
										    }
										    case "Haryana": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"Ambala",
										    			"Bhiwani",
										    			"Faridabad",
										    			"Fatehabad",
										    			"Gurgaon",
										    			"Hissar",
										    			"Jhajjar",
										    			"Jind",
										    			"Karnal",
										    			"Kaithal",
										    			"Kurukshetra",
										    			"Mahendragarh",
										    			"Mewat",
										    			"Palwal",
										    			"Panchkula",
										    			"Panipat",
										    			"Rewari",
										    			"Rohtak",
										    			"Sirsa",
										    			"Sonipat",
										    			"Yamuna Nagar",
										    				}));    
										        break;
										    }
										    case "Himachal Pradesh": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"Bilaspur",
										    			"Chamba",
										    			"Hamirpur",
										    			"Kangra",
										    			"Kinnaur",
										    			"Kullu",
										    			"Lahaul and Spiti",
										    			"Mandi",
										    			"Shimla",
										    			"Sirmaur",
										    			"Solan",
										    			"Una",
										    				}));	        
										        break;
										    }

										    case "Jammu and Kashmir": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"Anantnag",
										    			"Badgam",
										    			"Bandipora",
										    			"Baramulla",
										    			"Doda",
										    			"Ganderbal",
										    			"Jammu",
										    			"Kargil",
										    			"Kathua",
										    			"Kishtwar",
										    			"Kupwara",
										    			"Kulgam",
										    			"Leh",
										    			"Poonch",
										    			"Pulwama",
										    			"Rajauri",
										    			"Ramban",
										    			"Reasi",
										    			"Samba",
										    			"Shopian",
										    			"Srinagar",
										    			"Udhampur",
										    				}));        
										        break;
										    }
										    case "Jharkhand": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"Bokaro",
										    			"Chatra",
										    			"Deoghar",
										    			"Dhanbad",
										    			"Dumka",
										    			"East Singhbhum",
										    			"Garhwa",
										    			"Giridih",
										    			"Godda",
										    			"Gumla",
										    			"Hazaribag",
										    			"Jamtara",
										    			"Khunti",
										    			"Koderma",
										    			"Latehar",
										    			"Lohardaga",
										    			"Pakur",
										    			"Palamu",
										    			"Ramgarh",
										    			"Ranchi",
										    			"Sahibganj",
										    			"Seraikela Kharsawan",
										    			"Simdega",
										    			"West Singhbhum",
										    				}));        
										        break;
										    }
										    case "Karnataka": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"Bagalkot",
										    			"Bangalore Rural",
										    			"Bangalore Urban",
										    			"Belgaum",
										    			"Bellary",
										    			"Bidar",
										    			"Bijapur",
										    			"Chamarajnagar",
										    			"Chikkamagaluru",
										    			"Chikkaballapur",
										    			"Chitradurga",
										    			"Davanagere",
										    			"Dharwad",
										    			"Dakshina Kannada",
										    			"Gadag",
										    			"Gulbarga",
										    			"Hassan",
										    			"Haveri district",
										    			"Kodagu",
										    			"Kolar",
										    			"Koppal",
										    			"Mandya",
										    			"Mysore",
										    			"Raichur",
										    			"Shimoga",
										    			"Tumkur",
										    			"Udupi",
										    			"Uttara Kannada",
										    			"Ramanagara",
										    			"Yadgir",
										    				}));	        
										        break;
										    }

										    case "Kerala": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"Alappuzha",
										    			"Ernakulam",
										    			"Idukki",
										    			"Kannur",
										    			"Kasaragod",
										    			"Kollam",
										    			"Kottayam",
										    			"Kozhikode",
										    			"Malappuram",
										    			"Palakkad",
										    			"Pathanamthitta",
										    			"Thrissur",
										    			"Thiruvananthapuram",
										    			"Wayanad",
										    				}));       
										        break;
										    }

										    case "Madhya Pradesh": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"Alirajpur",
										    			"Anuppur",
										    			"Ashok Nagar",
										    			"Balaghat",
										    			"Barwani",
										    			"Betul",
										    			"Bhind",
										    			"Bhopal",
										    			"Burhanpur",
										    			"Chhatarpur",
										    			"Chhindwara",
										    			"Damoh",
										    			"Datia",
										    			"Dewas",
										    			"Dhar",
										    			"Dindori",
										    			"Guna",
										    			"Gwalior",
										    			"Harda",
										    			"Hoshangabad",
										    			"Indore",
										    			"Jabalpur",
										    			"Jhabua",
										    			"Katni",
										    			"Khandwa (East Nimar)",
										    			"Khargone (West Nimar)",
										    			"Mandla",
										    			"Mandsaur",
										    			"Morena",
										    			"Narsinghpur",
										    			"Neemuch",
										    			"Panna",
										    			"Rewa",
										    			"Rajgarh",
										    			"Ratlam",
										    			"Raisen",
										    			"Sagar",
										    			"Satna",
										    			"Sehore",
										    			"Seoni",
										    			"Shahdol",
										    			"Shajapur",
										    			"Sheopur",
										    			"Shivpuri",
										    			"Sidhi",
										    			"Singrauli",
										    			"Tikamgarh",
										    			"Ujjain",
										    			"Umaria",
										    			"Vidisha",
										    				}));       
										        break;
										    }
										    case "Maharashtra": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"Ahmednagar",
										    			"Akola",
										    			"Amravati",
										    			"Aurangabad",
										    			"Bhandara",
										    			"Beed",
										    			"Buldhana",
										    			"Chandrapur",
										    			"Dhule",
										    			"Gadchiroli",
										    			"Gondia",
										    			"Hingoli",
										    			"Jalgaon",
										    			"Jalna",
										    			"Kolhapur",
										    			"Latur",
										    			"Mumbai City",
										    			"Mumbai suburban",
										    			"Nandurbar",
										    			"Nanded",
										    			"Nagpur",
										    			"Nashik",
										    			"Osmanabad",
										    			"Parbhani",
										    			"Pune",
										    			"Raigad",
										    			"Ratnagiri",
										    			"Sindhudurg",
										    			"Sangli",
										    			"Solapur",
										    			"Satara",
										    			"Thane",
										    			"Wardha",
										    			"Washim",
										    			"Yavatmal",
										    					}));     
										        break;
										    }
										    case "Manipur": {
										    	comboBoxVDistrict.setModel(new DefaultComboBoxModel(new String[] {"Select District",
										    			"Bishnupur",
										    			"Churachandpur",
										    			"Chandel",
										    			"Imphal East",
										    			"Senapati",
										    			"Tamenglong",
										    			"Thoubal",
										    			"Ukhrul",
										    			"Imphal West",
										    				}));     
										        break;
										    }
										    
											default:
//												throw new IllegalArgumentException("Unexpected value: " + SelectedState);
												JOptionPane.showMessageDialog(null,"Unexpected value: " + SelectedState);
												
											}
											
										}
									});
								}
								else if (DashBoardUsernamearr.contains(usernameString) && DashBoardPasswordarr.contains(passwordString)) {
									
							        panel2.setVisible(false);
							        panel3.setVisible(false);
							        JPanel panel2 = new JPanel();
								
								JPanel D_Voterpanel = new JPanel();
								D_Voterpanel.setBackground(new Color(51, 204, 153));
								frame.getContentPane().add(D_Voterpanel, BorderLayout.CENTER);
								D_Voterpanel.setLayout(null);
								
								
								JButton btnNewButton = new JButton("Voter Data");
								btnNewButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										D_Voterpanel.setVisible(false);
										 
//										panel2.setVisible(true);
										try 
									    { 
											conn = DriverManager.getConnection(DB_URL, USER, PASS);
									        String query4 = "SELECT * FROM candidate_data"; 
									      
									    	Statement st4 = conn.createStatement();
											ResultSet rs = st4.executeQuery(query4); 
									        String columns[] = { "CandidateName Id", "PartyName", "Ward", "votes"};
									        String data[][] = new String[20][4];
									  		String D_CandidateName = null;
									  		String D_PartyName = null;
									  		String D_CandidateWard = null;
									  		String D_Votes = null;
									        int i = 0;
									        while (rs.next()) {
									      	  
									        	D_CandidateName = rs.getString("CandidateName");	
									        	D_PartyName = rs.getString("PartyName");			
									        	D_CandidateWard = rs.getString("Ward");				
									        	D_Votes = rs.getString("votes");
									          data[i][0] = D_CandidateName;
									          data[i][1] = D_PartyName;
									          data[i][2] = D_CandidateWard;
									          data[i][3] = D_Votes;
									          
									          i++;
									        }
									      
									        DefaultTableModel model = new DefaultTableModel(data, columns);
									        JTable table = new JTable(model);
									        table.setShowGrid(true);
									        table.setShowVerticalLines(true);
									        JScrollPane pane = new JScrollPane(table);
									        pane.setBounds(34, 66, 924, 427);
									        D_Voterpanel.setLayout(null);
									        panel2.add(pane);
									        table.setEnabled(false);
									      conn.close();
									      st4.close();
									      } catch(SQLException e12) {
									        e12.printStackTrace();
									      }
//										JPanel panel2 = new JPanel();
										panel2.setBackground(new Color(51, 204, 153));
										frame.getContentPane().add(panel2, BorderLayout.CENTER);
										panel2.setLayout(null);
										
										JButton CandidateDataButton = new JButton("Candidate Data");
										CandidateDataButton.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												panel2.setVisible(false);
												 	
												D_Voterpanel.setVisible(true);
												
											}
										});
										CandidateDataButton.setBackground(new Color(51, 204, 0));
										CandidateDataButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
										CandidateDataButton.setBounds(799, 11, 177, 27);
										panel2.add(CandidateDataButton);
										
									}
								});
								btnNewButton.setBackground(new Color(51, 204, 0));
								btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
								btnNewButton.setBounds(851, 11, 125, 27);
								D_Voterpanel.add(btnNewButton);
								

								try 
							    { 
									conn = DriverManager.getConnection(DB_URL, USER, PASS);
//							        Connection con = DriverManager.getConnection(DB_URL, USER, PASS); 
							        String query3 = "SELECT * FROM voter_data"; 
							      
							    	Statement st3 = conn.createStatement();
									ResultSet rs = st3.executeQuery(query3);
							        String columns[] = { "Voter Id", "First Name", "Middle Name", "Last Name", "Birth Date", "Gender", "Age", "State", "District","Taluka", "Pin Code", "Address", "Mobile no", "Addhar No", "Ward", "Voted"};
							        String data[][] = new String[20][16];
							  		String D_VoterID = null;
							  		String D_VoterFirstName = null;
							  		String D_VoterMiddleName = null;
							  		String D_VoterLastName = null;
							  		String D_VoterBirtDate = null;
							  		String D_VoterGender = null;
							  		String D_VoterAge = null;
							  		String D_VoterState = null;
							  		String D_VoterDistrict = null;
							  		String D_VoterTaluka = null;
							  		String D_VoterPinCode = null;
							  		String D_VoterAddress = null;
							  		String D_VoterMobileNo = null;
							  		String D_VoterAddarNo = null;
							  		String D_VoterWard = null;
							  		String D_VoterVoted = null;
							        int i = 0;
							        while (rs.next()) {
							      	  
							  			D_VoterID = rs.getString("voter_id");		
							  		D_VoterFirstName = rs.getString("First_name");			
							  		D_VoterMiddleName = rs.getString("middle_name");				
							  		D_VoterLastName = rs.getString("Last_name");								
							  		D_VoterBirtDate= rs.getString("birth_date");				
							  		D_VoterGender = rs.getString("gender");				
							  		D_VoterAge = rs.getString("Age");			
							  		D_VoterState = rs.getString("State");			
							  		D_VoterDistrict = rs.getString("District");			
							  		D_VoterTaluka= rs.getString("Taluka");				
							  		D_VoterPinCode = rs.getString("Pin_code");			
							  		D_VoterAddress = rs.getString("Address");			
							  		D_VoterMobileNo = rs.getString("Mobile_no");				
							  		D_VoterAddarNo= rs.getString("Addar_card_Number");
							  		D_VoterWard = rs.getString("Ward");
							  		D_VoterVoted=rs.getString("voted");
							          data[i][0] = D_VoterID;
							          data[i][1] = D_VoterFirstName;
							          data[i][2] = D_VoterMiddleName;
							          data[i][3] = D_VoterLastName;
							          data[i][4] = D_VoterBirtDate;
							          data[i][5] = D_VoterGender;
							          data[i][6] = D_VoterAge;
							          data[i][7] = D_VoterState;
							          data[i][8] = D_VoterDistrict;
							          data[i][9] = D_VoterTaluka;
							          data[i][10] = D_VoterPinCode;
							          data[i][11] = D_VoterAddress;
							          data[i][12] = D_VoterMobileNo;
							          data[i][13] = D_VoterAddarNo;
							          data[i][14] = D_VoterWard;
							          data[i][15]= D_VoterVoted;
							          
							          i++;
							        }
							      
							        DefaultTableModel model = new DefaultTableModel(data, columns);
							        JTable table = new JTable(model);
							        table.setShowGrid(true);
							        table.setShowVerticalLines(true);
							        JScrollPane pane = new JScrollPane(table);
							        pane.setBounds(34, 66, 924, 427);
							        D_Voterpanel.setLayout(null);
							        D_Voterpanel.add(pane);
							        table.setEnabled(false);
//							      conn.close();
//							      st3.close();
							      } catch(SQLException e17) {
							        e17.printStackTrace();	
							      }
								

								  
									
								}
								else {
									JOptionPane.showMessageDialog(null,"Wrong Username and Password","Error",0);
								}

						}
						
						  
					}
				});
				btnNewButton2.setFont(new Font("Arial", Font.BOLD, 18));
				btnNewButton2.setBounds(118, 213, 106, 46);
				panel3.add(btnNewButton2);
				
				JButton btnNewButton3 = new JButton("Home");
				btnNewButton3.setBackground(Color.LIGHT_GRAY);
				btnNewButton3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel1.setVisible(true);
						panel2.setVisible(false);
//						Show main page
					}
				});
				btnNewButton3.setFont(new Font("Arial", Font.BOLD, 18));
				btnNewButton3.setBounds(10, 20, 89, 31);
				panel2.add(btnNewButton3);
			
			}

		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 16));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 25;
		gbc_btnNewButton_1.gridy = 1;
		panel1.add(btnNewButton_1, gbc_btnNewButton_1);
		
	
		JButton btnNewButton1 = new JButton("Login");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				
//				Login Page 
//				JPanel panel = new JPanel();
				panel.setBackground(new Color(255, 204, 102));
				frame.getContentPane().add(panel, BorderLayout.CENTER);
				frame.setTitle("Login Page");
				panel.setLayout(null);
				panel.setVisible(true);
				
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBorder(new LineBorder(Color.BLACK, 2, true));
				panel_1.setBackground(new Color(255, 165, 0));
				panel_1.setBounds(338, 121, 346, 323);
				panel.add(panel_1);
				panel_1.setVisible(true);
				
				JLabel lblNewLabel5 = new JLabel("Username: ");
				lblNewLabel5.setFont(new Font("Arial", Font.BOLD, 19));
				lblNewLabel5.setBounds(24, 56, 119, 29);
				panel_1.add(lblNewLabel5);
				
				textField = new JTextField();
				textField.setBounds(178, 55, 126, 35);
				panel_1.add(textField);
				textField.setColumns(10);
				
				JLabel lblNewLabel_6 = new JLabel("Password: ");
				lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 19));
				lblNewLabel_6.setBounds(24, 147, 103, 23);
				panel_1.add(lblNewLabel_6);
				
				passwordField = new JPasswordField();
				passwordField.setBounds(178, 144, 126, 35);
				panel_1.add(passwordField);
				
				
				JPanel Votingpanel = new JPanel();
				JButton btnNewButton = new JButton("Login");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String usernameString1=textField.getText();
						String passwordString2= passwordField.getText();
						
						if (textField.getText().isEmpty() && passwordField.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null,"Please Enter Username and Password","Error",0);
						}
						else if (textField.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null,"Please Enter Username","Error",0);
						}
						else if (passwordField.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null,"Please Enter Password","Error",0);
						}
						else {
//							JOptionPane.showMessageDialog(null,"Username: "+usernameString1+"\nPassword: "+passwordString2,"Error",0);
							try{
								

								if (VoterUsernamearr.contains(usernameString1) && VoterPasswordarr.contains(passwordString2)) {
									int positionInteger=VoterPasswordarr.indexOf(passwordString2);
									String voterFirstString=VoterFirstNamearr.get(positionInteger);
									String voterLastString=VoterLastNamearr.get(positionInteger);
									String voterIdString=VoterIdarr.get(positionInteger);
									String votedString=VoterVotedarr.get(positionInteger);
									if (votedString.equals("true")) {
										JOptionPane.showMessageDialog(null,"Your voting is Done","Error",0);
										Votingpanel.setVisible(false);
										panel1.setVisible(true);
										panel_1.setVisible(false);
									}
									else {
//										Voting Page
//										JPanel Votingpanel = new JPanel();
										frame.setTitle("Voting Page");
										Votingpanel.setBackground(new Color(153, 153, 204));
										frame.getContentPane().add(Votingpanel, BorderLayout.CENTER);
										Votingpanel.setLayout(null);
										panel.setVisible(false);
										
										JPanel Votingpanel2 = new JPanel();
										Votingpanel2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
										Votingpanel2.setBackground(new Color(204, 204, 204));
										Votingpanel2.setBounds(410, 51, 555, 466);
										Votingpanel.add(Votingpanel2);
										Votingpanel2.setLayout(null);
										Votingpanel2.setVisible(true);
										
										JLabel CandidateNameLabel = new JLabel("Candidate Name");
										CandidateNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
										CandidateNameLabel.setBounds(10, 42, 157, 24);
										Votingpanel2.add(CandidateNameLabel);
										
										JLabel PartyNameLabel = new JLabel("Party Name");
										PartyNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
										PartyNameLabel.setBounds(237, 42, 115, 24);
										Votingpanel2.add(PartyNameLabel);
										
										JLabel VotingButtonsLabel = new JLabel("Voting Buttons");
										VotingButtonsLabel.setFont(new Font("Arial", Font.BOLD, 20));
										VotingButtonsLabel.setBounds(393, 42, 141, 24);
										Votingpanel2.add(VotingButtonsLabel);
										
										
										
										JPanel VoterInfopanel = new JPanel();
										VoterInfopanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
										VoterInfopanel.setBackground(new Color(204, 204, 204));
										VoterInfopanel.setBounds(20, 51, 331, 466);
										Votingpanel.add(VoterInfopanel);
										VoterInfopanel.setLayout(null);
										VoterInfopanel.setVisible(true);
										
										JLabel VoterInfoLabel = new JLabel("Voter Information");
										VoterInfoLabel.setFont(new Font("Arial", Font.BOLD, 20));
										VoterInfoLabel.setBounds(82, 40, 171, 24);
										VoterInfopanel.add(VoterInfoLabel);
										
										JLabel VoteridLabel = new JLabel("Voter id:");
										VoteridLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 17));
										VoteridLabel.setBounds(10, 143, 79, 24);
										VoterInfopanel.add(VoteridLabel);
										
										JLabel lblFirstName = new JLabel("First Name:");
										lblFirstName.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 17));
										lblFirstName.setBounds(10, 224, 105, 24);
										VoterInfopanel.add(lblFirstName);
										
										JLabel lblLastName = new JLabel("Last Name:");
										lblLastName.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 17));
										lblLastName.setBounds(10, 298, 100, 24);
										VoterInfopanel.add(lblLastName);
//										Votingpanel.setVisible(false);
										int j=90;
												
										for(i=0;i<DataSize;i++)
										{
											
											JTextField CandidateNametextField = new JTextField();
											CandidateNametextField.setBorder(new LineBorder(Color.GRAY, 2, true));
											CandidateNametextField.setEditable(false);
											CandidateNametextField.setBounds(10, j, 163, 33);
											Votingpanel2.add(CandidateNametextField);
											CandidateNametextField.setColumns(10);
											CandidateNametextField.setText(CandidateNamearr.get(i));
									
											JTextField CandidatePartyNametextField = new JTextField();
											CandidatePartyNametextField.setBorder(new LineBorder(Color.GRAY, 2, true));
											CandidatePartyNametextField.setEditable(false);
											CandidatePartyNametextField.setColumns(10);
											CandidatePartyNametextField.setBounds(211, j, 163, 33);
											Votingpanel2.add(CandidatePartyNametextField);
											CandidatePartyNametextField.setText(CandidatePartyarr.get(i));
											
											String CandidatePartyarrValue=CandidatePartyarr.get(i);
											String CandidateNamearrValue=CandidateNamearr.get(i);
											String VotesarrValue= Votesarr.get(i);
											int votesarrValueInteger=Integer.parseInt(VotesarrValue);
											votesarrValueInteger=votesarrValueInteger+1;
											String votesarrValueString=Integer.toString(votesarrValueInteger);
											JButton VoteButton=new JButton("Vote");
											
											VoteButton.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent e) {
													
													
													int confirmVote = JOptionPane.showConfirmDialog(null,"You want to give your Vote to " +CandidateNamearrValue+ " from "+CandidatePartyarrValue,"Confirm",0);
													if (confirmVote==0) {
														Votingpanel.setVisible(false);
														

																
																try
																{
																	//STEP 2: Register JDBC driver
																	Class.forName("com.mysql.jdbc.Driver");
																	
																	//STEP 3: Open a connection
//																	System.out.println("Connecting to a selected database...");
																	conn = DriverManager.getConnection(DB_URL, USER, PASS);
//																	System.out.println("Connected database successfully...");
																	
																	//STEP 4: Execute a query
//																	System.out.println("Inserting records into the table...");
																	stmt = conn.createStatement();
																
																	String sql = "UPDATE candidate_data " + "SET votes = "+votesarrValueString+" WHERE CandidateName ='"+CandidateNamearrValue+"'";
																	stmt.executeUpdate(sql);
																	
																	
																	// create the java statement
																	Statement st = conn.createStatement();
																	st.close();
																	conn.close();
																}
																catch(SQLException se)
																{
																	//Handle errors for JDBC
																	se.printStackTrace();
																}
																catch(Exception e22)
																{
																	//Handle errors for Class.forName
																	e22.printStackTrace();
																}
//																System.out.println("Goodbye!");
																try
																{
																	//STEP 2: Register JDBC driver
																	Class.forName("com.mysql.jdbc.Driver");
																	
																	//STEP 3: Open a connection
//																	System.out.println("Connecting to a selected database...");
																	conn = DriverManager.getConnection(DB_URL, USER, PASS);
//																	System.out.println("Connected database successfully...");
																	
																	//STEP 4: Execute a query
//																	System.out.println("Inserting records into the table...");
																	stmt = conn.createStatement();
																
																	String sql = "UPDATE voter_data " + "SET voted = 'true' WHERE voter_id ='"+voterIdString+"'";
																	stmt.executeUpdate(sql);
																	
																	
																	// create the java statement
																	Statement st = conn.createStatement();
																	st.close();
																	conn.close();
																}
																catch(SQLException se)
																{
																	//Handle errors for JDBC
																	se.printStackTrace();
																}
																catch(Exception e22)
																{
																	//Handle errors for Class.forName
																	e22.printStackTrace();
																}
																
																JOptionPane.showMessageDialog(null,"Your vote Submitted Successfully ","Success",0);
																Votingpanel.setVisible(false);
																panel1.setVisible(true);
//																btnNewButton_1.setVisible(false);
																
													}
													else {
//														Votingpanel2.setVisible(true);
													}
												}
											});
											VoteButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
											VoteButton.setBackground(Color.GREEN);
											VoteButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
											VoteButton.setBounds(426, j, 89, 34);
											Votingpanel2.add(VoteButton);
											j=j+52;
										}
										
										
										VoterIdtextField2 = new JTextField();
										VoterIdtextField2.setEditable(false);
										VoterIdtextField2.setColumns(10);
										VoterIdtextField2.setBorder(new LineBorder(Color.GRAY, 2, true));
										VoterIdtextField2.setBounds(125, 140, 163, 32);
										VoterInfopanel.add(VoterIdtextField2);
										VoterIdtextField2.setText(voterIdString);
										
										VoterFirstNametextField = new JTextField();
										VoterFirstNametextField.setEditable(false);
										VoterFirstNametextField.setColumns(10);
										VoterFirstNametextField.setBorder(new LineBorder(Color.GRAY, 2, true));
										VoterFirstNametextField.setBounds(125, 222, 163, 31);
										VoterInfopanel.add(VoterFirstNametextField);
										VoterFirstNametextField.setText(voterFirstString);
										
										VoterLAstNametextField = new JTextField();
										VoterLAstNametextField.setEditable(false);
										VoterLAstNametextField.setColumns(10);
										VoterLAstNametextField.setBorder(new LineBorder(Color.GRAY, 2, true));
										VoterLAstNametextField.setBounds(125, 295, 163, 32);
										VoterInfopanel.add(VoterLAstNametextField);
										VoterLAstNametextField.setText(voterLastString);
										
										
										JLabel lblVote = new JLabel("Vote");
										lblVote.setForeground(new Color(0, 0, 0));
										lblVote.setBounds(410, 1, 115, 39);
										Votingpanel.add(lblVote);
										lblVote.setFont(new Font("Arial", Font.BOLD, 40));
										
										JLabel VoteUnderline = new JLabel("_____________");
										VoteUnderline.setForeground(Color.BLACK);
										VoteUnderline.setFont(new Font("Arial", Font.BOLD, 40));
										VoteUnderline.setBounds(299, 1, 296, 39);
										Votingpanel.add(VoteUnderline);
									}

									
									
								}
								else {
									JOptionPane.showMessageDialog(null,"Wrong credentials");
								}

								stmt.close();
								conn.close();
								}catch(SQLException se){
								//Handle errors for JDBC
								se.printStackTrace();
								}catch(Exception e3){
								//Handle errors for Class.forName
								e3.printStackTrace();
								}finally{
								//finally block used to close resources
								try{
								if(stmt!=null)
								conn.close();
								}catch(SQLException se){
								}// do nothing
								try{
								if(conn!=null)
								conn.close();
								}catch(SQLException se){
								se.printStackTrace();
								}//end finally try
								}//end try
//								JOptionPane.showMessageDialog(null,"","Error",0);
							

						
						}
					}
				});
				btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
				btnNewButton.setBackground(new Color(102, 102, 102));
				btnNewButton.setBounds(116, 248, 119, 35);
				panel_1.add(btnNewButton);
				
				JLabel lblNewLabel_4 = new JLabel("Login");
				lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 30));
				lblNewLabel_4.setBounds(463, 44, 89, 36);
				panel.add(lblNewLabel_4);
				
				JButton btnNewButton_1 = new JButton("Home");
				btnNewButton_1.setBackground(Color.LIGHT_GRAY);
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel1.setVisible(true);
						panel.setVisible(false);
					}
				});
				btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 16));
				btnNewButton_1.setBounds(10, 11, 89, 36);
				panel.add(btnNewButton_1);

			}
			
		});
		btnNewButton1.setBackground(Color.LIGHT_GRAY);
		btnNewButton1.setFont(new Font("Arial", Font.BOLD, 16));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 0);
		gbc_btnNewButton.gridx = 26;
		gbc_btnNewButton.gridy = 1;
		panel1.add(btnNewButton1, gbc_btnNewButton);
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 5, true);
		String path = "https://media.istockphoto.com/photos/vote-online-vote-concept-on-the-touch-screen-picture-id1278053518?k=20&m=1278053518&s=612x612&w=0&h=L8qhWCzvwHwajvmaRITjcbUk5oajfz2bnhImAJhisOs=";
	    URL url = new URL(path);
	    BufferedImage image = ImageIO.read(url);
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(border);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setIcon(new ImageIcon(image));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridheight = 4;
		gbc_lblNewLabel_1.gridwidth = 5;
		gbc_lblNewLabel_1.gridx = 21;
		gbc_lblNewLabel_1.gridy = 9;
		panel1.add(lblNewLabel_1, gbc_lblNewLabel_1);
			
		
	}
}
