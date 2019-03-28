package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 * </p>
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{
    
    float side1, side2, side3;

    /**
     *Равносторонний треугольник
     * 
     * @param side1 Сторона расностороннего треугольника
     */
    public Triangle(float side1) {
        this.side1 = side1;
        this.side2 = side1;
        this.side3 = side1;
    }

    /**
     *прямоугольный треугольник 
     * 
     * @param side1 катет
     * @param side2 катет
     */
    public Triangle(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
        
        float s1_2 = side1 * side1;
        float s2_2 = side2 * side2;
                
        this.side3 = (float) Math.sqrt(s1_2+s2_2);
    }

    /**
     * треугольник из длин трех сторон
     *
     * @param side1 сторона
     * @param side2 сторона
     * @param side3 сторона
     */
    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public float getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public float getArea() {
        float p05 = getPerimeter();
        
        return (float) Math.sqrt((p05*(p05-side1)*(p05-side2)*(p05-side3)));
    }
    
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
