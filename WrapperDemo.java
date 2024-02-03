import java.math.BigInteger;
import java.util.LinkedList;

public class WrapperDemo {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("543543535345345435345345345435435345");
        BigInteger b2 = new BigInteger("534333677788888888888");
        BigInteger b3 = b.add(b2);
        System.out.println(b3);
        int x = 10;
        Integer y = 20;
        LinkedList<Integer> l = new LinkedList<>();
        int y2 = 20;
        l.add(x); // AutoBoxing
       // l.add(new Integer(x)); // Manual Boxing
        l.add(y2);
        l.add(30);
    }
}
