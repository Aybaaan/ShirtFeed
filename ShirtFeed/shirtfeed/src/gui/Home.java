package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
	
	int r = 13, g = 37, b = 39;
	
	JButton btnOrder = new JButton ("Order Now!");
	JPanel menuPanel = new JPanel();
	
	public Home(){
		setIconImage(new ImageIcon(getClass().getResource("Logo Sizes.png")).getImage());
		initComponents();
	}

	private void initComponents() {
		Font lblfont = new Font("Calibri", Font.BOLD, 23);
		Font lbltxt = new Font("Monospaced", Font.BOLD, 21);
		Font order = new Font("Arial", Font.BOLD, 18);
		
		setTitle("Shirt Feed");
        setSize(1000,700);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#17494D"));
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        
        
	    	menuPanel.setLayout(null);
	    	menuPanel.setBounds(0, 0, 1000, 700);
	    	menuPanel.setBackground(new Color(23,73,77));
    	
    	JLabel lblcolor1 = new JLabel("Black #000000");
    	JLabel lblcolor2 = new JLabel("Blue #003366");
    	JLabel lblcolor3 = new JLabel("Green #36B36F");
    	JLabel lblcolor4 = new JLabel("Orange #FFA500");
    	JLabel lblcolor5 = new JLabel("Gray #666666");
    	JLabel lblcolor6 = new JLabel("Yellow #FFFF00");
    	JLabel lblcolor7 = new JLabel("Red #FF0000");
    	JLabel lblcolor8 = new JLabel("White #FFFFFFF");
    	
    	JLabel lblLogo = new JLabel("");
    	JLabel lblText = new JLabel("Please check the chart on the right for"); 
    	JLabel lblText2 = new JLabel("a good fitting of the shirt.");
    	
    	JLabel lbltable = new JLabel("");
    	
		JButton btncolor1 = new JButton("");
		JButton btncolor2 = new JButton("");
		JButton btncolor3 = new JButton("");
		JButton btncolor4 = new JButton("");
		JButton btncolor5 = new JButton("");
		JButton btncolor6 = new JButton("");
		JButton btncolor7 = new JButton("");
		JButton btncolor8 = new JButton("");
		
		lblLogo.setBounds(55, 15, 210, 190); 
		lblLogo.setIcon(new ImageIcon(getClass().getResource("Logo Colors.png")));
		lblLogo.setBackground(new Color(r,g,b));
		
		lblText.setBounds(270, 60, 660, 35); 
		lblText.setFont(lblfont);
		lblText.setForeground(Color.white); 
		lblText.setBackground(new Color(r,g,b));
		
		lblText2.setBounds(270, 90, 660, 35); 
		lblText2.setFont(lblfont);
		lblText2.setForeground(Color.white); 
		lblText2.setBackground(new Color(r,g,b));
		
		lbltable.setBounds(660, 15, 250, 200); 
		lbltable.setIcon(new ImageIcon(getClass().getResource("Table.jpg")));
		lbltable.setBackground(new Color(r,g,b));
		
		btnOrder.setBackground(new Color(13,37,39));
		btnOrder.setBounds(270, 140, 145, 27);
		btnOrder.setFont(order);
		btnOrder.setFocusPainted(false); 
		btnOrder.setContentAreaFilled(false);
		btnOrder.setForeground(Color.white);
		btnOrder.addActionListener(this);
		
		btncolor1.setIcon(new ImageIcon(getClass().getResource("black #000000.jpg")));
		btncolor1.setBackground(new Color(r,g,b));
		btncolor1.setBounds(90, 255, 150, 150);
		btncolor1.setFocusPainted(false); 
		btncolor1.setBorder(null);
		btncolor1.setContentAreaFilled(false);
		//btncolor1.addActionListener(this);
		
		lblcolor1.setBounds(81, 405, 180, 23); 
		lblcolor1.setFont(lbltxt);
		lblcolor1.setForeground(Color.white); 
		lblcolor1.setBackground(new Color(r,g,b));
		
		btncolor2.setIcon(new ImageIcon(getClass().getResource("blue #003366.png")));
		btncolor2.setBackground(new Color(r,g,b));
		btncolor2.setBounds(300, 255, 150, 150);
		btncolor2.setFocusPainted(false); 
		btncolor2.setBorder(null);
		btncolor2.setContentAreaFilled(false);
		//btncolor2.addActionListener(this);
		
		lblcolor2.setBounds(298, 405, 180, 23); 
		lblcolor2.setFont(lbltxt);
		lblcolor2.setForeground(Color.white); 
		lblcolor2.setBackground(new Color(r,g,b));
		
		btncolor3.setIcon(new ImageIcon(getClass().getResource("green #36b36f.png")));
		btncolor3.setBackground(new Color(r,g,b));
		btncolor3.setBounds(510, 255, 150, 150);
		btncolor3.setFocusPainted(false); 
		btncolor3.setBorder(null);
		btncolor3.setContentAreaFilled(false);
		//btncolor3.addActionListener(this);
		
		lblcolor3.setBounds(501, 405, 180, 23); 
		lblcolor3.setFont(lbltxt);
		lblcolor3.setForeground(Color.white); 
		lblcolor3.setBackground(new Color(r,g,b));
		
		btncolor4.setIcon(new ImageIcon(getClass().getResource("orange #ffa500.png")));
		btncolor4.setBackground(new Color(r,g,b));
		btncolor4.setBounds(730, 255, 150, 150);
		btncolor4.setFocusPainted(false); 
		btncolor4.setBorder(null);
		btncolor4.setContentAreaFilled(false);
		//btncolor4.addActionListener(this);
		
		lblcolor4.setBounds(715, 405, 200, 23); 
		lblcolor4.setFont(lbltxt);
		lblcolor4.setForeground(Color.white); 
		lblcolor4.setBackground(new Color(r,g,b));
		
		btncolor5.setIcon(new ImageIcon(getClass().getResource("gray #666666.png")));
		btncolor5.setBackground(new Color(r,g,b));
		btncolor5.setBounds(90, 455, 150, 150);
		btncolor5.setFocusPainted(false); 
		btncolor5.setBorder(null);
		btncolor5.setContentAreaFilled(false);
		//btncolor5.addActionListener(this);
		
		lblcolor5.setBounds(86, 605, 180, 23); 
		lblcolor5.setFont(lbltxt);
		lblcolor5.setForeground(Color.white); 
		lblcolor5.setBackground(new Color(r,g,b));
		
		btncolor6.setIcon(new ImageIcon(getClass().getResource("yellow #ffff00.png")));
		btncolor6.setBackground(new Color(r,g,b));
		btncolor6.setBounds(300, 455, 150, 150);
		btncolor6.setFocusPainted(false); 
		btncolor6.setBorder(null);
		btncolor6.setContentAreaFilled(false);
		//btncolor6.addActionListener(this);
		
		lblcolor6.setBounds(284, 605, 200, 23); 
		lblcolor6.setFont(lbltxt);
		lblcolor6.setForeground(Color.white); 
		lblcolor6.setBackground(new Color(r,g,b));
		
		btncolor7.setIcon(new ImageIcon(getClass().getResource("red #ff0000.png")));
		btncolor7.setBackground(new Color(r,g,b));
		btncolor7.setBounds(510, 455, 150, 150);
		btncolor7.setFocusPainted(false); 
		btncolor7.setBorder(null);
		btncolor7.setContentAreaFilled(false);
		//btncolor7.addActionListener(this);
		
		lblcolor7.setBounds(514, 605, 180, 23); 
		lblcolor7.setFont(lbltxt);
		lblcolor7.setForeground(Color.white); 
		lblcolor7.setBackground(new Color(r,g,b));
		
		btncolor8.setIcon(new ImageIcon(getClass().getResource("white #ffffff.png")));
		btncolor8.setBackground(new Color(r,g,b));
		btncolor8.setBounds(730, 455, 150, 150);
		btncolor8.setFocusPainted(false); 
		btncolor8.setBorder(null);
		btncolor8.setContentAreaFilled(false);
		//btncolor8.addActionListener(this);
		
		lblcolor8.setBounds(715, 605, 200, 23); 
		lblcolor8.setFont(lbltxt);
		lblcolor8.setForeground(Color.white); 
		lblcolor8.setBackground(new Color(r,g,b));
		
		menuPanel.add(lblLogo);		
		menuPanel.add(lblText);		menuPanel.add(lblText2);
		menuPanel.add(btncolor1);	menuPanel.add(lblcolor1);
		menuPanel.add(btncolor2);	menuPanel.add(lblcolor2);
		menuPanel.add(btncolor3);	menuPanel.add(lblcolor3);
		menuPanel.add(btncolor4);	menuPanel.add(lblcolor4);
		menuPanel.add(btncolor5);	menuPanel.add(lblcolor5);
		menuPanel.add(btncolor6);	menuPanel.add(lblcolor6);
		menuPanel.add(btncolor7);	menuPanel.add(lblcolor7);
		menuPanel.add(btncolor8);	menuPanel.add(lblcolor8);
		menuPanel.add(btnOrder);	menuPanel.add(lbltable);
		
		add(menuPanel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnOrder) {
			this.dispose();
			Table table = new Table(); 
			table.setVisible(true);
			
		}
		
	}
}
