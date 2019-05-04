package pt.isel.poo.li21n.g1.draw.app.view;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

import pt.isel.poo.li21n.g1.draw.app.DrawController;

public class DrawView extends View {
    public DrawView(DrawController ctrl) { }

    public void reloadModel(DrawModel model) { }

    @Override
    public void onDraw(Canvas canvas) { }

    public boolean onTouchEvent(MotionEvent event) { }

}
