import java.util.Scanner;

//create ATMExample class to implement the ATM functionality  
public class ATMExample {
    // main method starts
    public static void main(String args[] )  
    {  
        //declare and initialize balance, withdraw, and deposit  
        int balance = 100000, withdraw, deposit,transfer,i=-1,j=-1,k; 
        int[] depo=new int[100];
        int[] wtdr=new int[100];
          
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine"); 
            System.out.println("Choose 1 for Transcation history");   
            System.out.println("Choose 2 for Withdraw");  
            System.out.println("Choose 3 for Deposit");  
            System.out.println("Choose 4 for Trasfer");  
            System.out.println("Choose 5 for Quit");  
            System.out.print("Choose the operation you want to perform:");  
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:
                  if(i>=0 || j>=0){
                       for(k=0;k<=j;k++)
                       {
                        System.out.println("deposited amount is"+depo[k]);
                       }  
                       for(k=0;k<=i;k++) 
                       {
                        System.out.println("withdrawn amount is"+wtdr[k]);
                       }
                      }
                    else
                    {
                        System.out.println("no deposit or withdraw happened");
                    }
                    System.out.println("");  
                    break;
                case 2:  
        System.out.print("Enter money to be withdrawn:");  
                      
        //get the withdrawl money from user  
        withdraw = sc.nextInt();  
                      
        //check whether the balance is greater than or equal to the withdrawal amount  
        if(balance >= withdraw)  
        {  
            //remove the withdrawl amount from the total balance  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");
            i++;
            wtdr[i]=withdraw;
        }  
        else  
        {  
            //show custom error message   
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 3:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        //get deposite amount from te user  
        deposit = sc.nextInt();  
                      
        //add the deposit amount to the total balanace 
        j++;
        depo[j]=deposit;
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 4:  
        //enter the money to be trasfered
                    System.out.println("enter the amount to be transfered");
        transfer=sc.nextInt();
                    
        if(balance >= transfer)  
        {  
            //remove the withdrawl amount from the total balance  
            balance = balance - transfer;  
            System.out.println("your money has been trasfered"); 
            i++;
            wtdr[i]=transfer;
        }  
        else  
        {  
            //show custom error message   
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 5:  
        //exit from the menu  
        System.exit(0);  
            }  
        }  
    }
}
