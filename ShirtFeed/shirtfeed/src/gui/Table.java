package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Table extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	JFrame frame = new JFrame("Shirt Feed");
	
	//JButton btnDelP = new JButton("Delete");
	JFrame frmDel = new JFrame();
	JButton btnConD = new JButton("Delete");
	JTextField delId = new JTextField();
	
	JTextField textFieldQty = new JTextField();
	JTextField textFieldSize = new JTextField();
	JTextField textFieldCode = new JTextField();
	JTextField textFieldPrice = new JTextField();
	JTextField textFieldSub = new JTextField();
	JTextField textFieldCustomer = new JTextField();
	String categoryS [] = {"--", "Extra Small", "Small", "Medium", "Large", "Extra Large", "XXL"};
	JComboBox<String> size = new JComboBox<String>(categoryS);
	String category [] = {"--", "Cash", "COD", "Credit Card"};
	JComboBox<String> MOP = new JComboBox<String>(category);
	
	JTable table = new JTable();
	
	DefaultTableModel model = new DefaultTableModel();
	
	JButton btnUpdate = new JButton("Update Order");
	JButton btnAdd = new JButton("Add Order");
	JButton btnDelete = new JButton("Order Complete");
	JButton btnBack = new JButton("Back");
	
	Connection con = DataConnection.getConnection();
	PreparedStatement pst;
	ResultSet rs;	
	
	public Table() {
		initComponents();
		Table();
	}
	
	public void Table() {
		try{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "");
			String sql = "SELECT * FROM products2";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex);
		}	
	}
	
	private void initComponents() {
		
		Object[] columns = {"Product Code", "Size", "Quantity", "Price", "Subtotal", "MOP / Customer"};

		Font txtfont = new Font("Monospaced", Font.PLAIN, 16);
		Font txtin = new Font("Monospaced", Font.PLAIN, 14);
		
		frame.getContentPane().setFont(new Font("Britannic Bold", Font.BOLD, 11));
		frame.getContentPane().setBackground(Color.decode("#17494D"));
		frame.getContentPane().setForeground(Color.white);
		frame.setSize(1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(new ImageIcon(getClass().getResource("Logo Sizes.png")).getImage());
		
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.setBackground(new Color(13,37,39));
		table.setForeground(Color.white);
		table.setBackground(new Color(34,40,49));
		table.setGridColor(new Color(169,190,221));
		table.setSelectionForeground(Color.white);
		table.setFont(new Font("Britannic Bold", Font.BOLD, 16));
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(25);
		table.setAutoCreateRowSorter(true);	
		
		JScrollPane sp = new JScrollPane(table);
		sp.setForeground(new Color(13,37,39));
		sp.setBackground(new Color(13,37,39));
		sp.setBounds(135,110,712,327);	
		
		frame.getContentPane().add(sp);

		JLabel lblHeader = new JLabel("Shirt Feed");
		lblHeader.setForeground(Color.WHITE);
		lblHeader.setFont(new Font("Stencil", Font.BOLD, 67));
		lblHeader.setBounds(280, 11, 440, 105);
		frame.getContentPane().add(lblHeader);
		
		JLabel lblCode = new JLabel("Product Code");
		lblCode.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblCode.setForeground(Color.WHITE);
		lblCode.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCode.setBounds(122, 448, 130, 33);
		frame.getContentPane().add(lblCode);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setForeground(Color.WHITE);
		lblSize.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblSize.setBounds(135, 490, 70, 33);
		frame.getContentPane().add(lblSize);
		
		JLabel lblQty = new JLabel("Quantity");
		lblQty.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblQty.setForeground(Color.WHITE);
		lblQty.setBounds(533, 449, 104, 32);
		frame.getContentPane().add(lblQty);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setForeground(Color.WHITE);
		lblPrice.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblPrice.setBounds(533, 490, 104, 32);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblCustomer = new JLabel("Customer");
		lblCustomer.setForeground(Color.WHITE);
		lblCustomer.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblCustomer.setBounds(533, 530, 104, 32);
		frame.getContentPane().add(lblCustomer);
		
		JLabel lblSub = new JLabel("Subtotal");
		lblSub.setForeground(Color.WHITE);
		lblSub.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		lblSub.setBounds(533, 570, 104, 32);
		frame.getContentPane().add(lblSub);
		
		JLabel lblMOP = new JLabel("MOP");
		lblMOP.setForeground(Color.WHITE);
		lblMOP.setFont(new Font("Britannic Bold", Font.PLAIN, 18));
		lblMOP.setBounds(135, 542, 139, 14);
		frame.getContentPane().add(lblMOP);
		
		frmDel.setSize(350,400);
		frmDel.setResizable(false);
		frmDel.setBackground(Color.decode("#17494D"));
		frmDel.getContentPane().setLayout(null);
		frmDel.setLocationRelativeTo(null);
		frmDel.setIconImage(new ImageIcon(getClass().getResource("Logo Sizes.png")).getImage());
		frmDel.setTitle("Delete Product");
		
		JPanel p_delc = new JPanel();
		p_delc.setLayout(null);
		p_delc.setBounds(0,0,350,400);
		p_delc.setBackground(Color.decode("#0d2527"));
		
	JLabel lblin2 = new JLabel("Enter ID of product to remove.");
		lblin2.setFont(txtin);
		lblin2.setBounds(50, 170, 300, 20);
		lblin2.setForeground(Color.white);
		
	JLabel lblImgd = new JLabel("");
		lblImgd.setBackground(Color.decode("#0d2527"));
		lblImgd.setIcon(new ImageIcon(getClass().getResource("Logo Sizes.png")));
		lblImgd.setBounds(90, 20, 150, 150);
	
	JLabel lblid2 = new JLabel("ID:", Label.RIGHT);
		lblid2.setBounds(50, 220, 120, 20);
		lblid2.setFont(txtfont);
		lblid2.setForeground(Color.white);
		lblid2.setBackground(Color.decode("#0d2527"));
		lblid2.setOpaque(true);
		
		delId.setBounds(105, 220, 180, 20);
		
    	btnConD.setBounds(100, 260, 125, 35);
    	btnConD.setFont(txtfont);
    	btnConD.setBackground(Color.decode("#17494D"));
    	btnConD.setForeground(Color.white);
    	btnConD.setFocusable(false);
    	btnConD.addActionListener(this);
		
    	p_delc.add(lblin2);
    	p_delc.add(delId);
    	p_delc.add(lblid2);
		p_delc.add(lblImgd);
		p_delc.add(btnConD);
	frmDel.add(p_delc);
		
		textFieldCode = new JTextField();
		textFieldCode.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		textFieldCode.setBounds(280, 448, 223, 31);
		frame.getContentPane().add(textFieldCode);
		textFieldCode.setColumns(10);

		size.setSelectedIndex(0);
		size.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		size.setBounds(280, 489, 223, 32);
		frame.getContentPane().add(size);
		size.addActionListener(this);
		
		textFieldQty = new JTextField();
		textFieldQty.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		textFieldQty.setBounds(620, 448, 227, 33);
		frame.getContentPane().add(textFieldQty);
		//textFieldQty.setColumns(10);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		textFieldPrice.setColumns(10);
		textFieldPrice.setBounds(620, 489, 227, 33);
		frame.getContentPane().add(textFieldPrice);

		//MOP.setBounds(150, 270, 180, 20);
		MOP.setSelectedIndex(0);
		MOP.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		MOP.setBounds(280, 530, 223, 32);
		frame.getContentPane().add(MOP);
		MOP.addActionListener(this);
		
		textFieldCustomer = new JTextField();
		textFieldCustomer.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		textFieldCustomer.setColumns(10);
		textFieldCustomer.setBounds(620, 529, 227, 29);
		frame.getContentPane().add(textFieldCustomer);
		
		textFieldSub = new JTextField();
		textFieldSub.setColumns(10);
		textFieldSub.setBounds(620, 570, 227, 29);
		textFieldSub.setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		textFieldSub.setEditable(false);
		frame.getContentPane().add(textFieldSub);
		
		//Add to the table
		btnAdd.setFont(new Font("Britannic Bold", Font.BOLD, 20));
		btnAdd.setBounds(135, 610, 339, 33);
		frame.getContentPane().add(btnAdd);
		btnAdd.addActionListener(this);

		
		//Delete an item
		btnDelete.setFont(new Font("Britannic Bold", Font.BOLD, 20));
		btnDelete.setBounds(508, 610, 339, 33);
		frame.getContentPane().add(btnDelete);
		btnDelete.addActionListener(this); {
			
		//Back to Home
		btnBack.setFont(new Font("Britannic Bold", Font.BOLD, 15));
		btnBack.setBounds(769, 79, 78, 25);
		frame.getContentPane().add(btnBack);
		btnBack.addActionListener(this); 
			
		frame.revalidate();
		frame.setVisible(true);
	}
}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == btnAdd) {	
			
			try {
				String sql = "INSERT INTO products2 (ID, Size, Quantity, Price, Subtotal, MOP, Customer)"
						+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
				
				int quant, price, sub = 0;
				quant = Integer.parseInt(textFieldQty.getText());
	            price = Integer.parseInt(textFieldPrice.getText());
	            
	            sub = quant * price;
	            textFieldSub.setText(Integer.toString(sub));
				
				pst = con.prepareStatement(sql);
				pst.setString(1, textFieldCode.getText());
				pst.setString(2, size.getSelectedItem().toString());
				pst.setString(3, textFieldQty.getText());
				pst.setString(4, textFieldPrice.getText());
				pst.setString(5, textFieldSub.getText());
				pst.setString(6, MOP.getSelectedItem().toString());
				pst.setString(7, textFieldCustomer.getText());
				pst.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "Order ID " + textFieldCode.getText() + " added succesfully.", 
						"Product added", JOptionPane.INFORMATION_MESSAGE);
				
			} catch (SQLException | HeadlessException ex) {
				JOptionPane.showMessageDialog(null, ex);
				
			}
			Table();
			
		}
	
		if (e.getSource() == btnDelete) {
			frmDel.setVisible(true);
			delId.setText("");
		}
		
		if (e.getSource() == btnConD) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "");
				PreparedStatement st = (PreparedStatement) 
		            	con.prepareStatement("Select ID from products2 where ID =?");

		        st.setString(1, delId.getText());
		        ResultSet rs = st.executeQuery();
		        
		        if (rs.next()) {
		        	String sql = "DELETE FROM products2 WHERE ID =?";
		        	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products", "root", "");
		        	pst = con.prepareStatement(sql);
		        	pst.setString(1, delId.getText());
	    			pst.executeUpdate();
	    			JOptionPane.showMessageDialog(null, "Product ID " + delId.getText() + " deleted succesfully.",
	    					"Product removed", JOptionPane.INFORMATION_MESSAGE);
	    			frmDel.setVisible(false);
		        } else {
		        	JOptionPane.showMessageDialog(null, "Product ID " + delId.getText() + " does not exist.",
		        			"Remove product", JOptionPane.ERROR_MESSAGE);
		        	delId.setText("");
		        }	
    		} catch (SQLException | HeadlessException ex) {
    			JOptionPane.showMessageDialog(null, ex);
    		}
			Table();
		}
	
		if (e.getSource() == btnBack) {
			
			this.dispose();
			Home homepage = new Home();
			homepage.setVisible(true);
			
		}
	}
}
