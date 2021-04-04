package com.company;

public class Main {
    //Создайте новый проект, залинкуйте его с удаленным репозиторием на GitHub, добавьте файл .gitignore и сделайте коммит
//Создайте класс Rectangle (Прямоугольник). Добавьте в него 2 поля класса x и y типа double
//Создайте конструктор, который принимает на вход 2 аргумента x и y соответственно
//Создайте конструктор, который принимает на вход 1 аргумент и инициализирует им оба поля класса Rectangle (т. е. по факту это будет квадрат)
//Добавьте в класс Rectangle метод под названием calculateArea без параметров. Этот метод должен вычислять площадь данного прямоугольника и возвращать результат
//Добавьте в класс Rectangle метод printArea без параметров. Этот метод должен выводить в консоль площадь текущего прямоугольника. Для получения площади в этом методе использовать метод calculateArea добавленный ранее
//Добавить в класс Rectangle метод printRectangleKind без параметров. Этот метод должен выводить в консоль “Это квадрат” или “Это прямоугольник” в зависимости от соотношения x и y
//Добавить в класс Rectangle метод isTheSameRectangle с единственным параметром типа Rectangle возвращающий тип boolean . Данный метод должен сравнить 2 прямоугольника (вызывающий и тот, который передан аргументом в метод) на предмет равенства (прямоугольники равны, если равны их стороны)
//Для демонстрации работы программы в методе main создать 3 экземпляра класса Rectangle (1 из них должен быть квадратом, 2 остальных прямоугольниками). Для каждого из созданных объектов продемонстрировать работу всех методов класса Rectangle
//Залить код в репозиторий и отправить ссылку на репозиторий преподавателю
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2.0, 2.0);
        Rectangle rectangle2 = new Rectangle(2.0, 3.0);
        Rectangle rectangle3 = new Rectangle(2.0);

        System.out.print("rectangle1 area: ");

        rectangle1.calculateArea();

        rectangle1.printArea();
        System.out.print("rectangle2 area: ");
        rectangle2.calculateArea();
        rectangle2.printArea();
        System.out.print("rectangle3 area: ");
        rectangle3.calculateArea();
        rectangle3.printArea();
        System.out.print("rectangle1: ");
        rectangle1.printRectangleKind();
        System.out.print("rectangle2: ");
        rectangle2.printRectangleKind();
        System.out.print("rectangle3: ");
        rectangle3.printRectangleKind();
        System.out.println(rectangle1.isTheSameRectangle(rectangle2));
        System.out.println(rectangle2.isTheSameRectangle(rectangle3));
        System.out.println(rectangle1.isTheSameRectangle(rectangle3));
    }
}
