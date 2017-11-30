import java.util.Scanner;
public class MonthTester{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of your month: ");
        if(in.hasNextInt()){
            int monthLength = in.nextInt();
            Month month = new Month(monthLength);
            if(0 < monthLength && monthLength <= 12){
                System.out.println("That month is " + month.getLength() + " days long.");
            }else{
                System.out.println("That number is outside the range of the months.");
            }
        }else{
            System.out.println("That is not a valid integer.");
        }
    }
}
