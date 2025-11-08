import java.util.*;

public class TaxiBooking {
    static List<Taxi> taxi = new ArrayList<>();
    int customer_Counter = 1;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number of Taxis : ");
        int tot_taxi = sc.nextInt();
        ini_taxi(tot_taxi);

        while(true){
            System.out.println("-------------------------------------- TAXI BOOKING SYSTEM ----------------------------------------");
            System.out.println("\n1.Book the Taxi \n 2.Display Taxi details \n3.Exit");
            System.out.println("Enter your Choice :");
            int Choice = sc.nextInt();
            switch (Choice) {
                case 1:
                    book_taxi();
                    break;
                case 2:
                    Display();
                    break;
                case 3:
                    System.out.println("Exiting . . . . . . . ");
                    return;
                default:
                    System.out.println("Invalid Choice , Try again...");
            }
        }
    }
    public static void ini_taxi(int tot){
        for(int i=1;i<=tot;i++){
            taxi.add(new Taxi(i));
        }
    }

    public void book_taxi(){
        customer_Counter++;
        System.out.println("Enter the Pick Up point : ");
        int pick_up = sc.nextInt();
        System.out.println("Enter the Drop point : ");
        int drop = sc.nextInt();
        System.out.println("Enter the pick_up time (in 24 hours format) :");
        int pick_up_time = sc.nextInt();
        
    }

}
