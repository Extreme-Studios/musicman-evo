package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class k12 implements j22 {
    public final String a;
    public final boolean b;

    public k12(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((rj1) obj).a;
        bundle.putString("gct", this.a);
        if (this.b) {
            bundle.putString("de", "1");
        }
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        ((rj1) obj).b.putString("gct", this.a);
    }
}
