import java.util.Scanner;

class SalarySlipApp{

    static void input(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Id");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter the Name");
        String name = scanner.nextLine();
        System.out.println("Enter the Basic Salary");
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
        System.out.println("Id "+id);
        System.out.println("Name "+properCase(name));
        System.out.println("Basic Salary "+basicSalary);
        System.out.println("Earning Allowances \t\t Deducation Allowances ");
        System.out.println("HRA "+hra+ " \t\t\t PF "+pf);
        System.out.println("DA "+da);
        System.out.println("TA "+ta);
        System.out.println("MA "+ma);
       // System.out.println("PF "+pf);
        System.out.println("GS "+gs);
        System.out.println("NS "+ns);
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