import java.util.*;
class sis{
	public static void main(String args[]){
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("|                        Salary Information System                                |");
		System.out.println("-----------------------------------------------------------------------------------\n\n");
		System.out.println("[1] Calculate Income Tax");
		System.out.println("[2] Calculate Annual Bonus");
		System.out.println("[3] Calculate Loan Amount\n\n");

		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter An Option To Continue > ");
		int x=Sc.nextInt();
		
		String name1="";
		double salary1=0;
		double it=0;
		double bal=0;

		
		switch(x){
			case 1 :
			System.out.println("\n-----------------------------------------------------------------------------------");
			System.out.println("|                       Calculate Income Tax                                      |");
			System.out.println("-----------------------------------------------------------------------------------\n\n");
			
			
			System.out.print("Input Employee Name   - ");
			name1=Sc.next();
			
			System.out.print("Input Employee Salary - ");
			salary1=Sc.nextDouble();
			
			if(salary1<100000){
				System.out.print("\nYou did not have income tax");
				break;
			}else if(salary1<141667){
				bal=salary1-100000;
				it=bal*0.06;
			}else if(salary1<=183333){
				bal=salary1-141666;
				it=(bal*0.12)+2500;
			}else if(salary1<=225000){
				bal=salary1-183332;
				it=(bal*0.18)+7500;
			}else if(salary1<=266667){
				bal=salary1-224999;
				it=(bal*0.24)+15000;
			}else if(salary1<=308333){
				bal=salary1-266666;
				it=(bal*0.30)+25000;
			}else{
				bal=salary1-308332;
				it=(bal*0.36)+37500;
			}
			System.out.print("\nYou Have To Pay Income Tax Per Month = "+(int)it);
			break;
		
			case 2 :
			System.out.println("\n-----------------------------------------------------------------------------------");
			System.out.println("|                       Calculate Annual Bonus                                     |");
			System.out.println("-----------------------------------------------------------------------------------\n\n");
			
			System.out.print("Input Employee Name   - ");
			name1=Sc.next();
			
			System.out.print("Input Employee Salary - ");
			salary1=Sc.nextDouble();
			
			if(salary1<100000){
				it=5000;
				break;
			}else if(salary1>100000 && salary1<=199999){
				it=salary1*0.10;
			}else if(salary1>=200000 && salary1<=299999){
				it=salary1*0.15;
			}else if(salary1>=300000 && salary1<=399999){
				it=salary1*0.20;
			}else{
				it=salary1*0.35;
			}
			System.out.print("\nAnnual Bonus = "+it);
			break;
			
			case 3 :
			System.out.println("\n-----------------------------------------------------------------------------------");
			System.out.println("|                       Calculate Loan Amount                                   |");
			System.out.println("-----------------------------------------------------------------------------------\n\n");
			
			System.out.print("Input Employee Name   - ");
			name1=Sc.next();
			
			System.out.print("Input Employee Salary - ");
			salary1=Sc.nextDouble();
			
			System.out.print("Enter The Number Of Years - ");
			int years=Sc.nextInt();
			
			double r=0.15;
			double la=0;
			double y=0;
			
			if(salary1<50000 || years>5){
				System.out.print("\tYOU CAN NOT GET A LOAN BECOUSE YOUR SALARY LESSTHAN RS.5000....! ");
				break;
			}else{
				int n=years*12;
				salary1*=0.60;
				y=Math.pow((1+(r/12)),n);
				la=((salary1*(1-(1/y)))/(r/12))/1000;
			}
				System.out.print("You Can Get Loan Amount IS : "+(int)la*1000);
		} 

	}
}
