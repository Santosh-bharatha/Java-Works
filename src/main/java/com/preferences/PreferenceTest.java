package com.preferences;

import java.util.prefs.Preferences;

import com.fundamentals.inheritance.Main;

public class PreferenceTest {
	
	private Preferences prefs;
	
	public void setPreference(){
		prefs = Preferences.userRoot().node(this.getClass().getName());
		
		String ID1 = "Test1";
		String ID2 = "Test2";
		String ID3 = "Test 3";
		
		System.out.println( prefs.getBoolean(ID1, true));
		System.out.println( prefs.get(ID1, "Hello World"));
		System.out.println( prefs.getInt(ID3, 50));
		
		prefs.putBoolean(ID1, false);
		prefs.put(ID2, "Hellow India");
		prefs.putInt(ID3, 45);
	}

	public static void main(String[] args) {
		
		PreferenceTest test = new PreferenceTest();
		test.setPreference();
		
		Preferences myPrefs = Preferences.userNodeForPackage(Main.class);
		
		//Preference Key name
		final String PREF_NAME = "name_of_preference";
		
		//save
		myPrefs.put(PREF_NAME, "a string"); //string
		myPrefs.getBoolean(PREF_NAME, true);
		myPrefs.putInt(PREF_NAME, 123);
		myPrefs.putLong(PREF_NAME, 123L);
		myPrefs.putFloat(PREF_NAME, 12.3F);
		myPrefs.putDouble(PREF_NAME, 12.3);
		
		byte[] bytes = new byte[1024];
		myPrefs.putByteArray(PREF_NAME, bytes); // byte[]

		//Retrieve
		
		String s = myPrefs.get(PREF_NAME, "a String"); //String
		boolean b = myPrefs.getBoolean(PREF_NAME, true);
		int i = myPrefs.getInt(PREF_NAME, 123); // int
	    long l = myPrefs.getLong(PREF_NAME, 123L); // long
	    float f = myPrefs.getFloat(PREF_NAME, 12.3F); // float
	    double d = myPrefs.getDouble(PREF_NAME, 12.3); // double
	    bytes = myPrefs.getByteArray(PREF_NAME, bytes); // byte[]
	    
	    int keyMax = Preferences.MAX_KEY_LENGTH;
	    
	    int valueMax = Preferences.MAX_VALUE_LENGTH;
	    
	    int byteMax = Preferences.MAX_VALUE_LENGTH * 3 / 4;
	    
	    System.out.println("################");
	    
	    System.out.println("KeyMax : "+keyMax);
	    System.out.println("valueMax : "+valueMax);
	    System.out.println("byteMax : "+byteMax);
	    

	    
	   Preferences prefs = Preferences.systemRoot();
	   
	   prefs = Preferences.userRoot();
	   
	   String name= prefs.name();
	   
	   Preferences parent = prefs.parent();
	   
	   String path = prefs.absolutePath();
	   
	   System.out.println("Parent :"+ parent);
	   System.out.println("Absolute Path "+ path);
	   
	
	}

}
