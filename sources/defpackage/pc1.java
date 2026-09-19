package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class pc1 {
    public final Context f;
    public final String g;
    public final WeakReference h;

    public pc1(md1 md1Var) {
        Context context = md1Var.getContext();
        this.f = context;
        this.g = vc3.C.c.E(context, md1Var.u().f);
        this.h = new WeakReference(md1Var);
    }

    public abstract boolean b(String str);

    public boolean d(String str, String[] strArr) {
        return b(str);
    }

    public boolean g(String str, String[] strArr, fc1 fc1Var) {
        return b(str);
    }

    public abstract void l();

    public final void m(String str, String str2, String str3, String str4) {
        f32.b.post(new oc1(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void n(HashMap map) {
        md1 md1Var = (md1) this.h.get();
        if (md1Var != null) {
            md1Var.a("onPrecacheEvent", map);
        }
    }

    public void a() {
    }

    public void h(int i) {
    }

    public void i(int i) {
    }

    public void j(int i) {
    }

    public void k(int i) {
    }
}
