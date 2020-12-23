package myutilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.util.*;
import java.util.regex.*;


public class Calculator extends JFrame implements ActionListener{
	JPanel cp;
	private JTextField result;
	private JButton clrButton;
	private JButton dltButton;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton button9;
	private JButton button8;
	private JButton button7;
	private JButton button6;
	private JButton button5;
	private JButton button4;
	private JButton button3;
	private JButton button2;
	private JButton button1;
	private JButton logButton;
	private JButton button0;
	private JButton decimalButton;
	private JButton lftBrktButton;
	private JButton rghtBrktButton;
	private JButton expntlButton;
	private JButton modulusButton;
	private JButton dvdButton;
	private JButton btnNewButton_4;
	private JButton multiplyButton;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton addButton;
	private JButton resultButton;
	String compData = new String();
	String data = new String();
	JButton bt;
	
	
	
	
	
	
	
	Calculator() {
		setTitle("Calculator");
		getContentPane().setLayout(null);
		setVisible(true);
		setSize(585,460);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            //585 460
		
		cp = new JPanel();
		cp.setBackground(new Color(245, 245, 245));
		setContentPane(cp);
		cp.setLayout(null);
		
		result = new JTextField();
		result.setBackground(Color.WHITE);
		result.setEditable(false);
		result.setFont(new Font("Tahoma", Font.PLAIN, 20));
		result.setBounds(10, 10, 551, 67);
		cp.add(result);
		result.setColumns(10);
		
		clrButton = new JButton("Clear");
		clrButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		clrButton.setBackground(new Color(230, 230, 250));
		clrButton.setBounds(10, 94, 85, 47);
		cp.add(clrButton);
		clrButton.addActionListener(this);
		
		dltButton = new JButton("Delete");
		dltButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dltButton.setBackground(new Color(230, 230, 250));
		dltButton.setBounds(106, 94, 85, 47);
		cp.add(dltButton);
		dltButton.addActionListener(this);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setBounds(201, 94, 85, 47);
		cp.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBackground(new Color(230, 230, 250));
		btnNewButton_1.setBounds(296, 94, 85, 47);
		cp.add(btnNewButton_1);
		btnNewButton_1.addActionListener(this);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBackground(new Color(230, 230, 250));
		btnNewButton_2.setBounds(391, 94, 85, 47);
		cp.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBackground(new Color(230, 230, 250));
		btnNewButton_3.setBounds(486, 94, 75, 47);
		cp.add(btnNewButton_3);
		btnNewButton_3.addActionListener(this);
		
		resultButton = new JButton("=");
		resultButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		resultButton.setBackground(new Color(230, 230, 250));
		resultButton.setBounds(448, 349, 85, 42);
		cp.add(resultButton);
		resultButton.addActionListener(this);
		
		button9 = new JButton("9");
		button9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button9.setBackground(new Color(230, 230, 250));
		button9.setBounds(10, 166, 85, 42);
		cp.add(button9);
		button9.addActionListener(this);
		
		button8 = new JButton("8");
		button8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button8.setBackground(new Color(230, 230, 250));
		button8.setBounds(107, 166, 85, 42);
		cp.add(button8);
		button8.addActionListener(this);
		
		button7 = new JButton("7");
		button7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button7.setBackground(new Color(230, 230, 250));
		button7.setBounds(212, 166, 85, 42);
		cp.add(button7);
		button7.addActionListener(this);
		
		button6 = new JButton("6");
		button6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button6.setBackground(new Color(230, 230, 250));
		button6.setBounds(10, 228, 85, 42);
		cp.add(button6);
		button6.addActionListener(this);
		
		button5 = new JButton("5");
		button5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button5.setBackground(new Color(230, 230, 250));
		button5.setBounds(107, 228, 85, 42);
		cp.add(button5);
		button5.addActionListener(this);
		
		button4 = new JButton("4");
		button4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button4.setBackground(new Color(230, 230, 250));
		button4.setBounds(212, 227, 85, 43);
		cp.add(button4);
		button4.addActionListener(this);
		
		button3 = new JButton("3");
		button3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button3.setBackground(new Color(230, 230, 250));
		button3.setBounds(10, 288, 85, 42);
		cp.add(button3);
		button3.addActionListener(this);
		
		button2 = new JButton("2");
		button2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button2.setBackground(new Color(230, 230, 250));
		button2.setBounds(107, 288, 85, 42);
		cp.add(button2);
		button2.addActionListener(this);
		
		button1 = new JButton("1");
		button1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button1.setBackground(new Color(230, 230, 250));
		button1.setBounds(212, 288, 85, 42);
		cp.add(button1);
		button1.addActionListener(this);
		
		button0 = new JButton("0");
		button0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button0.setBackground(new Color(230, 230, 250));
		button0.setBounds(107, 349, 85, 42);
		cp.add(button0);
		button0.addActionListener(this);
		
		decimalButton = new JButton(".");
		decimalButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		decimalButton.setBackground(new Color(230, 230, 250));
		decimalButton.setBounds(212, 349, 85, 42);
		cp.add(decimalButton);
		decimalButton.addActionListener(this);
		
		logButton = new JButton("log");
		logButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		logButton.setBackground(new Color(230, 230, 250));
		logButton.setBounds(10, 349, 85, 42);
		cp.add(logButton);
		logButton.addActionListener(this);
		
		lftBrktButton = new JButton("(");
		lftBrktButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lftBrktButton.setBackground(new Color(230, 230, 250));
		lftBrktButton.setBounds(317, 166, 85, 42);
		cp.add(lftBrktButton);
		lftBrktButton.addActionListener(this);
		
		modulusButton = new JButton("%");
		modulusButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		modulusButton.setBackground(new Color(230, 230, 250));
		modulusButton.setBounds(317, 228, 85, 42);
		cp.add(modulusButton);
		modulusButton.addActionListener(this);
		
		multiplyButton = new JButton("X");
		multiplyButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		multiplyButton.setBackground(new Color(230, 230, 250));
		multiplyButton.setBounds(317, 288, 85, 42);
		cp.add(multiplyButton);
		multiplyButton.addActionListener(this);
		
		addButton = new JButton("+");
		addButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addButton.setBackground(new Color(230, 230, 250));
		addButton.setBounds(317, 349, 85, 42);
		cp.add(addButton);
		addButton.addActionListener(this);
		
		rghtBrktButton = new JButton(")");
		rghtBrktButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rghtBrktButton.setBackground(new Color(230, 230, 250));
		rghtBrktButton.setBounds(418, 166, 85, 42);
		cp.add(rghtBrktButton);
		rghtBrktButton.addActionListener(this);
		
		dvdButton = new JButton("/");
		dvdButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dvdButton.setBackground(new Color(230, 230, 250));
		dvdButton.setBounds(418, 228, 85, 42);
		cp.add(dvdButton);
		dvdButton.addActionListener(this);
		
		btnNewButton_5 = new JButton("-");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_5.setBackground(new Color(230, 230, 250));
		btnNewButton_5.setBounds(418, 288, 85, 42);
		cp.add(btnNewButton_5);
		btnNewButton_5.addActionListener(this);
		
		expntlButton = new JButton("^");
		expntlButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		expntlButton.setBackground(new Color(230, 230, 250));
		expntlButton.setBounds(510, 166, 51, 42);
		cp.add(expntlButton);
		expntlButton.addActionListener(this);
		
		btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBackground(new Color(230, 230, 250));
		btnNewButton_4.setBounds(513, 228, 48, 42);
		cp.add(btnNewButton_4);
		btnNewButton_4.addActionListener(this);
		
		btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_6.setBackground(new Color(230, 230, 250));
		btnNewButton_6.setBounds(513, 288, 48, 42);
		cp.add(btnNewButton_6);
		btnNewButton_6.addActionListener(this);
		
	}
	
	
	
	
	
	
	
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		bt = (JButton)ae.getSource();
		data = bt.getText();
		if(data.equals("Clear"))
		{
			compData="";
		}
		
		else if(data.equals("Delete"))
		{
			if(compData.length()>0)
			compData = compData.substring(0,((compData.length())-1));
		}
		
		else if(data.equals("="))
		{
			compData=Integer.toString(compute());
			
		}
		
		else {
		compData = compData+data;
		}
		
		
		result.setText(compData);
	}

	
	
	
	
	
	public int compute() 
	{
		int c1=0,c2=0,len=0,i=0,j=0,result=0;
		char op=' ';
		int[] data = new int[20];
		char[] oprts = new char[20];
		String ops = new String();
		
		
		
		
		StringTokenizer dt = new StringTokenizer(compData,"+-X/%");
		len=dt.countTokens();
		while(dt.hasMoreTokens())
		{
			data[i]=Integer.parseInt(dt.nextToken());
			i++;
		}
		
		
		
		
		StringTokenizer opt = new StringTokenizer(compData,"01234567890");
		while(opt.hasMoreTokens())
		{
			ops=ops+""+opt.nextToken();
		}
		oprts = ops.toCharArray();

		
		
		
			
		c1=data[0];
		for(i=1,j=0;i<len;i++,j++) 
		{
			c2=data[i];
			op=oprts[j];
				
			switch(op)
			{
			case '+': result=c1+c2;
			          break;
			          
			case '-': result=c1-c2;
			          break;
			          
			case '/': result=c1/c2;
			          break;
			          
			case '%': result=c1%c2;
			          break;
			          
			case 'X': result=c1*c2;
			          break;
			}
			c1=result;
	        		
		}
		
	return result;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		try {
			SwingUtilities.invokeLater(new Runnable(){
				public void run()
				{
					Calculator cl = new Calculator();
				}
				});
					}catch(Exception e){      
						System.out.println("Exception occured");}
		        }
	}
