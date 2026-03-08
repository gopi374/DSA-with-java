import java.util.Scanner;
class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7:");
        int day = sc.nextInt();
        String dayName;

        switch (day) {
            case 0 -> System.out.println("0 is not contains any day");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            // // case 1:
            // //     dayName = "Monday";
            // //     break;
            // // case 2:
            // //     dayName = "Tuesday";
            // //     break;
            // // case 3:
            // //     dayName = "Wednesday";
            // //     break;
            // // case 4:
            // //     dayName = "Thursday";
            // //     break;
            // // case 5:
            // //     dayName = "Friday";
            // //     break;
            // // case 6:
            // //     dayName = "Saturday";
            // //     break;
            // // case 7:
            // //     dayName = "Sunday";
            //     break;
            // default:
            //     dayName = "Invalid input! Please enter a number between 1 and 7.";
        }

        // System.out.println(dayName);
    }    
}
