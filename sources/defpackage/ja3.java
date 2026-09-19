package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class ja3 extends yl implements a7 {
    public static final z61 p = new z61("AppSet.API", new t90(3), new ig(9));
    public final Context n;
    public final am o;

    public ja3(Context context, am amVar) {
        super(context, p, s3.a, xl.b);
        this.n = context;
        this.o = amVar;
    }

    @Override // defpackage.a7
    public final ve3 e() {
        if (this.o.c(this.n, 212800000) != 0) {
            v3 v3Var = new v3(new Status(17, null, null, null));
            ve3 ve3Var = new ve3();
            ve3Var.d(v3Var);
            return ve3Var;
        }
        j30 j30Var = new j30();
        j30Var.a = new ei[]{ar.k};
        j30Var.d = new v33(6, this);
        j30Var.b = false;
        j30Var.c = 27601;
        return b(0, j30Var.a());
    }
}
