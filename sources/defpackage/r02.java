package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class r02 implements j22 {
    public final Context a;
    public final Bundle b;
    public final String c;
    public final String d;
    public final h73 e;
    public final String f;
    public final cj1 g;

    public r02(Context context, Bundle bundle, String str, String str2, h73 h73Var, String str3, cj1 cj1Var) {
        this.a = context;
        this.b = bundle;
        this.c = str;
        this.d = str2;
        this.e = h73Var;
        this.f = str3;
        this.g = cj1Var;
    }

    public final void a(Bundle bundle) {
        if (((Boolean) tu0.e.c.a(lx0.b6)).booleanValue()) {
            try {
                try {
                    zb3 zb3Var = vc3.C.c;
                    bundle.putString("_app_id", zb3.N(this.a));
                } catch (RemoteException e) {
                    e = e;
                    vc3.C.h.d("AppStatsSignal_AppId", e);
                }
            } catch (RemoteException | RuntimeException e2) {
                e = e2;
                vc3.C.h.d("AppStatsSignal_AppId", e);
            }
        }
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        Bundle bundle = ((rj1) obj).a;
        bundle.putBundle("quality_signals", this.b);
        bundle.putString("seq_num", this.c);
        h73 h73Var = this.e;
        if (!h73Var.s()) {
            bundle.putString("session_id", this.d);
        }
        bundle.putBoolean("client_purpose_one", !h73Var.s());
        a(bundle);
        String str = this.f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            cj1 cj1Var = this.g;
            Long l = (Long) cj1Var.d.get(str);
            bundle2.putLong("dload", l == null ? -1L : l.longValue());
            Integer num = (Integer) cj1Var.b.get(str);
            bundle2.putInt("pcc", num == null ? 0 : num.intValue());
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) tu0.e.c.a(lx0.Aa)).booleanValue()) {
            vc3 vc3Var = vc3.C;
            if (vc3Var.h.l.get() > 0) {
                bundle.putInt("nrwv", vc3Var.h.l.get());
            }
        }
    }

    @Override // defpackage.j22
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        Bundle bundle = ((rj1) obj).b;
        bundle.putBundle("quality_signals", this.b);
        a(bundle);
    }
}
