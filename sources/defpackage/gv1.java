package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gv1 implements fv1, hn2, li1, pn1, hi2, hp1, bd3 {
    public final /* synthetic */ int f;
    public final Object g;

    public gv1(int i, byte b) {
        this.f = i;
        switch (i) {
            case 11:
                this.g = new AtomicBoolean(false);
                break;
            default:
                this.g = new int[2];
                break;
        }
    }

    public static gv1 h(byte[] bArr) {
        return new gv1(12, j03.a(bArr));
    }

    public static gv1 l(int i) {
        return new gv1(12, j03.a(vs2.a(i)));
    }

    @Override // defpackage.li1
    /* JADX INFO: renamed from: a */
    public hv1 mo1a() throws l52 {
        try {
            return ((s52) this.g).a.B();
        } catch (Throwable th) {
            throw new l52(th);
        }
    }

    @Override // defpackage.bd3
    public int b(Object obj) {
        pc3 pc3Var = (pc3) obj;
        HashMap map = cd3.a;
        de3 de3Var = (de3) this.g;
        String str = pc3Var.b;
        return ((str.equals(de3Var.m) || str.equals(cd3.c(de3Var))) && pc3Var.f(de3Var, false) && pc3Var.g(de3Var)) ? 1 : 0;
    }

    @Override // defpackage.pn1
    public x42 c() {
        return (x42) this.g;
    }

    @Override // defpackage.fv1
    public /* synthetic */ hp d(r71 r71Var) {
        return ((pv1) ((o63) ((r52) this.g).i).c()).C3(r71Var, Binder.getCallingUid());
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        switch (this.f) {
            case 1:
                try {
                    ((n62) this.g).b((SQLiteDatabase) obj);
                    return;
                } catch (Exception e) {
                    jn.M("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
                    return;
                }
            case 6:
                ((a72) this.g).a();
                return;
            default:
                ud2 ud2Var = ((je2) this.g).c;
                ge2 ge2Var = (ge2) obj;
                synchronized (ud2Var.m) {
                    to0 to0Var = ud2Var.p;
                    String strA = ge2Var.a();
                    to0Var.b();
                    ((uo0) to0Var.g).J(strA);
                    break;
                }
                return;
        }
    }

    @Override // defpackage.hi2
    public Iterator f(bz1 bz1Var, CharSequence charSequence) {
        return new di2(charSequence, new w32(((xh2) this.g).J.matcher(charSequence)), 1);
    }

    public JSONObject g(View view) {
        if (view == null) {
            return v92.a(0, 0, 0, 0);
        }
        int[] iArr = (int[]) this.g;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return v92.a(iArr[0], iArr[1], width, height);
    }

    public void i(String str, v63 v63Var) {
        if (v63Var != null) {
            ((LinkedHashMap) this.g).put(str, v63Var);
        } else {
            j7.l("provider");
        }
    }

    public void m(String str, v63 v63Var) {
        i(str, v63Var);
    }

    public t63 n() {
        return new t63((LinkedHashMap) this.g);
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        switch (this.f) {
            case 1:
                jn.M("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
                break;
        }
    }

    public /* synthetic */ gv1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public /* synthetic */ gv1(Object obj, int i, Object obj2) {
        this.f = i;
        this.g = obj2;
    }

    public /* synthetic */ gv1(q93 q93Var, qd3 qd3Var, vd3 vd3Var, IOException iOException, boolean z) {
        this.f = 15;
        this.g = iOException;
    }

    public gv1(int i) {
        this.f = 13;
        this.g = ej1.x(i);
    }

    @Override // defpackage.hp1
    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public /* synthetic */ void mo6b(Object obj) {
        ((r93) obj).o((IOException) this.g);
    }

    private final void j(Throwable th) {
    }

    private final void k(Throwable th) {
    }

    @Override // defpackage.pn1
    public void o(boolean z, Context context, ik1 ik1Var) {
    }
}
