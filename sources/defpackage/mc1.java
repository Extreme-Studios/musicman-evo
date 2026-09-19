package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mc1 implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ mc1(he1 he1Var, View view, d91 d91Var, int i) {
        this.h = he1Var;
        this.i = view;
        this.j = d91Var;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Object obj = this.j;
        int i2 = this.g;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheComplete");
                map.put("src", (String) obj3);
                map.put("cachedSrc", (String) obj2);
                map.put("totalBytes", Integer.toString(i2));
                ((pc1) obj).n(map);
                return;
            case 1:
                ((he1) obj3).s((View) obj2, (d91) obj, i2 - 1);
                return;
            default:
                oh2 oh2Var = (oh2) obj3;
                mh2 mh2Var = (mh2) obj2;
                s62 s62Var = (s62) obj;
                String str = oh2Var.b;
                try {
                    qx1 qx1Var = oh2Var.a;
                    if (qx1Var == null) {
                        throw null;
                    }
                    hh2 hh2Var = (hh2) qx1Var.o;
                    if (hh2Var == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i2);
                    String str2 = mh2Var.a;
                    if (!oh2.b(str2)) {
                        str2.getClass();
                        bundle.putString("sessionToken", str2.trim());
                    }
                    String str3 = mh2Var.b;
                    if (!oh2.b(str3)) {
                        str3.getClass();
                        bundle.putString("appId", str3.trim());
                    }
                    nh2 nh2Var = new nh2(oh2Var, s62Var);
                    fh2 fh2Var = (fh2) hh2Var;
                    Parcel parcelU = fh2Var.U();
                    kt0.c(parcelU, bundle);
                    kt0.e(parcelU, nh2Var);
                    fh2Var.O0(parcelU, 3);
                    return;
                } catch (RemoteException e) {
                    oh2.c.g(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i2), str);
                    return;
                }
        }
    }

    public /* synthetic */ mc1(oh2 oh2Var, mh2 mh2Var, int i, s62 s62Var) {
        this.h = oh2Var;
        this.i = mh2Var;
        this.g = i;
        this.j = s62Var;
    }

    public mc1(pc1 pc1Var, String str, String str2, int i) {
        this.h = str;
        this.i = str2;
        this.g = i;
        this.j = pc1Var;
    }
}
