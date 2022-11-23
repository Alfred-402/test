package org.apache.commons.math3.analysis.function;

public class maintest {
	public static void main(String[] args) {
		Abs A=new Abs();
        double x=-3.2;
        if(A.value(x)==3.2) {
        	System.out.println("CORRECT!");
        	System.out.println(A.value(x));
        }
        else {
        	System.err.println("ERROR!");
        	System.err.println(A.value(x));
        }
       
	}
}
