package com.epam.houseconstruction;
import Operation.*;
import java.util.*;
public class Interest {
	//private String Perform;
	private Double result;
	//private Double result1;
	int S=0;
	operation op=new operation();
	Interest()
	{
		
		//private double p;
		//private double t;
		//private double r;
		//private double s;
		
		//this.p=p;
		//this.t=t;
		//this.r=r;
		 Scanner sc = new Scanner(System.in);
		 String Perform=sc.next();
		
    	sc.nextLine();
	if(Perform.equalsIgnoreCase("simple interest")||Perform.equalsIgnoreCase("si")||Perform.equals("Simple interest"))S=1;
	if(Perform.equalsIgnoreCase("compound interest")||Perform.equalsIgnoreCase("ci")||Perform.equals("Compound interest"))S=2;
	if(Perform.equalsIgnoreCase("estimation")||Perform.equalsIgnoreCase("est")||Perform.equals("Estimation"))S=3;
	switch(S)
	{
		case 1:	
			System.out.print("Enter the values to perform operation: ");
			double p = sc.nextDouble();
			double t = sc.nextDouble();
			double r = sc.nextDouble();
			this.result = op.Simple_interest(p,t,r);
			break;
		case 2:
			System.out.print("Enter the values to perform operation: ");
			double p1 = sc.nextDouble();
			double t1 = sc.nextDouble();
			double r1 = sc.nextDouble();
			this.result = op.Compound_interest(p1,t1,r1);
			break;
		case 3 :
			System.out.println("Enter the value of sq.ft\n");
			double s = sc.nextDouble();
			System.out.println("Choose:\nStandard materials enter 1\nAbove standard materials enter 2\nHigh standard material enter 3\nHigh standard material and fully automated enter 4\n");	
			int req =sc.nextInt();
			this.result = op.Estimation(s,req);
			break;
	}
		sc.close(); 
	}
	public void Result()
	{
		if(result!=null)System.out.println("Result: "+result);
		else System.out.println("interest is not possible");
	}
}