package pt.isel.poo.li21n.g1.draw.model;

import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Figure {

    protected char letter;
    protected final Point start;

    protected Figure(int x, int y) {
        this.start = new Point (x, y);
    }

    protected Figure(){
        this.start = new Point();
    }

    protected char getLetter() {
        return this.letter;
    }

    public Figure newInstance(char letter) {
        switch(letter){
            case ('L'):
                return new Line();
            case ('R'):
                return new Rect();
            case ('P'):
                return new Pixel();
            case ('C'):
                return new Circle();
            default:
                return null;
        }
    }

    public Point getStart() {
        return this.start;
    }

    public void save(PrintWriter out){
        this.start.save(out);
    }

    public void load(Scanner in){
        this.start.load(in);
    }

    public abstract void setEnd(int x, int y);

    public abstract Point getEnd();

}
