package pt.isel.poo.li21n.g1.draw.model;

import java.io.PrintWriter;
import java.util.Scanner;

public class Rect extends Line {

    public final char LETTER = 'R';

    public Rect(int x, int y) {
        super(x, y);
        this.letter = LETTER;
    }

    public Rect(){
        super(0,0);
        this.letter = LETTER;
    }

    protected char getLetter(){
        return this.letter;
    }

    public void load(Scanner in) { super.load(in); }

    public void save(PrintWriter out) {
        super.save(out);
    }

    @Override
    public String toString() {
        return this.letter + " " + start.toString() + " " + end.toString();
    }
}
