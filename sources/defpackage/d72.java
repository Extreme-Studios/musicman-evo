package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class d72 implements Runnable {
    public final e72 g;
    public String h;
    public String j;
    public y91 k;
    public fu1 l;
    public ScheduledFuture m;
    public final ArrayList f = new ArrayList();
    public int n = 2;
    public int i = 2;

    public d72(e72 e72Var) {
        this.g = e72Var;
    }

    public final synchronized void a(a72 a72Var) {
        try {
            if (((Boolean) my0.c.u()).booleanValue()) {
                ArrayList arrayList = this.f;
                a72Var.h();
                arrayList.add(a72Var);
                ScheduledFuture scheduledFuture = this.m;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.m = za1.d.schedule(this, ((Integer) tu0.e.c.a(lx0.v9)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            if (((Boolean) my0.c.u()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains("BANNER")) {
                    this.n = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains("INTERSTITIAL")) {
                    this.n = 4;
                } else if (arrayList.contains("native") || arrayList.contains("NATIVE")) {
                    this.n = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains("REWARDED")) {
                    this.n = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.n = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                    this.n = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(String str) {
        boolean zMatches;
        if (((Boolean) my0.c.u()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) tu0.e.c.a(lx0.w9), str);
            }
            if (zMatches) {
                this.h = str;
            }
        }
    }

    public final synchronized void d(Bundle bundle) {
        if (((Boolean) my0.c.u()).booleanValue()) {
            this.i = jn.D(bundle);
        }
    }

    public final synchronized void e(y91 y91Var) {
        if (((Boolean) my0.c.u()).booleanValue()) {
            this.k = y91Var;
        }
    }

    public final synchronized void f(fu1 fu1Var) {
        if (((Boolean) my0.c.u()).booleanValue()) {
            this.l = fu1Var;
        }
    }

    public final synchronized void g(String str) {
        if (((Boolean) my0.c.u()).booleanValue()) {
            this.j = str;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) my0.c.u()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.m;
                int i = 0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.f;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    a72 a72Var = (a72) obj;
                    int i2 = this.n;
                    if (i2 != 2) {
                        a72Var.d(i2);
                    }
                    if (!TextUtils.isEmpty(this.h)) {
                        a72Var.F(this.h);
                    }
                    if (!TextUtils.isEmpty(this.j) && !a72Var.i()) {
                        a72Var.r0(this.j);
                    }
                    y91 y91Var = this.k;
                    if (y91Var != null) {
                        a72Var.l(y91Var);
                    } else {
                        fu1 fu1Var = this.l;
                        if (fu1Var != null) {
                            a72Var.g(fu1Var);
                        }
                    }
                    a72Var.t(this.i);
                    this.g.b(a72Var.m());
                }
                arrayList.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(int i) {
        if (((Boolean) my0.c.u()).booleanValue()) {
            this.n = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
