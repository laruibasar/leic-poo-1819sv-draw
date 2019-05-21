package pt.isel.poo.li21n.g1.draw.model;

import java.io.PrintWriter;
import java.util.Scanner;

public class Circle extends Figure {

    public final char letter = 'C';
    private int radius;

    public Circle(int x, int y){
        super(x,y);
        this.radius = 0;
    }

    public Circle(){
        super(0,0);
        this.radius = 0;
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
        return null;
    }

    public void setEnd(int x, int y){
        int ex = Math.abs(this.start.getX() - x);
        int ey = Math.abs(this.start.getY() - y);
        this.radius = (int) Math.sqrt((double) ((ex * ex) + (ey * ey)));
    }

    public int getRadius(){
        return this.radius;
    }

}
