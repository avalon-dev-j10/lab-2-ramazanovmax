package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Main {

    public static void main(String[] args) {
        ;
        
        Circle circle1 = new Circle(52);
        Circle circle2 = new Circle(15, 42);
        Circle circle3 = new Circle(32, 24);
        Rectangle rectangle1 = new Rectangle(21);
        Rectangle rectangle2 = new Rectangle(10, 32);
        Rectangle rectangle3 = new Rectangle(9, 15);
        Triangle triangle1 = new Triangle(15);
        Triangle triangle2 = new Triangle(12, 10);
        Triangle triangle3 = new Triangle(15, 21, 4);
        
        Shape[] shapes = {circle1,rectangle2, triangle3,circle2,rectangle3, triangle1,circle3,rectangle1, triangle2};

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
        
        
    }
}
