package javacore.builders.domain;

public class Rectangle {
    private double width;
    private double height;
    private double area;

    public Rectangle(){
        this.width = getWidth();
        this.height = getHeight();
        this.area = getArea();
    }

    public void calculateArea(){
        this.area = this.width * this.height;
    }

    public void showData(){
        System.out.println();
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
