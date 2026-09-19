package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class u12 implements j22 {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public u12(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        Bundle bundle = ((rj1) obj).a;
        ej1.E("pn", bundle, this.a);
        Integer num = this.b;
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        ej1.E("vnm", bundle, this.c);
        ej1.E("dl", bundle, this.d);
        ej1.E("ins_pn", bundle, this.e);
        ej1.E("ini_pn", bundle, this.f);
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        Bundle bundle = ((rj1) obj).b;
        ej1.E("pn", bundle, this.a);
        ej1.E("dl", bundle, this.d);
    }
}
