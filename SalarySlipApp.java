import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

class SalarySlipApp{
    static ResourceBundle rb;
    static Locale locale;
    static void loadBundle(){
        rb = ResourceBundle.getBundle("message",locale);
    }
    static String formatDate(){
        Date date = new Date();
        System.out.println(date);
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        return df.format(date);
        //return null;
    }
    // value 9000.00 (double)
    // formatted Value $9,000.00 (String)
    static String formatCurrency(double value){
       // NumberFormat nf  = new NumberFormat();
       NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
       return nf.format(value);
    }

    static void input(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Press 1 for english");
        System.out.println(" हिंदी के लिए 2 दबाएँ");
        System.out.println("Appuyez sur 3 pour le français");
        
        int choice = scanner.nextInt();
        if(choice == 1){
            locale = new Locale("en","US");
        }
        else if (choice == 2){
            locale = new Locale("hi","IN");
        }
        else if(choice == 3){
            locale = new Locale("fr","FR");
        }
        loadBundle();
        System.out.println(rb.getString("id.msg"));
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println(rb.getString("name.msg"));
        String name = scanner.nextLine();
        System.out.println(rb.getString("salary.msg"));
        double basicSalary = scanner.nextDouble();
        compute(id, name,basicSalary);
        scanner.close();
    } 
    // rAm KuMaR sHarmA
    // Ram Kumar Sharma
    static String properCase(String name){
            // 1. Segerate name with spaces
            // 2.pick the first name , pick the first char
            // 3. make first char as uppercase
            // 4. and remaining chars as lowercase
            // 5. and store the first name result somewhere
            String names[] = name.split(" ");
            String fullName = "";
            for(int i = 0; i<names.length; i++){
                String n = names[i];
                char firstLetter = n.charAt(0);
                String firstCapLetter = String.valueOf(firstLetter).toUpperCase();
                String remString = n.substring(1);
                String n2= firstCapLetter+ remString.toLowerCase();
                fullName+=n2+" ";
            }
            return fullName;

    }
   static void compute(int id, String name, double basicSalary){
        double hra = basicSalary * 0.50;
        double ta = basicSalary * 0.40;
        double da = basicSalary * 0.20;
        double ma = basicSalary * 0.25;
        double pf = basicSalary * 0.05;
        double gs = basicSalary + hra + ta + da + ma;
        double ns = gs - pf;
        print(id, name, basicSalary,hra, da, ta, ma, pf , gs, ns);
    }

    static void print(int id , String name , double basicSalary, 
    double hra, double da, double ta, double ma,
     double pf, double gs, double ns){
        System.out.println("Today "+formatDate());
        //formatDate();
        System.out.println("Id "+id);
        System.out.println("Name "+properCase(name));
        System.out.println("Basic Salary "+formatCurrency(basicSalary));
        System.out.println("Earning Allowances \t\t Deducation Allowances ");
        System.out.println("HRA "+formatCurrency(hra)+ " \t\t\t PF "+formatCurrency(pf));
        System.out.println("DA "+formatCurrency(da));
        System.out.println("TA "+formatCurrency(ta));
        System.out.println("MA "+formatCurrency(ma));
       // System.out.println("PF "+pf);
        System.out.println("GS "+formatCurrency(gs));
        System.out.println("NS "+formatCurrency(ns));
    }

    public static void main(String[] args) {
        input();
        // SalarySlipApp obj = new SalarySlipApp();
        // obj.input();
        // Input
        
        // Allowances
        
        // print
       

    }
}