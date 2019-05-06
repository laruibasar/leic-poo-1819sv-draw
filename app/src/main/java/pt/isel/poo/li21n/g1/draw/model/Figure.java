package pt.isel.poo.li21n.g1.draw.model;

public abstract class Figure {
    private Point start;
    private char letter;

    protected Figure() {
        start = new Point();
    }

    protected Figure(int x, int y) {
        start = new Point(x, y);
    }

    public Point getStart() {
        return start;
    }

    public void setEnd(int x, int y) { }

    protected char getLetter() {
        return this.letter;
    }
}
