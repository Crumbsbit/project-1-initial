package com.csc205.project1;

import static java.lang.Math.sqrt;

public class Point
{

    private double x;
    private double y;

    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void shiftX(double n)
    {
        x += n;
    }

    public void shiftY(double n) {
         y += n;
    }

    public double distance(Point p2)
    {
        return sqrt((p2.x - this.x) * (p2.x - this.x) + (p2.y - this.y) * (p2.y - this.y));
    }

    public void rotate(double angle)
    {
        double oldX = x;

        x = x * Math.cos(angle) - y * Math.sin(angle);
        y = oldX * Math.sin(angle) + y * Math.cos(angle);
    }

    @Override
    public String toString()
    {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args)
    {

    }
}
