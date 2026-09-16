public class BuggyProgram{
    public static void main (String [] args){
        //Calling method 1 
        method1();

        // Calling method 2 
        method2();

        //Calling method 3
        method3();

        //Calling method 4
        //method4();
    }

    public static void method1(){
        String hobby = "gardening";
        System.out.println(hobby);
    }

    public static void method2(){
        System.out.println("Hi there");
    }

    public static void method3(){
        double thisIsADouble = 5.0;
        System.out.println(thisIsADouble);
    }

    /* public static void method4(){
        int numSubject = 6;
        System.out.println(numSubjects);
    } */ 
}