package pt.isel.poo.li21n.g1.draw.app.view;

import android.graphics.Canvas;

import pt.isel.poo.li21n.g1.draw.app.model.Figure;
import pt.isel.poo.li21n.g1.draw.app.model.Point;

class PixelView extends FigureView {
    PixelView(Figure f) {
        super(f);
    }

    @Override
    protected void draw(Canvas c) {
        Point point = figure.getStart();
        c.drawPoint(point.getX(), point.getY(), paint);
    }
}
