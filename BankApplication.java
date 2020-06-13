
import java.util.*;
import java.lang.String;
public class BankApplication {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("================================================================");
		System.out.println("		SIGN IN								");
		System.out.println("=================================================================");
		System.out.print("Name:");
		String a=in.nextLine();
		System.out.print("Id:");
		String b=in.nextLine();
		
      BankAccount JANATA =new BankAccount(a,b);
      JANATA.menu();
    		  
		

	}


 
}
class BankAccount
{
	
int balance;
int previousTransaction;
String customerName;
String customerId;
						BankAccount(String cname,String cid)
								{customerName=cname;
												customerId=cid;
															}

void deposit(int amount)
{
	if(amount!=0)
	{
		balance+=amount;
		previousTransaction=amount;
		
	}
}

void withdraw(int amount)
{
	if (balance==0)
	{System.out.println("You dont have enough money in your bank account");}
else if(balance!=0)
		{
			balance-=amount;
			previousTransaction=-amount;
		}
}

void getPreviousTransaction()
{
   if(previousTransaction>0)
   {
	   System.out.println("The PreviousTransaction you made="+previousTransaction);
   }
   else if(previousTransaction<0)
   {
	   System.out.println("The PreviousTransaction you made="+Math.abs(previousTransaction));
   }
   else 
   {System.out.println("You didnot made any transaction");}
}

												void menu()
													{		   char option='\0';
																Scanner in=new Scanner(System.in);
																System.out.println("===================================================");
																System.out.println("WELCOME "+customerName+" ***ID*** "+customerId);
																System.out.println("===================================================");
																System.out.println("\n");
																System.out.println("A ) Check Balance*********");
																System.out.println("B ) Deposit***************");
																System.out.println("C ) Withdraw**************");
																System.out.println("D ) Get LatestTransaction*");
																System.out.println("E ) Exit******************");
																System.out.println("***************************************************");
																System.out.println("***************************************************");
	
          	do {
        		System.out.print("Enter your choice:");
    			option=in.next().charAt(0);
          		switch(option)
          		{
          			case 'A':{
          				System.out.println("===================================================");
          				System.out.println("Balance:"+balance);
          				System.out.println("===================================================");
          				break;
          			}

          			case 'B':{
          				System.out.println("===================================================");
          				System.out.print("Enter the amount:");
          				int a=in.nextInt();
          				deposit(a);
          				System.out.println("You deposited amount "+a+" on your bank account");
          				System.out.println("===================================================");
          				break;
          			}
          			case 'C':{
          				System.out.println("===================================================");
          				System.out.print("Enter the amount:");
          				int a=in.nextInt();
          				withdraw(a);
          				if(balance>=a) {
          				System.out.println("You withdrawan amount "+a+" from your bank account");
          				System.out.println("===================================================");}
          				break;
          			}
          			case 'D':{
          				System.out.println("===================================================");
          				getPreviousTransaction();          			
          				System.out.println("===================================================");
          				break;
          			}
          			case 'E':{
          				System.out.println("Thank you for using our service");
          				break;
          			}
          			default:{System.out.println("PLEASE CHOOSE THE CORRECT ALBHABET");}
          				
          			
          		}}while(option!='E');
          	
          		
          	
          	}		
			
		}
		




