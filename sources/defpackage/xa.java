package defpackage;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.extremestudios.musicmanevo.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class xa extends wa implements d70, km, bz {
    public final vb g = new vb();
    public final r52 h;
    public final oo i;
    public final un1 j;
    public c70 k;
    public uu l;
    public final va m;
    public final qk n;
    public final ra o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public final CopyOnWriteArrayList t;
    public boolean u;
    public boolean v;

    public xa() {
        c4 c4Var = (c4) this;
        this.h = new r52(new x1(2, c4Var));
        oo ooVar = new oo(this);
        this.i = ooVar;
        az azVar = new az(this, new oa(2, this));
        un1 un1Var = new un1(azVar);
        this.j = un1Var;
        this.l = null;
        this.m = new va(c4Var);
        new oa(0, c4Var);
        qk qkVar = new qk();
        qkVar.g = new Object();
        qkVar.h = new ArrayList();
        this.n = qkVar;
        new AtomicInteger();
        this.o = new ra(c4Var);
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.t = new CopyOnWriteArrayList();
        this.u = false;
        this.v = false;
        ooVar.a(new sa(c4Var, 0));
        ooVar.a(new sa(c4Var, 1));
        ooVar.a(new sa(c4Var, 2));
        azVar.a();
        ss0.i(this);
        ((z61) un1Var.h).y("android:support:activity-result", new pa(0, c4Var));
        h(new qa(c4Var, 0));
    }

    @Override // defpackage.bz
    public final z61 b() {
        return (z61) this.j.h;
    }

    @Override // defpackage.km
    public final at c() {
        at atVar = new at();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = atVar.a;
        if (application != null) {
            linkedHashMap.put(a23.g, getApplication());
        }
        linkedHashMap.put(ss0.d, this);
        linkedHashMap.put(ss0.e, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(ss0.f, getIntent().getExtras());
        }
        return atVar;
    }

    @Override // defpackage.d70
    public final c70 d() {
        if (getApplication() == null) {
            j7.e("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.k == null) {
            ua uaVar = (ua) getLastNonConfigurationInstance();
            if (uaVar != null) {
                this.k = uaVar.a;
            }
            if (this.k == null) {
                this.k = new c70();
            }
        }
        return this.k;
    }

    @Override // defpackage.mo
    public final oo e() {
        return this.i;
    }

    public final void g(mb mbVar) {
        this.p.add(mbVar);
    }

    public final void h(wu wuVar) {
        vb vbVar = this.g;
        vbVar.getClass();
        if (((xa) vbVar.f) != null) {
            wuVar.a();
        }
        ((CopyOnWriteArraySet) vbVar.g).add(wuVar);
    }

    public final uu i() {
        if (this.l == null) {
            this.l = new uu(new q7(2, this));
            this.i.a(new pw(1, this));
        }
        return this.l;
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.o.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        i().a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((mb) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.wa, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.j.k(bundle);
        vb vbVar = this.g;
        vbVar.getClass();
        vbVar.f = this;
        Iterator it = ((CopyOnWriteArraySet) vbVar.g).iterator();
        while (it.hasNext()) {
            ((wu) it.next()).a();
        }
        super.onCreate(bundle);
        int i = bx.g;
        zw.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.h.h).iterator();
        while (it.hasNext()) {
            ((rj) it.next()).a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.h.h).iterator();
            while (it.hasNext()) {
                if (((rj) it.next()).a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.u = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.u = false;
            for (mb mbVar : this.s) {
                configuration.getClass();
                mbVar.accept(new ss(z));
            }
        } catch (Throwable th) {
            this.u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((mb) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.h.h).iterator();
        while (it.hasNext()) {
            ((rj) it.next()).a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.v = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.v = false;
            for (mb mbVar : this.t) {
                configuration.getClass();
                mbVar.accept(new nv(z));
            }
        } catch (Throwable th) {
            this.v = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.h.h).iterator();
        while (it.hasNext()) {
            ((rj) it.next()).a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.o.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ua uaVar;
        c70 c70Var = this.k;
        if (c70Var == null && (uaVar = (ua) getLastNonConfigurationInstance()) != null) {
            c70Var = uaVar.a;
        }
        if (c70Var == null) {
            return null;
        }
        ua uaVar2 = new ua();
        uaVar2.a = c70Var;
        return uaVar2;
    }

    @Override // defpackage.wa, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        oo ooVar = this.i;
        if (ooVar != null) {
            ooVar.c("setCurrentState");
            ooVar.e(fo.h);
        }
        super.onSaveInstanceState(bundle);
        this.j.m(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((mb) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (jn.g()) {
                jn.d("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            qk qkVar = this.n;
            synchronized (qkVar.g) {
                try {
                    qkVar.f = true;
                    ArrayList arrayList = (ArrayList) qkVar.h;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((rk) obj).a();
                    }
                    ((ArrayList) qkVar.h).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        j();
        View decorView = getWindow().getDecorView();
        va vaVar = this.m;
        if (!vaVar.h) {
            vaVar.h = true;
            decorView.getViewTreeObserver().addOnDrawListener(vaVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.u) {
            return;
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((mb) it.next()).accept(new ss(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.v) {
            return;
        }
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((mb) it.next()).accept(new nv(z));
        }
    }
}
