package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class po extends Service implements mo {
    public final p83 f = new p83(this);

    @Override // defpackage.mo
    public final oo e() {
        return (oo) this.f.g;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        p83 p83Var = this.f;
        p83Var.getClass();
        p83Var.p(eo.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        p83 p83Var = this.f;
        p83Var.getClass();
        p83Var.p(eo.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        p83 p83Var = this.f;
        p83Var.getClass();
        p83Var.p(eo.ON_STOP);
        p83Var.p(eo.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        p83 p83Var = this.f;
        p83Var.getClass();
        p83Var.p(eo.ON_START);
        super.onStart(intent, i);
    }
}
