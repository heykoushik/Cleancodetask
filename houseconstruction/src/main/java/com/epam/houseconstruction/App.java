package com.epam.houseconstruction;
import java.util.*;
public class App 
{
	public static void main( String[] args )
    {
	System.out.println("WELCOME TO MY APPLICATION\nI can perform:-\nSimple interest\nCompound interest\nEstimation\n");
	boolean condition=true;
    //double p,t,r;
    Scanner sc = new Scanner(System.in);
    while(condition)
    {
    	System.out.print("Choose the operation to be performed : ");
        Interest i = new Interest();
    	i.Result();
    	System.out.println("To continue enter y for Yes and n for No");
    	String again = sc.next();
    	if(again.charAt(0)=='y' || again.charAt(0)=='Y')condition = true;
    	else {condition = false;break;}
    }
    sc.close();
}
}
