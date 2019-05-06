package pt.isel.poo.li21n.g1.draw.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import pt.isel.poo.li21n.g1.draw.model.Figure;
import pt.isel.poo.li21n.g1.draw.model.Point;

abstract class FigureView {
    final protected Paint paint;
    protected Figure figure;

    FigureView(Figure f) {
        this.figure = f;
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
    }

    void draw(Canvas c) {
    }

    FigureView newInstance(Figure f) {
        switch (f.getClass().getName()) {
            case "Line":
                return new LineView(f);
            case "Rect":
                return new RectView(f);
            case "Pixel":
                return new PixelView(f);
            case "Circle":
                return new CircleView(f);
            default:
                return null;
        }
    }
}
