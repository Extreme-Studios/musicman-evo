package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class f22 implements j22 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public f22(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((rj1) obj).a;
        ej1.E("gmp_app_id", bundle, this.a);
        ej1.E("fbs_aiid", bundle, this.b);
        ej1.E("fbs_aeid", bundle, this.c);
        ej1.E("apm_id_origin", bundle, this.d);
        Long l = this.e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        ej1.E("fbs_aeid", ((rj1) obj).b, this.c);
    }
}
