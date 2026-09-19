package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class gd implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Uri g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Bundle i;
    public final /* synthetic */ id j;

    public gd(id idVar, int i, Uri uri, boolean z, Bundle bundle) {
        this.j = idVar;
        this.f = i;
        this.g = uri;
        this.h = z;
        this.i = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.g.g(this.f, this.g, this.h, this.i);
    }
}
