public class HelloWorld3 {
    public static void main(String[] args) {
        String myname= "C3P0";
        String friendname= "R2D2";

        printGreeting();
        printIntro(myname);
        printfriendques(friendname);
        printresponse(friendname);
        printFarewell();
    }
    public static void printGreeting(){
        System.out.println("Hello! Welcome to Star Wars");
    }
    public static void printIntro(String myname){
        System.out.println("I am " + myname + " a protocol droid");
    }
    public static void printfriendques(String friendname){
        System.out.println("Now where is " + friendname + "?");
    }
    public static void printresponse(String friendname){
        System.out.println(friendname + " is a astromech droid");
    }
    public static void printFarewell(){
        System.out.println("May the force be with you");
    }
}
