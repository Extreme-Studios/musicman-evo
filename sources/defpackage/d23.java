package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class d23 extends f13 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, d23> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc;
    protected p33 zzt;

    public d23() {
        this.zzq = 0;
        this.zzc = -1;
        this.zzt = p33.f;
    }

    public static Object j(Method method, d23 d23Var, Object... objArr) {
        try {
            return method.invoke(d23Var, objArr);
        } catch (IllegalAccessException e) {
            j7.h("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            j7.h("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static s23 k(j23 j23Var) {
        int i = ((s23) j23Var).h;
        return ((s23) j23Var).z(i + i);
    }

    public static d23 l(d23 d23Var, r13 r13Var, v13 v13Var) throws o23 {
        d23 d23VarP = d23Var.p();
        try {
            j33 j33VarA = d33.c.a(d23VarP.getClass());
            n9 n9Var = r13Var.c;
            if (n9Var == null) {
                n9Var = new n9(r13Var);
            }
            j33VarA.g(d23VarP, n9Var, v13Var);
            j33VarA.h(d23VarP);
            return d23VarP;
        } catch (o23 e) {
            if (e.f) {
                throw new o23(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof o23) {
                throw ((o23) e2.getCause());
            }
            throw new o23(e2.getMessage(), e2);
        } catch (o33 e3) {
            j7.s(e3.getMessage());
            return null;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof o23) {
                throw ((o23) e4.getCause());
            }
            throw e4;
        }
    }

    public static d23 m(d23 d23Var, n13 n13Var, v13 v13Var) throws o23 {
        r13 r13VarL = n13Var.l();
        d23 d23VarL = l(d23Var, r13VarL, v13Var);
        r13VarL.i(0);
        y(d23VarL);
        return d23VarL;
    }

    public static d23 n(d23 d23Var, byte[] bArr, v13 v13Var) throws o23 {
        d23 d23VarX = x(d23Var, bArr, bArr.length, v13Var);
        y(d23VarX);
        return d23VarX;
    }

    public static d23 s(Class cls) {
        d23 d23Var = zzd.get(cls);
        if (d23Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                d23Var = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (d23Var != null) {
            return d23Var;
        }
        d23 d23Var2 = (d23) ((d23) u33.f(cls)).v(6, null);
        if (d23Var2 != null) {
            zzd.put(cls, d23Var2);
            return d23Var2;
        }
        j7.a();
        return null;
    }

    public static void t(Class cls, d23 d23Var) {
        d23Var.i();
        zzd.put(cls, d23Var);
    }

    public static final boolean w(d23 d23Var, boolean z) {
        byte bByteValue = ((Byte) d23Var.v(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = d33.c.a(d23Var.getClass()).d(d23Var);
        if (z) {
            d23Var.v(2, true == zD ? d23Var : null);
        }
        return zD;
    }

    public static d23 x(d23 d23Var, byte[] bArr, int i, v13 v13Var) throws o23 {
        if (i == 0) {
            return d23Var;
        }
        d23 d23VarP = d23Var.p();
        try {
            j33 j33VarA = d33.c.a(d23VarP.getClass());
            j33VarA.i(d23VarP, bArr, 0, i, new i13(v13Var));
            j33VarA.h(d23VarP);
            return d23VarP;
        } catch (IOException e) {
            if (e.getCause() instanceof o23) {
                throw ((o23) e.getCause());
            }
            throw new o23(e.getMessage(), e);
        } catch (IndexOutOfBoundsException unused) {
            j7.s("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        } catch (o23 e2) {
            if (e2.f) {
                throw new o23(e2.getMessage(), e2);
            }
            throw e2;
        } catch (o33 e3) {
            j7.s(e3.getMessage());
            return null;
        }
    }

    public static void y(d23 d23Var) throws o23 {
        if (d23Var == null || w(d23Var, true)) {
            return;
        }
        j7.s(new o33().getMessage());
    }

    @Override // defpackage.f13
    public final int d(j33 j33Var) {
        int iE;
        int iE2;
        if (h()) {
            if (j33Var == null) {
                iE2 = d33.c.a(getClass()).e(this);
            } else {
                iE2 = j33Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            j7.e(ec.j(new StringBuilder(String.valueOf(iE2).length() + 42), "serialized size must be non-negative, was ", iE2));
            return 0;
        }
        int i = this.zzc;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (j33Var == null) {
            iE = d33.c.a(getClass()).e(this);
        } else {
            iE = j33Var.e(this);
        }
        g(iE);
        return iE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return d33.c.a(getClass()).j(this, (d23) obj);
    }

    public final void g(int i) {
        if (i >= 0) {
            this.zzc = i | (this.zzc & zza);
        } else {
            j7.e(ec.j(new StringBuilder(String.valueOf(i).length() + 42), "serialized size must be non-negative, was ", i));
        }
    }

    public final boolean h() {
        return (this.zzc & zza) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return d33.c.a(getClass()).b(this);
        }
        if (this.zzq == 0) {
            this.zzq = d33.c.a(getClass()).b(this);
        }
        return this.zzq;
    }

    public final void i() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final b33 o() {
        return (b33) v(7, null);
    }

    public final d23 p() {
        return (d23) v(4, null);
    }

    public final b23 q() {
        return (b23) v(5, null);
    }

    public final b23 r() {
        b23 b23Var = (b23) v(5, null);
        b23Var.d(this);
        return b23Var;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = x23.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        x23.b(this, sb, 0);
        return sb.toString();
    }

    public final void u(u13 u13Var) {
        j33 j33VarA = d33.c.a(getClass());
        j52 j52Var = u13Var.a;
        if (j52Var == null) {
            j52Var = new j52(u13Var);
        }
        j33VarA.f(this, j52Var);
    }

    public abstract Object v(int i, d23 d23Var);
}
