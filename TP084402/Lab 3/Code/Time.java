import java.time.LocalTime;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(){
        LocalTime time = LocalTime.now();
        this.hour = time.getHour();
        this.minute = time.getMinute();
        this.second = time.getSecond();
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public String toString(){
        return String.format("%s:%s:%s", this.hour, this.minute, this.second);
    }
}
