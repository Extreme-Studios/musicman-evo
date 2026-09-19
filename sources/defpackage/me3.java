package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class me3 {
    public final Uri a;
    public final ep2 b;
    public final hb3 c;
    public final qe3 d;
    public final km1 e;
    public volatile boolean g;
    public long i;
    public eg2 j;
    public me0 k;
    public boolean l;
    public final /* synthetic */ qe3 m;
    public final rd0 f = new rd0();
    public boolean h = true;

    public me3(qe3 qe3Var, Uri uri, oe2 oe2Var, hb3 hb3Var, qe3 qe3Var2, km1 km1Var) {
        this.m = qe3Var;
        this.a = uri;
        this.b = new ep2(oe2Var);
        this.c = hb3Var;
        this.d = qe3Var2;
        this.e = km1Var;
        qd3.a.getAndIncrement();
        Map map = Collections.EMPTY_MAP;
        Map map2 = qe3.S;
        hn.O(uri, "The uri must be set.");
        this.j = new eg2(uri, map2, 0L, -1L, 6);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x023f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0249  */
    public final void a() throws Throwable {
        long j;
        hb3 hb3Var;
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i3;
        oe2 oe2Var;
        nd0 nd0Var;
        int i4;
        int i5;
        while (!this.g) {
            int i6 = 1;
            int i7 = 0;
            try {
                long j2 = this.f.a;
                Map map = Collections.EMPTY_MAP;
                Uri uri = this.a;
                Map map2 = qe3.S;
                hn.O(uri, "The uri must be set.");
                eg2 eg2Var = new eg2(uri, map2, j2, -1L, 6);
                this.j = eg2Var;
                ep2 ep2Var = this.b;
                long jA = ep2Var.a(eg2Var);
                if (this.g) {
                    hb3 hb3Var2 = this.c;
                    if (hb3Var2.c() != -1) {
                        this.f.a = hb3Var2.c();
                    }
                    try {
                        this.b.l();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                if (jA != -1) {
                    jA += j2;
                    qe3 qe3Var = this.m;
                    qe3Var.getClass();
                    qe3Var.t.post(new ne3(qe3Var, i6));
                }
                long j3 = jA;
                qe3 qe3Var2 = this.m;
                Map mapG = ep2Var.f.g();
                List list = (List) mapG.get("icy-br");
                j = -1;
                if (list != null) {
                    try {
                        String str4 = (String) list.get(0);
                        try {
                            i = Integer.parseInt(str4) * 1000;
                            if (i > 0) {
                                i2 = i;
                            } else {
                                try {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 17);
                                    sb.append("Invalid bitrate: ");
                                    sb.append(str4);
                                    s90.Q("IcyHeaders", sb.toString());
                                    i6 = 0;
                                    i2 = -1;
                                } catch (NumberFormatException unused2) {
                                    s90.Q("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                                    i6 = 0;
                                    i2 = i;
                                }
                            }
                        } catch (NumberFormatException unused3) {
                            i = -1;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (i7 != 1) {
                            hb3Var = this.c;
                            if (hb3Var.c() != j) {
                                this.f.a = hb3Var.c();
                            }
                        }
                        try {
                            this.b.l();
                        } catch (IOException unused4) {
                        }
                        throw th;
                    }
                } else {
                    i6 = 0;
                    i2 = -1;
                }
                List list2 = (List) mapG.get("icy-genre");
                if (list2 != null) {
                    str = (String) list2.get(0);
                    i6 = 1;
                } else {
                    str = null;
                }
                List list3 = (List) mapG.get("icy-name");
                if (list3 != null) {
                    str2 = (String) list3.get(0);
                    i6 = 1;
                } else {
                    str2 = null;
                }
                List list4 = (List) mapG.get("icy-url");
                if (list4 != null) {
                    str3 = (String) list4.get(0);
                    i6 = 1;
                } else {
                    str3 = null;
                }
                List list5 = (List) mapG.get("icy-pub");
                if (list5 != null) {
                    zEquals = ((String) list5.get(0)).equals("1");
                    i6 = 1;
                } else {
                    zEquals = false;
                }
                List list6 = (List) mapG.get("icy-metaint");
                if (list6 != null) {
                    String str5 = (String) list6.get(0);
                    try {
                        i5 = Integer.parseInt(str5);
                        if (i5 > 0) {
                            i3 = i5;
                            i6 = 1;
                        } else {
                            try {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 27);
                                sb2.append("Invalid metadata interval: ");
                                sb2.append(str5);
                                s90.Q("IcyHeaders", sb2.toString());
                                i3 = -1;
                            } catch (NumberFormatException unused5) {
                                s90.Q("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                i3 = i5;
                            }
                        }
                    } catch (NumberFormatException unused6) {
                        i5 = -1;
                    }
                } else {
                    i3 = -1;
                }
                qe3Var2.v = i6 != 0 ? new sf0(i2, i3, str, str2, str3, zEquals) : null;
                ep2 ep2Var2 = this.b;
                qe3 qe3Var3 = this.m;
                sf0 sf0Var = qe3Var3.v;
                if (sf0Var == null || (i4 = sf0Var.f) == -1) {
                    oe2Var = ep2Var2;
                } else {
                    pd3 pd3Var = new pd3(ep2Var2, i4, this);
                    me0 me0VarT = qe3Var3.t(new pe3(0, true));
                    this.k = me0VarT;
                    me0VarT.d(qe3.T);
                    oe2Var = pd3Var;
                }
                hb3 hb3Var3 = this.c;
                hb3Var3.a(oe2Var, this.a, ep2Var2.f.g(), j2, j3, this.d);
                long j4 = j2;
                if (qe3Var3.v != null && (nd0Var = (nd0) hb3Var3.g) != null && (nd0Var instanceof wg0)) {
                    ((wg0) nd0Var).p = true;
                }
                if (this.h) {
                    long j5 = this.i;
                    nd0 nd0Var2 = (nd0) hb3Var3.g;
                    nd0Var2.getClass();
                    nd0Var2.f(j4, j5);
                    this.h = false;
                }
                int iE = 0;
                while (iE == 0) {
                    try {
                        if (this.g) {
                            iE = 0;
                            break;
                        }
                        try {
                            km1 km1Var = this.e;
                            synchronized (km1Var) {
                                while (!km1Var.a) {
                                    try {
                                        km1Var.wait();
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                            rd0 rd0Var = this.f;
                            nd0 nd0Var3 = (nd0) hb3Var3.g;
                            if (nd0Var3 == null) {
                                throw null;
                            }
                            fd0 fd0Var = (fd0) hb3Var3.h;
                            if (fd0Var == null) {
                                throw null;
                            }
                            iE = nd0Var3.e(fd0Var, rd0Var);
                            long jC = hb3Var3.c();
                            if (jC > qe3Var3.m + j4) {
                                synchronized (km1Var) {
                                    km1Var.a = false;
                                }
                                qe3Var3.t.post(qe3Var3.s);
                                j4 = jC;
                            }
                        } catch (InterruptedException unused7) {
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i7 = iE;
                        if (i7 != 1) {
                            hb3Var = this.c;
                            if (hb3Var.c() != j) {
                                this.f.a = hb3Var.c();
                            }
                        }
                        this.b.l();
                        throw th;
                    }
                }
                if (iE != 1) {
                    if (hb3Var3.c() != -1) {
                        this.f.a = hb3Var3.c();
                    }
                    i7 = iE;
                }
                try {
                    ep2Var2.l();
                } catch (IOException unused8) {
                }
                if (i7 != 0) {
                    return;
                }
            } catch (Throwable th4) {
                th = th4;
                j = -1;
            }
        }
    }
}
