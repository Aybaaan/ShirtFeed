package gui;

import java.util.HashMap;

public class IDandPass {
	
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPass(){
		
		logininfo.put("admin01", "admin01pass");
		logininfo.put("admin02", "12345");
		logininfo.put("admin03", "password");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
		
	}
}
