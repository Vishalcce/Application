public class Booking {
    int booking_id;
    int amount;
    int customer_id;
    char pick_up;
    char drop;
    int pick_up_time;
    int drop_time;

    Booking(int booking_id,int customer_id,int amount,char pick_up,char drop,int pick_up_time,int drop_time){
        this.booking_id = booking_id;
        this.customer_id = customer_id;
        this.amount = amount;
        this.pick_up = pick_up;
        this.drop = drop;
        this.pick_up_time = pick_up_time;
        this.drop_time = drop_time;
    }

}
