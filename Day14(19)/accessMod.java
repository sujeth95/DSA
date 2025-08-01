public class accessMod {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
    myAcc.username = "SujeetOraon";
    myAcc.setPassword("suerhdfsa");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}