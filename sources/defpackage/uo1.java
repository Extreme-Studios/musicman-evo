package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface uo1 {
    void I(String str);

    void K();

    void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void b(sl1 sl1Var);

    void c();

    void d(View view);

    void e();

    boolean f();

    void g(View view);

    JSONObject h(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void i(y01 y01Var);

    void j(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i);

    void j0();

    void k(Bundle bundle);

    void l(mn1 mn1Var);

    JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void n(Bundle bundle);

    void o(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void q(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType);

    void r(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    boolean s();

    boolean t(Bundle bundle);

    void u(View view, MotionEvent motionEvent);

    int v();

    void x();
}
