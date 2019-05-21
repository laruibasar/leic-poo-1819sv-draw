package pt.isel.poo.li21n.g1.draw.model;

public class Line extends Figure {
    private Point end;

    public Line() {
        super();
        super.letter = 'L';
    }

    public Line(int x, int y) {
        super(x, y);
        super.letter = 'L';
    }

    @Override
    public void setEnd(int x, int y) {
        this.end = new Point(x, y);
    }

    public Point getEnd() {
        return this.end;
    }
}
