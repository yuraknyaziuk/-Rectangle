package com.company;

public class Rectangle {

    private double x;
    private double y;



    public Rectangle(double x, double y){
        this.x = x;
        this.y = y;

    }
    public Rectangle(double x){
        this.x = x;
        this.y = x;

    }


    double calculateArea(){return x * y;}
    public void printArea(){
        System.out.println(calculateArea());
    }
    public void printRectangleKind(){
        if (x==y){
            System.out.println("Это квадрат");
        }
        else {
            System.out.println("Это прямоугольник");
        }
    }
    public boolean isTheSameRectangle(Rectangle rectangle ) {

        return  this.x == rectangle.x && this.y == rectangle.y;
    }
}
