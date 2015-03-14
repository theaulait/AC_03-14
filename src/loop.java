/**
 * Created by c4q-vanice on 3/14/15.
 */
public class loop {
    public static void main(String[] args){
        int i=3;
        int k=0;
        String str = "c4q"; //variable of example #2 of calling strings
       // System.out.println(i);

        for (i = 0; i < 10; i++){
            int j=3;
         //   System.out.println(i); //testing loops and it's order of execution.
         //   System.out.println(j);
         //   System.out.println(weLoveJava("c4q")); //example #1 of calling string method
         //   System.out.println(weLoveJava(str)); //example #2 of calling string method w/variable defined.
              weLoveJava(str); //example #3 of calling a string method w/o return value.
        }
        i = 200;
        System.out.println(i);

        while(terminate(i)){
            i++;
            System.out.println(i);

        }
    }

    public static boolean terminate(int a) {
        if (a < 10) {
            return true;}
        else
        {
            return false;}
        }

    public static String weLoveJava(String myStr){
        System.out.println(myStr);
        return "c4q is SUPER awesome!";
    }
    }

