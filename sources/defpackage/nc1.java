package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nc1 implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ nc1(o22 o22Var, long j, m22 m22Var, Bundle bundle) {
        this.h = o22Var;
        this.g = j;
        this.i = m22Var;
        this.j = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheComplete");
                map.put("src", (String) this.h);
                map.put("cachedSrc", (String) this.i);
                map.put("totalDuration", Long.toString(this.g));
                ((pc1) this.j).n(map);
                return;
            default:
                o22 o22Var = (o22) this.h;
                long j = this.g;
                m22 m22Var = (m22) this.i;
                Bundle bundle = (Bundle) this.j;
                vc3 vc3Var = vc3.C;
                vc3Var.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                if (((Boolean) ty0.a.u()).booleanValue()) {
                    String canonicalName = m22Var.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = "";
                    }
                    StringBuilder sb = new StringBuilder(canonicalName.length() + 25 + String.valueOf(jElapsedRealtime).length());
                    sb.append("Signal runtime (ms) : ");
                    sb.append(canonicalName);
                    sb.append(" = ");
                    sb.append(jElapsedRealtime);
                    jn.p(sb.toString());
                }
                ix0 ix0Var = lx0.m2;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    if (((Boolean) tu0Var.c.a(lx0.s2)).booleanValue()) {
                        synchronized (o22Var) {
                            int iC = m22Var.c();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iC).length() + 3);
                            sb2.append("sig");
                            sb2.append(iC);
                            bundle.putLong(sb2.toString(), jElapsedRealtime);
                        }
                    }
                    break;
                }
                if (((Boolean) tu0Var.c.a(lx0.k2)).booleanValue()) {
                    us2 us2VarA = o22Var.e.a();
                    us2VarA.s("action", "lat_ms");
                    us2VarA.s("lat_grp", "sig_lat_grp");
                    us2VarA.s("lat_id", String.valueOf(m22Var.c()));
                    us2VarA.s("clat_ms", String.valueOf(jElapsedRealtime));
                    int i = 1;
                    if (((Boolean) tu0Var.c.a(lx0.l2)).booleanValue()) {
                        synchronized (o22Var) {
                            o22Var.g++;
                            break;
                        }
                        un1 un1Var = vc3Var.h.c.h;
                        synchronized (un1Var) {
                            str = (String) un1Var.h;
                        }
                        us2VarA.s("seq_num", str);
                        synchronized (o22Var) {
                            try {
                                if (o22Var.g == o22Var.b.size() && o22Var.f != 0) {
                                    o22Var.g = 0;
                                    vc3Var.k.getClass();
                                    String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - o22Var.f);
                                    if (m22Var.c() <= 39 || m22Var.c() >= 52) {
                                        us2VarA.s("lat_clsg", strValueOf);
                                    } else {
                                        us2VarA.s("lat_gmssg", strValueOf);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    ((es1) us2VarA.h).b.execute(new ds1(us2VarA, i));
                    return;
                }
                return;
        }
    }

    public nc1(pc1 pc1Var, String str, String str2, long j) {
        this.h = str;
        this.i = str2;
        this.g = j;
        this.j = pc1Var;
    }
}
