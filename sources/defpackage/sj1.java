package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sj1 {
    public final u62 a;
    public final d60 b;
    public final ApplicationInfo c;
    public final String d;
    public final ArrayList e;
    public final PackageInfo f;
    public final o63 g;
    public final String h;
    public final o22 i;
    public final h73 j;
    public final i52 k;
    public final int l;
    public final em1 m;

    public sj1(u62 u62Var, d60 d60Var, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, o63 o63Var, h73 h73Var, String str2, o22 o22Var, i52 i52Var, em1 em1Var, int i) {
        this.a = u62Var;
        this.b = d60Var;
        this.c = applicationInfo;
        this.d = str;
        this.e = arrayList;
        this.f = packageInfo;
        this.g = o63Var;
        this.h = str2;
        this.i = o22Var;
        this.j = h73Var;
        this.k = i52Var;
        this.m = em1Var;
        this.l = i;
    }

    public final p62 a(Bundle bundle) {
        this.m.a();
        u62 u62Var = this.a;
        Objects.requireNonNull(u62Var);
        return new es0(u62Var, r62.g, null, u62.d, Collections.EMPTY_LIST, this.i.a(new rj1(new Bundle(), new Bundle()), bundle, this.l == 2)).y();
    }

    public final p62 b() {
        Bundle bundle = new Bundle();
        if (((Boolean) tu0.e.c.a(lx0.m2)).booleanValue()) {
            Bundle bundle2 = this.k.t;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        p62 p62VarA = a(bundle);
        hp[] hpVarArr = {p62VarA, (hp) this.g.c()};
        u62 u62Var = this.a;
        u62Var.getClass();
        List listAsList = Arrays.asList(hpVarArr);
        ch0 ch0Var = new ch0(this, p62VarA, bundle, 2);
        tj2 tj2Var = vj2.g;
        listAsList.getClass();
        vj2 vj2VarM = vj2.m(listAsList);
        gx0 gx0Var = gx0.f;
        ya1 ya1Var = za1.g;
        bn2 bn2Var = new bn2(vj2VarM, true, false);
        bn2Var.u = new an2(bn2Var, gx0Var, ya1Var);
        bn2Var.v();
        ya1 ya1Var2 = u62Var.a;
        bn2 bn2Var2 = new bn2(vj2VarM, true, false);
        bn2Var2.u = new an2(bn2Var2, ch0Var, ya1Var2);
        bn2Var2.v();
        return new es0(u62Var, r62.h, null, bn2Var, listAsList, bn2Var2).y();
    }
}
