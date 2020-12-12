import java.awt.*;
import javax.swing.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;;


public class newStudent extends JFrame {
	
	static newStudent mainframe;
	private JPanel contentPane;
	private JTextField name_field;
	private JTextField rollNo_field;
	private JTextField studentClass_field;
	private JTextField section_field;
	private JTextField contact_field;
	
	private JTextField issuedBook;
	/* Confused that wether to add here or not */
	
	// The main application
	public static void main (String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try
				{
					mainframe = new newStudent();
					mainframe.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		} );
	}
	
	// The main frame
	public newStudent()
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 400, 600, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel labelNewStudent = new JLabel("Add new student");
		labelNewStudent.setForeground(Color.GRAY);
		labelNewStudent.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel labelname = new JLabel("Name");
		JLabel labelrollNumber = new JLabel("Roll No.");
		JLabel labelclass = new JLabel("Class");
		JLabel labelsection = new JLabel("Section");
		JLabel labelcontact = new JLabel("Contact Number");
		
		name_field = new JTextField();
		name_field.setColumns(20);
		
		rollNo_field =  new JTextField();
		rollNo_field.setColumns(20);
		
		studentClass_field = new JTextField();
		studentClass_field.setColumns(20);
		
		section_field = new JTextField();
		section_field.setColumns(20);
		
		contact_field = new JTextField();
		contact_field.setColumns(20);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = name_field.getText();
				String rollNo = rollNo_field.getText();
				String studentClass = studentClass_field.getText();
				String section = section_field.getText();
				String contact = contact_field.getText();
				
				/*  We can also use type casting to convert the contact to store as integer numbers
				 *  But in our case we can also save the mail ID too
				 */
				int i = newStudentAdd.save( name, rollNo, studentClass, section, contact );
				
				if(i>0)
				{
					JOptionPane.showMessageDialog(newStudent.this,"New student is added to the records");
					student.main(new String[]{});
					mainframe.dispose();
					
				}
				else
				{
					JOptionPane.showMessageDialog(newStudent.this,"Sorry, we are not able to please. Please try again !");
				}
				
				/* 
				 * The action listener event e ended here
				 */
				}
			
			}
			/*
			 * The action listner ended here
			 */
		);
		
	}
	/*
	 * Public class student ended here
	 */
	
	
}


