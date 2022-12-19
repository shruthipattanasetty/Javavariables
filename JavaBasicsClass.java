package com.perscholas.java_basics;
import java.util.Scanner;

public class JavaBasicsClass {

	public static void main(String[] args) {
		// Core Java - Variables 303.1.2 - Practice Assignment	
		
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		question8();
	}	
	
	/*
	Write a program that declares 2 integer variables, 
	assigns an integer to each, and adds them together. 
	Assign the sum to a variable. Print out the result.
	*/
	public static void question1() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("The sum of a and b is " +c);
	}	
		/*
		Write a program that declares 2 double variables, 
		assigns a number to each, and adds them together.
		 Assign the sum to a variable. Print out the result.
		*/	
		public static void question2() {
		double x = 10.9D;
		double y = 20.6D;
		double z = x+y;
		System.out.println("The sum of x and y is " +z);
		}
		/*
		Write a program that declares an integer variable and a double variable, 
		assigns numbers to each, and adds them together. Assign the sum to a variable.
		 Print out the result. What variable type must the sum be?
		*/
		public static void question3() {
		int d = 25;
		double e = 25.5D;
        double f = d+e;
        System.out.println("The sum of d and e is " +f);
		}
      
        /*
        Write a program that declares 2 integer variables, assigns an integer to each, 
        and divides the larger number by the smaller number. Assign the result to a variable. 
        Print out the result. Now change the larger number to a decimal.
         What happens? What corrections are needed?
        */
        public static void question4() {
        //int A =9;
       double A = 9.0;
        int B = 4;
        //int C = A/B;
        double C = A/B;
        System.out.println("The result of A and B is " +C);
        }
        
        /*
        Write a program that declares 2 double variables, 
        assigns a number to each, and divides the larger by the smaller. 
        Assign the result to a variable. Print out the result. 
        Now, cast the result to an integer. Print out the result again.
        */
        public static void question5() {
        double l = 9.5D;
        double m = 4.5D;
        //double n = l/m;
        double n = (int)l/m;
        System.out.println("The result of l and m is " +n);
        }
        
        /*
        Write a program that declares two integer variables,
         x, and y, and assigns 5 to x and 6 to y. 
        Declare a variable q and assign y/x to it and print q. 
        Now, cast y to a double and assign it to q. Print q again.
        */
       
       public static void question6() {
       int X = 5;
       int Y = 6;
      // int q = Y/X;
       double D = Y;
       double q = Y/X;
       System.out.println("The result of X and Y is " +q);
       }
       
       /*
       Write a program that declares a named constant and 
       uses it in a calculation. Print the result.
       */
       public static void question7() {
       double radius,area;
       Scanner sc = new Scanner(System.in);
       final double pi = 3.14;
       System.out.println("Enter the value of radius");
       radius = sc.nextDouble();
       area = pi*radius*radius;
       //area = Math.PI * radius * radius; 
       System.out.println("The area of a circle is " +area);
       }
       
       /*
       Write a program where you create 3 variables that represent products at a cafe. 
       The products could be beverages like coffee, cappuccino, espresso, green tea, etc. 
       Assign prices to each product. Create 2 more variables called subtotal and totalSale
        and complete an “order” for 3 items of the first product,
        4 items of the second product, and 2 items of the third product. 
       Add them all together to calculate the subtotal. 
       */
       
       public static void question8() {
       double coffee = 4.5D;
       double bagel = 2.5D;
       double cookies = 1.5D;
       double subtotal,totalsales;
       double J = 3*coffee;
       double K = 4*bagel;
       double L = 2*cookies;
       subtotal = J+K+L;
       final double salestax = 0.06 * subtotal;
       totalsales = salestax+subtotal;
       System.out.println("Subtotal is " +subtotal);
       System.out.println("Total sales is " +totalsales);
       }
	}


