package patikadev;

import java.util.Scanner;

public class ArtikYilHesaplama {

	public static void main(String[] args) {
		
		int year;
		String yearResult;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Year : ");
		
		year = input.nextInt();
		
		//condition being checked
		yearResult=((year%100!=0 &&year%4==0) || (year%400==0))?"Leap Year":"Not A Leap Year";
		
		System.out.println(year+" : "+yearResult);
		
	}

}
