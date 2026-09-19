package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class j2 {
    public final Context a;
    public final m51 b;

    public j2(Context context, String str) {
        dq.g(context, "context cannot be null");
        es0 es0Var = ut0.f.b;
        j41 j41Var = new j41();
        es0Var.getClass();
        m51 m51Var = (m51) new pm0(es0Var, context, str, j41Var).d(context, false);
        this.a = context;
        this.b = m51Var;
    }

    public final k2 a() {
        Context context = this.a;
        try {
            return new k2(context, this.b.b());
        } catch (RemoteException e) {
            jn.P("Failed to build AdLoader.", e);
            return new k2(context, new n52(new x52()));
        }
    }

    public final void b(et etVar) {
        try {
            m51 m51Var = this.b;
            boolean z = etVar.a;
            boolean z2 = etVar.c;
            int i = etVar.d;
            j60 j60Var = etVar.e;
            m51Var.x1(new qz0(4, z, -1, z2, i, j60Var != null ? new ee2(j60Var) : null, etVar.f, etVar.b, etVar.h, etVar.g, etVar.i - 1));
        } catch (RemoteException e) {
            jn.V("Failed to specify native ad options", e);
        }
    }
}
