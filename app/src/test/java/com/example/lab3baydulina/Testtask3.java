package com.example.lab3baydulina;

import com.example.lab3baydulina.task3.Point3D;

import org.junit.Test;

public class Testtask3 {
    @Test
    public void Test(){
        Point p1 = new Point();
        System.out.println("(Without setters) " + p1);
        p1.setX(5);
        p1.setY(3);
        System.out.println("(With setters) " + p1);


        Point3D p3d = new Point3D();
        System.out.println("(Without setter) "+ p3d);
        p3d.setZ(7);
        System.out.println("(With setter) "+ p3d);

    }
}