package Class21;

import java.awt.geom.Area;

public class CalculateArea {

    void CalculateArea(double length ,double width){
        System.out.println("Area of a rectangle is "+(length*width));
    }

    void calculateArea(double side){
        System.out.println("Area of a Square is "+(side*side));
    }

    public static void main(String[] args) {
        CalculateArea ca=new CalculateArea();
        ca.calculateArea(10);
        ca.CalculateArea(10,20);
    }

}

