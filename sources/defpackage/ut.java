package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ut extends jb {
    public static final String i = yp.f("NetworkStateTracker");
    public final ConnectivityManager g;
    public final tt h;

    public ut(Context context, l30 l30Var) {
        super(context, l30Var);
        this.g = (ConnectivityManager) this.b.getSystemService("connectivity");
        this.h = new tt(0, this);
    }

    @Override // defpackage.jb
    public final Object a() {
        return f();
    }

    @Override // defpackage.jb
    public final void d() {
        String str = i;
        try {
            yp.d().a(str, "Registering network callback", new Throwable[0]);
            this.g.registerDefaultNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            yp.d().c(str, "Received exception while registering network callback", e);
        }
    }

    @Override // defpackage.jb
    public final void e() {
        String str = i;
        try {
            yp.d().a(str, "Unregistering network callback", new Throwable[0]);
            this.g.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            yp.d().c(str, "Received exception while unregistering network callback", e);
        }
    }

    public final st f() {
        boolean z;
        ConnectivityManager connectivityManager = this.g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = false;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            z = networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException e) {
            yp.d().c(i, "Unable to validate active network", e);
        }
        boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z2 = true;
        }
        st stVar = new st();
        stVar.a = z3;
        stVar.b = z;
        stVar.c = zIsActiveNetworkMetered;
        stVar.d = z2;
        return stVar;
    }
}
