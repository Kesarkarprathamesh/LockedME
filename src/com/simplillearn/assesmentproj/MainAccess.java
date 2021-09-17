package com.simplillearn.assesmentproj;

import java.util.List;
import java.util.Scanner;
public class MainAccess {
	static final String folderpath="C:\\Users\\kesar\\fileoperations\\";

	public static void main(String[] args) {
		//calling methods
		FileHandlingMethods obj=new FileHandlingMethods();
		obj.Welcomescreen();
		
		Scanner input=new Scanner(System.in);
		String newline=System.lineSeparator();
		 {
			 while(true) {
		System.out.println("Press 1. To display all files"+newline+"Press 2.To do add file"+newline+"Press 3.To search file"+newline+"Press 4.To delete file"+newline+"Press 5.To exit file");
		System.out.println("******************************************************************************************************************");
		char ch=input.next().charAt(0);
		// switch case ----
		switch(ch) {
		
		case '1':
		List<String> filenames=FileHandlingMethods.ToDisplayFile(folderpath);
		for(String file:filenames)
			System.out.println(file);
		System.out.println(" ");
		break;
		
		
		case '2':
		System.out.println("enter filename for your new file");
		String text=input.next();
	    obj.filecreate(folderpath+text);
		break;
				
		case '3':
		System.out.println("enter file to search");
		String text1=input.next();
	    obj.searchfile(text1);
		break;
				
		case '4':
		System.out.println("enter filename to delete");
		String text3=input.next();
		obj.deletefile(folderpath+text3);
		break;
		
		case '5':
			System.exit(0);
			
		}
			 }	
			
		}			
	}
}