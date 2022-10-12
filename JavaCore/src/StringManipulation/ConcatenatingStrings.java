package StringManipulation;

public class ConcatenatingStrings {
	public static void main(String args[]) {
        //example 1
        String myStr = "My cat's name is ".concat("Copycat");
        System.out.println(myStr);
        // output will be: My cat's name is Copycat

        //example 2
        String myStr2 = "Hello, " + "World" + "!" ;
        System.out.println(myStr2);
        // output will be: Hello, World!

        //example 2.5
        String myStr3 = "Hello,"+ "World" + "!"; // Be careful, don't forget to add spaces!
        System.out.println(myStr3);
        //output will be: Hello,World! because no spaces were included above

        //example 3
        String string1 = "Welcome ";
        String string2 = "to ";
        String string3 = "Java";
        String string4 = "!";
        System.out.println(string1 + string2 + string3 + string4);
        // output will be: Welcome to Java!
    }
}
