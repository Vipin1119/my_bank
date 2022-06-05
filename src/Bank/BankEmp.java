package Bank;

public class BankEmp {

    private String name;
    private int pass;

   BankEmp(String name ,int pass)
   {
       this.name=name;
       this.pass=pass;

   }
   public int authenticate(String name,int pass )
   {
       if (!(this.name==name) && this.pass==pass) // need to check how we will comapre strings
           return 1;
       else return 0;

   }


}
