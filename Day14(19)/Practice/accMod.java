public class accMod {

    public static void main(String[] args) {
        BankAcc myAcc = new BankAcc();
        myAcc.username = "Sujeet";
        myAcc.setPassword("acb");
    }
}

class BankAcc {
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}