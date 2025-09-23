public class Rectangle {
    double width;
    double height;
    String color;

    public Rectangle(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public String getColor(){
        return this.color;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double findArea(){
        return this.height * this.width;
    }

    public double findPerimeter(){
        return (this.width * 2) + (this.height * 2);
    }
}
