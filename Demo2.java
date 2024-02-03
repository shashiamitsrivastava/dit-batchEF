public class Demo2 {
    public static void main(String[] args) {
        String q = "amit";
        q = "ram";
        // StringBuffer , StringBuilder
        String sql = "select * from products";
        sql += " where price >10000";
        sql +=" and rating>4";
        String x = "amit"; // 1 or 0 
        String y = "amit";
        String z = new String("amit");
        System.out.println(x==y);
        System.out.println(x==z);
        //10.equals(20); // Error
        System.out.println(x.equals(z));


    }
}
