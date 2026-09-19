package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gx0 implements Callable {
    public static final /* synthetic */ gx0 b = new gx0(0);
    public static final /* synthetic */ gx0 c = new gx0(2);
    public static final /* synthetic */ gx0 d = new gx0(3);
    public static final /* synthetic */ gx0 e = new gx0(6);
    public static final /* synthetic */ gx0 f = new gx0(7);
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        String str2 = null;
        int i = 1;
        switch (this.a) {
            case 0:
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            case 1:
                vc3 vc3Var = vc3.C;
                vc3Var.k.getClass();
                return new d12(System.currentTimeMillis() - vc3Var.h.g().m().f);
            case 2:
                vc3 vc3Var2 = vc3.C;
                yq0 yq0Var = vc3Var2.o;
                synchronized (yq0Var.a) {
                    str = yq0Var.c;
                    break;
                }
                return new k12(str, vc3Var2.o.h());
            case 3:
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                bundle.putInt("web_view_count", vc3.C.h.k.get());
                return new i02(1, bundle);
            case 4:
                ix0 ix0Var = lx0.G5;
                tu0 tu0Var = tu0.e;
                int i2 = 3;
                if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    return new f02(str2, i2);
                }
                if (!((Boolean) tu0Var.c.a(lx0.P5)).booleanValue()) {
                    vc3.C.x.getClass();
                    return new f02(el1.d(), i2);
                }
                if (c12.c == null) {
                    vc3.C.x.getClass();
                    c12.c = el1.d();
                }
                return new f02(c12.c, i2);
            case 5:
                return new m02(2, new JSONObject());
            case 6:
                HashMap map = new HashMap();
                ix0 ix0Var2 = lx0.V;
                tu0 tu0Var2 = tu0.e;
                String str3 = (String) tu0Var2.c.a(ix0Var2);
                if (str3 != null && !str3.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) tu0Var2.c.a(lx0.W)).intValue()) {
                        for (String str4 : str3.split(",", -1)) {
                            map.put(str4, pd1.a(str4));
                        }
                    }
                }
                return new s12(map, i);
            default:
                return null;
        }
    }

    public /* synthetic */ gx0(int i) {
        this.a = i;
    }
}
