package pt.isel.poo.li21n.g1.draw.model;

import java.io.PrintWriter;
import java.util.Scanner;

public class Point {

    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(){

    }

    void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void save(PrintWriter out){

    }

    public void load(Scanner in){

    }
}
