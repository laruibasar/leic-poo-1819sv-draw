package pt.isel.poo.li21n.g1.draw.app.model;

import java.io.PrintWriter;
import java.util.Scanner;

public class Line extends Figure {

    public char letter = 'L';


    private Point finish;

    public Line(int x, int y){
        super(x, y);
        finish = new Point(x,y);
    }

    public Line(){

    }

    protected char getLetter(){
        return this.letter;
    }

    public void load(Scanner in){

    }

    public void save(PrintWriter out){
        super.save(out);
        out.print(" (" + finish.getX() + "," + finish.getY() + ")");
    }

    public void setEnd(int x, int y){
        finish.set(x,y);
    }

    public Point getEnd(){
        return finish;
    }

}
