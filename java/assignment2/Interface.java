//Interface Concepts

package assignment2;

import java.util.Scanner;

interface FirstInterface {
		  public void myMethod(); // interface method
		}

		interface SecondInterface {
		  public void myOtherMethod(); // interface method
		}

		// DemoClass "implements" FirstInterface and SecondInterface

		class DemoClass implements FirstInterface, SecondInterface {
		  public void myMethod() {
			  Scanner in = new Scanner(System.in);
		    System.out.println("Enter the FristInterface text");
		    String ab=in.nextLine();
		    System.out.println("The First Interface text is: "+ab);
		  }
		  public void myOtherMethod() {
			  Scanner in = new Scanner(System.in);
			    System.out.println("Enter the SecondInterface text");
			    String ab=in.nextLine();
			    System.out.println("The Second Interface text is: "+ab);
		  }
		}

		class Interface {
			
		  public static void main(String[] args) {
			
		    DemoClass myObj = new DemoClass();
		    myObj.myMethod();
		    myObj.myOtherMethod();
		  }
		}

