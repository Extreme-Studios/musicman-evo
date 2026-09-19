package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class mx0 {
    public Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public mx0() {
        this.b = new ArrayBlockingQueue(100);
        this.c = new LinkedHashMap();
        this.d = new HashMap();
        this.h = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    }

    public bz1 a() {
        dq.F((Context) this.g, Context.class);
        dq.F((HashMap) this.d, Map.class);
        dq.F((hp0) this.a, hp0.class);
        dq.F((dd2) this.i, dd2.class);
        return new bz1((hm1) this.b, (y91) this.c, (Context) this.g, (View) this.f, (Activity) this.h, (String) this.e, (HashMap) this.d, (hp0) this.a, (dd2) this.i);
    }

    public LinkedHashMap b(LinkedHashMap linkedHashMap, Map map) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap2.get(str);
            qx0 qx0Var = (qx0) ((HashMap) this.d).get(str);
            if (qx0Var == null) {
                qx0Var = qx0.b;
            }
            linkedHashMap2.put(str, qx0Var.a(str3, str2));
        }
        return linkedHashMap2;
    }

    public void c(x42 x42Var) {
        hp hpVarC;
        synchronized (this) {
            Iterator it = x42Var.a.iterator();
            while (it.hasNext()) {
                tw1 tw1VarA = ((oi1) this.d).a((String) it.next(), x42Var.b);
                if (tw1VarA != null && tw1VarA.a((e52) this.i, x42Var)) {
                    hpVarC = na1.K(tw1VarA.b((e52) this.i, x42Var), x42Var.R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.c);
                }
            }
            hpVarC = na1.C(new au1(3));
        }
        ((hy1) this.e).b((e52) this.i, x42Var, hpVarC, (e82) this.f);
        hpVarC.a(new in2(hpVarC, 0, new us2(this, 20, x42Var)), (Executor) this.b);
    }

    public void d(LinkedHashMap linkedHashMap, z61 z61Var) {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.e).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (z61Var != null) {
            String str = (String) z61Var.h;
            String str2 = (String) z61Var.g;
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&it=");
                sb.append(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append("&blat=");
                sb.append(str);
            }
            string = sb.toString();
        }
        FileOutputStream fileOutputStream = null;
        if (!((AtomicBoolean) this.a).get()) {
            zb3 zb3Var = vc3.C.c;
            new l51((Context) this.g, (String) this.f, string, null).o1();
            return;
        }
        File file = (File) this.i;
        if (file == null) {
            jn.T("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        jn.V("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    jn.V("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            jn.V("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            jn.V("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public /* synthetic */ mx0(hm1 hm1Var, y91 y91Var) {
        this.b = hm1Var;
        this.c = y91Var;
    }

    public mx0(ya1 ya1Var, ScheduledExecutorService scheduledExecutorService, oi1 oi1Var, hy1 hy1Var, e82 e82Var) {
        this.g = new tn2();
        this.a = new AtomicBoolean();
        this.b = ya1Var;
        this.c = scheduledExecutorService;
        this.d = oi1Var;
        this.e = hy1Var;
        this.f = e82Var;
    }
}
