package com.employee;
import java.util.Scanner;
public class Ui {
	public static void main(String args[]) {
		int ch;
		Record record= new Record();
		Scanner s= new Scanner(System.in);
		do {
			System.out.println("\n ********************\n 1. Add records\n 2. retrieve records\n 3. delete records\n 4.exit ");
			System.out.println("enter choice:");
			ch= s.nextInt();
			switch(ch) {
			case 1:
				record.Addrecord();
				break;
			case 2:
				record.Retrieverecord();
				break;
			case 3:
				record.Deleterecord();
				break;
			case 4:
				System.out.println("**********thank you**********");
				System.exit(0);
				break;
			}
	       System.out.print("do you want to continue[y/n]");
	       char choice= s.next().charAt(0);
	       if(choice=='y'||choice=='Y')
	    	   continue;
	       else {
	    	   System.out.println("thank you");
	    	   System.exit(0);
	       }
	       
		}
		while(ch!=4);
	       s.close();
	}

}
