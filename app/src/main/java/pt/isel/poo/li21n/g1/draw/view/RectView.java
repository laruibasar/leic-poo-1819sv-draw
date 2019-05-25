package pt.isel.poo.li21n.g1.draw.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import pt.isel.poo.li21n.g1.draw.model.Figure;
import pt.isel.poo.li21n.g1.draw.model.Point;

class RectView extends FigureView {
    RectView(Figure f) {
        super(f);
    }

    @Override
    void draw(Canvas c) {
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3f);
        Point startPoint = elem.getStart();
        Point endPoint = elem.getEnd();

        c.drawRect((float) startPoint.getX(), (float) startPoint.getY(),
                (float) endPoint.getX(), (float) endPoint.getY(), paint);
    }
}
