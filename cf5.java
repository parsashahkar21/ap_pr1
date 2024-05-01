import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class cf1 {

	
	static String show = "";

	public static double findans4(String sho){
		String[] zarb = sho.split("×");
		double ans = 1;
		for(int i = 0; i < zarb.length; i++){
			ans *= Double.valueOf(zarb[i]);
		}
		return ans;
	}


	public static double findans3(String sho){
		String[] zarb = sho.split("/");
		double ans = findans4(zarb[0]);
		for(int i = 1; i < zarb.length; i++){
			ans /= findans2(zarb[i]);
		}
		return ans;
	}


	public static double findans2(String sho){
		String[] zarb = sho.split("-");
		double ans = findans3(zarb[0]);
		for(int i = 1; i < zarb.length; i++){
			ans -= findans2(zarb[i]);
		}
		return ans;
	}

	
	public static double findans(String sho){
		String[] zarb = sho.split("➕");
		double ans = 0;
		for(int i = 0; i < zarb.length; i++){
			ans += findans2(zarb[i]);
		}
		return ans;
	}


	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
       
	   
		JFrame frame = new JFrame("calculator");
		Dimension frameSize = new Dimension(360,360);
		frame.setSize(frameSize);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0,0,360,360);
		frame.add(panel);
		
		
		GridBagConstraints constraints = new GridBagConstraints();

		panel.setLayout(new GridBagLayout());

		constraints.insets = new Insets(0, 0, 0, 0);

		JTextArea area=new JTextArea("");
 		area.setBounds(10,30, 300,200);  
        constraints.gridx = 1; // Column 0
		constraints.gridy = 0; // Row 0
		panel.add(area, constraints);	



//////////////////////////////////////////////////////////////////////////////////////

		JButton button1 = new JButton("1");	
		button1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '1';
				area.setText(show);
			}
		});
		constraints.gridx = 0; // Column 0
		constraints.gridy = 1; // Row 0
		panel.add(button1, constraints);	

//**

		JButton button2 = new JButton("2");	
		button2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '2';
				area.setText(show);
			}
		});
		constraints.gridx = 1; // Column 0
		constraints.gridy = 1; // Row 0
		panel.add(button2, constraints);

//**

		JButton button3 = new JButton("3");	
		button3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '3';
				area.setText(show);		
			}
		});
		constraints.gridx = 2; // Column 0
		constraints.gridy = 1; // Row 0
		panel.add(button3, constraints);


		JButton buttonj = new JButton("➕");	
		buttonj.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '➕';
				area.setText(show);		
			}
		});
		constraints.gridx = 3; // Column 0
		constraints.gridy = 1; // Row 0
		panel.add(buttonj, constraints);


//////////////////////////////////////////////////////////////////////////////////////

		JButton button4 = new JButton("4");	
		button4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '4';
				area.setText(show);
			}
		});
		constraints.gridx = 0; // Column 0
		constraints.gridy = 2; // Row 0
		panel.add(button4, constraints);	

//**

		JButton button5 = new JButton("5");	
		button5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '5';
				area.setText(show);
			}
		});
		constraints.gridx = 1; // Column 0
		constraints.gridy = 2; // Row 0
		panel.add(button5, constraints);

//**

		JButton button6 = new JButton("6");	
		button6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '6';
				area.setText(show);		
			}
		});
		constraints.gridx = 2; // Column 0
		constraints.gridy = 2; // Row 0
		panel.add(button6, constraints);


		JButton buttont = new JButton("-");	
		buttont.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '-';
				area.setText(show);		
			}
		});
		constraints.gridx = 3; // Column 0
		constraints.gridy = 2; // Row 0
		panel.add(buttont, constraints);


//////////////////////////////////////////////////////////////////////////////////////

		JButton button7 = new JButton("7");	
		button7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '7';
				area.setText(show);
			}
		});
		constraints.gridx = 0; // Column 0
		constraints.gridy = 3; // Row 0
		panel.add(button7, constraints);	

//**

		JButton button8 = new JButton("8");	
		button8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '8';
				area.setText(show);
			}
		});
		constraints.gridx = 1; // Column 0
		constraints.gridy = 3; // Row 0
		panel.add(button8, constraints);

//**

		JButton button9 = new JButton("9");	
		button9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '9';
				area.setText(show);		
			}
		});
		constraints.gridx = 2; // Column 0
		constraints.gridy = 3; // Row 0
		panel.add(button9, constraints);


		JButton buttonz = new JButton("×");	
		buttonz.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '×';
				area.setText(show);		
			}
		});
		constraints.gridx = 3; // Column 0
		constraints.gridy = 3; // Row 0
		panel.add(buttonz, constraints);


//////////////////////////////////////////////////////////////////////////////////////

		JButton buttonn = new JButton(".");	
		buttonn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '.';
				area.setText(show);
			}
		});
		constraints.gridx = 0; // Column 0
		constraints.gridy = 4; // Row 0
		panel.add(buttonn, constraints);	

//**

		JButton button0 = new JButton("0");	
		button0.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '0';
				area.setText(show);
			}
		});
		constraints.gridx = 1; // Column 0
		constraints.gridy = 4; // Row 0
		panel.add(button0, constraints);

//**

		JButton buttonans = new JButton("=");	
		buttonans.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				DecimalFormat hashes = new DecimalFormat("#.#");

				show = String.valueOf(hashes.format(findans(show))); 
				area.setText(show);		
			}
		});
		constraints.gridx = 2; // Column 0
		constraints.gridy = 4; // Row 0
		panel.add(buttonans, constraints);


		JButton buttontaq = new JButton("/");	
		buttontaq.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show += '/';
				area.setText(show);		
			}
		});
		constraints.gridx = 3; // Column 0
		constraints.gridy = 4; // Row 0
		panel.add(buttontaq, constraints);

//////////////////////////////////////////////////////////////////////////////////////

		JButton buttondel = new JButton("del");	
		buttondel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				String ez1 = "";
				for(int i = 0; i < show.length()-1; i++) ez1 += show.charAt(i); 
				show = ez1;
				area.setText(show);
			}
		});
		constraints.gridx = 0; // Column 0
		constraints.gridy = 5; // Row 0
		panel.add(buttondel, constraints);	

//**

		JButton buttonclr = new JButton("clr");	
		buttonclr.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {	
				show = "";
				area.setText(show);
			}
		});
		constraints.gridx = 1; // Column 0
		constraints.gridy = 5; // Row 0
		panel.add(buttonclr, constraints);

//**

		








		

		









		frame.add(panel);
		frame.setVisible(true);
			

		
	}
}


