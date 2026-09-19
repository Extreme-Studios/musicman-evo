package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class fd implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ id i;

    public /* synthetic */ fd(id idVar, String str, Bundle bundle, int i) {
        this.f = i;
        this.i = idVar;
        this.g = str;
        this.h = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Bundle bundle = this.h;
        String str = this.g;
        id idVar = this.i;
        switch (i) {
            case 0:
                idVar.g.a(str, bundle);
                break;
            default:
                idVar.g.f(str, bundle);
                break;
        }
    }
}
