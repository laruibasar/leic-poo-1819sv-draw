package pt.isel.poo.li21n.g1.draw.model;

import java.io.PrintStream;
import java.util.Scanner;

public abstract class Figure {
    private int x;
    private int y;
    private char letter;

    protected Figure() {

    }

    protected Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected Figure(char l) {
        this.letter = l;
    }

    public void save(PrintStream out) { }

    public Figure load(Scanner in) { }

    protected char getLetter() {
        return this.letter;
    }

    public Figure newInstance(char l) { }

    public Point getStart() {
        return new Point(this.x, this.y);
    }

    public void setEnd(int x, int y) { }

}
