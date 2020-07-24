package com.epam.House;

import java.util.*;

public class constructionMaterials{
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.format("%s","There are various types of material standards for building a house, They are standard,above standard,high standard,high standard and fully automated");
			String material = sc.nextLine();
			System.out.format("%s", "Enter the Number of Square Feet" );
			float squareFeet =sc.nextFloat();
			constructionCost obj = new constructionCost();
			float cost = obj.calculateConstructionCost(material,squareFeet);
			System.out.format("%s","Total Cost Of House Construction is ");
			System.out.format("%f",cost);
		}
	}
}