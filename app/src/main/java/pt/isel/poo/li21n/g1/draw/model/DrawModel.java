package pt.isel.poo.li21n.g1.draw.model;

import android.util.Log;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DrawModel implements Iterable<Figure> {

    private List<Figure> figureList;

    public DrawModel() {
        this.figureList = new LinkedList<Figure>();
    }

    public void load(Scanner in) {
        if (!in.hasNextLine()) return;

        int number = in.nextInt();
        if (number == 0) return;

        for (int i = 0; i < number; i++) {
            char ch = in.next().charAt(0);
            Figure f = Figure.newInstance(ch);
            f.load(in);
            this.figureList.add(f);
            in.nextLine();
        }
    }

    public void save(PrintWriter out) {
        out.println(figureList.size());
        Iterator it = figureList.iterator();
        while (it.hasNext()) {
            Figure f = (Figure) it.next();
            //out.print(f.toString());
            out.print(f.getLetter() + " ");
            f.save(out);
            out.println();
        }
        out.close();
    }

    public void add(Figure f) {
        this.figureList.add(f);
    }

    public void reset() {
        this.figureList.clear();
    }

    public Iterator<Figure> iterator() {
        return figureList.iterator();
    }
}
