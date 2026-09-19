package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class mf2 extends pf2 {
    public static volatile Long g;
    public static final Object h = new Object();
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf2(String str, String str2, hp0 hp0Var, cf2 cf2Var, ch2 ch2Var, int i) {
        super(str, str2, hp0Var, cf2Var, ch2Var);
        this.f = i;
    }

    @Override // defpackage.pf2
    public final void a(Method method, hp0 hp0Var) {
        switch (this.f) {
            case 0:
                if (g == null) {
                    synchronized (h) {
                        try {
                            if (g == null) {
                                Long l = (Long) method.invoke("", null);
                                if (l == null) {
                                    throw null;
                                }
                                g = l;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                synchronized (hp0Var) {
                    try {
                        if (g != null) {
                            long jLongValue = g.longValue();
                            hp0Var.b();
                            ((sp0) hp0Var.g).P0(jLongValue);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                synchronized (hp0Var) {
                    hp0Var.b();
                    ((sp0) hp0Var.g).D0("E");
                    hp0Var.b();
                    ((sp0) hp0Var.g).L(0L);
                    hp0Var.b();
                    ((sp0) hp0Var.g).f0("D");
                    break;
                }
                Object[] objArr = (Object[]) method.invoke("", null);
                objArr.getClass();
                synchronized (hp0Var) {
                    String str = (String) objArr[0];
                    hp0Var.b();
                    ((sp0) hp0Var.g).D0(str);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).L(jLongValue2);
                    String str2 = (String) objArr[2];
                    hp0Var.b();
                    ((sp0) hp0Var.g).f0(str2);
                    break;
                }
                return;
        }
    }
}
