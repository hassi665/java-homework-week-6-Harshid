package javaprogrammes;

/*      3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the
            print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program3 {
    double x = 55.67;
    static int y = 77;
    public static void main(String[] args) {
        Program3 program3 = new Program3();
        program3.myCity();
        myPlace();
    }

    public void myCity(){

        System.out.println(x);
        System.out.println(y);

    }

    public static void myPlace(){
        Program3 obj = new Program3();
        System.out.println(y);
        System.out.println(obj.x);

    }
}
