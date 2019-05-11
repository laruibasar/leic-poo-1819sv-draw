package pt.isel.poo.li21n.g1.draw.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import pt.isel.poo.li21n.g1.draw.DrawController;

public class DrawView extends View {
    final private Paint paint;

    public DrawView(DrawController ctrl) {
        super(ctrl);

        paint = new Paint();
        paint.setColor(Color.BLACK);
    }

    //public void reloadModel(DrawModel model) { }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.argb(96, 0, 255, 0));

        //for (int i = 0; i < 3; ++i) {
        //    final float y = 100 + i;
        //    canvas.drawLine(0f, y, getWidth() - 1, y, paint);
        //}
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d("DrawView", "Down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("DrawView", "Moving");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("DrawView", "Up");
                break;
        }

        return true;
    }

}
