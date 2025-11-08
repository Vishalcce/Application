import java.util.*;

class Taxi{

    int id;
    
    char cur_point = 'A';

    int tot_earning = 0;

    List<Booking> booking = new ArrayList<>();


    public Taxi(int id){
        this.id = id;
    }

    public boolean isAvailable(int req_time){
        if(booking.isEmpty()) return true;
        Booking lastBook = booking.get(booking.size()-1);
        return lastBook.drop_time <= req_time;
    }

    public int Cal_Earning(char from,char to){
        int dist = Math.abs(to - from) * 15;
        return 100 + (dist - 5) *10;
    }
    
    public void add_booking(Booking booking){
        this.booking.add(booking);
        this.cur_point = booking.drop;
        this.tot_earning = booking.amount;
    }

}