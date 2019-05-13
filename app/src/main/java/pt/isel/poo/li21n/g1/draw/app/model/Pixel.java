package pt.isel.poo.li21n.g1.draw.app.model;

public class Pixel extends Figure {

    public char letter = 'P';

    public Pixel(int x, int y){
        super(x,y);
    }

    public Pixel(){

    }

    protected char getLetter(){
        return this.letter;
    }

    public void setEnd(int x, int y){

    }

}
