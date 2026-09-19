package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class y63 extends od {
    public final WeakReference b;

    public y63(xx0 xx0Var) {
        this.b = new WeakReference(xx0Var);
    }

    @Override // defpackage.od
    public final void a(nd ndVar) {
        xx0 xx0Var = (xx0) this.b.get();
        if (xx0Var != null) {
            xx0Var.b = ndVar;
            try {
                ((nm) ndVar.a).O0();
            } catch (RemoteException unused) {
            }
            y91 y91Var = xx0Var.d;
            if (y91Var != null) {
                xx0 xx0Var2 = (xx0) y91Var.g;
                nd ndVar2 = xx0Var2.b;
                if (ndVar2 == null) {
                    xx0Var2.a = null;
                } else if (xx0Var2.a == null) {
                    xx0Var2.a = ndVar2.b(null);
                }
                md mdVar = new md(xx0Var2.a);
                zb3.z(mdVar, (Bundle) y91Var.h);
                un1 un1VarA = mdVar.a();
                Intent intent = (Intent) un1VarA.g;
                Context context = (Context) y91Var.i;
                intent.setPackage(a23.r(context));
                intent.setData((Uri) y91Var.j);
                context.startActivity(intent, (Bundle) un1VarA.h);
                Activity activity = (Activity) context;
                y63 y63Var = xx0Var2.c;
                if (y63Var == null) {
                    return;
                }
                activity.unbindService(y63Var);
                xx0Var2.b = null;
                xx0Var2.a = null;
                xx0Var2.c = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        xx0 xx0Var = (xx0) this.b.get();
        if (xx0Var != null) {
            xx0Var.b = null;
            xx0Var.a = null;
        }
    }
}
