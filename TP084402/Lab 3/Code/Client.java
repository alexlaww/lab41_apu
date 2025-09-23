import java.util.ArrayList;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Time> times = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            System.out.println("Time created!");
            Time time = new Time();
            times.add(time);
            Thread.sleep(5000);
        }
        for (Time time : times){
            System.out.println(time.toString());
        }
    }
}
