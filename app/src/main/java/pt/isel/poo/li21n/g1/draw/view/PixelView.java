package pt.isel.poo.li21n.g1.draw.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import pt.isel.poo.li21n.g1.draw.model.Figure;
import pt.isel.poo.li21n.g1.draw.model.Point;

class PixelView extends FigureView {
    PixelView(Figure f) {
        super(f);
    }

    @Override
    protected void draw(Canvas c) {
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6f);
        Point point = elem.getStart();
        c.drawPoint(point.getX(), point.getY(), paint);
    }
}
