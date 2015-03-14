package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/12/15.
 */
public class Methods {
    public static int getNumber() {
        System.out.println("1");
        return 3;

        //void speak(){
        //System.out.println("hello");//
    }

    /*public static void main(String[] args){
        System.out.println(getNumber());
    }

    /*public static void shoutOut(String name){
        System.out.println("Hey, " + name );  /*" , you are" + age + "-years old.
        speak();*/
    /*public static void main(String[] args){
        speak(); //if you do it twice, you will get "hello" twice//
        String n = "Von Neumann";
        shoutOut(n);
        shoutOut("Grace Hopper");
        */

    /*public static int sum() {
        int result = 0;
        for (int i = 0; i < 10; i++){
            result++;
            System.out.println(i);
        }
        return result;
    }
    public static void main(String[] args){
        int result = sum();
        System.out.println(result);
    }*/

    public static int add(int a, int b, int c){
        int result = a + b + c ;
        return result;
    }
    public static double average(int a, int b, int c){
        double result= (a + b + c )/ 3;
        return result;
    }
    public static void main (String[] args){
        System.out.println(add(5,8,9));
        System.out.println(average(8,2,5));
    }



}
