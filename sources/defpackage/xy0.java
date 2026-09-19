package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xy0 extends mm0 {
    public final Object r;
    public final sz0 s;
    public final /* synthetic */ byte[] t;
    public final /* synthetic */ Map u;
    public final /* synthetic */ o83 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy0(n11 n11Var, int i, String str, sz0 sz0Var, un1 un1Var, byte[] bArr, Map map, o83 o83Var) {
        super(i, str, un1Var);
        this.t = bArr;
        this.u = map;
        this.v = o83Var;
        this.r = new Object();
        this.s = sz0Var;
    }

    @Override // defpackage.mm0
    public final Map e() {
        Map map = this.u;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // defpackage.mm0
    public final byte[] f() {
        byte[] bArr = this.t;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // defpackage.mm0
    public final md h(km0 km0Var) {
        String str;
        String str2;
        byte[] bArr = km0Var.b;
        try {
            Map map = km0Var.c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new md(str, w40.Y(km0Var));
    }

    @Override // defpackage.mm0
    public final void i(Object obj) {
        sz0 sz0Var;
        String str = (String) obj;
        o83 o83Var = this.v;
        if (o83.c() && str != null) {
            o83Var.e("onNetworkResponseBody", new zc1(str.getBytes()));
        }
        synchronized (this.r) {
            sz0Var = this.s;
        }
        sz0Var.b(str);
    }
}
