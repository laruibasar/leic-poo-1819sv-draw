package pt.isel.poo.li21n.g1.draw.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import pt.isel.poo.li21n.g1.draw.DrawController;
import pt.isel.poo.li21n.g1.draw.model.DrawModel;
import pt.isel.poo.li21n.g1.draw.model.Figure;

public class DrawView extends View {
    final private Paint paint = new Paint();
    DrawController ctrl;
    FigureView curr;
    List<FigureView> views;

    public DrawView(DrawController ctrl) {
        super(ctrl);
        this.ctrl = ctrl;
        this.views = new LinkedList<FigureView>();

        //paint = new Paint();
    }

    public void reloadModel(DrawModel model) {
        views.clear();
        Iterator it = model.iterator();
        while (it.hasNext()) {
            Figure f = (Figure) it.next();
            views.add(FigureView.newInstance(f));
        }
        invalidate();
    }

    // we update the view on touch event
    // we paint everything, every time
    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.argb(96, 0, 255, 0));

        for(FigureView f : views) {
            f.draw(canvas);
        }
        //if (curr != null)
        //    curr.draw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // the coordinates from the event
        int x = (int) event.getX();
        int y = (int) event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Figure f = ctrl.createSelectedFigure(x, y);
                // because the user might not have selected a figure yet
                if (f == null) {
                    break;
                }
                this.curr = FigureView.newInstance(f);
                this.views.add(this.curr);
                invalidate();
                return true;
            case MotionEvent.ACTION_MOVE:
                curr.elem.setEnd(x, y);
                invalidate();
                return true;
            case MotionEvent.ACTION_UP:
                curr.elem.setEnd(x, y);
                invalidate();
                return true;
        }
        return false;
    }

    public void clearCanvas() {
        views.clear();
        invalidate();
    }
}
