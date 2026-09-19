package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class kj implements ComponentCallbacks, View.OnCreateContextMenuListener, mo, d70, km, bz {
    public static final Object V = new Object();
    public int A;
    public int B;
    public String C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean H;
    public ViewGroup I;
    public boolean J;
    public jj L;
    public boolean M;
    public boolean N;
    public String O;
    public oo Q;
    public un1 S;
    public final ArrayList T;
    public final ij U;
    public Bundle g;
    public SparseArray h;
    public Bundle i;
    public Bundle k;
    public kj l;
    public int n;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public xj w;
    public mj x;
    public kj z;
    public int f = -1;
    public String j = UUID.randomUUID().toString();
    public String m = null;
    public Boolean o = null;
    public xj y = new xj();
    public final boolean G = true;
    public boolean K = true;
    public fo P = fo.j;
    public final bt R = new bt();

    public kj() {
        new AtomicInteger();
        this.T = new ArrayList();
        this.U = new ij(this);
        j();
    }

    public abstract i8 a();

    @Override // defpackage.bz
    public final z61 b() {
        return (z61) this.S.h;
    }

    @Override // defpackage.km
    public final at c() {
        Application application;
        Context applicationContext = y().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && xj.E(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + y().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        at atVar = new at();
        LinkedHashMap linkedHashMap = atVar.a;
        if (application != null) {
            linkedHashMap.put(a23.g, application);
        }
        linkedHashMap.put(ss0.d, this);
        linkedHashMap.put(ss0.e, this);
        Bundle bundle = this.k;
        if (bundle != null) {
            linkedHashMap.put(ss0.f, bundle);
        }
        return atVar;
    }

    @Override // defpackage.d70
    public final c70 d() {
        if (this.w == null) {
            j7.e("Can't access ViewModels from detached fragment");
            return null;
        }
        if (h() == 1) {
            j7.e("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.w.L.d;
        c70 c70Var = (c70) map.get(this.j);
        if (c70Var != null) {
            return c70Var;
        }
        c70 c70Var2 = new c70();
        map.put(this.j, c70Var2);
        return c70Var2;
    }

    @Override // defpackage.mo
    public final oo e() {
        return this.Q;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final jj f() {
        if (this.L == null) {
            jj jjVar = new jj();
            Object obj = V;
            jjVar.f = obj;
            jjVar.g = obj;
            jjVar.h = obj;
            jjVar.i = null;
            this.L = jjVar;
        }
        return this.L;
    }

    public final xj g() {
        if (this.x != null) {
            return this.y;
        }
        j7.c(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    public final int h() {
        fo foVar = this.P;
        return (foVar == fo.g || this.z == null) ? foVar.ordinal() : Math.min(foVar.ordinal(), this.z.h());
    }

    public final xj i() {
        xj xjVar = this.w;
        if (xjVar != null) {
            return xjVar;
        }
        j7.c(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public final void j() {
        this.Q = new oo(this);
        this.S = new un1(new az(this, new oa(2, this)));
        ArrayList arrayList = this.T;
        ij ijVar = this.U;
        if (arrayList.contains(ijVar)) {
            return;
        }
        if (this.f < 0) {
            arrayList.add(ijVar);
            return;
        }
        kj kjVar = ijVar.a;
        ((az) kjVar.S.g).a();
        ss0.i(kjVar);
    }

    public final void k() {
        j();
        this.O = this.j;
        this.j = UUID.randomUUID().toString();
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.v = 0;
        this.w = null;
        this.y = new xj();
        this.x = null;
        this.A = 0;
        this.B = 0;
        this.C = null;
        this.D = false;
        this.E = false;
    }

    public final boolean l() {
        if (this.D) {
            return true;
        }
        xj xjVar = this.w;
        if (xjVar != null) {
            kj kjVar = this.z;
            xjVar.getClass();
            if (kjVar == null ? false : kjVar.l()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        return this.v > 0;
    }

    public abstract void n();

    public void o(int i, int i2, Intent intent) {
        if (xj.E(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mj mjVar = this.x;
        c4 c4Var = mjVar == null ? null : mjVar.C;
        if (c4Var != null) {
            c4Var.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            j7.c(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.H = true;
    }

    public void p(Context context) {
        this.H = true;
        mj mjVar = this.x;
        if ((mjVar == null ? null : mjVar.C) != null) {
            this.H = true;
        }
    }

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s();

    public LayoutInflater t(Bundle bundle) {
        mj mjVar = this.x;
        if (mjVar == null) {
            j7.e("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        c4 c4Var = mjVar.G;
        LayoutInflater layoutInflaterCloneInContext = c4Var.getLayoutInflater().cloneInContext(c4Var);
        layoutInflaterCloneInContext.setFactory2(this.y.f);
        return layoutInflaterCloneInContext;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.j);
        if (this.A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.A));
        }
        if (this.C != null) {
            sb.append(" tag=");
            sb.append(this.C);
        }
        sb.append(")");
        return sb.toString();
    }

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w();

    public void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.y.K();
        this.u = true;
        d();
    }

    public final Context y() {
        mj mjVar = this.x;
        c4 c4Var = mjVar == null ? null : mjVar.D;
        if (c4Var != null) {
            return c4Var;
        }
        j7.c(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final void z(int i, int i2, int i3, int i4) {
        if (this.L == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        f().b = i;
        f().c = i2;
        f().d = i3;
        f().e = i4;
    }
}
