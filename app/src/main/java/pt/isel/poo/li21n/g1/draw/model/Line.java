package pt.isel.poo.li21n.g1.draw.model;

import java.io.PrintWriter;
import java.util.Scanner;

public class Line extends Figure {

    public final char letter = 'L';
    protected Point end;

    public Line(int x, int y){
        super(x, y);
        end = new Point(x,y);
    }

    public Line(){

    }

    protected char getLetter(){
        return this.letter;
    }

    public void load(Scanner in){

    }

    public void save(PrintWriter out){

    }

    public void setEnd(int x, int y){
        this.end.set(x,y);
    }

    public Point getEnd(){
        return this.end;
    }

}
