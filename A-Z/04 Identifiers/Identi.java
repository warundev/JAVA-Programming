/*--All Java variables must have distinctive names to identify them.

We refer to these special names as identifiers.

Short names (like x and y) or longer names (like age, sum, or totalVolume) can be used as identifiers.

Note:  It is recommended to use descriptive names in order to create understandable and maintainable code: */

public class Identi {
    public static void main(String[] args) {
        // Good
        int minutesPerHour = 60;
    
        // OK, but not so easy to understand what m actually is
        int m = 60;
        
        System.out.println(minutesPerHour);
        System.out.println(m);
      }
}



//The general rules for naming variables are:

/*
 * Names can contain letters, digits, underscores, and dollar signs.
 * Names must begin with a letter.
 * Names should start with a lowercase letter and it cannot contain whitespace.
 * Names can also begin with $ and _  .
 * Names are case sensitive ("myVar" and "myvar" are different variables).
 * Reserved words (like Java keywords, such as int or boolean) cannot be used as names.
 */