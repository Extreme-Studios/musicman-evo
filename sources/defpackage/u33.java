package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class u33 {
    public static final Unsafe a;
    public static final Class b;
    public static final t33 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final long g;
    public static final boolean h;

    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    static {
        boolean z;
        boolean z2;
        t33 t33Var;
        Unsafe unsafeO = o();
        a = unsafeO;
        int i = h13.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean zP = p(cls);
        Class cls2 = Integer.TYPE;
        boolean zP2 = p(cls2);
        t33 r33Var = null;
        if (unsafeO != null) {
            if (zP) {
                r33Var = new s33(unsafeO);
            } else if (zP2) {
                r33Var = new r33(unsafeO);
            }
        }
        c = r33Var;
        if (r33Var == null) {
            z = false;
        } else {
            try {
                Class<?> cls3 = ((Unsafe) r33Var.f).getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (c() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(u33.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        d = z;
        t33 t33Var2 = c;
        if (t33Var2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls4 = ((Unsafe) t33Var2.f).getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                Logger.getLogger(u33.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z2 = false;
            }
        }
        e = z2;
        f = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field fieldC = c();
        long jObjectFieldOffset = -1;
        if (fieldC != null && (t33Var = c) != null) {
            jObjectFieldOffset = ((Unsafe) t33Var.f).objectFieldOffset(fieldC);
        }
        g = jObjectFieldOffset;
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (e) {
            return ((Unsafe) c.f).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (e) {
            ((Unsafe) c.f).arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        int i = h13.a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void d(Object obj, long j, byte b2) {
        Unsafe unsafe = (Unsafe) c.f;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    public static void e(Object obj, long j, byte b2) {
        Unsafe unsafe = (Unsafe) c.f;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static Object f(Class cls) {
        try {
            return a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int g(long j, Object obj) {
        return ((Unsafe) c.f).getInt(obj, j);
    }

    public static void h(Object obj, long j, int i) {
        ((Unsafe) c.f).putInt(obj, j, i);
    }

    public static long i(long j, Object obj) {
        return ((Unsafe) c.f).getLong(obj, j);
    }

    public static void j(Object obj, long j, long j2) {
        ((Unsafe) c.f).putLong(obj, j, j2);
    }

    public static Object k(long j, Object obj) {
        return ((Unsafe) c.f).getObject(obj, j);
    }

    public static void l(Object obj, long j, Object obj2) {
        ((Unsafe) c.f).putObject(obj, j, obj2);
    }

    public static void m(byte[] bArr, long j, byte b2) {
        c.n1(bArr, f + j, b2);
    }

    public static long n(ByteBuffer byteBuffer) {
        return ((Unsafe) c.f).getLong(byteBuffer, g);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new q33());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean p(Class cls) {
        int i = h13.a;
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean q(long j, Object obj) {
        return ((byte) ((((Unsafe) c.f).getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean r(long j, Object obj) {
        return ((byte) ((((Unsafe) c.f).getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
