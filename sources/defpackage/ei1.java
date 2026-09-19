package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ei1 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final Context f;
    public View g;

    public ei1(Context context) {
        super(context);
        this.f = context;
    }

    public static ei1 a(Context context, View view, x42 x42Var) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Resources resources;
        DisplayMetrics displayMetrics;
        ei1 ei1Var = new ei1(context);
        List list = x42Var.u;
        boolean zIsEmpty = list.isEmpty();
        Context context2 = ei1Var.f;
        if (!zIsEmpty && (resources = context2.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            y42 y42Var = (y42) list.get(0);
            float f = y42Var.a;
            float f2 = displayMetrics.density;
            ei1Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (y42Var.b * f2)));
        }
        ei1Var.g = view;
        ei1Var.addView(view);
        zf0 zf0Var = vc3.C.B;
        gb1 gb1Var = new gb1(ei1Var, ei1Var);
        View view2 = (View) ((WeakReference) gb1Var.f).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            gb1Var.R1(viewTreeObserver);
        }
        fb1 fb1Var = new fb1(ei1Var, ei1Var);
        View view3 = (View) ((WeakReference) fb1Var.f).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            fb1Var.R1(viewTreeObserver3);
        }
        JSONObject jSONObject = x42Var.h0;
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            ei1Var.b(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            ei1Var.b(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        ei1Var.addView(relativeLayout);
        return ei1Var;
    }

    public final void b(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        Context context = this.f;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double dOptDouble = jSONObject.optDouble("padding", 0.0d);
        ut0 ut0Var = ut0.f;
        f32 f32Var = ut0Var.a;
        int iB = f32.b(context, (int) dOptDouble);
        textView.setPadding(0, iB, 0, iB);
        double dOptDouble2 = jSONObject.optDouble("height", 15.0d);
        f32 f32Var2 = ut0Var.a;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, f32.b(context, (int) dOptDouble2));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.g.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.g.setY(-iArr[1]);
    }
}
