public class SwitchCaseDemo {
    public static void main(String[] args) {

        String item = "burger";
        int amount = switch(item){
            case "burger","pizza"->{
                System.out.println("Pan Pizza");
                System.out.println("Veggie");
                yield 100;
            }
            case "drink"->200;
            default->0;
        };
        // String item = "burger";
        // int amount = switch(item){
        //     case "burger","pizza"->100;
        //     case "drink"->200;
        //     default->0;
        // };
       // break  - exit from the block
        // Java 7 (switch string allow)
        // Java 14 Arrow  (Lambda)
        // Colon  - Fall
        // Arrow  - Not Fall
        // String item = "burger";
        // switch(item){
        //     case "burger","pizza"->
        //     System.out.println("Price is Rs 100");
        //     case "drink"->
        //     System.out.println("Price is Rs 200");
        //     case "sweets"->
        //     System.out.println("Price is Rs 50");
        //     default->
        //     System.out.println("50% Off");
        // }

        // switch case (int , short, byte, long , char)

       /* 
       final int BURGER = 1;
       final int DRINK = 2;
       final int SWEETS = 3;
        int item = 1;
        switch(item){
            case BURGER:
            System.out.println("Price is Rs 200");
            case DRINK:
            System.out.println("Price is Rs 100");
            case SWEETS:
            System.out.println("Price is Rs 50");
            default:
            System.out.println("50% Off....");
        }
        */
    }
}
