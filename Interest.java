package com.epam.maven_demo;
import java.util.*;
public class Interest{
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.format("%s","Select an option for calculating\n1.Simple Interest\n2.Compound Interest\n");
			int choice = sc.nextInt();
			System.out.format("%s","enter principal amount");
			double principal = sc.nextDouble();
			System.out.format("%s","enter rate of interest");
			double rate = sc.nextDouble();
			System.out.format("%s","enter timeperiod");
			double timeperiod = sc.nextDouble();
			switch(choice)
			{
			case 1:calculateInterest si =new calculateInterest();
			       double interest_obtained = si.calculateSimpleInterest(principal,rate,timeperiod);
			       System.out.format("%f",interest_obtained);
			       break;
			case 2:calculateInterest ci = new calculateInterest();
			       double interest_obtained1 = ci.calculateCompoundInterest(principal,rate,timeperiod);
			       System.out.format("%f",interest_obtained1);
			       break;

			}
		}
	}
}