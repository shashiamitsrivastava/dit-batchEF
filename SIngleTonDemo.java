class Email{
    static Email obj; // null
    private Email(){

    }

    // int show(){
    //     return 20;
    // }

    static Email getEmailInstance(){
        if(obj==null){
            obj = new Email();
        }
        return obj;
    }

}
public class SIngleTonDemo {
    public static void main(String[] args) {
        Email email1 = Email.getEmailInstance();
        Email email2 = Email.getEmailInstance();
        Email email3 = Email.getEmailInstance();
        System.out.println(email1 == email2 && email1 == email3);
        // Email email1 =new Email();
        // Email email2 =new Email();
        // Email email3 =new Email();
    }
}
