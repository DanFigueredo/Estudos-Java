package javacore.builders.domain;

public class Rectangle {
    private double width;
    private double height;
    private double area;

    public Rectangle(){
      
    }

    public void calculateArea(){
        this.area = this.width * this.height;
    }

    public void showData(){
        System.out.println("Width: "+ this.width);
        System.out.println("Height: "+this.height);
        System.out.println("Area: "+ this.area);
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
