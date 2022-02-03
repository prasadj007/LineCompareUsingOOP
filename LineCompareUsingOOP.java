package com.bridgeabz.oop;

import java.util.*;

public class LineCompareUsingOOP {
	public double Line1() {
		Scanner sc =new Scanner(System.in);
		int x1,y1,x2,y2;
		x1=sc.nextInt();
		x2=sc.nextInt();
		y1=sc.nextInt();
		y2=sc.nextInt();
		double line1= Math.sqrt(Math.pow((x2 - x1), 2)+Math.pow((y2 - y1), 2));
		System.out.println("Length of Line is"+line1);
		return line1;
	}
	
	public double Line2() {
		Scanner sc =new Scanner(System.in);
		int a1,b1,a2,b2;
		a1=sc.nextInt();
		a2=sc.nextInt();
		b1=sc.nextInt();
		b2=sc.nextInt();
		double line2 = Math.sqrt(Math.pow((a2 - a1), 2)+Math.pow((b2 - b1), 2));
		System.out.println("Length of Line is"+line2);
		return line2;
	}
	
	public void LineEquals() {
		
		double line1=Line1();
		String str1=Double.toString(line1);
		double line2=Line2();
		String str2=Double.toString(line2);
		if(str1.equals(str2))
		{
			System.out.println("Lines are Equal");
		}
		else 
			System.out.println("Lines are not equal");

	}
	
	public void LineCompare()
	{
		double line1=Line1();
		String str1=Double.toString(line1);
		double line2=Line2();
		String str2=Double.toString(line2);
		int verify=str1.compareTo(str2);
		if(verify == 0)
		{
			System.out.println("Lines are Equal");
		}
		else if(verify < 0 )
		{
			System.out.println("Line1 is Smaller than Line2 ");
		}
		else 
		{
			System.out.print("Line1 is Greater than Line2");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		LineCompareUsingOOP lc = new LineCompareUsingOOP();
		System.out.println("Enter Co-ordinaes for line 1");
		lc.Line1();
		System.out.println("Enter Co-ordinaes for line 2");
		lc.Line2();
		lc.LineEquals();
		lc.LineCompare();
	}

}
