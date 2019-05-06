package pt.isel.poo.li21n.g1.draw.app.view;

import android.graphics.Canvas;

import pt.isel.poo.li21n.g1.draw.app.model.Figure;
import pt.isel.poo.li21n.g1.draw.app.model.Point;

class RectView extends FigureView {
    RectView(Figure f) {
        super(f);
    }

    @Override
    void draw(Canvas c) {
        Point sideLeft = figure.getStart();
        Point sideTop = figure.getTop();
        Point sideRight = figure.getRight();
        Point sideBottom = figure.getEnd();

        c.drawLine(sideLeft.getX(), sideLeft.getY(), sideTop.getX(), sideTop.getY(), paint);
        c.drawLine(sideTop.getX(), sideTop.getY(), sideRight.getX(), sideRight.getY(), paint);
        c.drawLine(sideRight.getX(), sideRight.getY(), sideBottom.getX(), sideBottom.getY(), paint);
        c.drawLine(sideBottom.getX(), sideBottom.getY(), sideLeft.getX(), sideLeft.getY(), paint);
    }
}
