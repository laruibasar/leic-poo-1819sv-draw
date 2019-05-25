package pt.isel.poo.li21n.g1.draw.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import pt.isel.poo.li21n.g1.draw.model.Figure;
import pt.isel.poo.li21n.g1.draw.model.Point;

class LineView extends FigureView {
    LineView(Figure f) {
        super(f);
    }

    @Override
    void draw(Canvas c) {
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3f);
        Point start = elem.getStart();
        Point end = elem.getEnd();

        c.drawLine(start.getX(), start.getY(), end.getX(), end.getY(), paint);
    }
}
