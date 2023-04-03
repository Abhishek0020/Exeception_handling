import com.sun.javaws.IconUtil;

public class try_catch {
    public static void main(String[] args){
        int a=100,b=2,c;
        System.out.println("1");
        try{
//            //riskey code
            System.out.println("2");
            System.out.println("3");
            System.out.println(a/b);
//            int a=10,b=0;
//            int c=10/0;
//            System.out.println(c);
        }
        catch (Exception e){
////            //handle code
////            System.out.println(e);
            System.out.println("4");
            System.out.println("5");
            System.out.println(e);
        }
        System.out.println("hello");
    }
}
