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
        this.x = 0;
        this.y = 0;
    }

    void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() { return this.x; }
    public int getY() { return this.y; }

    public void save(PrintWriter out) {
        out.print(this.toString());
    }

    public void load(Scanner in) {
        String point = in.next();
        int comma = 0;
        for (; comma < point.length(); comma++) {
            if (point.charAt(comma) == ',')
                break;
        }

        String sx = point.substring(1, comma);
        this.x = stringToInt(sx);

        String sy = point.substring(comma + 1, point.length() - 1);
        this.y = stringToInt(sy);
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
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
