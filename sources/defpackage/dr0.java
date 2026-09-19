package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class dr0 implements nb, tr, c2, pr, xm0, hn2, db1, dr, gm1, ke1, fv1, li1, yd2, wm2, i42 {
    public static final kt2 h = new kt2(28);
    public final /* synthetic */ int f;
    public Object g;

    public dr0(wz0 wz0Var) {
        this.f = 17;
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
                a01 a01VarB3 = obj instanceof IBinder ? oz0.B3((IBinder) obj) : null;
                if (a01VarB3 != null) {
                    ((ArrayList) this.g).add(new zy1(a01VarB3));
                }
            }
        } catch (RemoteException e2) {
            jn.P("", e2);
        }
    }

    public static dr0 n(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        dr0 dr0Var = new dr0(0);
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new tt(1, dr0Var));
                return dr0Var;
            } catch (RuntimeException unused) {
                synchronized (dr0.class) {
                    dr0Var.g = null;
                }
            }
        }
        return dr0Var;
    }

    @Override // defpackage.dr
    public void A(g2 g2Var) {
        try {
            ((i51) this.g).a(g2Var.d());
        } catch (RemoteException e) {
            jn.P("", e);
        }
    }

    @Override // defpackage.wm2
    public hp a() {
        Bundle bundle;
        String str;
        HashMap map;
        vk2 vk2VarA;
        e22 e22Var = (e22) this.g;
        ix0 ix0Var = lx0.Ib;
        tu0 tu0Var = tu0.e;
        boolean zBooleanValue = ((Boolean) tu0Var.c.a(ix0Var)).booleanValue();
        String lowerCase = e22Var.e.g;
        if (zBooleanValue) {
            lowerCase = lowerCase.toLowerCase(Locale.ROOT);
        }
        if (((Boolean) tu0Var.c.a(lx0.L1)).booleanValue()) {
            et1 et1Var = e22Var.h;
            synchronized (et1Var) {
                bundle = new Bundle(et1Var.f);
            }
        } else {
            bundle = new Bundle();
        }
        if (((Boolean) tu0Var.c.a(lx0.C4)).booleanValue()) {
            qa1 qa1VarM = vc3.C.h.g().m();
            str = (TextUtils.isEmpty(qa1VarM.e) || qa1VarM.g == null) ? "EMPTY" : qa1VarM.b() ? "VALID" : "INVALID";
        } else {
            str = "";
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        boolean zBooleanValue2 = ((Boolean) tu0Var.c.a(lx0.U1)).booleanValue();
        ez1 ez1Var = e22Var.c;
        String str3 = e22Var.j;
        if (zBooleanValue2) {
            synchronized (ez1Var) {
                try {
                    vk2 vk2VarA2 = ez1Var.a(str3, lowerCase);
                    vk2 vk2VarI = ez1Var.i(lowerCase);
                    map = new HashMap();
                    for (Map.Entry entry : (sk2) vk2VarA2.entrySet()) {
                        String str4 = (String) entry.getKey();
                        if (vk2VarI.containsKey(str4)) {
                            hz1 hz1Var = (hz1) vk2VarI.get(str4);
                            List list = (List) entry.getValue();
                            map.put(str4, new hz1(str4, hz1Var.b, hz1Var.c, hz1Var.d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                        }
                    }
                    dl2 dl2VarA = vk2VarI.entrySet().a();
                    while (dl2VarA.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) dl2VarA.next();
                        String str5 = (String) entry2.getKey();
                        if (!map.containsKey(str5) && ((hz1) entry2.getValue()).d) {
                            map.put(str5, (hz1) entry2.getValue());
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            e22Var.b(arrayList, map);
        } else {
            for (Map.Entry entry3 : (sk2) ez1Var.a(str3, lowerCase).entrySet()) {
                String str6 = (String) entry3.getKey();
                List list2 = (List) entry3.getValue();
                Bundle bundle2 = e22Var.e.d.r;
                arrayList.add(e22Var.d(str6, list2, bundle2 != null ? bundle2.getBundle(str6) : null, true, true));
            }
            synchronized (ez1Var) {
                vk2VarA = TextUtils.isEmpty(vc3.C.h.g().m().e) ? vk2.l : vk2.a(ez1Var.b);
            }
            e22Var.b(arrayList, vk2VarA);
        }
        vj2 vj2VarM = vj2.m(arrayList);
        ch0 ch0Var = new ch0(arrayList, bundle, str2, 4);
        ya1 ya1Var = e22Var.a;
        bn2 bn2Var = new bn2(vj2VarM, true, false);
        bn2Var.u = new an2(bn2Var, ch0Var, ya1Var);
        bn2Var.v();
        return bn2Var;
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((pl1) obj).A((e52) this.g);
    }

    @Override // defpackage.yd2
    public void c() {
        ((ak1) ((rf1) this.g).V.c()).B();
    }

    @Override // defpackage.fv1
    public hp d(r71 r71Var) {
        zu1 zu1Var = (zu1) ((r52) this.g).h;
        String str = r71Var.m;
        synchronized (zu1Var.g) {
            try {
                int i = zu1Var.m;
                if (i != 1 && i != 3) {
                    return na1.C(new dv1(2));
                }
                if (zu1Var.h) {
                    return zu1Var.f;
                }
                zu1Var.m = 3;
                zu1Var.h = true;
                zu1Var.l = str;
                zu1Var.k.m();
                cb1 cb1Var = zu1Var.f;
                cb1Var.f.a(new xu1(zu1Var, 0), za1.g);
                return cb1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        switch (this.f) {
            case 14:
                String str = (String) obj;
                md1 md1Var = (md1) this.g;
                new l51(md1Var.getContext(), md1Var.u().f, str, md1Var.E() != null ? md1Var.E().x0 : null).o1();
                return;
            case 20:
                ((nj1) this.g).f.a();
                return;
            default:
                e52 e52Var = (e52) obj;
                if (((Boolean) tu0.e.c.a(lx0.C6)).booleanValue()) {
                    qu1 qu1Var = (qu1) this.g;
                    z42 z42Var = (z42) e52Var.b.h;
                    wv1 wv1Var = qu1Var.e;
                    int i = z42Var.f;
                    synchronized (wv1Var.g) {
                        wv1Var.b = i;
                        break;
                    }
                    wv1 wv1Var2 = qu1Var.e;
                    long j = z42Var.g;
                    synchronized (wv1Var2.h) {
                        wv1Var2.c = j;
                        break;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.i42
    public /* bridge */ /* synthetic */ hp f(vg2 vg2Var, h42 h42Var) {
        return s(vg2Var, h42Var, null);
    }

    @Override // defpackage.tr
    public void g(rr rrVar, MenuItem menuItem) {
        ((g9) this.g).k.removeCallbacksAndMessages(rrVar);
    }

    @Override // defpackage.yd2
    public void h() {
        rf1 rf1Var = (rf1) this.g;
        ((kk1) rf1Var.R.c()).a();
        an1 an1Var = (an1) rf1Var.X.c();
        synchronized (an1Var) {
            an1Var.L1(fl1.r);
        }
    }

    @Override // defpackage.pr
    public boolean i(rr rrVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.tr
    public void j(rr rrVar, ur urVar) {
        g9 g9Var = (g9) this.g;
        Handler handler = g9Var.k;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = g9Var.m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (rrVar == ((f9) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new e9(this, i2 < arrayList.size() ? (f9) arrayList.get(i2) : null, urVar, rrVar), rrVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.i42
    public Object l() {
        tj1 tj1Var;
        synchronized (this) {
            tj1Var = (tj1) this.g;
        }
        return tj1Var;
    }

    @Override // defpackage.pr
    public void m(rr rrVar) {
        Toolbar toolbar = (Toolbar) this.g;
        r1 r1Var = toolbar.f.y;
        if (r1Var == null || !r1Var.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.L.h).iterator();
            while (it.hasNext()) {
                ((rj) it.next()).a.s();
            }
        }
    }

    public void o(ImageView.ScaleType scaleType) {
        e01 e01Var = ((gt) this.g).g;
        if (e01Var == null || scaleType == null) {
            return;
        }
        try {
            e01Var.A1(new ju(scaleType));
        } catch (RemoteException e) {
            jn.P("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    @Override // defpackage.c2
    public void p(Object obj) {
        b2 b2Var = (b2) obj;
        xj xjVar = (xj) this.g;
        uj ujVar = (uj) xjVar.C.pollFirst();
        if (ujVar == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = ujVar.f;
        int i = ujVar.g;
        kj kjVarG = xjVar.c.g(str);
        if (kjVarG != null) {
            kjVarG.o(i, b2Var.f, b2Var.g);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.ke1
    public /* synthetic */ void q(String str, int i, String str2, boolean z) {
        ((yu0) this.g).d();
    }

    public synchronized hp s(vg2 vg2Var, h42 h42Var, tj1 tj1Var) {
        vi1 vi1VarA;
        try {
            if (tj1Var != null) {
                this.g = tj1Var;
            } else {
                this.g = (tj1) h42Var.g((g42) vg2Var.h).c();
            }
            vi1VarA = ((tj1) this.g).a();
        } catch (Throwable th) {
            throw th;
        }
        return vi1VarA.c(vi1VarA.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    public List t(um0 um0Var) {
        String str;
        int i;
        List listSingletonList;
        cw1 cw1Var = new cw1((byte[]) um0Var.h);
        ArrayList arrayList = (List) this.g;
        while (cw1Var.B() > 0) {
            int iK = cw1Var.K();
            int iK2 = cw1Var.b + cw1Var.K();
            if (iK == 134) {
                arrayList = new ArrayList();
                int iK3 = cw1Var.K() & 31;
                for (int i2 = 0; i2 < iK3; i2++) {
                    String strK = cw1Var.k(3, StandardCharsets.UTF_8);
                    int iK4 = cw1Var.K();
                    boolean z = (iK4 & 128) != 0;
                    if (z) {
                        i = iK4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bK = (byte) cw1Var.K();
                    cw1Var.G(1);
                    if (z) {
                        int i3 = bK & 64;
                        byte[] bArr = rl1.a;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    uc3 uc3Var = new uc3();
                    uc3Var.e(str);
                    uc3Var.d = strK;
                    uc3Var.I = i;
                    uc3Var.o = listSingletonList;
                    arrayList.add(new de3(uc3Var));
                }
            }
            cw1Var.E(iK2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        switch (this.f) {
            case 14:
                vc3.C.h.d("DefaultGmsgHandlers.attributionReportingManager", th);
                return;
            case 20:
                return;
            default:
                if (((Boolean) tu0.e.c.a(lx0.C6)).booleanValue()) {
                    Matcher matcher = qu1.h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        qu1 qu1Var = (qu1) this.g;
                        int i = Integer.parseInt(strGroup);
                        wv1 wv1Var = qu1Var.e;
                        synchronized (wv1Var.g) {
                            wv1Var.b = i;
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void r(Throwable th) {
    }

    @Override // defpackage.yd2
    public void k(View view) {
    }

    public /* synthetic */ dr0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public /* synthetic */ dr0(Object obj, int i, Object obj2) {
        this.f = i;
        this.g = obj2;
    }

    public dr0(if1 if1Var) {
        this.f = 19;
        this.g = new u91((v63) if1Var.g, (v63) if1Var.R, (v63) new eg1(if1Var.S, 18), (v63) if1Var.T, (v63) if1Var.t, 9);
    }

    public dr0() {
        this.f = 1;
        int i = h13.a;
        bz1 bz1Var = new bz1(new w23[]{gm.n, h});
        Charset charset = m23.a;
        this.g = bz1Var;
    }

    public dr0(Context context, Executor executor) {
        this.f = 13;
        this.g = na1.F(new br0(0, context), executor);
    }

    public /* synthetic */ dr0(int i) {
        this.f = i;
    }

    public dr0(r31 r31Var) {
        this.f = 15;
        Objects.requireNonNull(r31Var);
        this.g = r31Var;
    }

    public dr0(EditText editText) {
        this.f = 4;
        this.g = new vg2(editText, 3);
    }

    @Override // defpackage.xm0
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public File mo2a() {
        return (File) this.g;
    }

    @Override // defpackage.li1
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public hv1 mo1a() throws l52 {
        try {
            return ((s51) ((ww1) this.g).b).f();
        } catch (RemoteException e) {
            throw new l52(e);
        }
    }

    @Override // defpackage.db1
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo3a() {
        ((r31) this.g).d.q();
    }
}
