package defpackage;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xr0 extends js0 {
    public static volatile Long i;
    public static volatile String k;
    public static volatile Long m;
    public static volatile String o;
    public static volatile Long q;
    public final /* synthetic */ int h;
    public static final Object j = new Object();
    public static final Object l = new Object();
    public static final Object n = new Object();
    public static final Object p = new Object();
    public static final Object r = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(nr0 nr0Var, hp0 hp0Var, int i2, int i3) {
        super(nr0Var, "N+SNt584k90MWn4aBLIhSutg85cYgcNyu+q+5WGRUo/oWkmPivq/1xlEIBG+GcFK", "VOVDFi9LxFQe2QWzKEnmStNUha/UwjqmQV12jeIMYds=", hp0Var, i2, 44);
        this.h = i3;
        switch (i3) {
            case 2:
                super(nr0Var, "b8WdxwEW5LYMXGC6g6q07uNIFUV3fs77AEo1YVb/4q/M8KyV69so1cxJ+MsKyWwh", "kazSW9iygMpHEkKh5zVqXBXYRU+noi3Tzu4hpFfxZG4=", hp0Var, i2, 22);
                break;
            case 3:
                super(nr0Var, "MMDDWI2IGLmF5pG/RRqJJZVb/JAirVaBalbjWCkub0DwWmFp7b+bfaTjmPK9uiWU", "m1dpreCDNlkoMOYdr+vmzaz+jSmUZiIrETih78jZTqg=", hp0Var, i2, 1);
                break;
            case 4:
                super(nr0Var, "VYNLVwJcUVwKHNYqtTAMU2Cbdf8xQvz3Fr3MGMTI+Feinwv11ysZpnAq/2AMk2I1", "XCAdtiyR5t8AMQ7u4CMXLD5NJ9dD+Tw+KRPDn9OS+vQ=", hp0Var, i2, 33);
                break;
            case 5:
                super(nr0Var, "zPJzhz1QtGvdwoq8b/etTeYWv9LDeLRPadnOSNl7lohby1/0Z3YfZB4nvs0ev2QM", "fVJK5Q/FtQnQT4sQUZztmOn3k4N5bqyd4pz/QTy2bEo=", hp0Var, i2, 89);
                break;
            case 6:
                super(nr0Var, "Ps5Xy95qN5Bq7sgqC6/M4zZXLDS2M1Isx7H/g2/CV37zoy2ILxNb7iAARKvnhAcR", "UDDHIUrqun7cz3t6d4j2iVVfWcHKtBQnSOoDChOFM5Y=", hp0Var, i2, 49);
                break;
            case 7:
                super(nr0Var, "0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP", "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg=", hp0Var, i2, 5);
                break;
            case 8:
            default:
                break;
            case 9:
                super(nr0Var, "01PVhP+doaGKdC1W6GrY+2IWUVFKtg3RWpQDin/wN/cS8wkuezVXqSDwZNREySxt", "hY1jxg+6DUCngCe0vbxb4cMsyHNENce67SGKWd6hzv8=", hp0Var, i2, 12);
                break;
            case 10:
                super(nr0Var, "8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN", "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc=", hp0Var, i2, 3);
                break;
            case 11:
                super(nr0Var, "ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", hp0Var, i2, 73);
                break;
            case 12:
                super(nr0Var, "cOth2BAAthu6X8KDmzC58653OwqftcurhEiV9l+3uxMh7KBnOgbdhGM0zSnSPufi", "2EDSTVCwfkpT+1duJ+umEyNIZ3jEP0NWyK78oeLPLhI=", hp0Var, i2, 51);
                break;
            case 13:
                super(nr0Var, "f5uC0Q5BJBhs1YfPGy7Wx7MnBjWVUX5JNaW+Lz6dfUOfz0sIXH0KubqvIhiUByWt", "klWlopX/vpRWeyQx7GUjF52wT93EUJwbeMp05ev02yc=", hp0Var, i2, 48);
                break;
        }
    }

    private final void b() {
        hp0 hp0Var = this.d;
        hp0Var.b();
        ((sp0) hp0Var.g).G0(-1L);
        hp0Var.b();
        ((sp0) hp0Var.g).H0(-1L);
        int[] iArr = (int[]) this.e.invoke(null, this.a.a);
        synchronized (hp0Var) {
            long j2 = iArr[0];
            hp0Var.b();
            ((sp0) hp0Var.g).G0(j2);
            long j3 = iArr[1];
            hp0Var.b();
            ((sp0) hp0Var.g).H0(j3);
            int i2 = iArr[2];
            if (i2 != Integer.MIN_VALUE) {
                hp0Var.b();
                ((sp0) hp0Var.g).X(i2);
            }
        }
    }

    private final void c() {
        if (k == null) {
            synchronized (l) {
                try {
                    if (k == null) {
                        k = (String) this.e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        hp0 hp0Var = this.d;
        synchronized (hp0Var) {
            String str = k;
            hp0Var.b();
            ((sp0) hp0Var.g).f0(str);
        }
    }

    private final void d() {
        if (m == null) {
            synchronized (n) {
                try {
                    if (m == null) {
                        m = (Long) this.e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        hp0 hp0Var = this.d;
        synchronized (hp0Var) {
            long jLongValue = m.longValue();
            hp0Var.b();
            ((sp0) hp0Var.g).P0(jLongValue);
        }
    }

    private final void e() {
        hp0 hp0Var = this.d;
        hp0Var.b();
        ((sp0) hp0Var.g).D0("E");
        if (o == null) {
            synchronized (p) {
                try {
                    if (o == null) {
                        o = (String) this.e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        hp0 hp0Var2 = this.d;
        synchronized (hp0Var2) {
            String str = o;
            hp0Var2.b();
            ((sp0) hp0Var2.g).D0(str);
        }
    }

    private final void f() {
        Boolean bool = (Boolean) tu0.e.c.a(lx0.i3);
        bool.getClass();
        String str = (String) this.e.invoke(null, this.a.a, bool);
        fr0 fr0Var = new fr0(18);
        fr0Var.s = -1L;
        fr0Var.t = -1L;
        HashMap mapA = v51.A(str);
        if (mapA != null) {
            fr0Var.s = ((Long) mapA.get(0)).longValue();
            fr0Var.t = ((Long) mapA.get(1)).longValue();
        }
        hp0 hp0Var = this.d;
        synchronized (hp0Var) {
            long j2 = fr0Var.s;
            hp0Var.b();
            ((sp0) hp0Var.g).F0(j2);
            long j3 = fr0Var.t;
            hp0Var.b();
            ((sp0) hp0Var.g).Y(j3);
        }
    }

    private final void g() {
        hp0 hp0Var = this.d;
        synchronized (hp0Var) {
            String str = (String) this.e.invoke(null, null);
            kr0 kr0Var = new kr0(18);
            HashMap mapA = v51.A(str);
            if (mapA != null) {
                kr0Var.s = (Long) mapA.get(0);
                kr0Var.t = (Long) mapA.get(1);
            }
            long jLongValue = kr0Var.s.longValue();
            hp0Var.b();
            ((sp0) hp0Var.g).P(jLongValue);
            long jLongValue2 = kr0Var.t.longValue();
            hp0Var.b();
            ((sp0) hp0Var.g).Q(jLongValue2);
        }
    }

    private final void h() {
        if (q == null) {
            synchronized (r) {
                try {
                    if (q == null) {
                        q = (Long) this.e.invoke(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        hp0 hp0Var = this.d;
        synchronized (hp0Var) {
            long jLongValue = q.longValue();
            hp0Var.b();
            ((sp0) hp0Var.g).C(jLongValue);
        }
    }

    @Override // defpackage.js0
    public final void a() throws InvocationTargetException {
        int i2 = 1;
        switch (this.h) {
            case 0:
                if (i == null) {
                    synchronized (j) {
                        try {
                            if (i == null) {
                                i = (Long) this.e.invoke(null, null);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                hp0 hp0Var = this.d;
                synchronized (hp0Var) {
                    long jLongValue = i.longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).L(jLongValue);
                    break;
                }
                return;
            case 1:
                c();
                return;
            case 2:
                d();
                return;
            case 3:
                e();
                return;
            case 4:
                h();
                return;
            case 5:
                String str = (String) this.e.invoke(null, null);
                hp0 hp0Var2 = this.d;
                synchronized (hp0Var2) {
                    hp0Var2.b();
                    ((sp0) hp0Var2.g).k0(str);
                    break;
                }
                return;
            case 6:
                hp0 hp0Var3 = this.d;
                hp0Var3.b();
                ((sp0) hp0Var3.g).p0(3);
                try {
                    if (true == ((Boolean) this.e.invoke(null, this.a.a)).booleanValue()) {
                        i2 = 2;
                    }
                    hp0Var3.b();
                    ((sp0) hp0Var3.g).p0(i2);
                    return;
                } catch (InvocationTargetException e) {
                    if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                        throw e;
                    }
                    return;
                }
            case 7:
                b();
                return;
            case 8:
                i2 = true == ((Boolean) this.e.invoke(null, this.a.a)).booleanValue() ? 2 : 1;
                hp0 hp0Var4 = this.d;
                hp0Var4.b();
                ((sp0) hp0Var4.g).s0(i2);
                return;
            case 9:
                hp0 hp0Var5 = this.d;
                hp0Var5.b();
                ((sp0) hp0Var5.g).J0(-1L);
                long jLongValue2 = ((Long) this.e.invoke(null, this.a.a)).longValue();
                hp0Var5.b();
                ((sp0) hp0Var5.g).J0(jLongValue2);
                return;
            case 10:
                f();
                return;
            case 11:
                hp0 hp0Var6 = this.d;
                try {
                    if (true == ((Boolean) this.e.invoke(null, this.a.a)).booleanValue()) {
                        i2 = 2;
                    }
                    hp0Var6.b();
                    ((sp0) hp0Var6.g).r0(i2);
                    return;
                } catch (InvocationTargetException unused) {
                    hp0Var6.b();
                    ((sp0) hp0Var6.g).r0(3);
                    return;
                }
            case 12:
                g();
                return;
            default:
                hp0 hp0Var7 = this.d;
                hp0Var7.f(3);
                boolean zBooleanValue = ((Boolean) this.e.invoke(null, this.a.a)).booleanValue();
                synchronized (hp0Var7) {
                    try {
                        if (zBooleanValue) {
                            hp0Var7.f(2);
                        } else {
                            hp0Var7.f(1);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr0(nr0 nr0Var, String str, String str2, hp0 hp0Var, int i2, int i3, int i4) {
        super(nr0Var, str, str2, hp0Var, i2, i3);
        this.h = i4;
    }
}
