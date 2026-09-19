package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z01 extends mm0 {
    public final cb1 r;
    public final o83 s;

    public z01(String str, cb1 cb1Var) {
        super(0, str, new i01(cb1Var));
        this.r = cb1Var;
        o83 o83Var = new o83();
        this.s = o83Var;
        if (o83.c()) {
            Object obj = null;
            o83Var.e("onNetworkRequest", new u40(str, "GET", obj, obj, 22, false));
        }
    }

    @Override // defpackage.mm0
    public final md h(km0 km0Var) {
        return new md(km0Var, w40.Y(km0Var));
    }

    @Override // defpackage.mm0
    public final void i(Object obj) {
        km0 km0Var = (km0) obj;
        Map map = km0Var.c;
        int i = km0Var.a;
        o83 o83Var = this.s;
        o83Var.getClass();
        if (o83.c()) {
            o83Var.e("onNetworkResponse", new e3(i, map));
            if (i < 200 || i >= 300) {
                o83Var.e("onNetworkRequestError", new ao2(null, 4));
            }
        }
        byte[] bArr = km0Var.b;
        if (o83.c() && bArr != null) {
            o83Var.e("onNetworkResponseBody", new zc1(bArr));
        }
        this.r.b(km0Var);
    }
}
