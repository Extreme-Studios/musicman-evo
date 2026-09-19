package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fe3 implements pm1, a7 {
    public final Object f;
    public final Object g;

    public fe3(Context context) {
        p83 p83Var;
        this.f = new ja3(context, am.b);
        synchronized (p83.class) {
            try {
                if (p83.j == null) {
                    p83.j = new p83(context.getApplicationContext());
                }
                p83Var = p83.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = p83Var;
    }

    @Override // defpackage.pm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo0b(Object obj) {
        ((ge3) obj).p(0, ((xb3) this.f).a, (vd3) this.g);
    }

    @Override // defpackage.a7
    public ve3 e() {
        ve3 ve3VarE = ((ja3) this.f).e();
        w32 w32Var = new w32(10, this);
        ve3VarE.getClass();
        h90 h90Var = m30.a;
        ve3 ve3Var = new ve3();
        ve3VarE.b.b(new tk1(h90Var, w32Var, ve3Var, 1));
        ve3VarE.h();
        return ve3Var;
    }

    public /* synthetic */ fe3(xb3 xb3Var, vd3 vd3Var) {
        this.f = xb3Var;
        this.g = vd3Var;
    }
}
