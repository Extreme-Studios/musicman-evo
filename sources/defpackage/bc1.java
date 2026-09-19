package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bc1 extends lb1 implements TextureView.SurfaceTextureListener, qb1 {
    public final md1 h;
    public final vb1 i;
    public final ub1 j;
    public final es1 k;
    public pb1 l;
    public Surface m;
    public ed1 n;
    public String o;
    public String[] p;
    public boolean q;
    public int r;
    public tb1 s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public float y;

    public bc1(Context context, vb1 vb1Var, md1 md1Var, boolean z, ub1 ub1Var, es1 es1Var) {
        super(context);
        this.r = 1;
        this.h = md1Var;
        this.i = vb1Var;
        this.t = z;
        this.j = ub1Var;
        vb1Var.a(this);
        this.k = es1Var;
    }

    public static String J(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        ec.x(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // defpackage.lb1
    public final void A(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.p = new String[]{str};
        } else {
            this.p = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.o;
        boolean z = false;
        if (this.j.k && str2 != null && !str.equals(str2) && this.r == 4) {
            z = true;
        }
        this.o = str;
        F(z, num);
    }

    @Override // defpackage.lb1
    public final void B(int i) {
        ed1 ed1Var = this.n;
        if (ed1Var != null) {
            wc1 wc1Var = ed1Var.g;
            synchronized (wc1Var) {
                wc1Var.b = ((long) i) * 1000;
            }
        }
    }

    @Override // defpackage.lb1
    public final void C(int i) {
        ed1 ed1Var = this.n;
        if (ed1Var != null) {
            wc1 wc1Var = ed1Var.g;
            synchronized (wc1Var) {
                wc1Var.c = ((long) i) * 1000;
            }
        }
    }

    public final boolean D() {
        ed1 ed1Var = this.n;
        return (ed1Var == null || ed1Var.l == null || this.q) ? false : true;
    }

    public final boolean E() {
        return D() && this.r != 1;
    }

    public final void F(boolean z, Integer num) {
        ed1 ed1Var = this.n;
        if (ed1Var != null && !z) {
            ed1Var.v = num;
            return;
        }
        if (this.o == null || this.m == null) {
            return;
        }
        if (z) {
            if (!D()) {
                jn.T("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
            d93 d93Var = ed1Var.l;
            d93Var.i.b();
            d93Var.h.p();
            G();
        }
        if (this.o.startsWith("cache:")) {
            pc1 pc1VarU0 = this.h.u0(this.o);
            if (pc1VarU0 instanceof tc1) {
                tc1 tc1Var = (tc1) pc1VarU0;
                synchronized (tc1Var) {
                    tc1Var.l = true;
                    tc1Var.notify();
                }
                ed1 ed1Var2 = tc1Var.i;
                ed1Var2.o = null;
                tc1Var.i = null;
                this.n = ed1Var2;
                ed1Var2.v = num;
                if (ed1Var2.l == null) {
                    jn.T("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(pc1VarU0 instanceof sc1)) {
                    jn.T("Stream cache miss: ".concat(String.valueOf(this.o)));
                    return;
                }
                sc1 sc1Var = (sc1) pc1VarU0;
                md1 md1Var = this.h;
                vc3.C.c.E(md1Var.getContext(), md1Var.u().f);
                synchronized (sc1Var.p) {
                    try {
                        ByteBuffer byteBuffer = sc1Var.n;
                        if (byteBuffer != null && !sc1Var.o) {
                            byteBuffer.flip();
                            sc1Var.o = true;
                        }
                        sc1Var.k = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ByteBuffer byteBuffer2 = sc1Var.n;
                boolean z2 = sc1Var.s;
                String str = sc1Var.i;
                if (str == null) {
                    jn.T("Stream cache URL is null.");
                    return;
                }
                ub1 ub1Var = this.j;
                md1 md1Var2 = this.h;
                ed1 ed1Var3 = new ed1(md1Var2.getContext(), ub1Var, md1Var2, num);
                jn.R("ExoPlayerAdapter initialized.");
                this.n = ed1Var3;
                ed1Var3.u(new Uri[]{Uri.parse(str)}, byteBuffer2, z2);
            }
        } else {
            ub1 ub1Var2 = this.j;
            md1 md1Var3 = this.h;
            ed1 ed1Var4 = new ed1(md1Var3.getContext(), ub1Var2, md1Var3, num);
            jn.R("ExoPlayerAdapter initialized.");
            this.n = ed1Var4;
            md1 md1Var4 = this.h;
            vc3.C.c.E(md1Var4.getContext(), md1Var4.u().f);
            Uri[] uriArr = new Uri[this.p.length];
            int i = 0;
            while (true) {
                String[] strArr = this.p;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            ed1 ed1Var5 = this.n;
            ed1Var5.getClass();
            ed1Var5.u(uriArr, ByteBuffer.allocate(0), false);
        }
        this.n.o = this;
        H(this.m);
        d93 d93Var2 = this.n.l;
        if (d93Var2 != null) {
            int iY1 = d93Var2.y1();
            this.r = iY1;
            if (iY1 == 3) {
                I();
            }
        }
    }

    public final void G() {
        if (this.n != null) {
            H(null);
            ed1 ed1Var = this.n;
            if (ed1Var != null) {
                ed1Var.o = null;
                d93 d93Var = ed1Var.l;
                if (d93Var != null) {
                    d93Var.i.b();
                    d93Var.h.T1(ed1Var);
                    d93 d93Var2 = ed1Var.l;
                    d93Var2.i.b();
                    d93Var2.h.U1();
                    ed1Var.l = null;
                    ed1.A.decrementAndGet();
                }
                this.n = null;
            }
            this.r = 1;
            this.q = false;
            this.u = false;
            this.v = false;
        }
    }

    public final void H(Surface surface) {
        ed1 ed1Var = this.n;
        if (ed1Var == null) {
            jn.T("Trying to set surface before player is initialized.");
            return;
        }
        try {
            d93 d93Var = ed1Var.l;
            if (d93Var != null) {
                d93Var.i.b();
                p73 p73Var = d93Var.h;
                p73Var.g2();
                p73Var.e2(surface);
                int i = surface == null ? 0 : -1;
                p73Var.f2(i, i);
            }
        } catch (IOException e) {
            jn.V("", e);
        }
    }

    public final void I() {
        if (this.u) {
            return;
        }
        this.u = true;
        zb3.l.post(new xb1(this, 0));
        y();
        vb1 vb1Var = this.i;
        if (vb1Var.i && !vb1Var.j) {
            jn.q(vb1Var.e, vb1Var.d, "vfr2");
            vb1Var.j = true;
        }
        if (this.v) {
            h();
        }
    }

    @Override // defpackage.lb1
    public final void a(int i) {
        ed1 ed1Var = this.n;
        if (ed1Var != null) {
            wc1 wc1Var = ed1Var.g;
            synchronized (wc1Var) {
                wc1Var.d = ((long) i) * 1000;
            }
        }
    }

    @Override // defpackage.lb1
    public final void b(int i) {
        ed1 ed1Var = this.n;
        if (ed1Var != null) {
            wc1 wc1Var = ed1Var.g;
            synchronized (wc1Var) {
                wc1Var.e = ((long) i) * 1000;
            }
        }
    }

    @Override // defpackage.lb1
    public final void c(int i) {
        ed1 ed1Var = this.n;
        if (ed1Var != null) {
            Iterator it = ed1Var.y.iterator();
            while (it.hasNext()) {
                vc1 vc1Var = (vc1) ((WeakReference) it.next()).get();
                if (vc1Var != null) {
                    vc1Var.w = i;
                    for (Socket socket : vc1Var.x) {
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(vc1Var.w);
                            } catch (SocketException e) {
                                jn.V("Failed to update receive buffer size.", e);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.lb1
    public final String d() {
        return "ExoPlayer/2".concat(true != this.t ? "" : " spherical");
    }

    @Override // defpackage.lb1
    public final void e(pb1 pb1Var) {
        this.l = pb1Var;
    }

    @Override // defpackage.lb1
    public final void f(String str) {
        if (str != null) {
            A(str, null, null);
        }
    }

    @Override // defpackage.qb1
    public final void f0(int i) {
        ed1 ed1Var;
        if (this.r != i) {
            this.r = i;
            if (i == 3) {
                I();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.j.a && (ed1Var = this.n) != null) {
                ed1Var.s(false);
            }
            this.i.m = false;
            wb1 wb1Var = this.g;
            wb1Var.d = false;
            wb1Var.a();
            zb3.l.post(new xb1(this, 2));
        }
    }

    @Override // defpackage.lb1
    public final void g() {
        if (D()) {
            d93 d93Var = this.n.l;
            d93Var.i.b();
            d93Var.h.p();
            G();
        }
        vb1 vb1Var = this.i;
        vb1Var.m = false;
        wb1 wb1Var = this.g;
        wb1Var.d = false;
        wb1Var.a();
        vb1Var.b();
    }

    @Override // defpackage.lb1
    public final void h() {
        ed1 ed1Var;
        if (!E()) {
            this.v = true;
            return;
        }
        if (this.j.a && (ed1Var = this.n) != null) {
            ed1Var.s(true);
        }
        d93 d93Var = this.n.l;
        d93Var.i.b();
        d93Var.h.i2(true);
        this.i.d();
        wb1 wb1Var = this.g;
        wb1Var.d = true;
        wb1Var.a();
        this.f.c = true;
        zb3.l.post(new xb1(this, 3));
    }

    @Override // defpackage.lb1
    public final void i() {
        ed1 ed1Var;
        if (E()) {
            if (this.j.a && (ed1Var = this.n) != null) {
                ed1Var.s(false);
            }
            d93 d93Var = this.n.l;
            d93Var.i.b();
            d93Var.h.i2(false);
            this.i.m = false;
            wb1 wb1Var = this.g;
            wb1Var.d = false;
            wb1Var.a();
            zb3.l.post(new xb1(this, 4));
        }
    }

    @Override // defpackage.lb1
    public final int j() {
        if (E()) {
            return (int) this.n.l.R1();
        }
        return 0;
    }

    @Override // defpackage.lb1
    public final int k() {
        if (E()) {
            return (int) this.n.l.M1();
        }
        return 0;
    }

    @Override // defpackage.lb1
    public final void l(int i) {
        if (E()) {
            d93 d93Var = this.n.l;
            d93Var.r1(d93Var.K1(), i);
        }
    }

    @Override // defpackage.lb1
    public final void m(float f, float f2) {
        tb1 tb1Var = this.s;
        if (tb1Var != null) {
            tb1Var.c(f, f2);
        }
    }

    @Override // defpackage.lb1
    public final int n() {
        return this.w;
    }

    @Override // defpackage.lb1
    public final int o() {
        return this.x;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.y;
        if (f != 0.0f && this.s == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        tb1 tb1Var = this.s;
        if (tb1Var != null) {
            tb1Var.a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ed1 ed1Var;
        float f;
        int i3;
        SurfaceTexture surfaceTexture2;
        es1 es1Var;
        if (this.t) {
            if (((Boolean) tu0.e.c.a(lx0.be)).booleanValue() && (es1Var = this.k) != null) {
                us2 us2VarA = es1Var.a();
                us2VarA.s("action", "svp_aepv");
                us2VarA.t();
            }
            tb1 tb1Var = new tb1(getContext());
            this.s = tb1Var;
            tb1Var.r = i;
            tb1Var.q = i2;
            tb1Var.t = surfaceTexture;
            tb1Var.start();
            if (tb1Var.t == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    tb1Var.y.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = tb1Var.s;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.s.b();
                this.s = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.m = surface;
        if (this.n == null) {
            F(false, null);
        } else {
            H(surface);
            if (!this.j.a && (ed1Var = this.n) != null) {
                ed1Var.s(true);
            }
        }
        int i4 = this.w;
        if (i4 == 0 || (i3 = this.x) == 0) {
            f = i2 > 0 ? i / i2 : 1.0f;
            if (this.y != f) {
                this.y = f;
                requestLayout();
            }
        } else {
            f = i3 > 0 ? i4 / i3 : 1.0f;
            if (this.y != f) {
                this.y = f;
                requestLayout();
            }
        }
        zb3.l.post(new xb1(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i();
        tb1 tb1Var = this.s;
        if (tb1Var != null) {
            tb1Var.b();
            this.s = null;
        }
        ed1 ed1Var = this.n;
        if (ed1Var != null) {
            if (ed1Var != null) {
                ed1Var.s(false);
            }
            Surface surface = this.m;
            if (surface != null) {
                surface.release();
            }
            this.m = null;
            H(null);
        }
        zb3.l.post(new xb1(this, 6));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        tb1 tb1Var = this.s;
        if (tb1Var != null) {
            tb1Var.a(i, i2);
        }
        zb3.l.post(new jb1(this, i, i2, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.i.c(this);
        this.f.a(surfaceTexture, this.l);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        jn.p(sb.toString());
        zb3.l.post(new og(i, 7, this));
        super.onWindowVisibilityChanged(i);
    }

    @Override // defpackage.lb1
    public final long p() {
        ed1 ed1Var = this.n;
        if (ed1Var == null) {
            return -1L;
        }
        if (ed1Var.x == null || !ed1Var.x.u) {
            return ed1Var.p;
        }
        return 0L;
    }

    @Override // defpackage.lb1
    public final long q() {
        ed1 ed1Var = this.n;
        if (ed1Var != null) {
            return ed1Var.q();
        }
        return -1L;
    }

    @Override // defpackage.lb1
    public final long r() {
        ed1 ed1Var = this.n;
        if (ed1Var != null) {
            return ed1Var.r();
        }
        return -1L;
    }

    @Override // defpackage.lb1
    public final int s() {
        ed1 ed1Var = this.n;
        if (ed1Var != null) {
            return ed1Var.q;
        }
        return -1;
    }

    @Override // defpackage.qb1
    public final void t() {
        zb3.l.post(new xb1(this, 1));
    }

    @Override // defpackage.qb1
    public final void u(IOException iOException) {
        String strJ = J("onLoadException", iOException);
        jn.T("ExoPlayerAdapter exception: ".concat(strJ));
        vc3.C.h.e("AdExoPlayerView.onException", iOException);
        zb3.l.post(new yb1(this, strJ, 0));
    }

    @Override // defpackage.qb1
    public final void v(long j, boolean z) {
        if (this.h != null) {
            za1.f.execute(new ac1(this, z, j, 0));
        }
    }

    @Override // defpackage.qb1
    public final void w(int i, int i2) {
        this.w = i;
        this.x = i2;
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.y != f) {
            this.y = f;
            requestLayout();
        }
    }

    @Override // defpackage.qb1
    public final void x(String str, Exception exc) {
        ed1 ed1Var;
        String strJ = J(str, exc);
        jn.T("ExoPlayerAdapter error: ".concat(strJ));
        int i = 1;
        this.q = true;
        if (this.j.a && (ed1Var = this.n) != null) {
            ed1Var.s(false);
        }
        zb3.l.post(new yb1(this, strJ, i));
        vc3.C.h.e("AdExoPlayerView.onError", exc);
    }

    @Override // defpackage.lb1
    public final void y() {
        zb3.l.post(new xb1(this, 7));
    }

    @Override // defpackage.lb1
    public final Integer z() {
        ed1 ed1Var = this.n;
        if (ed1Var != null) {
            return ed1Var.v;
        }
        return null;
    }
}
