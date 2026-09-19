package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x20 implements z80, yh {
    public static final String o = yp.f("SystemFgDispatcher");
    public final g90 f;
    public final l30 g;
    public final Object h = new Object();
    public String i;
    public final LinkedHashMap j;
    public final HashMap k;
    public final HashSet l;
    public final a90 m;
    public SystemForegroundService n;

    public x20(Context context) {
        g90 g90VarB = g90.b(context);
        this.f = g90VarB;
        r52 r52Var = g90VarB.d;
        this.g = r52Var;
        this.i = null;
        this.j = new LinkedHashMap();
        this.l = new HashSet();
        this.k = new HashMap();
        this.m = new a90(context, r52Var, this);
        g90VarB.e.b(this);
    }

    @Override // defpackage.yh
    public final void a(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.h) {
            try {
                j90 j90Var = (j90) this.k.remove(str);
                if (j90Var != null ? this.l.remove(j90Var) : false) {
                    this.m.b(this.l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        fj fjVar = (fj) this.j.remove(str);
        int i = 1;
        if (str.equals(this.i) && this.j.size() > 0) {
            Iterator it = this.j.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.i = (String) entry.getKey();
            if (this.n != null) {
                fj fjVar2 = (fj) entry.getValue();
                SystemForegroundService systemForegroundService = this.n;
                systemForegroundService.g.post(new hd(systemForegroundService, fjVar2.a, fjVar2.c, fjVar2.b));
                SystemForegroundService systemForegroundService2 = this.n;
                systemForegroundService2.g.post(new og(fjVar2.a, i, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.n;
        if (fjVar == null || systemForegroundService3 == null) {
            return;
        }
        yp.d().a(o, "Removing Notification (id: " + fjVar.a + ", workSpecId: " + str + " ,notificationType: " + fjVar.b + ")", new Throwable[0]);
        systemForegroundService3.g.post(new og(fjVar.a, i, systemForegroundService3));
    }

    @Override // defpackage.z80
    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            yp.d().a(o, "Constraints unmet for WorkSpec " + str, new Throwable[0]);
            g90 g90Var = this.f;
            g90Var.d.i(new c20(g90Var, str, true));
        }
    }

    public final void d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        yp.d().a(o, "Notifying with (id: " + intExtra + ", workSpecId: " + stringExtra + ", notificationType: " + intExtra2 + ")", new Throwable[0]);
        if (notification == null || this.n == null) {
            return;
        }
        fj fjVar = new fj(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.j;
        linkedHashMap.put(stringExtra, fjVar);
        if (TextUtils.isEmpty(this.i)) {
            this.i = stringExtra;
            SystemForegroundService systemForegroundService = this.n;
            systemForegroundService.g.post(new hd(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.n;
        systemForegroundService2.g.post(new e6((Object) systemForegroundService2, intExtra, (Parcelable) notification, 3));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((fj) ((Map.Entry) it.next()).getValue()).b;
        }
        fj fjVar2 = (fj) linkedHashMap.get(this.i);
        if (fjVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.n;
            systemForegroundService3.g.post(new hd(systemForegroundService3, fjVar2.a, fjVar2.c, i));
        }
    }

    public final void e() {
        this.n = null;
        synchronized (this.h) {
            this.m.c();
        }
        this.f.e.d(this);
    }

    @Override // defpackage.z80
    public final void c(List list) {
    }
}
