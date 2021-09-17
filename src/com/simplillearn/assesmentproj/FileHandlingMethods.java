package com.simplillearn.assesmentproj;
import java.io.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;

import java.util.Scanner;
public class FileHandlingMethods {
	//This method prints welcome screen 
	public static void Welcomescreen() {
		
		System.out.println("***********************************************************");
		System.out.println("** Welcome to LockedMe.com");
		System.out.println("** This application was developed by Prathamesh Kesarkar");
		System.out.println("************************************************************");
		System.out.println("    ");
		System.out.println("    ");
		System.out.println("You can use this application to:-");
		System.out.println("a. Retrieve all file names in the fileoperations folder");
		System.out.println("b. Search,add,delete files in fileoperations folder");
		System.out.println("      ");
		System.out.println("      ");
		System.out.println("****Select any option from below and press Enter");
		System.out.println("      ");
		
		
	}
	// method to display file in ascending order
	public static List<String> ToDisplayFile(String folderpath) {
		File directorypath=new File(folderpath);
		File filesList[]=directorypath.listFiles();
		List<String> filenames=new ArrayList<String>();
		//for sorting files in ascending order
		Collections.sort(filenames);
		for(File file:filesList) {
			filenames.add(file.getName());
		}
		
		
		return filenames;
		
	}
	
	//Method to add file to folder
    public static void filecreate(String filename) {
		
	    try {
	    	File myObj=new File(filename);
	    	if (myObj.createNewFile()) {
	    		System.out.println("FileCreated");
	    		FileWriter myWriter=new FileWriter(filename);
	    		Scanner input1=new Scanner(System.in);
	    		System.out.println("do you want to enter content for file(y/n)?");
	    		char operator=input1.next().charAt(0);
	    		switch(operator) {
	    		case 'y':
	    			Scanner input=new Scanner(System.in);
	    			System.out.println("enter content to your file");
		    		String sc=input.nextLine();
		    		myWriter.write(sc);
		    		myWriter.close();
		    	    System.out.println("Successfully written to file");
		    		System.out.println("*******************************");
		    		break;
		    		
	    		case 'n':
	    			System.out.println("nothing written to file");
	    			break;
	    		                  }
	    		
	    	}
	    	else {
	    		System.out.println("file already exists");
	    		System.out.println("**********************");
	    	}  		
	    }
	    catch(IOException e) {
	    	System.out.println("an error occured.");
	    	e.printStackTrace();
	    }
	}
    
    //method to search file from existing folder
    public static void searchfile(String filename) {
	
	File directory=new File("C:\\Users\\kesar\\fileoperations");
	 
	String flist[]=directory.list();
	
	int flag=0;
	
	if(flist==null) {
		System.out.println("empty directory");
	}
	else {
		
		for (int i=0;i<flist.length;i++) {
			String files=flist[i];
			if(files.equalsIgnoreCase(filename)) {
				System.out.println(files +" :found");
				System.out.println("******************");
			    flag=1;
			}
		}	
		
	}
	
	if (flag==0) {
		System.out.println("file not found");
		System.out.println("******************");
	}	
	
}

    //method to delete file from the folder
     public static void deletefile(String filename1) {
		File myObj=new File(filename1);
		
		if(myObj.delete()) {
			System.out.println("file deleted successfully");
			System.out.println("*****************************");
		}
		else {
			System.out.println("file doesnt exist");
			System.out.println("******************************");
		}
	}
	
	
	
}


