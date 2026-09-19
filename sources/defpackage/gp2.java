package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class gp2 implements hn2, gm1, n62 {
    public static final gp2 h;
    public static final gp2 i;
    public static final gp2 j;
    public static final gp2 k;
    public static final gp2 l;
    public final /* synthetic */ int f;
    public final String g;

    static {
        int i2 = 0;
        h = new gp2("TINK", i2);
        i = new gp2("CRUNCHY", i2);
        j = new gp2("NO_PREFIX", i2);
        int i3 = 1;
        k = new gp2("TINK", i3);
        l = new gp2("NO_PREFIX", i3);
    }

    public gp2(mn1 mn1Var) {
        String strB;
        this.f = 4;
        try {
            strB = mn1Var.b();
        } catch (RemoteException e) {
            jn.P("", e);
            strB = null;
        }
        this.g = strB;
    }

    @Override // defpackage.n62
    public Object b(Object obj) {
        ((SQLiteDatabase) obj).delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{this.g, Integer.toString(0)});
        return null;
    }

    public String toString() {
        int i2 = this.f;
        String str = this.g;
        switch (i2) {
            case 0:
            case 1:
            case 4:
                return str;
            case 2:
            case 3:
            default:
                return super.toString();
        }
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        vc3.C.h.e(this.g, th);
    }

    public /* synthetic */ gp2(String str, int i2) {
        this.f = i2;
        this.g = str;
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((om1) obj).w(this.g);
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
    }
}
