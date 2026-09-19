package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class qe2 {
    public final ya1 a;
    public final re2 b;
    public final Set c;
    public final String d;
    public final hp0 e;
    public final cf2 f;
    public final dh2 g;

    public qe2(ya1 ya1Var, re2 re2Var, cf2 cf2Var, dd2 dd2Var, String str, hp0 hp0Var, w63 w63Var, w63 w63Var2, w63 w63Var3, dh2 dh2Var) {
        this.a = ya1Var;
        this.b = re2Var;
        this.d = str;
        this.f = cf2Var;
        this.e = hp0Var;
        this.g = dh2Var;
        int iOrdinal = dd2Var.ordinal();
        if (iOrdinal == 0) {
            this.c = w63Var.c();
            return;
        }
        if (iOrdinal == 1) {
            this.c = w63Var2.c();
        } else if (iOrdinal == 2) {
            this.c = w63Var3.c();
        } else {
            j7.a();
            throw null;
        }
    }

    public final hp a() {
        boolean z;
        boolean z2;
        re2 re2Var = this.b;
        synchronized (re2Var) {
            z = re2Var.d;
        }
        if (!z) {
            return na1.t(Integer.toString(7));
        }
        cf2 cf2Var = this.f;
        synchronized (cf2Var) {
            z2 = cf2Var.j;
        }
        if (!z2) {
            final int i = 1;
            return na1.F(new Callable(this) { // from class: pe2
                public final /* synthetic */ qe2 b;

                {
                    this.b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strEncodeToString;
                    int i2 = i;
                    qe2 qe2Var = this.b;
                    switch (i2) {
                        case 0:
                            ch2 ch2VarA = qe2Var.g.a(101);
                            try {
                                ch2VarA.a();
                                sp0 sp0Var = (sp0) qe2Var.e.c();
                                String str = qe2Var.d;
                                re2 re2Var2 = qe2Var.b;
                                try {
                                    strEncodeToString = Base64.encodeToString(((eq0) re2Var2.d(str, sp0Var.b()).c()).b(), 11);
                                    break;
                                } catch (IllegalArgumentException unused) {
                                    re2Var2.getClass();
                                    hp0 hp0VarB0 = sp0.B0();
                                    hp0VarB0.g(4096L);
                                    strEncodeToString = Base64.encodeToString(re2Var2.b(((sp0) hp0VarB0.c()).b(), str, true), 11);
                                    break;
                                }
                                ch2VarA.c();
                                return strEncodeToString;
                            } catch (Throwable th) {
                                try {
                                    ch2VarA.b(th);
                                    throw th;
                                } catch (Throwable th2) {
                                    ch2VarA.c();
                                    throw th2;
                                }
                            }
                        default:
                            String str2 = qe2Var.d;
                            re2 re2Var3 = qe2Var.b;
                            re2Var3.getClass();
                            hp0 hp0VarB1 = sp0.B0();
                            hp0VarB1.g(16384L);
                            return Base64.encodeToString(re2Var3.b(((sp0) hp0VarB1.c()).b(), str2, true), 11);
                    }
                }
            }, this.a);
        }
        Set set = this.c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.a.b((of2) it.next()));
        }
        vj2 vj2VarM = vj2.m(arrayList);
        final int i2 = 0;
        Callable callable = new Callable(this) { // from class: pe2
            public final /* synthetic */ qe2 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strEncodeToString;
                int i3 = i2;
                qe2 qe2Var = this.b;
                switch (i3) {
                    case 0:
                        ch2 ch2VarA = qe2Var.g.a(101);
                        try {
                            ch2VarA.a();
                            sp0 sp0Var = (sp0) qe2Var.e.c();
                            String str = qe2Var.d;
                            re2 re2Var2 = qe2Var.b;
                            try {
                                strEncodeToString = Base64.encodeToString(((eq0) re2Var2.d(str, sp0Var.b()).c()).b(), 11);
                                break;
                            } catch (IllegalArgumentException unused) {
                                re2Var2.getClass();
                                hp0 hp0VarB0 = sp0.B0();
                                hp0VarB0.g(4096L);
                                strEncodeToString = Base64.encodeToString(re2Var2.b(((sp0) hp0VarB0.c()).b(), str, true), 11);
                                break;
                            }
                            ch2VarA.c();
                            return strEncodeToString;
                        } catch (Throwable th) {
                            try {
                                ch2VarA.b(th);
                                throw th;
                            } catch (Throwable th2) {
                                ch2VarA.c();
                                throw th2;
                            }
                        }
                    default:
                        String str2 = qe2Var.d;
                        re2 re2Var3 = qe2Var.b;
                        re2Var3.getClass();
                        hp0 hp0VarB1 = sp0.B0();
                        hp0VarB1.g(16384L);
                        return Base64.encodeToString(re2Var3.b(((sp0) hp0VarB1.c()).b(), str2, true), 11);
                }
            }
        };
        cn2 cn2Var = cn2.f;
        bn2 bn2Var = new bn2(vj2VarM, false, false);
        bn2Var.u = new an2(bn2Var, callable, cn2Var);
        bn2Var.v();
        return bn2Var;
    }
}
