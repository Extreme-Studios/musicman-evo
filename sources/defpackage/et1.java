package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class et1 implements om1 {
    public final Bundle f = new Bundle();

    @Override // defpackage.om1
    public final synchronized void l(String str) {
        this.f.putInt(str, 1);
    }

    @Override // defpackage.om1
    public final synchronized void s(String str, String str2) {
        this.f.putInt(str, 3);
    }

    @Override // defpackage.om1
    public final synchronized void w(String str) {
        this.f.putInt(str, 2);
    }

    @Override // defpackage.om1
    public final void b() {
    }

    @Override // defpackage.om1
    public final void d() {
    }

    @Override // defpackage.om1
    public final void I(String str) {
    }
}
