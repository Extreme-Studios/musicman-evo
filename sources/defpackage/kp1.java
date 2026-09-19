package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kp1 implements v11 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ mp1 g;
    public final /* synthetic */ View h;
    public final /* synthetic */ WindowManager i;

    public /* synthetic */ kp1(mp1 mp1Var, View view, WindowManager windowManager) {
        this.g = mp1Var;
        this.h = view;
        this.i = windowManager;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [lp1] */
    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        int i = this.f;
        mp1 mp1Var = this.g;
        switch (i) {
            case 0:
                md1 md1Var = (md1) obj;
                jn.F("Hide native ad policy validator overlay.");
                md1Var.p0().setVisibility(8);
                if (md1Var.p0().getWindowToken() != null) {
                    this.i.removeView(md1Var.p0());
                }
                md1Var.destroy();
                ViewTreeObserver viewTreeObserver = this.h.getViewTreeObserver();
                if (mp1Var.c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(mp1Var.c);
                    break;
                }
                break;
            default:
                final md1 md1Var2 = (md1) obj;
                md1Var2.e0().l = new us2(mp1Var, map, 17, false);
                if (map != null) {
                    final View view = this.h;
                    Context context = view.getContext();
                    String str = (String) map.get("validator_width");
                    ix0 ix0Var = lx0.K8;
                    kx0 kx0Var = tu0.e.c;
                    int iB = mp1.b(((Integer) kx0Var.a(ix0Var)).intValue(), context, str);
                    int iB2 = mp1.b(((Integer) kx0Var.a(lx0.L8)).intValue(), context, (String) map.get("validator_height"));
                    int iB3 = mp1.b(0, context, (String) map.get("validator_x"));
                    int iB4 = mp1.b(0, context, (String) map.get("validator_y"));
                    md1Var2.W(new eg(1, iB, iB2));
                    try {
                        md1Var2.t().getSettings().setUseWideViewPort(((Boolean) kx0Var.a(lx0.M8)).booleanValue());
                        md1Var2.t().getSettings().setLoadWithOverviewMode(((Boolean) kx0Var.a(lx0.N8)).booleanValue());
                        break;
                    } catch (NullPointerException unused) {
                    }
                    final WindowManager.LayoutParams layoutParamsG = rs0.G();
                    layoutParamsG.x = iB3;
                    layoutParamsG.y = iB4;
                    View viewP0 = md1Var2.p0();
                    final WindowManager windowManager = this.i;
                    windowManager.updateViewLayout(viewP0, layoutParamsG);
                    final String str2 = (String) map.get("orientation");
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        final int i2 = (("1".equals(str2) || "2".equals(str2)) ? rect.bottom : rect.top) - iB4;
                        mp1Var.c = new ViewTreeObserver.OnScrollChangedListener() { // from class: lp1
                            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                            public final /* synthetic */ void onScrollChanged() {
                                Rect rect2 = new Rect();
                                if (view.getGlobalVisibleRect(rect2)) {
                                    md1 md1Var3 = md1Var2;
                                    if (md1Var3.p0().getWindowToken() == null) {
                                        return;
                                    }
                                    String str3 = str2;
                                    boolean zEquals = "1".equals(str3);
                                    int i3 = i2;
                                    WindowManager.LayoutParams layoutParams = layoutParamsG;
                                    if (zEquals || "2".equals(str3)) {
                                        layoutParams.y = rect2.bottom - i3;
                                    } else {
                                        layoutParams.y = rect2.top - i3;
                                    }
                                    windowManager.updateViewLayout(md1Var3.p0(), layoutParams);
                                }
                            }
                        };
                        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.addOnScrollChangedListener(mp1Var.c);
                        }
                    }
                    String str3 = (String) map.get("overlay_url");
                    if (!TextUtils.isEmpty(str3)) {
                        md1Var2.loadUrl(str3);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kp1(mp1 mp1Var, WindowManager windowManager, View view) {
        this.g = mp1Var;
        this.i = windowManager;
        this.h = view;
    }
}
