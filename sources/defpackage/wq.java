package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;

/* JADX INFO: loaded from: classes.dex */
public final class wq {
    public final uq a;

    public wq(uq uqVar) {
        this.a = uqVar;
    }

    public static final wq b(Context context) {
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        r2 r2Var = r2.a;
        sb.append(i >= 30 ? r2Var.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        uq uqVar = (i >= 30 ? r2Var.a() : 0) >= 5 ? new uq(context) : null;
        if (uqVar != null) {
            return new wq(uqVar);
        }
        return null;
    }

    public hp a(ve veVar) {
        throw null;
    }

    public hp c() {
        return jn.c(rs0.b(v51.b(jf.a), new bc2(this, null, 6)));
    }

    public hp d(Uri uri, InputEvent inputEvent) {
        uri.getClass();
        return jn.c(rs0.b(v51.b(jf.a), new vq(this, uri, inputEvent, null)));
    }

    public hp e(Uri uri) {
        uri.getClass();
        return jn.c(rs0.b(v51.b(jf.a), new sd(this, uri, null, 1)));
    }

    public hp f(t70 t70Var) {
        throw null;
    }

    public hp g(u70 u70Var) {
        throw null;
    }
}
