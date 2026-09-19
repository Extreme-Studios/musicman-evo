package defpackage;

import android.util.Base64;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class ba3 {
    public static final Random h = new Random();
    public ea3 d;
    public String f;
    public final ex0 a = new ex0();
    public final su0 b = new su0();
    public final HashMap c = new HashMap();
    public ox0 e = ox0.a;
    public long g = -1;

    public final synchronized String a(ox0 ox0Var, yd3 yd3Var) {
        return e(ox0Var.o(yd3Var.a, this.b).c, yd3Var).a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0027, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:23:0x004b, B:16:0x002e, B:28:0x0055, B:30:0x005f, B:33:0x0066, B:35:0x006c, B:37:0x007f, B:38:0x0093, B:40:0x0097, B:41:0x0099, B:43:0x00a3, B:45:0x00a7, B:47:0x00b4, B:50:0x00bb, B:56:0x00d8), top: B:59:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0027, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:23:0x004b, B:16:0x002e, B:28:0x0055, B:30:0x005f, B:33:0x0066, B:35:0x006c, B:37:0x007f, B:38:0x0093, B:40:0x0097, B:41:0x0099, B:43:0x00a3, B:45:0x00a7, B:47:0x00b4, B:50:0x00bb, B:56:0x00d8), top: B:59:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0027, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:23:0x004b, B:16:0x002e, B:28:0x0055, B:30:0x005f, B:33:0x0066, B:35:0x006c, B:37:0x007f, B:38:0x0093, B:40:0x0097, B:41:0x0099, B:43:0x00a3, B:45:0x00a7, B:47:0x00b4, B:50:0x00bb, B:56:0x00d8), top: B:59:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007f A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0027, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:23:0x004b, B:16:0x002e, B:28:0x0055, B:30:0x005f, B:33:0x0066, B:35:0x006c, B:37:0x007f, B:38:0x0093, B:40:0x0097, B:41:0x0099, B:43:0x00a3, B:45:0x00a7, B:47:0x00b4, B:50:0x00bb, B:56:0x00d8), top: B:59:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0097 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0027, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:23:0x004b, B:16:0x002e, B:28:0x0055, B:30:0x005f, B:33:0x0066, B:35:0x006c, B:37:0x007f, B:38:0x0093, B:40:0x0097, B:41:0x0099, B:43:0x00a3, B:45:0x00a7, B:47:0x00b4, B:50:0x00bb, B:56:0x00d8), top: B:59:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0027, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:23:0x004b, B:16:0x002e, B:28:0x0055, B:30:0x005f, B:33:0x0066, B:35:0x006c, B:37:0x007f, B:38:0x0093, B:40:0x0097, B:41:0x0099, B:43:0x00a3, B:45:0x00a7, B:47:0x00b4, B:50:0x00bb, B:56:0x00d8), top: B:59:0x0007 }] */
    public final synchronized void b(q93 q93Var) {
        int i;
        aa3 aa3VarE;
        ea3 ea3Var;
        String str;
        yd3 yd3Var;
        Object obj;
        int i2;
        aa3 aa3VarE2;
        long j;
        aa3 aa3Var;
        long jQ = qz1.q(0L);
        synchronized (this) {
            try {
                if (this.d == null) {
                    throw null;
                }
                ox0 ox0Var = q93Var.b;
                if (!ox0Var.g()) {
                    yd3 yd3Var2 = q93Var.d;
                    if (yd3Var2 == null) {
                        i = q93Var.c;
                        aa3VarE = e(i, yd3Var2);
                        if (this.f == null) {
                            this.f = aa3VarE.a;
                        }
                        if (yd3Var2 != null && yd3Var2.b()) {
                            obj = yd3Var2.a;
                            long j2 = yd3Var2.d;
                            i2 = yd3Var2.b;
                            aa3VarE2 = e(i, new yd3(obj, j2, i2));
                            if (!aa3VarE2.e) {
                                aa3VarE2.e = true;
                                su0 su0Var = this.b;
                                ox0Var.o(obj, su0Var);
                                su0Var.f.a(i2).getClass();
                                Math.max(0L, jQ + jQ);
                            }
                        }
                        if (!aa3VarE.e) {
                            aa3VarE.e = true;
                        }
                        if (aa3VarE.a.equals(this.f) && !aa3VarE.f) {
                            aa3VarE.f = true;
                            ea3Var = this.d;
                            str = aa3VarE.a;
                            ea3Var.getClass();
                            yd3Var = q93Var.d;
                            if (yd3Var != null || !yd3Var.b()) {
                                ea3Var.f();
                                ea3Var.o = str;
                                ea3Var.p = da3.m().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
                                ea3Var.e(q93Var.b, yd3Var);
                            }
                        }
                    } else {
                        aa3 aa3Var2 = (aa3) this.c.get(this.f);
                        if (aa3Var2 != null) {
                            j = aa3Var2.c;
                            if (j == -1) {
                                j = this.g + 1;
                            }
                        } else {
                            j = this.g + 1;
                        }
                        if (yd3Var2.d >= j && ((aa3Var = (aa3) this.c.get(this.f)) == null || aa3Var.c != -1 || aa3Var.b == q93Var.c)) {
                            i = q93Var.c;
                            aa3VarE = e(i, yd3Var2);
                            if (this.f == null) {
                                this.f = aa3VarE.a;
                            }
                            if (yd3Var2 != null) {
                                obj = yd3Var2.a;
                                long j3 = yd3Var2.d;
                                i2 = yd3Var2.b;
                                aa3VarE2 = e(i, new yd3(obj, j3, i2));
                                if (!aa3VarE2.e) {
                                    aa3VarE2.e = true;
                                    su0 su0Var2 = this.b;
                                    ox0Var.o(obj, su0Var2);
                                    su0Var2.f.a(i2).getClass();
                                    Math.max(0L, jQ + jQ);
                                }
                            }
                            if (!aa3VarE.e) {
                                aa3VarE.e = true;
                            }
                            if (aa3VarE.a.equals(this.f)) {
                                aa3VarE.f = true;
                                ea3Var = this.d;
                                str = aa3VarE.a;
                                ea3Var.getClass();
                                yd3Var = q93Var.d;
                                if (yd3Var != null) {
                                    ea3Var.f();
                                    ea3Var.o = str;
                                    ea3Var.p = da3.m().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
                                    ea3Var.e(q93Var.b, yd3Var);
                                } else {
                                    ea3Var.f();
                                    ea3Var.o = str;
                                    ea3Var.p = da3.m().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
                                    ea3Var.e(q93Var.b, yd3Var);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(q93 q93Var) {
        yd3 yd3Var;
        boolean zG = q93Var.b.g();
        String str = this.f;
        HashMap map = this.c;
        if (zG) {
            if (str != null) {
                aa3 aa3Var = (aa3) map.get(str);
                aa3Var.getClass();
                d(aa3Var);
                return;
            }
            return;
        }
        aa3 aa3Var2 = (aa3) map.get(str);
        int i = q93Var.c;
        yd3 yd3Var2 = q93Var.d;
        this.f = e(i, yd3Var2).a;
        b(q93Var);
        if (yd3Var2 != null) {
            long j = yd3Var2.d;
            if (yd3Var2.b()) {
                if (aa3Var2 != null && aa3Var2.c == j && (yd3Var = aa3Var2.d) != null) {
                    if (yd3Var.b == yd3Var2.b) {
                        if (yd3Var.c == yd3Var2.c) {
                            return;
                        }
                    }
                }
                e(i, new yd3(yd3Var2.a, j));
            }
        }
    }

    public final void d(aa3 aa3Var) {
        long j = aa3Var.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final aa3 e(int i, yd3 yd3Var) {
        long j;
        long j2;
        long j3;
        HashMap map = this.c;
        long j4 = Long.MAX_VALUE;
        aa3 aa3Var = null;
        for (aa3 aa3Var2 : map.values()) {
            long j5 = aa3Var2.c;
            yd3 yd3Var2 = aa3Var2.d;
            if (j5 == -1 && i == aa3Var2.b && yd3Var != null) {
                ba3 ba3Var = aa3Var2.g;
                long j6 = yd3Var.d;
                j = -1;
                aa3 aa3Var3 = (aa3) ba3Var.c.get(ba3Var.f);
                if (aa3Var3 != null) {
                    j3 = aa3Var3.c;
                    if (j3 == -1) {
                        j3 = 1 + ba3Var.g;
                    }
                } else {
                    j3 = 1 + ba3Var.g;
                }
                if (j6 >= j3) {
                    aa3Var2.c = j6;
                }
            } else {
                j = -1;
            }
            if (yd3Var != null) {
                long j7 = yd3Var.d;
                if (yd3Var2 == null) {
                    if (!yd3Var.b() && j7 == aa3Var2.c) {
                        j2 = aa3Var2.c;
                        if (j2 != j) {
                        }
                        aa3Var = aa3Var2;
                        j4 = j2;
                    }
                } else if (j7 == yd3Var2.d && yd3Var.b == yd3Var2.b && yd3Var.c == yd3Var2.c) {
                    j2 = aa3Var2.c;
                    if (j2 != j) {
                    }
                    aa3Var = aa3Var2;
                    j4 = j2;
                }
            } else if (i == aa3Var2.b) {
                j2 = aa3Var2.c;
                if (j2 != j || j2 < j4) {
                    aa3Var = aa3Var2;
                    j4 = j2;
                } else if (j2 == j4) {
                    String str = qz1.a;
                    if (aa3Var.d != null && yd3Var2 != null) {
                        aa3Var = aa3Var2;
                    }
                }
            }
        }
        if (aa3Var != null) {
            return aa3Var;
        }
        byte[] bArr = new byte[12];
        h.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 10);
        aa3 aa3Var4 = new aa3(this, strEncodeToString, i, yd3Var);
        map.put(strEncodeToString, aa3Var4);
        return aa3Var4;
    }
}
