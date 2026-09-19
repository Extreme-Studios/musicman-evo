package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ed implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ id g;

    public ed(id idVar, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.f = 2;
        this.g = idVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        id idVar = this.g;
        switch (i) {
            case 0:
                idVar.g.getClass();
                break;
            case 1:
                idVar.g.getClass();
                break;
            case 2:
                idVar.g.getClass();
                break;
            default:
                idVar.g.getClass();
                break;
        }
    }

    public /* synthetic */ ed(id idVar, Bundle bundle, int i) {
        this.f = i;
        this.g = idVar;
    }
}
