package pt.isel.poo.li21n.g1.draw.model;

public class Rect extends Line {

    public final char Letter = 'R';

    public Rect(int x, int y){
        super(x, y);
    }

    public Rect(){
        super(0,0);
    }

    protected char getLetter(){
        return letter;
    }

}
