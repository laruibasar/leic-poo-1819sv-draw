package pt.isel.poo.li21n.g1.draw.model;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class DrawModel extends LinkedList {

    private LinkedList<Figure> figureList= new LinkedList<>();





    public DrawModel() { }

    public void load(Scanner in) { }

    public void save(PrintWriter out) { }

    public void add(Figure f) {
        figureList.add(f);
    }

    public void reset() { }
}
