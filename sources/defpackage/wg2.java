package defpackage;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class wg2 implements ug2, md2 {
    public final /* synthetic */ int a;
    public final Context b;
    public final dh2 c;
    public final ya1 d;
    public final vc2 e;
    public final AtomicBoolean f;
    public hp g;

    public wg2(Context context, dh2 dh2Var, vc2 vc2Var, ya1 ya1Var) {
        this.a = 0;
        this.f = new AtomicBoolean(false);
        this.g = na1.t("E");
        this.b = context;
        this.c = dh2Var;
        this.e = vc2Var;
        this.d = ya1Var;
    }

    @Override // defpackage.md2
    public final hp a() {
        int i = this.a;
        ya1 ya1Var = this.d;
        AtomicBoolean atomicBoolean = this.f;
        switch (i) {
            case 0:
                return atomicBoolean.getAndSet(true) ? kn2.g : ya1Var.b(new s22(9, this));
            default:
                return (atomicBoolean.getAndSet(true) || !this.e.E()) ? kn2.g : ya1Var.a(new ly1(20, this));
        }
    }

    @Override // defpackage.ug2
    public final void b(HashMap map, Context context, View view) {
        switch (this.a) {
            case 0:
                e(map);
                break;
            default:
                map.put("gs", this.g);
                break;
        }
    }

    @Override // defpackage.ug2
    public final void c(HashMap map) {
        switch (this.a) {
            case 0:
                e(map);
                break;
            default:
                map.put("gs", this.g);
                break;
        }
    }

    @Override // defpackage.ug2
    public final void d(HashMap map) {
        switch (this.a) {
            case 0:
                e(map);
                break;
            default:
                map.put("gs", this.g);
                break;
        }
    }

    public void e(HashMap map) {
        synchronized (this) {
            map.put("ai", this.g);
        }
    }

    public wg2(Context context, dh2 dh2Var, ya1 ya1Var, vc2 vc2Var) {
        this.a = 1;
        this.f = new AtomicBoolean(false);
        this.g = kn2.g;
        this.b = context;
        this.c = dh2Var;
        this.d = ya1Var;
        this.e = vc2Var;
    }
}
