package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ig2 implements gg2 {
    public final qg2 a;
    public final ng2 b;
    public final ExecutorService c;
    public final tg2 d;
    public final dh2 e;
    public final Object f = new Object();
    public final String g;
    public final long h;
    public final long i;
    public gh0 j;

    public ig2(qg2 qg2Var, ng2 ng2Var, tg2 tg2Var, dh2 dh2Var, vc2 vc2Var, ExecutorService executorService) {
        this.a = qg2Var;
        this.b = ng2Var;
        this.c = executorService;
        this.d = tg2Var;
        this.e = dh2Var;
        this.g = vc2Var.D();
        this.h = vc2Var.L();
        this.i = vc2Var.K();
    }

    @Override // defpackage.gg2
    public final String a() {
        synchronized (this.f) {
            try {
                gh0 gh0Var = this.j;
                if (gh0Var == null) {
                    return "3.-1";
                }
                return (String) gh0Var.h;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gg2
    public final xn2 b(Context context, View view, Activity activity) {
        return na1.F(new wp1(this, context, view, activity, 4), this.c);
    }

    @Override // defpackage.gg2
    public final fn2 c() {
        fn2 fn2VarR = fn2.r(this.b.a());
        zf2 zf2Var = zf2.d;
        ExecutorService executorService = this.c;
        return na1.L(na1.I(fn2VarR, Throwable.class, zf2Var, executorService), new r21(17, this), executorService);
    }

    @Override // defpackage.gg2
    public final void d(InputEvent inputEvent) {
        try {
            synchronized (this.f) {
                try {
                    gh0 gh0Var = this.j;
                    if (gh0Var != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        ((mn0) gh0Var.i).g(gh0Var.g, Optional.of(map));
                    } else {
                        this.e.b(20105);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (in0 | ln0 e) {
            this.e.c(20104, e);
        }
    }

    @Override // defpackage.gg2
    public final int e() {
        return 4;
    }

    @Override // defpackage.gg2
    public final xn2 f(Context context, String str, View view) {
        return na1.F(new wp1(this, context, str, view, 5), this.c);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    public final void g(HashMap map) {
        String strU0;
        ch2 ch2VarA;
        String str;
        map.put("v", this.g);
        hp hpVar = (hp) map.get("gs");
        hp hpVar2 = (hp) map.get("ai");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        dh2 dh2Var = this.e;
        byte[] bArrB = null;
        long jW0 = -1;
        if (hpVar != null) {
            ch2 ch2VarA2 = dh2Var.a(20107);
            try {
                try {
                    ch2VarA2.a();
                    sp0 sp0Var = (sp0) hpVar.get(this.i, timeUnit);
                    if (sp0Var != null) {
                        bArrB = sp0Var.z0().b();
                        strU0 = sp0Var.u0().length() > 1 ? sp0Var.u0() : "E";
                        try {
                            if (sp0Var.v0()) {
                                jW0 = sp0Var.w0();
                            }
                        } catch (ClassCastException e) {
                            e = e;
                            ch2VarA2.b(e);
                        } catch (InterruptedException e2) {
                            e = e2;
                            ch2VarA2.b(e);
                        } catch (ExecutionException e3) {
                            e = e3;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            ch2VarA2.b(e);
                        } catch (TimeoutException e4) {
                            e = e4;
                            ch2VarA2.b(e);
                        }
                    } else {
                        strU0 = "E";
                    }
                } catch (Throwable th) {
                    ch2VarA2.c();
                    throw th;
                }
            } catch (ClassCastException e5) {
                e = e5;
                strU0 = "E";
                ch2VarA2.b(e);
                ch2VarA2.c();
                if (strU0.equals("E")) {
                    ch2VarA = dh2Var.a(20108);
                    try {
                        try {
                            ch2VarA.a();
                            str = (String) hpVar2.get(this.h, timeUnit);
                            if (true != yd.v(str)) {
                                strU0 = str;
                            }
                        } catch (Throwable th2) {
                            ch2VarA.c();
                            throw th2;
                        }
                    } catch (ClassCastException e6) {
                        e = e6;
                        ch2VarA.b(e);
                    } catch (InterruptedException e7) {
                        e = e7;
                        ch2VarA.b(e);
                    } catch (ExecutionException e8) {
                        e = e8;
                        Throwable cause2 = e.getCause();
                        if (cause2 != null) {
                            e = cause2;
                        }
                        ch2VarA.b(e);
                    } catch (TimeoutException e9) {
                        e = e9;
                        ch2VarA.b(e);
                    }
                    ch2VarA.c();
                }
                map.put("int", strU0);
                if (bArrB != null) {
                    map.put("att", bArrB);
                }
                map.put("gv", Long.valueOf(jW0));
            } catch (InterruptedException e10) {
                e = e10;
                strU0 = "E";
                ch2VarA2.b(e);
                ch2VarA2.c();
                if (strU0.equals("E")) {
                    ch2VarA = dh2Var.a(20108);
                    ch2VarA.a();
                    str = (String) hpVar2.get(this.h, timeUnit);
                    if (true != yd.v(str)) {
                        strU0 = str;
                    }
                    ch2VarA.c();
                }
                map.put("int", strU0);
                if (bArrB != null) {
                    map.put("att", bArrB);
                }
                map.put("gv", Long.valueOf(jW0));
            } catch (ExecutionException e11) {
                e = e11;
                strU0 = "E";
            } catch (TimeoutException e12) {
                e = e12;
                strU0 = "E";
                ch2VarA2.b(e);
                ch2VarA2.c();
                if (strU0.equals("E")) {
                    ch2VarA = dh2Var.a(20108);
                    ch2VarA.a();
                    str = (String) hpVar2.get(this.h, timeUnit);
                    if (true != yd.v(str)) {
                        strU0 = str;
                    }
                    ch2VarA.c();
                }
                map.put("int", strU0);
                if (bArrB != null) {
                    map.put("att", bArrB);
                }
                map.put("gv", Long.valueOf(jW0));
            }
            ch2VarA2.c();
        } else {
            strU0 = "E";
        }
        if (strU0.equals("E") && hpVar2 != null) {
            ch2VarA = dh2Var.a(20108);
            ch2VarA.a();
            str = (String) hpVar2.get(this.h, timeUnit);
            if (true != yd.v(str)) {
                strU0 = str;
            }
            ch2VarA.c();
        }
        map.put("int", strU0);
        if (bArrB != null) {
            map.put("att", bArrB);
        }
        map.put("gv", Long.valueOf(jW0));
    }

    @Override // defpackage.gg2
    public final xn2 h(Context context) {
        return na1.F(new hq0(this, 15, context), this.c);
    }

    public final String i(HashMap map) {
        String strG;
        dh2 dh2Var = this.e;
        ch2 ch2VarA = dh2Var.a(20110);
        try {
            ch2VarA.a();
            synchronized (this.f) {
                try {
                    gh0 gh0Var = this.j;
                    if (gh0Var == null) {
                        dh2Var.b(20109);
                        strG = "";
                    } else {
                        byte[] bArr = (byte[]) ((mn0) gh0Var.i).g(gh0Var.f, Optional.of(map));
                        gl2 gl2Var = il2.e;
                        if (gl2Var.b != null) {
                            gl2Var = new gl2(gl2Var.a, (Character) null);
                        }
                        strG = gl2Var.g(bArr.length, bArr);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ch2VarA.c();
            return strG;
        } catch (Throwable th2) {
            try {
                ch2VarA.b(th2);
                throw th2;
            } catch (Throwable th3) {
                ch2VarA.c();
                throw th3;
            }
        }
    }
}
