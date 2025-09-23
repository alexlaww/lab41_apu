public class Fan {
    int speed;
    boolean on;
    double radius;
    String color;

    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed(){
        return this.speed;
    }

    public boolean getOn(){
        return this.on;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        String stat = "Off";
        String stat2;
        if (this.on) {
            stat = "On";
        }

        stat2 = switch (this.speed) {
            case 1 -> "Slow";
            case 2 -> "Medium";
            case 3 -> "Fast";
            default -> "Spinning";
        };

        return  String.format("The speed of this fan is %s. Its radius is %s units. It is %s and %s.", stat2, this.radius, this.color, stat);
    }
}
