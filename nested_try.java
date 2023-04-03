//public class nested_try {
//    public static void main(String[] args) {
//        try{
//            try{
//                try{
//                    int arr[]={1,2,3,4};
//                    System.out.println(arr[10]);
//                }
//                catch(ArithmeticException e){
//                    System.out.println("Arithmetic exception ..");
//                    System.out.println("inner block 2...");
//                }
//            }
//            catch(ArithmeticException e){
//                System.out.println("Arithmetic Exception ....");
//                System.out.println("inner block 1..");
//            }
//        }
//        catch(ArrayIndexOutOfBoundsException e4){
//            System.out.println(e4);
//            System.out.println("out try body ...");
//        }
//        catch(Exception e5){
//            System.out.println(e5);
//            System.out.println("handled in try block ...");
//        }
//    }
//}
