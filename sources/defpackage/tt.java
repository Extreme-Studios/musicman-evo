package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tt extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public tt(sa1 sa1Var) {
        this.a = 2;
        Objects.requireNonNull(sa1Var);
        this.b = sa1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 2:
                ((sa1) this.b).p.set(true);
                break;
            case 3:
                ((h82) this.b).a(true);
                break;
            case 4:
                ((o82) this.b).b(true);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                yp.d().a(ut.i, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                ut utVar = (ut) this.b;
                utVar.c(utVar.f());
                return;
            case 1:
                synchronized (dr0.class) {
                    ((dr0) this.b).g = networkCapabilities;
                    break;
                }
                return;
            case 5:
                xg2 xg2Var = (xg2) this.b;
                synchronized (xg2Var) {
                    xg2Var.c = networkCapabilities;
                    break;
                }
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                yp.d().a(ut.i, "Network connection lost", new Throwable[0]);
                ut utVar = (ut) this.b;
                utVar.c(utVar.f());
                return;
            case 1:
                synchronized (dr0.class) {
                    ((dr0) this.b).g = null;
                    break;
                }
                return;
            case 2:
                ((sa1) this.b).p.set(false);
                return;
            case 3:
                ((h82) this.b).a(false);
                return;
            case 4:
                ((o82) this.b).b(false);
                return;
            default:
                xg2 xg2Var = (xg2) this.b;
                synchronized (xg2Var) {
                    xg2Var.c = null;
                    break;
                }
                return;
        }
    }

    public /* synthetic */ tt(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public tt(h82 h82Var) {
        this.a = 3;
        Objects.requireNonNull(h82Var);
        this.b = h82Var;
    }

    public tt(o82 o82Var) {
        this.a = 4;
        Objects.requireNonNull(o82Var);
        this.b = o82Var;
    }
}
