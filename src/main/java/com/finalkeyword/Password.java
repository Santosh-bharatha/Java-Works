package com.finalkeyword;

public class Password {
	
	private static final int key = 78945666;
	private final int encryptionPassword;
	
	public Password(int password){
		this.encryptionPassword = encryptDecrypt(password);
	}

	private int encryptDecrypt(int password) {
		
		
		return password ^ key;
	}
	
	public void storePassword(){
		System.out.println("Saving password as "+ this.encryptionPassword);
	}
	
	public boolean letMeIn(int password){
		if(encryptDecrypt(password) == this.encryptionPassword){
			System.out.println("Welcome");
			return true;
		}else{
			System.out.println("Nope, you cannot come in");
			return false;
		}
	}

}
