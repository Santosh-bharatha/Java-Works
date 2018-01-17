package com.preferences;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class PreferenceExample {
	
	public static void main(String args[]) throws BackingStoreException, IOException{
		
		Preferences prefRoot = Preferences.userRoot();
		Preferences myPrefs = prefRoot.node("PreferenceExample");
		
		myPrefs.put("A","a");
		myPrefs.put("B","b");
		myPrefs.put("C","c");
		myPrefs.put("D","d");
		
		FileOutputStream fos = new FileOutputStream("/WORK/Camel/prefs.xml");
		
		myPrefs.exportSubtree(fos);
		fos.close();
			
		
		System.out.println("Node's absolute path: " + myPrefs.absolutePath());
		
		
		System.out.print("Node's children: ");
		
			for(String ss : myPrefs.childrenNames()){
				System.out.println(ss +" ");
			}
		
			System.out.println("\nNode's Keys: ");
			//get value from Preferences
			for(String s : myPrefs.keys()){
				System.out.println(""+ s + "="+myPrefs.get(s, ""));
			}
		
			System.out.println("Node's name: "+myPrefs.name());
			System.out.println("Node's Parent: "+ myPrefs.parent());
			System.out.println("Node: "+ myPrefs);
			System.out.println("UserNodeforPackage"+Preferences.userNodeForPackage(Preferences.class));
			
	}

}
