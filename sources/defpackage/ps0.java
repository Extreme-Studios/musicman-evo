package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class ps0 extends za0 {
    public final /* synthetic */ a8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps0(a8 a8Var, Looper looper) {
        super(looper, 3);
        this.b = a8Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        int i = this.b.w.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if (i3 == 2 || i3 == 1 || i3 == 7) {
                db0 db0Var = (db0) message.obj;
                db0Var.getClass();
                db0Var.c();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !this.b.e()) {
            db0 db0Var2 = (db0) message.obj;
            db0Var2.getClass();
            db0Var2.c();
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            a8 a8Var = this.b;
            a8Var.t = new db(message.arg2);
            if (!a8Var.u && !TextUtils.isEmpty(a8Var.u()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(a8Var.u());
                    a8 a8Var2 = this.b;
                    if (!a8Var2.u) {
                        a8Var2.y(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            a8 a8Var3 = this.b;
            db dbVar = a8Var3.t;
            if (dbVar == null) {
                dbVar = new db(8);
            }
            a8Var3.j.j(dbVar);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            a8 a8Var4 = this.b;
            db dbVar2 = a8Var4.t;
            if (dbVar2 == null) {
                dbVar2 = new db(8);
            }
            a8Var4.j.j(dbVar2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            this.b.j.j(new db(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            this.b.y(5, null);
            x7 x7Var = this.b.o;
            if (x7Var != null) {
                x7Var.T(message.arg2);
            }
            System.currentTimeMillis();
            a8.x(this.b, 5, 1, null);
            return;
        }
        if (i4 == 2 && !this.b.a()) {
            db0 db0Var3 = (db0) message.obj;
            db0Var3.getClass();
            db0Var3.c();
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", ec.h("Don't know how to handle message: ", i5), new Exception());
            return;
        }
        db0 db0Var4 = (db0) message.obj;
        synchronized (db0Var4) {
            try {
                bool = db0Var4.a;
                if (db0Var4.b) {
                    Log.w("GmsClient", "Callback proxy " + db0Var4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a8 a8Var5 = db0Var4.f;
            int i6 = db0Var4.d;
            if (i6 != 0) {
                a8Var5.y(1, null);
                Bundle bundle = db0Var4.e;
                db0Var4.a(new db(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!db0Var4.b()) {
                a8Var5.y(1, null);
                db0Var4.a(new db(8, null));
            }
        }
        synchronized (db0Var4) {
            db0Var4.b = true;
        }
        db0Var4.c();
    }
}
