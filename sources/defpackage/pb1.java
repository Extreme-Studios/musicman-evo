package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.extremestudios.musicmanevo.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pb1 extends FrameLayout {
    public final md1 f;
    public final FrameLayout g;
    public final View h;
    public final sx0 i;
    public final ob1 j;
    public final long k;
    public final lb1 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public long r;
    public String s;
    public String[] t;
    public Bitmap u;
    public final ImageView v;
    public boolean w;

    public pb1(Context context, md1 md1Var, int i, boolean z, sx0 sx0Var, ub1 ub1Var, es1 es1Var) {
        lb1 kb1Var;
        lb1 id1Var;
        super(context);
        this.f = md1Var;
        this.i = sx0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        dq.f(md1Var.k());
        Object obj = md1Var.k().g;
        vb1 vb1Var = new vb1(context, md1Var.u(), md1Var.m(), sx0Var, md1Var.j());
        if (i == 3) {
            id1Var = new id1(context, vb1Var);
        } else {
            if (i == 2) {
                md1Var.x().getClass();
                kb1Var = new bc1(context, vb1Var, md1Var, z, ub1Var, es1Var);
            } else {
                kb1Var = new kb1(context, md1Var, z, md1Var.x().b(), new vb1(context, md1Var.u(), md1Var.m(), sx0Var, md1Var.j()), es1Var);
            }
            id1Var = kb1Var;
        }
        this.l = id1Var;
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(0);
        frameLayout.addView(id1Var, new FrameLayout.LayoutParams(-1, -1, 17));
        ix0 ix0Var = lx0.R;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) tu0Var.c.a(lx0.O)).booleanValue()) {
            a();
        }
        this.v = new ImageView(context);
        this.k = ((Long) tu0Var.c.a(lx0.T)).longValue();
        boolean zBooleanValue = ((Boolean) tu0Var.c.a(lx0.Q)).booleanValue();
        this.p = zBooleanValue;
        sx0Var.c("spinner_used", true != zBooleanValue ? "0" : "1");
        this.j = new ob1(this);
        id1Var.e(this);
    }

    public final void a() {
        lb1 lb1Var = this.l;
        if (lb1Var == null) {
            return;
        }
        TextView textView = new TextView(lb1Var.getContext());
        Resources resourcesC = vc3.C.h.c();
        textView.setText(String.valueOf(resourcesC == null ? "AdMob - " : resourcesC.getString(R.string.watermark_label_prefix)).concat(lb1Var.d()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.g;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void b() {
        lb1 lb1Var = this.l;
        if (lb1Var == null) {
            return;
        }
        long jK = lb1Var.k();
        if (this.q == jK || jK <= 0) {
            return;
        }
        float f = jK / 1000.0f;
        if (((Boolean) tu0.e.c.a(lx0.Y1)).booleanValue()) {
            String strValueOf = String.valueOf(f);
            String strValueOf2 = String.valueOf(lb1Var.r());
            String strValueOf3 = String.valueOf(lb1Var.q());
            String strValueOf4 = String.valueOf(lb1Var.p());
            String strValueOf5 = String.valueOf(lb1Var.s());
            vc3.C.k.getClass();
            c("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            c("timeupdate", "time", String.valueOf(f));
        }
        this.q = jK;
    }

    public final void c(String str, String... strArr) {
        HashMap map = new HashMap();
        lb1 lb1Var = this.l;
        Integer numZ = lb1Var != null ? lb1Var.z() : null;
        if (numZ != null) {
            map.put("playerId", numZ.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f.a("onVideoEvent", map);
    }

    public final void d() {
        md1 md1Var = this.f;
        if (md1Var.g() == null || !this.n || this.o) {
            return;
        }
        md1Var.g().getWindow().clearFlags(128);
        this.n = false;
    }

    public final void e() {
        lb1 lb1Var = this.l;
        if (lb1Var != null && this.r == 0) {
            c("canplaythrough", "duration", String.valueOf(lb1Var.j() / 1000.0f), "videoWidth", String.valueOf(lb1Var.n()), "videoHeight", String.valueOf(lb1Var.o()));
        }
    }

    public final void f() {
        if (((Boolean) tu0.e.c.a(lx0.a2)).booleanValue()) {
            ob1 ob1Var = this.j;
            ob1Var.h = false;
            e32 e32Var = zb3.l;
            e32Var.removeCallbacks(ob1Var);
            e32Var.postDelayed(ob1Var, 250L);
        }
        md1 md1Var = this.f;
        if (md1Var.g() != null && !this.n) {
            boolean z = (md1Var.g().getWindow().getAttributes().flags & 128) != 0;
            this.o = z;
            if (!z) {
                md1Var.g().getWindow().addFlags(128);
                this.n = true;
            }
        }
        this.m = true;
    }

    public final void finalize() throws Throwable {
        try {
            this.j.a();
            lb1 lb1Var = this.l;
            if (lb1Var != null) {
                za1.f.execute(new va1(2, lb1Var));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        c("pause", new String[0]);
        d();
        this.m = false;
    }

    public final void h() {
        if (((Boolean) tu0.e.c.a(lx0.a2)).booleanValue()) {
            this.j.a();
        }
        c("ended", new String[0]);
        d();
    }

    public final void i() {
        if (this.w && this.u != null) {
            ImageView imageView = this.v;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.u);
                imageView.invalidate();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = this.g;
                frameLayout.addView(imageView, layoutParams);
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.j.a();
        this.r = this.q;
        zb3.l.post(new mb1(this, 1));
    }

    public final void j(int i, int i2) {
        if (this.p) {
            ix0 ix0Var = lx0.S;
            tu0 tu0Var = tu0.e;
            int iMax = Math.max(i / ((Integer) tu0Var.c.a(ix0Var)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) tu0Var.c.a(ix0Var)).intValue(), 1);
            Bitmap bitmap = this.u;
            if (bitmap != null && bitmap.getWidth() == iMax && this.u.getHeight() == iMax2) {
                return;
            }
            this.u = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.w = false;
        }
    }

    public final void k() {
        this.h.setVisibility(4);
        zb3.l.post(new mb1(this, 2));
    }

    public final void l(int i, int i2, int i3, int i4) {
        if (jn.B()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i2).length() + 3 + String.valueOf(i3).length() + 3 + String.valueOf(i4).length());
            ec.v(sb, "Set video bounds to x:", i, ";y:", i2);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            jn.p(sb.toString());
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.g.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ob1 ob1Var = this.j;
        if (z) {
            ob1Var.h = false;
            e32 e32Var = zb3.l;
            e32Var.removeCallbacks(ob1Var);
            e32Var.postDelayed(ob1Var, 250L);
        } else {
            ob1Var.a();
            this.r = this.q;
        }
        zb3.l.post(new ob1(this, z, 1));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        int i2 = 0;
        ob1 ob1Var = this.j;
        if (i == 0) {
            ob1Var.h = false;
            e32 e32Var = zb3.l;
            e32Var.removeCallbacks(ob1Var);
            e32Var.postDelayed(ob1Var, 250L);
            z = true;
        } else {
            ob1Var.a();
            this.r = this.q;
            z = false;
        }
        zb3.l.post(new ob1(this, z, i2));
    }
}
