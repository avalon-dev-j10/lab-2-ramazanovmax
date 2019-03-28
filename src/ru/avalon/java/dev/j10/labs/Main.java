package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Main {

    public static void main(String[] args) {
        
        Shape[] shapes = new Shape[10];

        for(int i=0;i < 10;i++){
            byte rand = (byte) (Math.random() * 3);
            if(rand == 0){
                shapes[i] = new Circle((int)(Math.random()*100));
            }else if(rand == 1){
                shapes[i] = new Rectangle((int)(Math.random()*100));
            }else if(rand == 2){
                shapes[i] = new Triangle((int)(Math.random()*100));
            }
        }

        for (Shape shape: shapes){
            System.out.println(shape.getClass()+" "+shape.getArea());
        }
        System.out.println("Максимальная площадь: "+getMaxArea(shapes).getArea());

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

    public static Shape getMaxArea(Shape[] shapes){
        Shape max = shapes[0];
        for(int i = 0; i < shapes.length; i++){
            if(max.getArea() < shapes[i].getArea()){
                max = shapes[i];
            }
        }
        return max;
    }
}
