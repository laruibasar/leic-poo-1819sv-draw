package pt.isel.poo.li21n.g1.draw.model;

public class Pixel extends Figure {

    public final char letter = 'P';

    public Pixel(int x, int y){
        super(x,y);
    }

    public Pixel(){
        super(0,0);
    }

    protected char getLetter(){
        return this.letter;
    }

    public void setEnd(int x, int y){
        this.start.set(x, y);
    }

    @Override
    public Point getEnd() {
        return this.start;
    }

}
