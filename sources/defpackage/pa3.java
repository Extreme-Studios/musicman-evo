package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class pa3 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ qx1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa3(qx1 qx1Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = qx1Var;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        qx1 qx1Var = this.c;
        qx1Var.b(na3.a((Context) qx1Var.g, (qk1) qx1Var.o, (AudioDeviceInfo) qx1Var.n));
    }
}
