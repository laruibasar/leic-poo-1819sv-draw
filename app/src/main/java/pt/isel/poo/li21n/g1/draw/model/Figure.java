package pt.isel.poo.li21n.g1.draw.model;


import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Figure {

    public Figure(int x, int y) {

    }

    public Figure(){}

    public void save(PrintWriter out){}

    public void load(Scanner in){}

    public char getLetter(){

        return 0;
    }

    public Figure newInstance(char letter){

        return null;
    }

    public Point getStart(){

        return null;
    }

    public void setEnd(int x, int y){

    }
}
