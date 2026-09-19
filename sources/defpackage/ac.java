package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class ac implements yb, sc, Serializable {
    public final yb f;
    public final ic g;
    public transient yb h;

    public ac(yb ybVar) {
        this(ybVar, ybVar != null ? ybVar.getContext() : null);
    }

    @Override // defpackage.sc
    public sc c() {
        yb ybVar = this.f;
        if (ybVar instanceof sc) {
            return (sc) ybVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.yb
    public final void d(Object obj) {
        ?? r2 = this;
        while (true) {
            ac acVar = (ac) r2;
            yb ybVar = acVar.f;
            ybVar.getClass();
            try {
                obj = acVar.m(obj);
                if (obj == rc.f) {
                    return;
                }
            } catch (Throwable th) {
                obj = new rx(th);
            }
            acVar.n();
            if (!(ybVar instanceof ac)) {
                ybVar.d(obj);
                return;
            }
            r2 = ybVar;
        }
    }

    @Override // defpackage.yb
    public ic getContext() {
        ic icVar = this.g;
        icVar.getClass();
        return icVar;
    }

    public yb k(yb ybVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement l() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        xd xdVar = (xd) getClass().getAnnotation(xd.class);
        String str = null;
        if (xdVar == null) {
            return null;
        }
        int iV = xdVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? xdVar.l()[iIntValue] : -1;
        p83 p83Var = yd.g;
        p83 p83Var2 = yd.h;
        if (p83Var2 == null) {
            try {
                p83 p83Var3 = new p83(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 3);
                yd.h = p83Var3;
                p83Var2 = p83Var3;
            } catch (Exception unused2) {
                yd.h = p83Var;
                p83Var2 = p83Var;
            }
        }
        if (p83Var2 != p83Var && (method = (Method) p83Var2.g) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) p83Var2.h) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) p83Var2.i;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = xdVar.c();
        } else {
            strC = str + '/' + xdVar.c();
        }
        return new StackTraceElement(strC, xdVar.m(), xdVar.f(), i);
    }

    public abstract Object m(Object obj);

    public void n() {
        yb ybVar = this.h;
        if (ybVar != null && ybVar != this) {
            gc gcVarF = getContext().f(ig.g);
            gcVarF.getClass();
            ff ffVar = (ff) ybVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ff.m;
            while (atomicReferenceFieldUpdater.get(ffVar) == ss0.c) {
            }
            Object obj = atomicReferenceFieldUpdater.get(ffVar);
            z8 z8Var = obj instanceof z8 ? (z8) obj : null;
            if (z8Var != null) {
                z8Var.p();
            }
        }
        this.h = la.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objL = l();
        if (objL == null) {
            objL = getClass().getName();
        }
        sb.append(objL);
        return sb.toString();
    }

    public ac(yb ybVar, ic icVar) {
        this.f = ybVar;
        this.g = icVar;
    }
}
