package pt.isel.poo.li21n.g1.draw.model;

import java.io.PrintWriter;
import java.util.Scanner;

public class Pixel extends Figure {

    public final char LETTER = 'P';

    public Pixel(int x, int y) {
        super(x, y);
        this.letter = LETTER;
    }

    public Pixel(){
        super(0,0);
    }

    protected char getLetter(){
        return this.letter;
    }

    public void load(Scanner in) {
        super.load(in);
    }

    public void save(PrintWriter out) {
        super.save(out);
    }

    public void setEnd(int x, int y){
        this.start.set(x, y);
    }

    @Override
    public Point getEnd() {
        return this.start;
    }

    @Override
    public String toString() {
        return this.letter + " " + start.toString();
    }

}
