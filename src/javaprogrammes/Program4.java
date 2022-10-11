package javaprogrammes;

/*          4.1 Declare two instance and two static variables.
            4.2 Declare one instance method.
            4.3 Declare one static method.
            4.4 Call all four instance and static variables into both instance and static methods inside the
                print statement.
            4.5 Declare the Main method.
            4.6 Call both instance and static methods into the Main method and run the programme.
*/

public class Program4 {

    int a = 10;
    int b = 20;
    static String car ="Ford";
    static String bike = "Honda";

    public static void main (String[] args) {
        Program4 obj = new Program4();
        obj.king();
        cobra();

    }

    public void king(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(car + " " + bike);
    }

    public static void cobra(){
        Program4 program4 = new Program4();
        System.out.println(car + " " + bike);
        System.out.println(program4.b);
        System.out.println(program4.a);
    }
}
