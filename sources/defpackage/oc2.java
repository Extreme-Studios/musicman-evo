package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.MotionEvent;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oc2 implements pr, j6, zv, x7, z82, db1, dr, hn2, gm1, pz0, ke1 {
    public static oc2 h;
    public final /* synthetic */ int f;
    public final Object g;

    public oc2(wz0 wz0Var) {
        a01 zz0Var;
        this.f = 13;
        this.g = new ArrayList();
        try {
            wz0Var.c();
        } catch (RemoteException e) {
            jn.P("", e);
        }
        try {
            ArrayList arrayListH = wz0Var.h();
            int size = arrayListH.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListH.get(i);
                i++;
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zz0Var = iInterfaceQueryLocalInterface instanceof a01 ? (a01) iInterfaceQueryLocalInterface : new zz0(iBinder);
                } else {
                    zz0Var = null;
                }
                if (zz0Var != null) {
                    ((ArrayList) this.g).add(new b01(zz0Var));
                }
            }
        } catch (RemoteException e2) {
            jn.P("", e2);
        }
    }

    public static final oc2 o(Context context) {
        oc2 oc2Var;
        synchronized (oc2.class) {
            try {
                if (h == null) {
                    h = new oc2(context);
                }
                oc2Var = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oc2Var;
    }

    @Override // defpackage.dr
    public void A(g2 g2Var) {
        try {
            ((o51) this.g).a(g2Var.d());
        } catch (RemoteException e) {
            jn.P("", e);
        }
    }

    @Override // defpackage.x7
    public void T(int i) {
        ((bm) this.g).T(i);
    }

    @Override // defpackage.x7
    public void Y() {
        ((bm) this.g).Y();
    }

    @Override // defpackage.db1
    /* JADX INFO: renamed from: a */
    public void mo3a() {
        switch (this.f) {
            case 12:
                e01 e01Var = ((gt) this.g).g;
                if (e01Var == null) {
                    return;
                }
                try {
                    e01Var.U2(null);
                    return;
                } catch (RemoteException e) {
                    jn.P("Unable to call setMediaContent on delegate", e);
                    return;
                }
            case 15:
                ((cb1) this.g).c(new w31("Cannot get Javascript Engine"));
                return;
            case 25:
                no1 no1Var = ((oq1) this.g).i;
                if (no1Var != null) {
                    synchronized (no1Var) {
                        no1Var.n.I("_videoMediaView");
                    }
                    return;
                }
                return;
            default:
                String str = "persistFlags";
                hp hpVarB = ((kd0) this.g).b();
                if (!((Boolean) tu0.e.c.a(lx0.h8)).booleanValue()) {
                    ej1.s(hpVarB, "persistFlags");
                    return;
                }
                gp2 gp2Var = new gp2(str, 2);
                hpVarB.a(new in2(hpVarB, 0, gp2Var), za1.g);
                return;
        }
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 20:
                ((jk1) obj).s((fu1) obj2);
                break;
            case zw0.zzm /* 21 */:
                ((al1) obj).G0((mi1) obj2);
                break;
            case 22:
                ((dm1) obj).f0((gw0) obj2);
                break;
            default:
                ((i21) obj).U((g81) obj2);
                break;
        }
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        boolean z = false;
        switch (this.f) {
            case 19:
                ((vi1) this.g).f.R(true);
                return;
            case 24:
                try {
                    md1 md1Var = (md1) ((List) obj).get(0);
                    if (md1Var == null) {
                        return;
                    }
                    try {
                        op1 op1Var = (op1) this.g;
                        op1Var.getClass();
                        op1Var.h.execute(new xd1(md1Var, 5));
                        return;
                    } catch (ClassCastException e) {
                        e = e;
                    }
                } catch (ClassCastException | IndexOutOfBoundsException e2) {
                    e = e2;
                }
                if (((Boolean) tu0.e.c.a(lx0.O5)).booleanValue()) {
                    vc3.C.h.d("omid native display exp", e);
                    return;
                }
                return;
            case 26:
                String str = (String) obj;
                synchronized (this) {
                    dt1 dt1Var = (dt1) this.g;
                    dt1Var.c = true;
                    vc3.C.k.getClass();
                    dt1Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - dt1Var.d), "", true);
                    dt1Var.i.execute(new hb1(this, str, 14, z));
                    break;
                }
                return;
            default:
                ((bv1) this.g).c.A((e52) obj);
                return;
        }
    }

    @Override // defpackage.pz0
    public JSONObject h() {
        return null;
    }

    @Override // defpackage.pr
    public boolean i(rr rrVar, MenuItem menuItem) {
        u1 u1Var = ((ActionMenuView) this.g).E;
        if (u1Var == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((s70) u1Var).g).L.h).iterator();
        while (it.hasNext()) {
            if (((rj) it.next()).a.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.z82
    public /* synthetic */ void j(long j, cw1 cw1Var) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 9:
                s90.A(j, cw1Var, ((oh0) obj).I);
                break;
            default:
                s90.I(j, cw1Var, (me0[]) ((r52) obj).h);
                break;
        }
    }

    public dc k(dc dcVar) {
        return dcVar instanceof vw ? dcVar : new v2(-((rq) this.g).f(), dcVar);
    }

    @Override // defpackage.pz0
    /* JADX INFO: renamed from: l */
    public JSONObject mo15l() {
        return null;
    }

    @Override // defpackage.pr
    public void m(rr rrVar) {
        dr0 dr0Var = ((ActionMenuView) this.g).z;
        if (dr0Var != null) {
            dr0Var.m(rrVar);
        }
    }

    public void n() {
        ((mj) this.g).F.K();
    }

    @Override // defpackage.ke1
    public /* synthetic */ void q(String str, int i, String str2, boolean z) {
        md1 md1Var = (md1) this.g;
        md1Var.J0();
        md1Var.e0().Y();
    }

    public void r() {
        synchronized (oc2.class) {
            z61 z61Var = (z61) this.g;
            z61Var.J("vendor_scoped_gpid_v2_id");
            z61Var.J("vendor_scoped_gpid_v2_creation_time");
        }
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        switch (this.f) {
            case 19:
                ((vi1) this.g).f.R(false);
                return;
            case 24:
                if (((Boolean) tu0.e.c.a(lx0.O5)).booleanValue()) {
                    vc3.C.h.d("omid native display exp", th);
                    return;
                }
                return;
            case 26:
                synchronized (this) {
                    dt1 dt1Var = (dt1) this.g;
                    dt1Var.c = true;
                    vc3.C.k.getClass();
                    dt1Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - dt1Var.d), "Internal Error.", false);
                    dt1Var.e.c(new Exception());
                    break;
                }
                return;
            default:
                return;
        }
    }

    private final void p(Throwable th) {
    }

    public void c(int i) {
    }

    public void d(int i) {
    }

    @Override // defpackage.pz0
    public void g(MotionEvent motionEvent) {
    }

    public oc2() {
        this.f = 17;
        this.g = new WeakHashMap();
    }

    public oc2(Context context) {
        this.f = 0;
        if (z61.k == null) {
            z61.k = new z61(context);
        }
        this.g = z61.k;
        kc2.n(context);
    }

    public /* synthetic */ oc2(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public oc2(w51 w51Var, o51 o51Var) {
        this.f = 16;
        this.g = o51Var;
    }

    public oc2(dt1 dt1Var) {
        this.f = 26;
        Objects.requireNonNull(dt1Var);
        this.g = dt1Var;
    }

    public oc2(byte[] bArr) {
        this.f = 11;
        this.g = new byte[256];
        for (int i = 0; i < 256; i++) {
            ((byte[]) this.g)[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = (byte[]) this.g;
            byte b = bArr2[i3];
            i2 = (i2 + b + bArr[i3 % bArr.length]) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
        }
    }

    public void f(int i, float f) {
    }
}
