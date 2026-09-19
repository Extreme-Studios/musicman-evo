package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class z12 implements j22 {
    public final String a;
    public final int b;

    public z12(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((rj1) obj).a;
        bundle.putString("request_id", this.a);
        if (this.b == 2) {
            bundle.putInt("sod", 1);
        }
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        ((rj1) obj).b.putString("request_id", this.a);
    }
}
