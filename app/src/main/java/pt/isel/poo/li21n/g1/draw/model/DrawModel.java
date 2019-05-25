package pt.isel.poo.li21n.g1.draw.model;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DrawModel implements Iterable<Figure> {

    private List<Figure> figureList;

    public DrawModel() {
        this.figureList = new LinkedList<Figure>();
    }

    public void load(Scanner in) { }

    public void save(PrintWriter out) { }

    public void add(Figure f) {
        this.figureList.add(f);
    }

    public void reset() {
        this.figureList.clear();
    }

    public Iterator<Figure> iterator() {
        return figureList.iterator();
    }
}
