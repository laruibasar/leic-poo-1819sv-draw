package pt.isel.poo.li21n.g1.draw.model;

import java.io.PrintWriter;
import java.util.Scanner;

public class Circle extends Figure {

    public final char LETTER = 'C';
    private int radius;
    protected Point end;

    public Circle(int x, int y){
        super(x,y);
        this.letter = LETTER;
        this.end = new Point(x, y);
        this.radius = calcRadius(start, end);
    }

    public Circle() {
        super(0,0);
        this.end = new Point(0, 0);
        this.radius = calcRadius(start, end);
    }

    protected char getLetter(){
        return this.letter;
    }

    public void load(Scanner in) {
        super.load(in);

        String rad = in.next();
        int r = stringToInt(rad.substring(1, rad.length() - 1));
        this.end.set(this.start.getX() + r, this.start.getY());
    }

    public void save(PrintWriter out) {
        super.save(out);
        out.print(" |" + this.radius + "|");
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

    @Override
    public String toString() {
        return this.letter + " " + start.toString() + " |" + radius + "|";
    }

    private static int stringToInt(String str) {
        int signal = (str.charAt(0) == '-') ? 1 : 0;
        int i = signal;
        int n = 0;
        int d = 0;
        for (; i < str.length(); i++) {
            n = (n * 10) + str.charAt(i) - '0';
            d++;
        }
        return (signal == 1) ? (0 - n) : n;
    }

}
