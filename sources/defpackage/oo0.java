package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class oo0 {
    public final Context a;
    public final qt1 b;
    public String c;
    public String d;
    public String e;
    public String f;
    public final int h;
    public PointF i;
    public PointF j;
    public final za0 k;
    public int g = 0;
    public final ae0 l = new ae0(this, 6);

    public oo0(Context context) {
        this.a = context;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        vc3 vc3Var = vc3.C;
        vc3Var.t.c();
        this.k = (za0) vc3Var.t.i;
        this.b = vc3Var.o.g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z) {
        if (!z) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.g;
        if (i == -1) {
            return;
        }
        ae0 ae0Var = this.l;
        za0 za0Var = this.k;
        if (i == 0) {
            if (actionMasked == 5) {
                this.g = 5;
                this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                za0Var.postDelayed(ae0Var, ((Long) tu0.e.c.a(lx0.n5)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !c(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (c(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.g = -1;
            za0Var.removeCallbacks(ae0Var);
        }
    }

    public final void b() {
        String str;
        try {
            Context context = this.a;
            if (!(context instanceof Activity)) {
                jn.R("Can not create dialog without Activity Context");
                return;
            }
            vc3 vc3Var = vc3.C;
            yq0 yq0Var = vc3Var.o;
            synchronized (yq0Var.a) {
                str = yq0Var.c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != vc3Var.o.h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iE = e(arrayList, "Ad information", true);
            final int iE2 = e(arrayList, str2, true);
            final int iE3 = e(arrayList, str3, true);
            boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.X9)).booleanValue();
            final int iE4 = e(arrayList, "Open ad inspector", zBooleanValue);
            final int iE5 = e(arrayList, "Ad inspector settings", zBooleanValue);
            AlertDialog.Builder builderK = zb3.k(context);
            builderK.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: jd0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    final oo0 oo0Var = this.f;
                    qt1 qt1Var = oo0Var.b;
                    final int i2 = 0;
                    if (i != iE) {
                        final int i3 = 1;
                        if (i == iE2) {
                            jn.F("Debug mode [Creative Preview] selected.");
                            za1.a.execute(new ae0(oo0Var, i3));
                            return;
                        }
                        if (i == iE3) {
                            jn.F("Debug mode [Troubleshooting] selected.");
                            za1.a.execute(new ae0(oo0Var, 2));
                            return;
                        }
                        if (i == iE4) {
                            final ya1 ya1Var = za1.f;
                            ya1 ya1Var2 = za1.a;
                            if (qt1Var.f()) {
                                ya1Var.execute(new ae0(oo0Var, 5));
                                return;
                            } else {
                                ya1Var2.execute(new Runnable() { // from class: bm0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i4 = i2;
                                        ya1 ya1Var3 = ya1Var;
                                        oo0 oo0Var2 = oo0Var;
                                        switch (i4) {
                                            case 0:
                                                vc3 vc3Var2 = vc3.C;
                                                yq0 yq0Var2 = vc3Var2.o;
                                                Context context2 = oo0Var2.a;
                                                if (!yq0Var2.b(context2, oo0Var2.d, oo0Var2.e)) {
                                                    vc3Var2.o.c(context2, oo0Var2.d, oo0Var2.e);
                                                } else {
                                                    ya1Var3.execute(new ae0(oo0Var2, 4));
                                                }
                                                break;
                                            default:
                                                vc3 vc3Var3 = vc3.C;
                                                yq0 yq0Var3 = vc3Var3.o;
                                                Context context3 = oo0Var2.a;
                                                if (!yq0Var3.b(context3, oo0Var2.d, oo0Var2.e)) {
                                                    vc3Var3.o.c(context3, oo0Var2.d, oo0Var2.e);
                                                } else {
                                                    ya1Var3.execute(new ae0(oo0Var2, 3));
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i == iE5) {
                            final ya1 ya1Var3 = za1.f;
                            ya1 ya1Var4 = za1.a;
                            if (qt1Var.f()) {
                                ya1Var3.execute(new ae0(oo0Var, i2));
                                return;
                            } else {
                                ya1Var4.execute(new Runnable() { // from class: bm0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i4 = i3;
                                        ya1 ya1Var5 = ya1Var3;
                                        oo0 oo0Var2 = oo0Var;
                                        switch (i4) {
                                            case 0:
                                                vc3 vc3Var2 = vc3.C;
                                                yq0 yq0Var2 = vc3Var2.o;
                                                Context context2 = oo0Var2.a;
                                                if (!yq0Var2.b(context2, oo0Var2.d, oo0Var2.e)) {
                                                    vc3Var2.o.c(context2, oo0Var2.d, oo0Var2.e);
                                                } else {
                                                    ya1Var5.execute(new ae0(oo0Var2, 4));
                                                }
                                                break;
                                            default:
                                                vc3 vc3Var3 = vc3.C;
                                                yq0 yq0Var3 = vc3Var3.o;
                                                Context context3 = oo0Var2.a;
                                                if (!yq0Var3.b(context3, oo0Var2.d, oo0Var2.e)) {
                                                    vc3Var3.o.c(context3, oo0Var2.d, oo0Var2.e);
                                                } else {
                                                    ya1Var5.execute(new ae0(oo0Var2, 3));
                                                }
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = oo0Var.a;
                    if (!(context2 instanceof Activity)) {
                        jn.R("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = oo0Var.c;
                    String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        zb3 zb3Var = vc3.C.c;
                        HashMap mapO = zb3.o(uriBuild);
                        for (String str6 : mapO.keySet()) {
                            sb.append(str6);
                            sb.append(" = ");
                            sb.append((String) mapO.get(str6));
                            sb.append("\n\n");
                        }
                        String strTrim = sb.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str5 = strTrim;
                        }
                    }
                    zb3 zb3Var2 = vc3.C.c;
                    AlertDialog.Builder builderK2 = zb3.k(context2);
                    builderK2.setMessage(str5);
                    builderK2.setTitle("Ad Information");
                    builderK2.setPositiveButton("Share", new tk0(oo0Var, i2, str5));
                    builderK2.setNegativeButton("Close", gl0.f);
                    builderK2.create().show();
                }
            });
            builderK.create().show();
        } catch (WindowManager.BadTokenException e) {
            jn.w("", e);
        }
    }

    public final boolean c(float f, float f2, float f3, float f4) {
        float fAbs = Math.abs(this.i.x - f);
        int i = this.h;
        return fAbs < ((float) i) && Math.abs(this.i.y - f2) < ((float) i) && Math.abs(this.j.x - f3) < ((float) i) && Math.abs(this.j.y - f4) < ((float) i);
    }

    public final void d(Context context) {
        final int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int iE = e(arrayList, "None", true);
        final int iE2 = e(arrayList, "Shake", true);
        final int iE3 = e(arrayList, "Flick", true);
        int iOrdinal = this.b.r.ordinal();
        if (iOrdinal != 1) {
            i = iOrdinal != 2 ? iE : iE3;
        } else {
            i = iE2;
        }
        zb3 zb3Var = vc3.C.c;
        AlertDialog.Builder builderK = zb3.k(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderK.setTitle("Setup gesture");
        builderK.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new th0(0, atomicInteger));
        builderK.setNegativeButton("Dismiss", new th0(i2, this));
        builderK.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: dj0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                oo0 oo0Var = this.f;
                qt1 qt1Var = oo0Var.b;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i) {
                    if (atomicInteger2.get() == iE2) {
                        qt1Var.h(nt1.g, true);
                    } else if (atomicInteger2.get() == iE3) {
                        qt1Var.h(nt1.h, true);
                    } else {
                        qt1Var.h(nt1.f, true);
                    }
                }
                oo0Var.b();
            }
        });
        builderK.setOnCancelListener(new af(i2, this));
        builderK.create().show();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.c);
        sb.append(",DebugSignal: ");
        sb.append(this.f);
        sb.append(",AFMA Version: ");
        sb.append(this.e);
        sb.append(",Ad Unit ID: ");
        return ec.m(sb, this.d, "}");
    }
}
