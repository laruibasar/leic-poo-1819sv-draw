package pt.isel.poo.li21n.g1.draw.view;

import android.graphics.Canvas;

import pt.isel.poo.li21n.g1.draw.model.Figure;
import pt.isel.poo.li21n.g1.draw.model.Point;

class CircleView extends FigureView {
    CircleView(Figure f) {
        super(f);
    }

    @Override
    void draw(Canvas c) {
        Point center = elem.getStart();
        //c.drawCircle(center.getX(), center.getY(), figure.getRadius(), paint);
    }
}
