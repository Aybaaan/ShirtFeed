package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class Login extends JFrame implements ActionListener{	
	
	private static final long serialVersionUID = 1L;
	JTextField txtName = new JTextField();
    JPasswordField txtPass = new JPasswordField();
    JLabel lblMessage = new JLabel();
     
    JButton btnlogin = new JButton("Log In");
	
	HashMap<String, String> logininfo = new HashMap<String, String>();
		
	public Login(HashMap<String, String> loginInfoOrig){
		
		logininfo = loginInfoOrig;
		
		setIconImage(new ImageIcon(getClass().getResource("Logo Sizes.png")).getImage());
		initComponents();
	}
	
	private void initComponents() {
		Font lblfont = new Font("Candara", Font.BOLD, 23);
		Font lbltxt = new Font("Monospaced", Font.BOLD, 22);
		
		setTitle("Sign In");
        setSize(1000,600);
		setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#17494D"));
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);

        JPanel logoPanel = new JPanel();
	        logoPanel.setLayout(null);
	    	logoPanel.setBounds(0, 0, 500, 600);
    	
    	JLabel lblbg1 = new JLabel("");
    		lblbg1.setIcon(new ImageIcon(getClass().getResource("shirt2.png")));
    		lblbg1.setBounds(-250, -75, 550, 700);
    		lblbg1.setBackground(new Color(23,73,77));
    		
    	JLabel lblbg2 = new JLabel("");
    		lblbg2.setIcon(new ImageIcon(getClass().getResource("shirt2.png")));
    		lblbg2.setBounds(760, -75, 550, 700);
    		lblbg2.setBackground(new Color(23,73,77));
    		
    	logoPanel.add(lblbg1);	logoPanel.add(lblbg2);
    	
    	JPanel formPanel = new JPanel();
	       	formPanel.setLayout(null);
	       	formPanel.setBackground(new Color(23,73,77));
	       	formPanel.setBounds(0, 0, 1000, 600);
        
	    JLabel lblName = new JLabel("Username");
	    JLabel lblPass = new JLabel("Password");   	
	       	
        JLabel lblloginpic = new JLabel ("");

    	lblName.setBounds(305, 388, 110, 25);	
    	lblName.setFont(lblfont);	
    	lblName.setForeground(Color.white);

    	lblloginpic.setBounds(310, 10, 380, 350);	
    	lblloginpic.setIcon(new ImageIcon(getClass().getResource("Logo Log In.png")));
    	
    	lblPass.setBounds(305, 439, 110, 25);	
    	lblPass.setFont(lblfont);	
    	lblPass.setForeground(Color.white);
    	
    	lblMessage.setBounds(420, 468, 200, 30);	
    	lblMessage.setFont(lblfont);	
    	lblMessage.setForeground(Color.white);
    	lblMessage.setFont(new Font("Candara",Font.PLAIN,21));
        
        txtName.setBounds(420,380,300,30);
        txtName.setFont(lbltxt);
        txtName.setForeground(Color.white);
        txtName.setBackground(new Color(13,37,39));

        txtPass.setBounds(420,430,300,30);
        txtPass.setFont(lbltxt);
        txtPass.setForeground(Color.white);
        txtPass.setBackground(new Color(13,37,39));
        
        btnlogin.setBounds(433,495,120,40);
        btnlogin.setFont(lblfont);
        btnlogin.setForeground(Color.white);
        btnlogin.setBackground(new Color(13,37,39));
        btnlogin.setFocusable(false);
        btnlogin.setHorizontalTextPosition(SwingConstants.CENTER);
        btnlogin.addActionListener(this);
        
        formPanel.add(lblName); 	formPanel.add(lblPass);
        formPanel.add(txtName);		formPanel.add(txtPass);
        formPanel.add(btnlogin);	formPanel.add(lblMessage);
        formPanel.add(lblbg1);
        formPanel.add(lblbg2);
        formPanel.add(lblloginpic);
        
        add(formPanel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==btnlogin) {
			
			String userID = txtName.getText();
			String password = String.valueOf(txtPass.getPassword());
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					lblMessage.setForeground(Color.green);
					lblMessage.setText("Login successful");
					this.dispose();
					Home homepage = new Home();
					homepage.setVisible(true);
				}
				else {
					lblMessage.setForeground(Color.red);
					lblMessage.setText("Wrong password");
				}

			}
			else {
				lblMessage.setForeground(Color.red);
				lblMessage.setText("Username not found");
			}
		}
	}	
}

