public class StringDemo {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder();
        // StringBuffer sb = new StringBuffer(); // 16 
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        synchronized(sb){
        sb.append("hi");
        }
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("gdshkjgdhfkjgdfjhdfjkghdfjkhgjdfhgkjfdhgjkhdkhgfd");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.ensureCapacity(100);



    }
}
