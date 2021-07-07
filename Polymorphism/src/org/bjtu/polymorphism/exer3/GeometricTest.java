package org.bjtu.polymorphism.exer3;

/**
 * @author Yuxuan
 * @Description:
 * @create 2021-07-04 17:06
 * @param:
 */

public class GeometricTest{
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        test.ShowArea(new Circle("white",1.0,1));
        test.ShowArea(new Myrectangle("black",1.0,3,5));
        if (test.EqualsArea(new Circle("pink",10,2), new Myrectangle("black",10,3,5))){
            System.out.println("面积相等");
        }
        else{
            System.out.println("面积不想等");
        }
    }

    public void ShowArea(GeometricObject o){
        System.out.println("Area is "+o.FindArea());
    }

    public boolean EqualsArea(GeometricObject c, GeometricObject r){
        double s1 = c.FindArea();
        double s2 = r.FindArea();
        return s1 == s2;
    }
}

class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Double FindArea(){
        return 0.0;
    }
}

class Circle extends GeometricObject{
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
@Override
    public Double FindArea(){
        return Math.PI*radius*radius;
    }
}

class Myrectangle extends GeometricObject{
    private double weight;
    private double height;

    public Myrectangle(String color, double weight, double weight1, double height) {
        super(color, weight);
        this.weight = weight1;
        this.height = height;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public Double FindArea(){
        return weight*height;
    }
}