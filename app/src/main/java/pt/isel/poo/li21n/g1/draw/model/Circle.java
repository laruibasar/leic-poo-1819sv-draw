package pt.isel.poo.li21n.g1.draw.model;

import java.io.PrintWriter;
import java.util.Scanner;

public class Circle extends Figure {

    public final char letter = 'C';
    private int radius;
    protected Point end;

    public Circle(int x, int y){
        super(x,y);
        this.end = new Point(x, y);
        this.radius = calcRadius(start, end);
    }

    public Circle(){
        super(0,0);
        this.end = new Point(0, 0);
        this.radius = calcRadius(start, end);
    }

    protected char getLetter(){
        return this.letter;
    }

    public void load(Scanner in){

    }

    public void save(PrintWriter out){

    }

    @Override
    public Point getEnd() {
        return this.end;
    }

    @Override
    public void setEnd(int x, int y){
        this.end = new Point(x, y);
        this.radius = calcRadius(start, end);
    }

    private int calcRadius(Point c1, Point c2) {
        int ex = Math.abs(c1.getX() - c2.getX());
        int ey = Math.abs(c1.getY() - c2.getY());
        return (int) Math.sqrt((ex * ex) + (ey * ey));
    }

}
