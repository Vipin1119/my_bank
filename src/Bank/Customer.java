package Bank;

public class Customer {
    // properties

    private String userId;
    private int pass;
    private Float bal;

    // fn
    Customer(String UserId,int pass,float bal)
    {
        this.userId=UserId;
        this.pass=pass;
        this.bal=bal;

    }

    public void widthdraw(float amt)
    {
        this.bal=this.bal-amt;
        System.out.println("Your withdrawl is successful");
        System.out.println("Your updated balance is  "+this.bal);
    }
    public void Deposit(float amt)
    {
        this.bal=this.bal+amt;
        System.out.println("Your Deposit is successful");
        System.out.println("Your updated balance is  "+this.bal);
    }

    public int authenticate(String name,int pass )
    {
        if (!(this.userId==name) && this.pass==pass) // need to check how we will comapre strings
            return 1;
        else return 0;

    }

    public String getUserId() {
        return userId;
    }

    public Float getBal() {
        return bal;
    }

    public int getPass() {
        return pass;
    }
    //abstract private void setp(String ID);
    //getters()
    //setters()
    //add
    //del
    //deposit
    //withdraw
    //login Authenticate
    //bank official
    //customer

}
