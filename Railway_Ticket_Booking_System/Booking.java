import java.util.*;

public class Booking {
    static List<Ticket> tickets = new ArrayList<>();
    static List<Ticket> RACtic = new ArrayList<>();
    static List<Ticket> waittic = new ArrayList<>();

    static int ticket_counter = 1;

    static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            System.out.println("------------------------- Railway Ticket Booking System -------------------------");
            System.out.println("1 . Booking the ticket");
            System.out.println("2 . cancelling the ticket");
            System.out.println("3 . View Available Tickets");
            System.out.println("4 . View Conformed Tickets");
            System.out.println("5 . View RAC Ticket");
            System.out.println("6 . View Waiting List Ticket");
            System.out.println("7 . Exit");
            System.out.println("Enter your Choice : ");
            int choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    if(isAvail()){
                        book();
                        System.out.println();
                    }
                    else{
                        System.out.println(" Sorry , Ticket not Availabe . . . .");
                    }
                    break;
                case 2:
                    cancel();
                    System.out.println();
                    break;
                case 3:
                    availTic();
                    System.out.println();
                    break;
                case 4:
                    view();
                    System.out.println();
                    break;
                case 5:
                    //viewRAC();
                    break;
                case 6:
                    //viewwait();
                    break;
                case 7:
                    System.out.println("Exiting  . . . . .");
                    return;
                default:
                    System.out.println("Invalid Input . . .  . . . . . . . .");
            }
        }
    }
    
    public static void view(){
        for(Ticket i:tickets){
            System.out.println("Ticket ID : ");
        }
    }
    public static void availTic(){
        System.out.println("Available Tickets are : ");
        System.out.println("Tickets in Berth out of 3 : "+tickets.size());
        System.out.println("TIckets in RAC out of 1 : "+RACtic.size());
        System.out.println("Tickets in Waiting List : "+waittic);
    }
    public static void cancel(){
        System.out.println("Enter the Ticket Id : ");
        String str = s.nextLine();
        for(Ticket i : tickets){
            if(i.Ticket_id.equals(str)){
                tickets.remove(i);
                System.out.println("Your ticket has Canceled . . . ");
                return;
            }
        }
        for(Ticket i:RACtic){
            if(i.Ticket_id.equals(str)){
                RACtic.remove(i);
                System.out.println("Your ticket has Canceled from the RAC  . . . .");
                return;
            }
        }
        for(Ticket i:waittic){
            if(i.Ticket_id.equals(str)){
                waittic.remove(i);
                System.out.println("Your ticket has Canceled from the Waiting list . . . .");
                return;
            }
        }
        System.out.println("Invalid Ticket ID , Try again . . . . ");
    }

    public static boolean isAvail(){
        if(tickets.size() < 3 || RACtic.size() < 1 || waittic.size() < 5){
            return true;
        }
        return false;
    }
    public static Ticket getTick(){
        String ticId = "T"+ticket_counter++;
        System.out.println("Enter the Name : ");
        String name = s.nextLine();
        System.out.println("Enter the Age : ");
        int age = s.nextInt();
        s.nextLine();
        System.out.println("Enter the gender (Male / Female) : ");
        String gender = s.nextLine();
        System.out.println("Enter the berth you like (U/M/L) : ");
        char berth = s.next().toUpperCase().charAt(0);
        Ticket tic = new Ticket(ticId, name, age, gender, berth);
        return tic;

    }
    public static void book(){
        if(tickets.size() < 3){
            tickets.add(getTick());
            System.out.println("Ticket Conformed . . . . . .");
        }
        else if(RACtic.size() < 1){
            RACtic.add(getTick());
            System.out.println("Ticket Conformed on RAC . . . . ");
        }
        else if(waittic.size() < 5){
            waittic.add(getTick());
            System.out.println("Ticket Conformed on Waiting List . . . . ");
        }
    }

}
