package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class vu0 extends p91 {
    public final /* synthetic */ int y;

    /* JADX WARN: Illegal instructions before constructor call */
    public vu0(Context context, Looper looper, x7 x7Var, y7 y7Var, int i) {
        this.y = i;
        switch (i) {
            case 2:
                int i2 = x30.b;
                Context applicationContext = context.getApplicationContext();
                super(applicationContext != null ? applicationContext : context, looper, 8, x7Var, y7Var);
                break;
            default:
                int i3 = x30.b;
                Context applicationContext2 = context.getApplicationContext();
                super(applicationContext2 == null ? context : applicationContext2, looper, 123, x7Var, y7Var);
                break;
        }
    }

    @Override // defpackage.a8, defpackage.t3
    public int d() {
        switch (this.y) {
            case 2:
                return 244933000;
            default:
                return super.d();
        }
    }

    @Override // defpackage.a8
    public final IInterface n(IBinder iBinder) {
        switch (this.y) {
            case 0:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
                return iInterfaceQueryLocalInterface instanceof xu0 ? (xu0) iInterfaceQueryLocalInterface : new xu0(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService", 2);
            case 1:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
                return iInterfaceQueryLocalInterface2 instanceof p21 ? (p21) iInterfaceQueryLocalInterface2 : new p21(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService", 2);
            default:
                if (iBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                return iInterfaceQueryLocalInterface3 instanceof l71 ? (l71) iInterfaceQueryLocalInterface3 : new k71(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService", 2);
        }
    }

    @Override // defpackage.a8
    public ei[] q() {
        switch (this.y) {
            case 0:
                return jn.n;
            default:
                return super.q();
        }
    }

    @Override // defpackage.a8
    public final String u() {
        switch (this.y) {
            case 0:
                return "com.google.android.gms.ads.internal.cache.ICacheService";
            case 1:
                return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
            default:
                return "com.google.android.gms.ads.internal.request.IAdRequestService";
        }
    }

    @Override // defpackage.a8
    public final String v() {
        switch (this.y) {
            case 0:
                return "com.google.android.gms.ads.service.CACHE";
            case 1:
                return "com.google.android.gms.ads.service.HTTP";
            default:
                return "com.google.android.gms.ads.service.START";
        }
    }

    public boolean z() {
        ei[] eiVarArrG = g();
        if (((Boolean) tu0.e.c.a(lx0.Y1)).booleanValue()) {
            ei eiVar = jn.m;
            int length = eiVarArrG != null ? eiVarArrG.length : 0;
            for (int i = 0; i < length; i++) {
                if (s90.d(eiVarArrG[i], eiVar)) {
                    if (i >= 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu0(Context context, Looper looper, int i, x7 x7Var, y7 y7Var) {
        super(context, looper, i, x7Var, y7Var);
        this.y = 1;
    }
}
