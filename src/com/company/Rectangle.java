package com.company;

public class Rectangle {

    private double x;
    private double y;
private static int createdRectangles;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";




    public Rectangle(double x, double y){
        this.x = x;
        this.y = y;
        createdRectangles++;
    }
    public Rectangle(double x){
        this.x = x;
        this.y = x;
        createdRectangles++;
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
    public static void printRectanglesCount(){
        System.out.println("Всего было создано " + createdRectangles + " прямоугольников");
    }
    public static void printClassName(boolean printInRussian){
        if (true){
            System.out.print(RUSSIAN_CLASS_NAME);
        }
        else {
            System.out.print(ENGLISH_CLASS_NAME);
        }
    }
}
