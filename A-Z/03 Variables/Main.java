/*---There are different types of variables, for example:--- */

//String ---> stores text, such as "Hello". String values are surrounded by double quotes
//int    ---> stores integers (whole numbers), without decimals, such as 123 or -123
//float  ---> stores floating point numbers, with decimals, such as 19.99 or -19.99
//char   ---> stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//boolean --> stores values with two states: true or false


/*---Declaring (Creating) Variables--- */

public class Main {
    public static void main(String [] args){
        String name = "GitHub";    //Create a variable called name of type String and assign it the value "GitHub".
        int age = 35;             //Create a variable called age of type int and assign it the value 35.
        float weight = 65.5f;    //Create a variable called weight of type float and assign it the value 65.5.
        char gender = 'M';      //Create a variable called gender of type char and assign it the value 'M'.
        boolean status = true; //Create a variable called status of type boolean and assign it the value true.

        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(gender);
        System.out.println(status);
    }
}
