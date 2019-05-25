package pt.isel.poo.li21n.g1.draw.model;

import java.io.PrintWriter;
import java.util.Scanner;

public class Line extends Figure {

    public final char LETTER = 'L';
    protected Point end;

    public Line(int x, int y) {
        super(x, y);
        this.letter = LETTER;
        end = new Point(x, y);
    }

    public Line() {
        super(0, 0);
        this.letter = LETTER;
        end = new Point(0, 0);
    }

    protected char getLetter() {
        return this.letter;
    }

    public void load(Scanner in) {
        super.load(in);
        this.end.load(in);
    }

    public void save(PrintWriter out) {
        super.save(out);
        out.print(" ");
        end.save(out);
    }

    @Override
    public void setEnd(int x, int y){
        end.set(x,y);
    }

    public Point getEnd(){
        return this.end;
    }

    @Override
    public String toString() {
        return this.letter + " " + start.toString() + " " + end.toString();
    }

}
