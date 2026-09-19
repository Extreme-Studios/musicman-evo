package defpackage;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class yp implements gm1, hp1, dg {
    public static yp h;
    public final /* synthetic */ int f;
    public int g;

    public /* synthetic */ yp(yp ypVar) {
        this.f = 5;
        this.g = ypVar.g;
    }

    public static synchronized yp d() {
        try {
            if (h == null) {
                h = new yp(3, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return h;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void a(String str, String str2, Throwable... thArr) {
        if (this.g <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        switch (this.f) {
            case 2:
                ((lb3) obj).H1(this.g);
                break;
            case 6:
                ((r93) obj).a(this.g);
                break;
            case 7:
                ((r93) obj).d(this.g);
                break;
            default:
                ((r93) obj).h(this.g);
                break;
        }
    }

    public void c(String str, String str2, Throwable... thArr) {
        if (this.g <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void e(String str, String str2, Throwable... thArr) {
        if (this.g <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void g(String str, String str2, Throwable... thArr) {
        if (this.g <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    @Override // defpackage.dg
    public int l(Context context) {
        return this.g;
    }

    @Override // defpackage.dg
    public int m(Context context, boolean z) {
        return 0;
    }

    public /* synthetic */ yp(int i, int i2) {
        this.f = i2;
        this.g = i;
    }

    public /* synthetic */ yp(q93 q93Var, int i) {
        this.f = 7;
        this.g = i;
    }

    public /* synthetic */ yp(q93 q93Var, int i, long j) {
        this.f = 6;
        this.g = i;
    }

    public /* synthetic */ yp(q93 q93Var, int i, at0 at0Var, at0 at0Var2) {
        this.f = 8;
        this.g = i;
    }
}
