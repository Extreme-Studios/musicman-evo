package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ContentInfo;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zy1 implements gs, pb, wm2, y7, eb1, dr, hn2, gm1, ke1, bv0, fv1, n62 {
    public static final Object h = new Object();
    public static zy1 i;
    public final /* synthetic */ int f;
    public Object g;

    public zy1(a01 a01Var) {
        this.f = 17;
        this.g = a01Var;
        try {
            rm rmVarC = a01Var.c();
            if (rmVarC != null) {
            }
        } catch (RemoteException e) {
            jn.P("", e);
        }
        try {
            ((a01) this.g).h();
        } catch (RemoteException e2) {
            jn.P("", e2);
        }
        try {
            ((a01) this.g).l();
        } catch (RemoteException e3) {
            jn.P("", e3);
        }
        try {
            ((a01) this.g).b();
        } catch (RemoteException e4) {
            jn.P("", e4);
        }
        try {
            ((a01) this.g).d();
        } catch (RemoteException e5) {
            jn.P("", e5);
        }
        if (((Boolean) tu0.e.c.a(lx0.o4)).booleanValue()) {
            try {
                ((a01) this.g).e();
            } catch (RemoteException unused) {
            }
        }
    }

    public static void k(lk lkVar) {
        lkVar.c("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        lkVar.c("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        lkVar.c("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        lkVar.c("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        lkVar.c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        lkVar.c("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        lkVar.c("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        lkVar.c("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        lkVar.c("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        lkVar.c("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        lkVar.c("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        lkVar.c("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        lkVar.c("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        lkVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        lkVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static xx l(lk lkVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new c30(1, 1, "work_spec_id", "TEXT", null, true));
        map.put("prerequisite_id", new c30(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new d30("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new d30("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new f30("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
        hashSet2.add(new f30("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
        g30 g30Var = new g30("Dependency", map, hashSet, hashSet2);
        g30 g30VarA = g30.a(lkVar, "Dependency");
        if (!g30Var.equals(g30VarA)) {
            return new xx(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + g30Var + "\n Found:\n" + g30VarA);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new c30(1, 1, "id", "TEXT", null, true));
        map2.put("state", new c30(0, 1, "state", "INTEGER", null, true));
        map2.put("worker_class_name", new c30(0, 1, "worker_class_name", "TEXT", null, true));
        map2.put("input_merger_class_name", new c30(0, 1, "input_merger_class_name", "TEXT", null, false));
        map2.put("input", new c30(0, 1, "input", "BLOB", null, true));
        map2.put("output", new c30(0, 1, "output", "BLOB", null, true));
        map2.put("initial_delay", new c30(0, 1, "initial_delay", "INTEGER", null, true));
        map2.put("interval_duration", new c30(0, 1, "interval_duration", "INTEGER", null, true));
        map2.put("flex_duration", new c30(0, 1, "flex_duration", "INTEGER", null, true));
        map2.put("run_attempt_count", new c30(0, 1, "run_attempt_count", "INTEGER", null, true));
        map2.put("backoff_policy", new c30(0, 1, "backoff_policy", "INTEGER", null, true));
        map2.put("backoff_delay_duration", new c30(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        map2.put("period_start_time", new c30(0, 1, "period_start_time", "INTEGER", null, true));
        map2.put("minimum_retention_duration", new c30(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        map2.put("schedule_requested_at", new c30(0, 1, "schedule_requested_at", "INTEGER", null, true));
        map2.put("run_in_foreground", new c30(0, 1, "run_in_foreground", "INTEGER", null, true));
        map2.put("out_of_quota_policy", new c30(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        map2.put("required_network_type", new c30(0, 1, "required_network_type", "INTEGER", null, false));
        map2.put("requires_charging", new c30(0, 1, "requires_charging", "INTEGER", null, true));
        map2.put("requires_device_idle", new c30(0, 1, "requires_device_idle", "INTEGER", null, true));
        map2.put("requires_battery_not_low", new c30(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        map2.put("requires_storage_not_low", new c30(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        map2.put("trigger_content_update_delay", new c30(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        map2.put("trigger_max_content_delay", new c30(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        map2.put("content_uri_triggers", new c30(0, 1, "content_uri_triggers", "BLOB", null, false));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new f30("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
        hashSet4.add(new f30("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
        g30 g30Var2 = new g30("WorkSpec", map2, hashSet3, hashSet4);
        g30 g30VarA2 = g30.a(lkVar, "WorkSpec");
        if (!g30Var2.equals(g30VarA2)) {
            return new xx(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + g30Var2 + "\n Found:\n" + g30VarA2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new c30(1, 1, "tag", "TEXT", null, true));
        map3.put("work_spec_id", new c30(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new d30("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new f30("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
        g30 g30Var3 = new g30("WorkTag", map3, hashSet5, hashSet6);
        g30 g30VarA3 = g30.a(lkVar, "WorkTag");
        if (!g30Var3.equals(g30VarA3)) {
            return new xx(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + g30Var3 + "\n Found:\n" + g30VarA3);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new c30(1, 1, "work_spec_id", "TEXT", null, true));
        map4.put("system_id", new c30(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new d30("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        g30 g30Var4 = new g30("SystemIdInfo", map4, hashSet7, new HashSet(0));
        g30 g30VarA4 = g30.a(lkVar, "SystemIdInfo");
        if (!g30Var4.equals(g30VarA4)) {
            return new xx(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + g30Var4 + "\n Found:\n" + g30VarA4);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new c30(1, 1, "name", "TEXT", null, true));
        map5.put("work_spec_id", new c30(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new d30("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new f30("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
        g30 g30Var5 = new g30("WorkName", map5, hashSet8, hashSet9);
        g30 g30VarA5 = g30.a(lkVar, "WorkName");
        if (!g30Var5.equals(g30VarA5)) {
            return new xx(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + g30Var5 + "\n Found:\n" + g30VarA5);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new c30(1, 1, "work_spec_id", "TEXT", null, true));
        map6.put("progress", new c30(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new d30("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        g30 g30Var6 = new g30("WorkProgress", map6, hashSet10, new HashSet(0));
        g30 g30VarA6 = g30.a(lkVar, "WorkProgress");
        if (!g30Var6.equals(g30VarA6)) {
            return new xx(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + g30Var6 + "\n Found:\n" + g30VarA6);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new c30(1, 1, "key", "TEXT", null, true));
        map7.put("long_value", new c30(0, 1, "long_value", "INTEGER", null, false));
        g30 g30Var7 = new g30("Preference", map7, new HashSet(0), new HashSet(0));
        g30 g30VarA7 = g30.a(lkVar, "Preference");
        if (g30Var7.equals(g30VarA7)) {
            return new xx(true, (String) null);
        }
        return new xx(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + g30Var7 + "\n Found:\n" + g30VarA7);
    }

    @Override // defpackage.dr
    public void A(g2 g2Var) {
        try {
            ((k51) this.g).a(g2Var.d());
        } catch (RemoteException e) {
            jn.P("", e);
        }
    }

    @Override // defpackage.y7
    public void U(db dbVar) {
        ((cb1) this.g).c(new RuntimeException("Connection failed."));
    }

    @Override // defpackage.wm2
    public hp a() {
        ep0 ep0Var = (ep0) this.g;
        return (hp) ep0Var.G3(ep0Var.h, null, "BANNER", null, null, 0, null, new Bundle(), null).b.c();
    }

    @Override // defpackage.eb1
    /* JADX INFO: renamed from: b */
    public void mo11b(Object obj) {
        switch (this.f) {
            case 15:
                k31 k31Var = (k31) obj;
                jn.p("Getting a new session for JS Engine.");
                k31Var.getClass();
                ((cb1) ((r31) this.g).a).b(new v31(k31Var));
                break;
            case zw0.zzm /* 21 */:
                ((ek1) obj).Z((fu1) this.g);
                break;
            default:
                ((pl1) obj).E0((r71) this.g);
                break;
        }
    }

    @Override // defpackage.pb
    public sb build() {
        return new sb(new kc2(((ContentInfo.Builder) this.g).build()));
    }

    @Override // defpackage.gs
    public void c(rr rrVar, boolean z) {
        ((c5) this.g).q(rrVar);
    }

    @Override // defpackage.fv1
    public /* synthetic */ hp d(r71 r71Var) {
        return ((pv1) ((o63) ((r52) this.g).i).c()).D3(r71Var.m);
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        cb1 cb1Var;
        switch (this.f) {
            case 18:
                ((AtomicInteger) ((z4) this.g).b).set(1);
                return;
            case 20:
                zg1 zg1Var = (zg1) this.g;
                e82 e82Var = zg1Var.l;
                e52 e52Var = zg1Var.j;
                x42 x42Var = zg1Var.k;
                zg1Var.m.b(true == vc3.C.h.i(zg1Var.f) ? 2 : 1, e82Var.b(e52Var, x42Var, false, "", (String) obj, x42Var.c, null));
                return;
            case 23:
                no1 no1Var = (no1) this.g;
                ro1 ro1Var = no1Var.m;
                md1 md1Var = (md1) obj;
                synchronized (ro1Var) {
                    ro1Var.k = md1Var;
                }
                ro1 ro1Var2 = no1Var.m;
                synchronized (ro1Var2) {
                    cb1Var = ro1Var2.n;
                }
                qw1 qw1VarE = no1Var.e("Google", true);
                if (qw1VarE != null && cb1Var != null) {
                    cb1Var.b(qw1VarE);
                    return;
                } else {
                    if (cb1Var != null) {
                        cb1Var.cancel(false);
                        return;
                    }
                    return;
                }
            default:
                e52 e52Var2 = (e52) obj;
                if (((Boolean) tu0.e.c.a(lx0.r2)).booleanValue()) {
                    ((ru1) this.g).k.A(e52Var2);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.bv0
    public void f(yw0 yw0Var) {
        ev0 ev0Var = (ev0) ((zw0) yw0Var.g).B().r();
        sw0 sw0Var = (sw0) ((zw0) yw0Var.g).B().C().r();
        String str = ((z42) ((e52) this.g).b.h).b;
        sw0Var.b();
        ((tw0) sw0Var.g).A(str);
        ev0Var.b();
        ((fv0) ev0Var.g).B((tw0) sw0Var.c());
        yw0Var.b();
        ((zw0) yw0Var.g).G((fv0) ev0Var.c());
    }

    @Override // defpackage.pb
    public void g(Uri uri) {
        ((ContentInfo.Builder) this.g).setLinkUri(uri);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(hi hiVar, yb ybVar) {
        j jVar;
        hy hyVar;
        if (ybVar instanceof j) {
            jVar = (j) ybVar;
            int i2 = jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.l = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, (ac) ybVar);
            }
        } else {
            jVar = new j(this, (ac) ybVar);
        }
        Object obj = jVar.j;
        int i3 = jVar.l;
        k50 k50Var = k50.a;
        if (i3 != 0) {
            if (i3 != 1) {
                j7.e("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hyVar = jVar.i;
            try {
                ar.n(obj);
                hyVar.n();
                return k50Var;
            } catch (Throwable th) {
                th = th;
                hyVar.n();
                throw th;
            }
        }
        ar.n(obj);
        ic icVar = jVar.g;
        icVar.getClass();
        hy hyVar2 = new hy(hiVar, icVar);
        try {
            jVar.i = hyVar2;
            jVar.l = 1;
            try {
                Object objF = ((v00) this.g).f(hyVar2, jVar);
                rc rcVar = rc.f;
                if (objF != rcVar) {
                    objF = k50Var;
                }
                if (objF == rcVar) {
                    return rcVar;
                }
                hyVar = hyVar2;
                hyVar.n();
                return k50Var;
            } catch (Throwable th2) {
                th = th2;
                hyVar = hyVar2;
                hyVar.n();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.gs
    public boolean i(rr rrVar) {
        Window.Callback callback = ((c5) this.g).q.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, rrVar);
        return true;
    }

    @Override // defpackage.pb
    public void j(int i2) {
        ((ContentInfo.Builder) this.g).setFlags(i2);
    }

    public void m(long j, long j2, long j3) throws eo0 {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        do0 do0Var = new do0(j, j2, j3);
        ArrayDeque arrayDeque = (ArrayDeque) this.g;
        if (arrayDeque.size() >= (ec.e((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8) ^ (i9 % 452867621))) {
            throw new eo0();
        }
        arrayDeque.push(do0Var);
    }

    public void n(ed0 ed0Var) {
        long[] jArr = ed0Var.e;
        if (jArr.length > 0) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.g;
            if (linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            linkedHashMap.put(Long.valueOf(jArr[0]), ed0Var);
        }
    }

    @Override // defpackage.ke1
    public void q(String str, int i2, String str2, boolean z) {
        yu0 yu0Var = (yu0) this.g;
        if (z) {
            yu0Var.d();
            return;
        }
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Image Web View failed to load. Error code: ");
        sb.append(i2);
        sb.append(", Description: ");
        sb.append(str);
        yu0Var.c(new ky1(ec.m(sb, ", Failing URL: ", str2), 1));
    }

    public do0 r() {
        return (do0) Optional.ofNullable((do0) ((ArrayDeque) this.g).peek()).orElseThrow(co0.b);
    }

    public String s(Context context) {
        String strA;
        qm2 qm2Var;
        tc2 tc2Var = (tc2) this.g;
        long j = tc2Var.h;
        boolean z = false;
        if (tc2Var.i && System.currentTimeMillis() - j <= tc2Var.j) {
            z = true;
        }
        ch2 ch2VarA = tc2Var.d.a(3);
        try {
            try {
                try {
                    try {
                        try {
                            ch2VarA.a();
                            nd2 nd2Var = tc2Var.a;
                            synchronized (nd2Var) {
                                qm2Var = nd2Var.e;
                                if (qm2Var == null) {
                                    throw null;
                                }
                            }
                            strA = (String) na1.L(qm2Var, new yy0(tc2Var, context), cn2.f).get(z ? tc2Var.g : tc2Var.e, TimeUnit.MILLISECONDS);
                        } catch (ExecutionException e) {
                            e = e;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            ch2VarA.b(e);
                            strA = Integer.toString(3);
                        }
                    } catch (Throwable th) {
                        ch2VarA.b(th);
                        throw th;
                    }
                } catch (TimeoutException e2) {
                    ch2VarA.b(e2);
                    strA = z ? ((rf2) tc2Var.f.c()).a(j) : Integer.toString(17);
                }
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                ch2VarA.b(e3);
                strA = "";
            }
            ch2VarA.c();
            return strA;
        } catch (Throwable th2) {
            ch2VarA.c();
            throw th2;
        }
    }

    @Override // defpackage.pb
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.g).setExtras(bundle);
    }

    public String t(Context context, String str, View view) {
        String string;
        qm2 qm2Var;
        tc2 tc2Var = (tc2) this.g;
        ch2 ch2VarA = tc2Var.d.a(5);
        try {
            try {
                try {
                    ch2VarA.a();
                    nd2 nd2Var = tc2Var.a;
                    synchronized (nd2Var) {
                        qm2Var = nd2Var.e;
                        if (qm2Var == null) {
                            throw null;
                        }
                    }
                    string = (String) na1.L(qm2Var, new c41(tc2Var, context, str, view), cn2.f).get(tc2Var.e, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ch2VarA.b(e);
                    string = "";
                } catch (TimeoutException e2) {
                    ch2VarA.b(e2);
                    string = Integer.toString(17);
                }
            } catch (ExecutionException e3) {
                e = e3;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                ch2VarA.b(e);
                string = Integer.toString(3);
            } catch (Throwable th) {
                ch2VarA.b(th);
                throw th;
            }
            ch2VarA.c();
            return string;
        } catch (Throwable th2) {
            ch2VarA.c();
            throw th2;
        }
    }

    public void u(MotionEvent motionEvent) {
        je2 je2Var = ((tc2) this.g).b;
        ge2 ge2Var = (ge2) je2Var.f.get();
        if (ge2Var == null) {
            je2Var.e.b(54);
        } else {
            ge2Var.d(motionEvent);
        }
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        switch (this.f) {
            case 18:
                ((AtomicInteger) ((z4) this.g).b).set(-1);
                break;
            case 20:
                break;
            case 23:
                if (((Boolean) tu0.e.c.a(lx0.O5)).booleanValue()) {
                    vc3.C.h.e("omid native display exp", th);
                }
                break;
        }
    }

    private final void o(Throwable th) {
    }

    private final void p(Throwable th) {
    }

    @Override // defpackage.n62
    public /* synthetic */ Object b(Object obj) {
        bw1.c((SQLiteDatabase) obj, (id3) this.g);
        return null;
    }

    public /* synthetic */ zy1(int i2, boolean z) {
        this.f = i2;
    }

    public /* synthetic */ zy1(Object obj, int i2, Object obj2) {
        this.f = i2;
        this.g = obj2;
    }

    public zy1(int i2) {
        this.f = i2;
        switch (i2) {
            case 12:
                this.g = new ArrayDeque();
                break;
            case 13:
                this.g = Collections.EMPTY_LIST;
                break;
            case 19:
                this.g = new AtomicBoolean(false);
                break;
            default:
                this.g = new LinkedHashMap();
                break;
        }
    }

    public /* synthetic */ zy1(int i2, Object obj) {
        this.f = i2;
        this.g = obj;
    }

    public zy1(t31 t31Var, r31 r31Var) {
        this.f = 15;
        this.g = r31Var;
        Objects.requireNonNull(t31Var);
    }

    public zy1(Context context, ya1 ya1Var, vc2 vc2Var) {
        this.f = 1;
        context.getClass();
        ya1Var.getClass();
        this.g = (tc2) ((q63) new hm1(ya1Var, context, vc2Var).m).c();
    }

    public zy1(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f = 5;
        if (Build.VERSION.SDK_INT >= 25) {
            this.g = new dn(uri, clipDescription, uri2);
        } else {
            this.g = new p83(uri, clipDescription, uri2, 2);
        }
    }

    public zy1(ClipData clipData, int i2) {
        this.f = 4;
        this.g = ob.p(clipData, i2);
    }
}
