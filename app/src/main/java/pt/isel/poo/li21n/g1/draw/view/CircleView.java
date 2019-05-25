package pt.isel.poo.li21n.g1.draw.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

import pt.isel.poo.li21n.g1.draw.model.Figure;
import pt.isel.poo.li21n.g1.draw.model.Point;

class CircleView extends FigureView {

    CircleView(Figure f) {
        super(f);
    }

    @Override
    void draw(Canvas c) {
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3f);
        Point center = elem.getStart();
        Point end = elem.getEnd();

        int dx = Math.abs(center.getX() - end.getX());
        int dy = Math.abs(center.getY() - end.getY());
        float r = (float) Math.sqrt((dx * dx) + (dy * dy));

        c.drawCircle(center.getX(), center.getY(), r, paint);
    }
}
