package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n92 implements p20, gm1, ii2 {
    public static final n92 h = new n92();
    public final /* synthetic */ int f;
    public Context g;

    public n92(Context context) {
        this.f = 2;
        dq.g(context, "Context can not be null");
        this.g = context;
    }

    @Override // defpackage.ii2
    public Object a() {
        kg3 kg3Var;
        switch (this.f) {
            case 4:
                return na1.o(this.g);
            default:
                Context context = this.g;
                qk2 qk2Var = kg3.s;
                synchronized (kg3.class) {
                    try {
                        if (kg3.y == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            kg3.y = new kg3(applicationContext, map);
                        }
                        kg3Var = kg3.y;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return kg3Var;
        }
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((mk1) obj).p(this.g);
    }

    public boolean c(Intent intent) {
        dq.g(intent, "Intent can not be null");
        return !this.g.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @Override // defpackage.p20
    public q20 d(md mdVar) {
        Context context = this.g;
        String str = (String) mdVar.h;
        us2 us2Var = (us2) mdVar.i;
        if (us2Var == null) {
            j7.p("Must set a callback to create the configuration.");
            return null;
        }
        if (context == null) {
            j7.p("Must set a non-null context to create the configuration.");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            j7.p("Must set a non-null database name to a configuration that uses the no backup directory.");
            return null;
        }
        md mdVar2 = new md(context, str, us2Var, true);
        return new ok((Context) mdVar2.g, (String) mdVar2.h, (us2) mdVar2.i, mdVar2.f);
    }

    public /* synthetic */ n92(Context context, int i) {
        this.f = i;
        this.g = context;
    }

    public /* synthetic */ n92() {
        this.f = 0;
    }
}
