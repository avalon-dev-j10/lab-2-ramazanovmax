package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{

    private float ellipsA, ellipsB;
    
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    public Circle(float radius) {
        this.ellipsA = radius;
        this.ellipsB = radius;
    }

    public Circle(float ellipsA, float ellipsB) {
        this.ellipsA = ellipsA;
        this.ellipsB = ellipsB;
    }

    @Override
    public  float getLength() {
        return (float) (Math.PI * (this.ellipsA + this.ellipsB));
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * (this.ellipsA * this.ellipsB));
    }

    @Override
    public float getPerimeter() {
        if(ellipsA == ellipsB){
            return (float) ((float) 2 * Math.PI * ellipsA);
        }
        float a2 = ellipsA * ellipsA;
        float b2 = ellipsB * ellipsB;
        return (float) ((float) 2 * Math.PI * Math.sqrt(((a2 + b2 )/2)));
    }
}
