import java.util.Scanner;

public class BankAccount
{
     private int id;
     private int amount=0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int deposit(int x)
    {
          amount=amount+x;
          return amount;
    }
    public int withdraw(int x)
    {
          if(x>amount)
               System.out.println("insufficent amount");
          else 
               amount=amount-x;
          return amount;
    }
    public void transfer(BankAccount account,int a)
    {
          this.withdraw(a);
          account.deposit(a);
          System.out.println("transfer is succssesfull");
    }
    public void show()
    {
         System.out.println("BankAccount [id=" + id + ", amount=" + amount + "]");
    }



    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int choice;
        int i=0;
        int id;
        int id1;
        int amount;
        boolean state=true;
        boolean accountFound=false;
        boolean accountFound1=false;
        BankAccount [] accounts=new BankAccount[100];
        while(state)
        {
             System.out.println("1. create account   2.deposit     3.withdraw      4.showAmount     5.transfer");
             choice=in.nextInt();
             switch(choice)
             {
                  case 1: accounts[i]=new BankAccount();
                  System.out.println("enter the id ");
                  accounts[i].setId(in.nextInt());
                  System.out.println("account created..");
                  i++;
                  break;
                  
                  case 2:
                  accountFound=false;
                  System.out.println("enter the account you want to deposit to ");
                  id=in.nextInt();

                  for(int j=0;j<accounts.length;j++)
                    {
                       if(accounts[j] != null && id==accounts[j].getId())
                         {
                            System.out.println("enter the amount you want to deposit");
                            accounts[j].deposit(in.nextInt());
                            System.out.println("deposited..");
                            accountFound=true;
                         }
                    }
                              if(accountFound==false)
                              System.out.println("account is not found..");
                    break;
                    case 3:
                    accountFound=false;
                     System.out.println("enter the account you want to withdraw to ");
                    id=in.nextInt();
                    for(int j=0;j<accounts.length;j++)
                    {
                         if(accounts[j] != null &&id==accounts[j].getId())
                         {
                              System.out.println("enter the amount you want to withdraw");
                         accounts[j].withdraw(in.nextInt());
                         System.out.println("withdrawed..");
                         accountFound=true;
                    }
                    }
                         if(accountFound==false)
                         System.out.println("account is not found..");
               break;
               case 4: 
               accountFound=false;
               System.out.println("enter the account you want to check its balance ");
               id=in.nextInt();
               for(int j=0;j<accounts.length;j++)
               {
                    if(accounts[j] != null &&id==accounts[j].getId())
                    {
                         accounts[j].show();
                         accountFound=true;
                    }
               }
                    if(accountFound==false)
                    System.out.println("account is not found..");
                    
               break; 
               case 5: 
                    BankAccount current=null;
                    BankAccount target=null;
                    System.out.println("enter the account you want to transfer from : ");
                    id=in.nextInt();
                    for(int j=0;j<accounts.length;j++)
                    {
                         if(accounts[j] != null &&id==accounts[j].getId())
                         {
                              accountFound=true;
                              current=accounts[j];
                         }
                    }
                    if(accountFound==false){
                         System.out.println("account is not found..");
                         break;}
                    System.out.println("enter the account you want to transfer to");
                    id=in.nextInt();
                    for(int j=0;j<accounts.length;j++)
                    {
                         if(accounts[j] != null &&id==accounts[j].getId())
                         {
                              accountFound1=true;
                              target=accounts[j];
                         }
                    }
                    if(accountFound1==false){
                         System.out.println("account is not found..");
                         break;}
                    System.out.println("enter the amount you want to transfer : ");
                    amount=in.nextInt();
                    current.transfer(target, amount);
                    break;



          }
          
     }
    }

}