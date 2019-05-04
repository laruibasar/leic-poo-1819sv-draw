package pt.isel.poo.li21n.g1.draw.app.view;

import android.graphics.Canvas;
import android.graphics.Paint;

abstract class FigureView {
    protected Paint paint;

    FigureView(Figure f) { }
    void draw(Canvas c) { }
    FigureView newInstance(Figure f) { }
}
