package gradeCalculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GradeCalculator {

	public static void main(String[] args) {
         
         Grade obj = new Grade();
         
        }

}

class Grade extends JFrame implements ActionListener{
	JTextField t1,t2,t3,t4,t5;
	JButton b1;
	JLabel l1;
	
	public Grade() {
	
    t1 = new JTextField(30);
	t2 = new JTextField(30);
    t3 = new JTextField(30);
    t4 = new JTextField(30);
    t5 = new JTextField(30);

	
    b1 = new JButton("calculate");
	
	b1.addActionListener(this);
	
	
    l1= new JLabel("Average Grade");
    
	add(t1);
	add(t2);
	add(t3);
	add(t4);
	add(t5);
	add(b1);
	add(l1);
	
	
	
	setLayout(new FlowLayout());		
	setSize(400,400);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
}
	public void actionPerformed(ActionEvent ab) {
		double a = Double.parseDouble(t1.getText());
		double b = Double.parseDouble(t2.getText());
		double c = Double.parseDouble(t3.getText());
		double d = Double.parseDouble(t4.getText());
		double e = Double.parseDouble(t5.getText());
		
	    double AVG = (a + b + c + d + e) / 5 ;
	    
	    DecimalFormat numberFormat = new DecimalFormat("#.00");
	    l1.setText(numberFormat.format(AVG) + ""); 
		
	}

}
