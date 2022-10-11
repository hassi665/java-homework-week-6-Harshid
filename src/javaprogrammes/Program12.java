package javaprogrammes;

/*`
Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */
public class Program12 {
    double x = (25.5 * 3.5 - 3.5 * 3.5);
    double y = (40.5 - 4.5);
    double z = x/y;
    public static void main(String[] args) {
        calculation();
    }
    public static void calculation(){
        Program12 obj = new Program12();
        System.out.println(obj.z);
    }
}
