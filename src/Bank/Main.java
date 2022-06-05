package Bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
//Variables Declarations

        Customer[] cust = new Customer[10];  //customer data  to be stored in the array
        BankEmp [] emp=new BankEmp[2];//here only the space ias allocated to emp array variable , which will be enough to hold 5 cust
        int i=0 , CountCust=0,choice1=0,Epass=0;
        String Ename;
        Scanner sc = new Scanner(System.in);
        int flag=-1;
        int recCount=0;

        //hiring emp
//        for (i=0;i<2;i++)
//        {

             emp[0]=new BankEmp("Vipin",123);
             emp[1]=new BankEmp("Mannu",456);//we can make constructor and pass the values here itself here



//        }


        choice1=greet();


////        do {
//            System.out.println("Menu");
//            System.out.println("Hi everyone ");
//            System.out.println("Press 1. Employee");
//            System.out.println("Press 2. Existing Customer");
//            System.out.println("Press 3. New Customer");
//            System.out.println("Press 0. New Customer");
//
//            choice1=sc.nextInt();
////        }while(choice1!=0);

        switch(choice1)
        {
            case 1:
                System.out.println("Welcome Our Employee");
                System.out.println("pls enter userID");
                Ename=sc.next();
                System.out.println("pls enter pass");
                Epass=sc.nextInt();
                flag=authBank(emp,Ename,Epass);
                if(flag==1) Emp_action(cust,recCount);
//                else
                //action();
                break;
            case 2:
                System.out.println("Welcome Our Customer");
                System.out.println("pls enter userID");
                Ename=sc.next();
                System.out.println("pls enter pass");
                Epass=sc.nextInt();
//                flag=authCust(cust,Ename,Epass);
//                if (flag==1)
                    Cust_action(cust,Ename,Epass);
//                flag=auth()
                  //action()
                break;
            case 3:
                break;
            case 4:
                break;
        }

        //menu
        // employee or existing customer, new customer
        //employee :login:  add details , remove details
        //login : we will take id nd pass i/p but in what we will take them (let in string and int as req )
        // then how we will search them in our records
        //for now we can create array or linklist of the obj to store .
        //if array then we will create and array in the begging it self , whereas linklist we can create a node
        //
    }

     public static int greet()
     {
         Scanner sc2=new Scanner(System.in);
         int choice1;



         System.out.println("Menu");
         System.out.println("Hi everyone ");
         System.out.println("Press 1. Employee");
         System.out.println("Press 2. Existing Customer");
//         System.out.println("Press 3. New Customer");
         System.out.println("Press 0. Exit");

         //int m =Empaction();
         choice1=sc2.nextInt();
         return choice1;
     }

    public static int authBank(BankEmp arr[],String name,int pass)
    {   int i,size;
        size=arr.length;
//        int f=0;
        for (i=0;i<2;i++) {
            if (arr[i].authenticate(name, pass) == 1)
           {     //f=1;
                System.out.println("Welcome " + name);
            return 1;

            }
        }

          System.out.println("wrong Credentials");
            return 0;
//        }
    }
//    public static int authCust(Customer arr[],String name,int pass)
//    {   int i;
//        for (i=0;i<10;i++) {
//            if (arr[i].authenticate(name, pass) == 1)
//            {     //f=1;
//                System.out.println("Welcome " + name);
//                return 1;
//
//            }
//        }
//
//        System.out.println("wrong Credentials");
//        return 0;
////        }
//    }
     public static void Emp_action(Customer cust[],int recCount) {
        int choice=0; Scanner sc = new Scanner(System.in);
        String Userid; int Pass;
        float bal;   int i;
        String user;//del
        int pwd;//del
        int j;


        do {
             System.out.println("Menu");
             System.out.println("Hi Employee ");
             System.out.println("Press 1. Add Record");
             System.out.println("Press 2. Delete Record");
             System.out.println("Press 0. Exit");
             choice= sc.nextInt();

             switch (choice)
             {
                 case 1://cust;
                     if(recCount>=10)
                         System.out.println("Our Bank is Full");
                     else {
                         System.out.println("You name please");
                         Userid = sc.next();
                         System.out.println("Please set Your passward");
                         Pass = sc.nextInt();
                         System.out.println("Enter Amount you want to deposit");
                         bal = sc.nextFloat();
                         for (j = 0; j < 10; j++) {
                             if (cust[j] == null)
                             {
                                 cust[j] = new Customer(Userid, Pass, bal);
                                 System.out.println("Record is added");
                             }
                         }
                         cust[recCount] = new Customer(Userid, Pass, bal);
                         recCount = recCount + 1;
                     }
                     break;

                 case 2://cust;if(recCount<=0)sout("Our Bank is Full")
                     if(recCount<=0) System.out.println("Our Bank is Full");
                     System.out.println("Your name please ");
                     user= sc.next();
                     System.out.println("Your pass pls ");
                      pwd= sc.nextInt();
                     for(i=0;i<recCount;i++)
                     {
                         if( !(cust[i].getUserId()==user) && cust[i].getPass()==pwd )
                         {
                             cust[i]=null;
                             System.out.println(user+" record is deleted");
                         }
                         else System.out.println("no such record found");

                     }
                     recCount=recCount-1;
                     break;
                 default:
                     break;

             }
         }while (choice!=0);


     }


    public static void Cust_action(Customer arr [],String name,int pass)
    {   int choice;
        int i;
        float amt;
        Scanner sc=new Scanner(System.in);

        for (i=0;i<10;i++) {
            if (arr[i].authenticate(name, pass) == 1)
            {     //f=1;
                System.out.println("Welcome " + name);

            }
        }



        do {
            System.out.println("Menu");
            System.out.println("Hi  "+ name);
            System.out.println("Press 1. Deposit");
            System.out.println("Press 2. Withdraw");
            System.out.println("Press 0. Exit");
            choice= sc.nextInt();


            switch (choice)
            {
                case 1:
                    System.out.println("Enter Amount");
                    amt=sc.nextFloat();
                    arr[i].Deposit(amt);
                    break;
                case 2:System.out.println("Enter Amount");
                    amt=sc.nextFloat();
                    arr[i].widthdraw(amt);
                    break;
                default:
                    break;
            }



    }while (choice!=0);

    }
}