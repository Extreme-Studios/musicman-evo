package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ek {
    public final z61 a;
    public final y91 b;
    public final kj c;
    public boolean d = false;
    public int e = -1;

    public ek(z61 z61Var, y91 y91Var, ClassLoader classLoader, sj sjVar, dk dkVar) {
        this.a = z61Var;
        this.b = y91Var;
        kj kjVarA = sjVar.a(dkVar.f);
        Bundle bundle = dkVar.o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        xj xjVar = kjVarA.w;
        if (xjVar != null && (xjVar.E || xjVar.F)) {
            j7.e("Fragment already added and state has been saved");
            throw null;
        }
        kjVarA.k = bundle;
        kjVarA.j = dkVar.g;
        kjVarA.r = dkVar.h;
        kjVarA.t = true;
        kjVarA.A = dkVar.i;
        kjVarA.B = dkVar.j;
        kjVarA.C = dkVar.k;
        kjVarA.F = dkVar.l;
        kjVarA.q = dkVar.m;
        kjVarA.E = dkVar.n;
        kjVarA.D = dkVar.p;
        kjVarA.P = fo.values()[dkVar.q];
        Bundle bundle2 = dkVar.r;
        if (bundle2 != null) {
            kjVarA.g = bundle2;
        } else {
            kjVarA.g = new Bundle();
        }
        this.c = kjVarA;
        if (xj.E(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + kjVarA);
        }
    }

    public final void a() {
        boolean zE = xj.E(3);
        kj kjVar = this.c;
        if (zE) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + kjVar);
        }
        Bundle bundle = kjVar.g;
        kjVar.y.K();
        kjVar.f = 3;
        kjVar.H = false;
        kjVar.n();
        if (!kjVar.H) {
            j7.b(kjVar, " did not call through to super.onActivityCreated()");
            return;
        }
        if (xj.E(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + kjVar);
        }
        kjVar.g = null;
        xj xjVar = kjVar.y;
        xjVar.E = false;
        xjVar.F = false;
        xjVar.L.g = false;
        xjVar.t(4);
        this.a.g(false);
    }

    public final void b() {
        boolean zE = xj.E(3);
        kj kjVar = this.c;
        if (zE) {
            Log.d("FragmentManager", "moveto ATTACHED: " + kjVar);
        }
        kj kjVar2 = kjVar.l;
        ek ekVar = null;
        y91 y91Var = this.b;
        if (kjVar2 != null) {
            ek ekVar2 = (ek) ((HashMap) y91Var.h).get(kjVar2.j);
            if (ekVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(kjVar);
                kj kjVar3 = kjVar.l;
                sb.append(" declared target fragment ");
                sb.append(kjVar3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            kjVar.m = kjVar.l.j;
            kjVar.l = null;
            ekVar = ekVar2;
        } else {
            String str = kjVar.m;
            if (str != null && (ekVar = (ek) ((HashMap) y91Var.h).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(kjVar);
                sb2.append(" declared target fragment ");
                j7.e(ec.m(sb2, kjVar.m, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (ekVar != null) {
            ekVar.j();
        }
        xj xjVar = kjVar.w;
        kjVar.x = xjVar.t;
        kjVar.z = xjVar.v;
        z61 z61Var = this.a;
        z61Var.n(false);
        ArrayList arrayList = kjVar.T;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kj kjVar4 = ((ij) obj).a;
            ((az) kjVar4.S.g).a();
            ss0.i(kjVar4);
        }
        arrayList.clear();
        kjVar.y.b(kjVar.x, kjVar.a(), kjVar);
        kjVar.f = 0;
        kjVar.H = false;
        kjVar.p(kjVar.x.D);
        if (!kjVar.H) {
            j7.b(kjVar, " did not call through to super.onAttach()");
            return;
        }
        Iterator it = kjVar.w.m.iterator();
        while (it.hasNext()) {
            ((bk) it.next()).c();
        }
        xj xjVar2 = kjVar.y;
        xjVar2.E = false;
        xjVar2.F = false;
        xjVar2.L.g = false;
        xjVar2.t(0);
        z61Var.h(false);
    }

    public final int c() {
        kj kjVar = this.c;
        if (kjVar.w == null) {
            return kjVar.f;
        }
        int iMin = this.e;
        int iOrdinal = kjVar.P.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (kjVar.r) {
            boolean z = kjVar.s;
            int i = this.e;
            if (z) {
                iMin = Math.max(i, 2);
            } else {
                iMin = i < 4 ? Math.min(iMin, kjVar.f) : Math.min(iMin, 1);
            }
        }
        if (!kjVar.p) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = kjVar.I;
        if (viewGroup != null) {
            ne neVarD = ne.d(viewGroup, kjVar.i().C());
            ArrayList arrayList = neVarD.b;
            if (arrayList.size() > 0) {
                ((o10) arrayList.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList2 = neVarD.c;
            if (arrayList2.size() > 0) {
                ((o10) arrayList2.get(0)).getClass();
                throw null;
            }
        }
        if (kjVar.q) {
            iMin = kjVar.m() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (kjVar.J && kjVar.f < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (xj.E(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + kjVar);
        }
        return iMin;
    }

    public final void d() {
        Parcelable parcelable;
        int i = 3;
        boolean zE = xj.E(3);
        kj kjVar = this.c;
        if (zE) {
            Log.d("FragmentManager", "moveto CREATED: " + kjVar);
        }
        boolean z = kjVar.N;
        Bundle bundle = kjVar.g;
        if (z) {
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                kjVar.y.P(parcelable);
                xj xjVar = kjVar.y;
                xjVar.E = false;
                xjVar.F = false;
                xjVar.L.g = false;
                xjVar.t(1);
            }
            kjVar.f = 1;
            return;
        }
        z61 z61Var = this.a;
        z61Var.p(false);
        Bundle bundle2 = kjVar.g;
        kjVar.y.K();
        kjVar.f = 1;
        kjVar.H = false;
        kjVar.Q.a(new pw(i, kjVar));
        kjVar.S.k(bundle2);
        kjVar.q(bundle2);
        kjVar.N = true;
        if (!kjVar.H) {
            j7.b(kjVar, " did not call through to super.onCreate()");
        } else {
            kjVar.Q.d(eo.ON_CREATE);
            z61Var.i(false);
        }
    }

    public final void e() {
        String resourceName;
        kj kjVar = this.c;
        if (kjVar.r) {
            return;
        }
        if (xj.E(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + kjVar);
        }
        LayoutInflater layoutInflaterT = kjVar.t(kjVar.g);
        ViewGroup viewGroup = kjVar.I;
        if (viewGroup == null) {
            int i = kjVar.B;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + kjVar + " for a container view with no id");
                }
                viewGroup = (ViewGroup) kjVar.w.u.p(i);
                if (viewGroup == null) {
                    if (!kjVar.t) {
                        try {
                            resourceName = kjVar.y().getResources().getResourceName(kjVar.B);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(kjVar.B) + " (" + resourceName + ") for fragment " + kjVar);
                    }
                } else if (!(viewGroup instanceof nj)) {
                    fk fkVar = gk.a;
                    gk.b(new hk(kjVar, viewGroup, 1));
                    gk.a(kjVar).getClass();
                }
            }
        }
        kjVar.I = viewGroup;
        kjVar.x(layoutInflaterT, viewGroup, kjVar.g);
        kjVar.f = 2;
    }

    public final void f() {
        boolean z;
        kj kjVarD;
        boolean zE = xj.E(3);
        kj kjVar = this.c;
        if (zE) {
            Log.d("FragmentManager", "movefrom CREATED: " + kjVar);
        }
        int i = 0;
        boolean z2 = kjVar.q && !kjVar.m();
        y91 y91Var = this.b;
        if (z2) {
        }
        if (!z2) {
            ak akVar = (ak) y91Var.j;
            if (!((akVar.b.containsKey(kjVar.j) && akVar.e) ? akVar.f : true)) {
                String str = kjVar.m;
                if (str != null && (kjVarD = y91Var.d(str)) != null && kjVarD.F) {
                    kjVar.l = kjVarD;
                }
                kjVar.f = 0;
                return;
            }
        }
        mj mjVar = kjVar.x;
        if (mjVar != null) {
            z = ((ak) y91Var.j).f;
        } else {
            c4 c4Var = mjVar.D;
            z = c4Var != null ? !c4Var.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((ak) y91Var.j).c(kjVar);
        }
        kjVar.y.k();
        kjVar.Q.d(eo.ON_DESTROY);
        kjVar.f = 0;
        kjVar.H = false;
        kjVar.N = false;
        kjVar.H = true;
        if (!kjVar.H) {
            j7.b(kjVar, " did not call through to super.onDestroy()");
            return;
        }
        this.a.j(false);
        ArrayList arrayListI = y91Var.i();
        int size = arrayListI.size();
        while (i < size) {
            Object obj = arrayListI.get(i);
            i++;
            ek ekVar = (ek) obj;
            if (ekVar != null) {
                kj kjVar2 = ekVar.c;
                if (kjVar.j.equals(kjVar2.m)) {
                    kjVar2.l = kjVar;
                    kjVar2.m = null;
                }
            }
        }
        String str2 = kjVar.m;
        if (str2 != null) {
            kjVar.l = y91Var.d(str2);
        }
        y91Var.m(this);
    }

    public final void g() {
        kj kjVar = this.c;
        if (xj.E(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + kjVar);
        }
        ViewGroup viewGroup = kjVar.I;
        kjVar.y.t(1);
        kjVar.f = 1;
        kjVar.H = false;
        kjVar.r();
        if (!kjVar.H) {
            j7.b(kjVar, " did not call through to super.onDestroyView()");
            return;
        }
        n10 n10Var = ((op) new s70(kjVar.d(), op.c).l(op.class)).b;
        if (n10Var.h > 0) {
            n10Var.g[0].getClass();
            j7.j();
            return;
        }
        kjVar.u = false;
        this.a.u(false);
        kjVar.I = null;
        bt btVar = kjVar.R;
        btVar.getClass();
        bt.a("setValue");
        btVar.g++;
        btVar.e = null;
        btVar.c(null);
        kjVar.s = false;
    }

    public final void h() {
        boolean zE = xj.E(3);
        kj kjVar = this.c;
        if (zE) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + kjVar);
        }
        kjVar.f = -1;
        kjVar.H = false;
        kjVar.s();
        if (!kjVar.H) {
            j7.b(kjVar, " did not call through to super.onDetach()");
            return;
        }
        xj xjVar = kjVar.y;
        if (!xjVar.G) {
            xjVar.k();
            kjVar.y = new xj();
        }
        this.a.k(false);
        kjVar.f = -1;
        kjVar.x = null;
        kjVar.z = null;
        kjVar.w = null;
        if (!kjVar.q || kjVar.m()) {
            ak akVar = (ak) this.b.j;
            if (!((akVar.b.containsKey(kjVar.j) && akVar.e) ? akVar.f : true)) {
                return;
            }
        }
        if (xj.E(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + kjVar);
        }
        kjVar.k();
    }

    public final void i() {
        kj kjVar = this.c;
        if (kjVar.r && kjVar.s && !kjVar.u) {
            if (xj.E(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + kjVar);
            }
            kjVar.x(kjVar.t(kjVar.g), null, kjVar.g);
        }
    }

    public final void j() {
        y91 y91Var = this.b;
        boolean z = this.d;
        kj kjVar = this.c;
        if (z) {
            if (xj.E(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + kjVar);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iC = c();
                int i = kjVar.f;
                if (iC == i) {
                    if (!z2 && i == -1 && kjVar.q && !kjVar.m()) {
                        if (xj.E(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + kjVar);
                        }
                        ((ak) y91Var.j).c(kjVar);
                        y91Var.m(this);
                        if (xj.E(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + kjVar);
                        }
                        kjVar.k();
                    }
                    if (kjVar.M) {
                        xj xjVar = kjVar.w;
                        if (xjVar != null && kjVar.p && xj.F(kjVar)) {
                            xjVar.D = true;
                        }
                        kjVar.M = false;
                        kjVar.y.n();
                    }
                    return;
                }
                if (iC <= i) {
                    switch (i - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            kjVar.f = 1;
                            break;
                        case 2:
                            kjVar.s = false;
                            kjVar.f = 2;
                            break;
                        case 3:
                            if (xj.E(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + kjVar);
                            }
                            kjVar.f = 3;
                            break;
                        case 4:
                            o();
                            break;
                        case 5:
                            kjVar.f = 5;
                            break;
                        case 6:
                            k();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            kjVar.f = 4;
                            break;
                        case 5:
                            n();
                            break;
                        case 6:
                            kjVar.f = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.d = false;
        }
    }

    public final void k() {
        boolean zE = xj.E(3);
        kj kjVar = this.c;
        if (zE) {
            Log.d("FragmentManager", "movefrom RESUMED: " + kjVar);
        }
        kjVar.y.t(5);
        kjVar.Q.d(eo.ON_PAUSE);
        kjVar.f = 6;
        kjVar.H = true;
        this.a.m(false);
    }

    public final void l(ClassLoader classLoader) {
        kj kjVar = this.c;
        Bundle bundle = kjVar.g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        kjVar.h = kjVar.g.getSparseParcelableArray("android:view_state");
        kjVar.i = kjVar.g.getBundle("android:view_registry_state");
        String string = kjVar.g.getString("android:target_state");
        kjVar.m = string;
        if (string != null) {
            kjVar.n = kjVar.g.getInt("android:target_req_state", 0);
        }
        boolean z = kjVar.g.getBoolean("android:user_visible_hint", true);
        kjVar.K = z;
        if (z) {
            return;
        }
        kjVar.J = true;
    }

    public final void m() {
        boolean zE = xj.E(3);
        kj kjVar = this.c;
        if (zE) {
            Log.d("FragmentManager", "moveto RESUMED: " + kjVar);
        }
        jj jjVar = kjVar.L;
        View view = jjVar == null ? null : jjVar.i;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        kjVar.f().i = null;
        kjVar.y.K();
        kjVar.y.x(true);
        kjVar.f = 7;
        kjVar.H = false;
        kjVar.H = true;
        if (!kjVar.H) {
            j7.b(kjVar, " did not call through to super.onResume()");
            return;
        }
        kjVar.Q.d(eo.ON_RESUME);
        xj xjVar = kjVar.y;
        xjVar.E = false;
        xjVar.F = false;
        xjVar.L.g = false;
        xjVar.t(7);
        this.a.q(false);
        kjVar.g = null;
        kjVar.h = null;
        kjVar.i = null;
    }

    public final void n() {
        boolean zE = xj.E(3);
        kj kjVar = this.c;
        if (zE) {
            Log.d("FragmentManager", "moveto STARTED: " + kjVar);
        }
        kjVar.y.K();
        kjVar.y.x(true);
        kjVar.f = 5;
        kjVar.H = false;
        kjVar.v();
        if (!kjVar.H) {
            j7.b(kjVar, " did not call through to super.onStart()");
            return;
        }
        kjVar.Q.d(eo.ON_START);
        xj xjVar = kjVar.y;
        xjVar.E = false;
        xjVar.F = false;
        xjVar.L.g = false;
        xjVar.t(5);
        this.a.s(false);
    }

    public final void o() {
        boolean zE = xj.E(3);
        kj kjVar = this.c;
        if (zE) {
            Log.d("FragmentManager", "movefrom STARTED: " + kjVar);
        }
        xj xjVar = kjVar.y;
        xjVar.F = true;
        xjVar.L.g = true;
        xjVar.t(4);
        kjVar.Q.d(eo.ON_STOP);
        kjVar.f = 4;
        kjVar.H = false;
        kjVar.w();
        if (kjVar.H) {
            this.a.t(false);
        } else {
            j7.b(kjVar, " did not call through to super.onStop()");
        }
    }

    public ek(z61 z61Var, y91 y91Var, kj kjVar) {
        this.a = z61Var;
        this.b = y91Var;
        this.c = kjVar;
    }

    public ek(z61 z61Var, y91 y91Var, kj kjVar, dk dkVar) {
        this.a = z61Var;
        this.b = y91Var;
        this.c = kjVar;
        kjVar.h = null;
        kjVar.i = null;
        kjVar.v = 0;
        kjVar.s = false;
        kjVar.p = false;
        kj kjVar2 = kjVar.l;
        kjVar.m = kjVar2 != null ? kjVar2.j : null;
        kjVar.l = null;
        Bundle bundle = dkVar.r;
        if (bundle != null) {
            kjVar.g = bundle;
        } else {
            kjVar.g = new Bundle();
        }
    }
}
