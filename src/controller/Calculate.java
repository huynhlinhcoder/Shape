/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithms;
import common.Library;
import model.Circle;
import model.Rectangle;
import model.Triangle;
import view.Menu;

/**
 *
 * @author huynh
 */
public class Calculate extends Menu<String> {

    protected Library library;
    protected Algorithms algorithm;

    public Calculate() {
        super("=====Calculator Shape Program=====");
        library = new Library();
        algorithm = new Algorithms();
    }

    @Override
    public void execute() {
        double width = library.getDouble("Please input side width of Rectangle: ");
        double length = library.getDouble("Please input length of Rectangle: ");
        double radius = library.getDouble("Please input radius of Circle: ");
        double sideA = library.getDouble("Please input side A of Triangle: ");
        double sideB = library.getDouble("Please input side B of Triangle: ");
        double sideC = library.getDouble("Please input side C of Triangle: ");
        Rectangle r = new Rectangle(width, length);
        r.printResult();
        Circle c = new Circle(radius);
        c.printResult();
        Triangle t = new Triangle(sideA, sideB, sideC);
        t.printResult();
    }
}

