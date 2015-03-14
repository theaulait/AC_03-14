/**
 * Created by c4q-vanice on 3/14/15.
 */
public class ifelse {
    public static void main(String[] args) {
        int age = 100;
/*
        if (age > 67){
            System.out.println("You are a little too old to get drunk");
        // int age = 68;
        //  if (age > 21{

        // System.out.println("Let's get Krunked!")} example #1 of wrong seq where it fit the 1st criteria and would not continue to the next statement because it is an else if.

        }
        else if (age >= 21){
            System.out.println("Let's get Krunked!");
        }
        else{
            System.out.println("You should drink apple juice");
        }
    }
}
*/
        if (age == 15 || age >= 21){ //short circuit evaluation example int = 15;
            System.out.println("Let's get Krunked!");
        }
        else if (age > 67){
            System.out.println("You are a little too old to get drunk");
        }
        else {
            System.out.println("You should drink apple juice");
        }
    }
}