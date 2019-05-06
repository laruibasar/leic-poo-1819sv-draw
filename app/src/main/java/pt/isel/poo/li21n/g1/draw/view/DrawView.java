package pt.isel.poo.li21n.g1.draw.view;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

import pt.isel.poo.li21n.g1.draw.DrawController;
import pt.isel.poo.li21n.g1.draw.model.DrawModel;
import pt.isel.poo.li21n.g1.draw.model.Figure;

public class DrawView extends View {
    private FigureView current;
    private FigureView[] views;
    private int numberView;
    private DrawModel model;

    public DrawView(DrawController ctrl) {
        super(ctrl);
    }

    public void reloadModel(DrawModel model) { }

    @Override
    public void onDraw(Canvas canvas) {
        current.draw(canvas);
    }

    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

}
