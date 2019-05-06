package pt.isel.poo.li21n.g1.draw.app.view;

import android.graphics.Canvas;

import pt.isel.poo.li21n.g1.draw.app.model.Figure;
import pt.isel.poo.li21n.g1.draw.app.model.Point;

class LineView extends FigureView {
    LineView(Figure f) {
        super(f);
    }

    @Override
    void draw(Canvas c) {
        Point start = figure.getStart();
        Point end = figure.getEnd();

        c.drawLine(start.getX(), start.getY(), end.getX(), end.getY(), paint);
    }
}
