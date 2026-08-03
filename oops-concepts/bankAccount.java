public class bankAccount {

    // Properties
    public String username;
    private String password;

    // Method
    public void setPassword(String pass) {
        password = pass;
    }

    public static void main(String[] args) {
        bankAccount myAcc = new bankAccount();
        myAcc.username = "Rajat";
        myAcc.password = "1233";

        System.out.println("Username: " + myAcc.username);
        System.out.println("pasword: " + myAcc.password);
    }
}