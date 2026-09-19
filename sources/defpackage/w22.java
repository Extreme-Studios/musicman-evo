package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class w22 implements m22 {
    public final Context a;
    public final ScheduledExecutorService b;
    public final Executor c;
    public final boolean d;
    public final boolean e;
    public final ue0 f;

    public w22(ue0 ue0Var, Context context, ScheduledExecutorService scheduledExecutorService, ya1 ya1Var, int i, boolean z, boolean z2) {
        this.f = ue0Var;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = ya1Var;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.m22
    public final hp a() {
        cb1 cb1Var = new cb1();
        f32 f32Var = ut0.f.a;
        am amVar = am.b;
        Context context = this.a;
        int iC = amVar.c(context, 12451000);
        if (iC == 0 || iC == 2) {
            za1.a.execute(new in2(this.f, context, cb1Var));
        }
        fn2 fn2VarR = fn2.r(cb1Var);
        final int i = 1;
        wh2 wh2Var = new wh2(this) { // from class: v22
            public final /* synthetic */ w22 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:33:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:35:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // defpackage.wh2
            public final Object apply(Object obj) {
                mc2 mc2VarF;
                String str;
                String packageName;
                long jLongValue;
                boolean z;
                int i2 = i;
                w22 w22Var = this.b;
                switch (i2) {
                    case 0:
                        f32 f32Var2 = ut0.f.a;
                        ContentResolver contentResolver = w22Var.a.getContentResolver();
                        return new b02(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new je0(6), 1);
                    default:
                        w2 w2Var = (w2) obj;
                        je0 je0Var = new je0(6);
                        if (!w22Var.d) {
                            if (((Boolean) tu0.e.c.a(lx0.w3)).booleanValue()) {
                                try {
                                    Context context2 = w22Var.a;
                                    mc2VarF = mc2.f(context2);
                                    Objects.requireNonNull(w2Var);
                                    str = w2Var.a;
                                    Objects.requireNonNull(str);
                                    packageName = context2.getPackageName();
                                    jLongValue = ((Long) tu0.e.c.a(lx0.C3)).longValue();
                                    z = w22Var.e;
                                    mc2VarF.getClass();
                                    synchronized (mc2.class) {
                                        je0Var = mc2VarF.a(str, packageName, jLongValue, z);
                                    }
                                } catch (IOException | IllegalArgumentException e) {
                                    vc3.C.h.d("AdIdInfoSignalSource.getPaidV1", e);
                                    je0Var = new je0(6);
                                }
                            }
                            break;
                        } else if (((Boolean) tu0.e.c.a(lx0.x3)).booleanValue()) {
                            Context context3 = w22Var.a;
                            mc2VarF = mc2.f(context3);
                            Objects.requireNonNull(w2Var);
                            str = w2Var.a;
                            Objects.requireNonNull(str);
                            packageName = context3.getPackageName();
                            jLongValue = ((Long) tu0.e.c.a(lx0.C3)).longValue();
                            z = w22Var.e;
                            mc2VarF.getClass();
                            synchronized (mc2.class) {
                                je0Var = mc2VarF.a(str, packageName, jLongValue, z);
                            }
                        }
                        return new b02(w2Var, null, je0Var, 1);
                }
            }
        };
        Executor executor = this.c;
        final int i2 = 0;
        return na1.I((fn2) na1.K(na1.M(fn2VarR, wh2Var, executor), ((Long) tu0.e.c.a(lx0.e1)).longValue(), TimeUnit.MILLISECONDS, this.b), Throwable.class, new wh2(this) { // from class: v22
            public final /* synthetic */ w22 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:33:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:35:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // defpackage.wh2
            public final Object apply(Object obj) {
                mc2 mc2VarF;
                String str;
                String packageName;
                long jLongValue;
                boolean z;
                int i3 = i2;
                w22 w22Var = this.b;
                switch (i3) {
                    case 0:
                        f32 f32Var2 = ut0.f.a;
                        ContentResolver contentResolver = w22Var.a.getContentResolver();
                        return new b02(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new je0(6), 1);
                    default:
                        w2 w2Var = (w2) obj;
                        je0 je0Var = new je0(6);
                        if (!w22Var.d) {
                            if (((Boolean) tu0.e.c.a(lx0.w3)).booleanValue()) {
                                try {
                                    Context context3 = w22Var.a;
                                    mc2VarF = mc2.f(context3);
                                    Objects.requireNonNull(w2Var);
                                    str = w2Var.a;
                                    Objects.requireNonNull(str);
                                    packageName = context3.getPackageName();
                                    jLongValue = ((Long) tu0.e.c.a(lx0.C3)).longValue();
                                    z = w22Var.e;
                                    mc2VarF.getClass();
                                    synchronized (mc2.class) {
                                        je0Var = mc2VarF.a(str, packageName, jLongValue, z);
                                    }
                                } catch (IOException | IllegalArgumentException e) {
                                    vc3.C.h.d("AdIdInfoSignalSource.getPaidV1", e);
                                    je0Var = new je0(6);
                                }
                            }
                            break;
                        } else if (((Boolean) tu0.e.c.a(lx0.x3)).booleanValue()) {
                            Context context4 = w22Var.a;
                            mc2VarF = mc2.f(context4);
                            Objects.requireNonNull(w2Var);
                            str = w2Var.a;
                            Objects.requireNonNull(str);
                            packageName = context4.getPackageName();
                            jLongValue = ((Long) tu0.e.c.a(lx0.C3)).longValue();
                            z = w22Var.e;
                            mc2VarF.getClass();
                            synchronized (mc2.class) {
                                je0Var = mc2VarF.a(str, packageName, jLongValue, z);
                            }
                        }
                        return new b02(w2Var, null, je0Var, 1);
                }
            }
        }, executor);
    }

    @Override // defpackage.m22
    public final int c() {
        return 40;
    }
}
