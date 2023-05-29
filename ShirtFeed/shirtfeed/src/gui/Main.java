package gui;

public class Main {

	public static void main(String[] args) {
		
		IDandPass idandPasswords = new IDandPass();
				
		Login loginPage = new Login(idandPasswords.getLoginInfo());
		loginPage.setVisible(true);

	}
}