package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class e60 {
    public final m7 a;
    public final m7 b;
    public final m7 c;

    public e60(m7 m7Var, m7 m7Var2, m7 m7Var3) {
        this.a = m7Var;
        this.b = m7Var2;
        this.c = m7Var3;
    }

    public abstract f60 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        m7 m7Var = this.c;
        Class cls2 = (Class) m7Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        m7Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        m7 m7Var = this.a;
        Method method = (Method) m7Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, e60.class.getClassLoader()).getDeclaredMethod("read", e60.class);
        m7Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        m7 m7Var = this.b;
        Method method = (Method) m7Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, e60.class);
        m7Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((f60) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((f60) this).e.readParcelable(f60.class.getClassLoader());
    }

    public final g60 h() {
        String string = ((f60) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (g60) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            j7.h("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            j7.h("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            j7.h("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            j7.h("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((f60) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((f60) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(g60 g60Var) {
        if (g60Var == null) {
            ((f60) this).e.writeString(null);
            return;
        }
        try {
            ((f60) this).e.writeString(b(g60Var.getClass()).getName());
            f60 f60VarA = a();
            try {
                d(g60Var.getClass()).invoke(null, g60Var, f60VarA);
                Parcel parcel = f60VarA.e;
                int i = f60VarA.i;
                if (i >= 0) {
                    int i2 = f60VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                j7.h("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                j7.h("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                j7.h("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                j7.h("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            j7.h(g60Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
