package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class sj {
    public static final q00 b = new q00(0);
    public final /* synthetic */ xj a;

    public sj(xj xjVar) {
        this.a = xjVar;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        q00 q00Var = b;
        q00 q00Var2 = (q00) q00Var.get(classLoader);
        if (q00Var2 == null) {
            q00Var2 = new q00(0);
            q00Var.put(classLoader, q00Var2);
        }
        Class cls = (Class) q00Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        q00Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new na(ec.i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new na(ec.i("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final kj a(String str) {
        try {
            return (kj) c(this.a.t.D.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new na(ec.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new na(ec.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new na(ec.i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new na(ec.i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
