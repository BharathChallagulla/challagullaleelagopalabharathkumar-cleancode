package com.epam.maven_demo;

import java.lang.Math;
public class calculateInterest {
 double calculateCompoundInterest(double principal,double rate,double time_period)
 {
	 return (principal*(Math.pow(1+rate/100,time_period)));
 }
  double calculateSimpleInterest(double principal,double rate,double timeperiod)
	{
		return (principal*rate*timeperiod)/100;
	}
}