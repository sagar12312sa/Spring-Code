package com.coupling;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    	ReportService rs = new ReportService();
    	System.out.println("Enter Your Option");
    	System.out.println("1. PDF");
    	System.out.println("2. Excel");
    	
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	if(n == 1) {
    		rs.setGenerator(new PdfReport());
    		rs.printReport();
    	}
    	else if(n == 2) {
    		rs.setGenerator(new Excelreport());
    		rs.printReport();
    	}
    	else {
    		System.out.println("please Enter a valid choice");
    	}
    }
}
