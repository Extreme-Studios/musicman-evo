package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import defpackage.g2;
import defpackage.g90;
import defpackage.ig;
import defpackage.j90;
import defpackage.jb0;
import defpackage.jn;
import defpackage.jt0;
import defpackage.ju;
import defpackage.kb;
import defpackage.kt0;
import defpackage.qd;
import defpackage.r52;
import defpackage.rm;
import defpackage.u21;
import defpackage.ub;
import defpackage.v8;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends jt0 implements u21 {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            rm rmVarO0 = ju.O0(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            kt0.f(parcel);
            boolean zZze = zze(rmVarO0, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
            return true;
        }
        if (i == 2) {
            rm rmVarO1 = ju.O0(parcel.readStrongBinder());
            kt0.f(parcel);
            zzf(rmVarO1);
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return false;
        }
        rm rmVarO2 = ju.O0(parcel.readStrongBinder());
        jb0 jb0Var = (jb0) kt0.b(parcel, jb0.CREATOR);
        kt0.f(parcel);
        boolean zZzg = zzg(rmVarO2, jb0Var);
        parcel2.writeNoException();
        parcel2.writeInt(zZzg ? 1 : 0);
        return true;
    }

    @Override // defpackage.u21
    public final boolean zze(rm rmVar, String str, String str2) {
        return zzg(rmVar, new jb0(str, str2, ""));
    }

    @Override // defpackage.u21
    public final void zzf(rm rmVar) {
        Context context = (Context) ju.Z0(rmVar);
        try {
            g90.c(context.getApplicationContext(), new g2(new ig(10)));
        } catch (IllegalStateException unused) {
        }
        try {
            g90 g90VarB = g90.b(context);
            g90VarB.d.i(new v8(g90VarB));
            ub ubVar = new ub();
            kb kbVar = new kb();
            kbVar.a = 1;
            kbVar.f = -1L;
            kbVar.g = -1L;
            new HashSet();
            kbVar.b = false;
            kbVar.c = false;
            kbVar.a = 2;
            kbVar.d = false;
            kbVar.e = false;
            kbVar.h = ubVar;
            kbVar.f = -1L;
            kbVar.g = -1L;
            r52 r52Var = new r52(OfflinePingSender.class);
            ((j90) r52Var.h).j = kbVar;
            ((HashSet) r52Var.i).add("offline_ping_sender_work");
            g90VarB.a(r52Var.a());
        } catch (IllegalStateException e) {
            jn.V("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // defpackage.u21
    public final boolean zzg(rm rmVar, jb0 jb0Var) throws Throwable {
        Context context = (Context) ju.Z0(rmVar);
        try {
            g90.c(context.getApplicationContext(), new g2(new ig(10)));
        } catch (IllegalStateException unused) {
        }
        ub ubVar = new ub();
        kb kbVar = new kb();
        kbVar.a = 1;
        kbVar.f = -1L;
        kbVar.g = -1L;
        new HashSet();
        kbVar.b = false;
        kbVar.c = false;
        kbVar.a = 2;
        kbVar.d = false;
        kbVar.e = false;
        kbVar.h = ubVar;
        kbVar.f = -1L;
        kbVar.g = -1L;
        HashMap map = new HashMap();
        map.put("uri", jb0Var.f);
        map.put("gws_query_id", jb0Var.g);
        map.put("image_url", jb0Var.h);
        qd qdVar = new qd(map);
        qd.c(qdVar);
        r52 r52Var = new r52(OfflineNotificationPoster.class);
        j90 j90Var = (j90) r52Var.h;
        j90Var.j = kbVar;
        j90Var.e = qdVar;
        ((HashSet) r52Var.i).add("offline_notification_work");
        try {
            g90.b(context).a(r52Var.a());
            return true;
        } catch (IllegalStateException e) {
            jn.V("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
