// Vanilla 
abstract class Account{
    void withDraw(){

    }
    void deposit(){

    }

}
class SavingAccount extends Account{
    void limit(){

    }
}
class CurrentAccount extends Account{
    void odLimit(){

    }
}
public class Liskov {

    // Upcasting - Child Cast to Parent
    static void callAccount(Account account){
        account.deposit();
        account.withDraw();
        if(account instanceof SavingAccount){
        ((SavingAccount)account).limit();
        }
        else if(account instanceof CurrentAccount){
            ((CurrentAccount)account).odLimit();
        }
    }
    public static void main(String[] args) {
       // callAccount(new Account());
        callAccount(new CurrentAccount());
        callAccount(new SavingAccount());
        // CurrentAccount ca = new CurrentAccount();
        // ca.withDraw();
        // ca.deposit();
        // ca.odLimit();
        // SavingAccount sa = new SavingAccount();
        // sa.withDraw();
        // sa.deposit();
        // sa.limit();
    }
}
