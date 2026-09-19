package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class mn0 implements hn2, n62 {
    public boolean f;
    public final Object g;

    public mn0(int i) {
        switch (i) {
            case 3:
                this.g = new SparseBooleanArray();
                break;
            default:
                e3 e3Var = new e3(7, (byte) 0);
                zf0 zf0Var = new zf0(3);
                g2 g2Var = new g2(xn0.b, 0, new ue0(false));
                g2Var.j = zf0Var;
                this.g = new ko0(e3Var, g2Var);
                this.f = false;
                break;
        }
    }

    public void a() throws ln0 {
        ko0 ko0Var = (ko0) this.g;
        boolean z = this.f;
        String strA = wn0.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
        if (z) {
            return;
        }
        try {
            HashMap map = jo0.a;
            um0 um0Var = new um0(4);
            um0Var.m(yn0.f, qo0.f(tn0.s));
            um0Var.m(yn0.g, ue0.o(0L));
            um0Var.m(yn0.h, ue0.o(1L));
            um0Var.m(yn0.i, ue0.o(2L));
            um0Var.m(yn0.j, ue0.o(3L));
            um0Var.m(yn0.k, ue0.o(4L));
            um0Var.m(yn0.l, ue0.o(7L));
            um0Var.m(yn0.m, ue0.o(-1L));
            um0Var.m(yn0.n, ue0.o(-2L));
            um0Var.m(yn0.o, qo0.f(pn0.b));
            um0Var.m(yn0.p, qo0.f(pn0.d));
            um0Var.m(yn0.q, qo0.f(pn0.j));
            um0Var.m(yn0.r, qo0.f(pn0.k));
            um0Var.m(yn0.s, qo0.f(pn0.n));
            um0Var.m(yn0.t, qo0.f(tn0.n));
            um0Var.m(yn0.u, qo0.f(pn0.f));
            um0Var.m(yn0.v, qo0.f(pn0.g));
            um0Var.m(yn0.w, qo0.f(pn0.h));
            um0Var.m(yn0.x, qo0.f(pn0.i));
            um0Var.m(yn0.y, qo0.f(tn0.h));
            um0Var.m(yn0.z, qo0.f(tn0.j));
            um0Var.m(yn0.B, qo0.f(pn0.o));
            um0Var.m(yn0.C, qo0.f(pn0.p));
            um0Var.m(yn0.D, qo0.f(pn0.s));
            um0Var.m(yn0.E, qo0.f(pn0.t));
            um0Var.m(yn0.F, qo0.f(pn0.u));
            um0Var.m(yn0.G, qo0.f(pn0.v));
            um0Var.m(yn0.H, qo0.f(tn0.b));
            um0Var.m(yn0.I, qo0.f(tn0.d));
            um0Var.m(yn0.J, qo0.f(tn0.e));
            um0Var.m(yn0.K, qo0.f(tn0.f));
            um0Var.m(yn0.L, qo0.f(tn0.k));
            um0Var.m(yn0.M, qo0.f(tn0.l));
            um0Var.m(yn0.N, qo0.f(tn0.p));
            um0Var.m(yn0.O, qo0.f(tn0.q));
            um0Var.m(yn0.P, qo0.f(tn0.u));
            um0Var.m(yn0.Q, qo0.f(tn0.v));
            um0Var.m(yn0.R, qo0.f(vn0.b));
            um0Var.m(yn0.S, qo0.f(vn0.d));
            um0Var.m(yn0.Z, qo0.f(vn0.e));
            um0Var.m(yn0.T, qo0.f(vn0.j));
            um0Var.m(yn0.U, qo0.f(vn0.k));
            um0Var.m(yn0.V, qo0.f(vn0.n));
            um0Var.m(yn0.W, qo0.f(vn0.q));
            um0Var.m(yn0.X, qo0.f(pn0.q));
            um0Var.m(yn0.Y, qo0.f(vn0.l));
            um0Var.m(yn0.a0, qo0.f(pn0.l));
            um0Var.m(yn0.b0, qo0.f(vn0.g));
            um0Var.m(yn0.c0, qo0.f(vn0.h));
            um0Var.m(yn0.A, qo0.f(tn0.i));
            um0Var.m(yn0.d0, qo0.f(vn0.p));
            um0Var.m(yn0.e0, qo0.f(tn0.m));
            um0Var.m(yn0.f0, qo0.f(vn0.o));
            um0Var.m(yn0.g0, qo0.f(tn0.c));
            um0Var.m(yn0.h0, qo0.f(vn0.c));
            um0Var.m(yn0.i0, qo0.f(pn0.r));
            um0Var.m(yn0.j0, qo0.f(vn0.m));
            um0Var.m(yn0.k0, qo0.f(pn0.e));
            um0Var.m(yn0.l0, qo0.f(vn0.f));
            um0Var.m(yn0.m0, qo0.f(tn0.t));
            um0Var.m(yn0.n0, qo0.f(pn0.c));
            um0Var.m(yn0.o0, qo0.f(vn0.i));
            um0Var.m(yn0.p0, qo0.f(tn0.o));
            um0Var.m(yn0.q0, qo0.f(pn0.m));
            um0Var.m(yn0.r0, qo0.f(tn0.r));
            um0Var.m(yn0.s0, qo0.f(tn0.g));
            vk2 vk2VarS = um0Var.s();
            for (long j = -1; j >= -82; j--) {
                yn0 yn0Var = (yn0) map.get(Long.valueOf(j));
                if (yn0Var == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 36);
                    sb.append(strA);
                    sb.append(j);
                    throw new na(sb.toString());
                }
                ko0Var.a.k((qo0) vk2VarS.get(yn0Var));
            }
            for (int i = 82; i < 1159; i++) {
                ko0Var.a.k(qo0.a(null));
            }
            this.f = true;
        } catch (ho0 e) {
            throw new ln0(kn0.g, e);
        }
    }

    @Override // defpackage.n62
    public Object b(Object obj) {
        long j;
        r52 r52Var = (r52) this.g;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.f) {
            ((Context) r52Var.g).deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(kv0.O(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (o23 e) {
                jn.M("Unable to deserialize proto from offline signals database:");
                jn.M(e.getMessage());
            }
        }
        cursorQuery.close();
        Context context = (Context) r52Var.g;
        lv0 lv0VarZ = nv0.z();
        String packageName = context.getPackageName();
        lv0VarZ.b();
        ((nv0) lv0VarZ.g).E(packageName);
        String str = Build.MODEL;
        lv0VarZ.b();
        ((nv0) lv0VarZ.g).F();
        int iN = s90.N(sQLiteDatabase, 0);
        lv0VarZ.b();
        ((nv0) lv0VarZ.g).B(iN);
        lv0VarZ.b();
        ((nv0) lv0VarZ.g).A(arrayList);
        int iN2 = s90.N(sQLiteDatabase, 1);
        lv0VarZ.b();
        ((nv0) lv0VarZ.g).C(iN2);
        int iN3 = s90.N(sQLiteDatabase, 3);
        lv0VarZ.b();
        ((nv0) lv0VarZ.g).H(iN3);
        vc3.C.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        lv0VarZ.b();
        ((nv0) lv0VarZ.g).D(jCurrentTimeMillis);
        Cursor cursorD0 = s90.d0(sQLiteDatabase, 2);
        if (cursorD0.getCount() > 0) {
            cursorD0.moveToNext();
            j = cursorD0.getLong(cursorD0.getColumnIndexOrThrow("value"));
        } else {
            j = 0;
        }
        cursorD0.close();
        lv0VarZ.b();
        ((nv0) lv0VarZ.g).G(j);
        nv0 nv0Var = (nv0) lv0VarZ.c();
        int size = arrayList.size();
        long jM = 0;
        for (int i = 0; i < size; i++) {
            kv0 kv0Var = (kv0) arrayList.get(i);
            if (kv0Var.N() == 2 && kv0Var.M() > jM) {
                jM = kv0Var.M();
            }
        }
        if (jM != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jM));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
        cv0 cv0Var = (cv0) r52Var.h;
        synchronized (cv0Var) {
            if (cv0Var.c) {
                try {
                    yw0 yw0Var = cv0Var.b;
                    yw0Var.b();
                    ((zw0) yw0Var.g).H(nv0Var);
                } catch (NullPointerException e2) {
                    vc3.C.h.d("AdMobClearcutLogger.modify", e2);
                }
            }
            d60 d60Var = (d60) r52Var.i;
            tv0 tv0VarA = uv0.A();
            int i2 = d60Var.g;
            tv0VarA.b();
            ((uv0) tv0VarA.g).B(i2);
            int i3 = d60Var.h;
            tv0VarA.b();
            ((uv0) tv0VarA.g).C(i3);
            int i4 = true != d60Var.i ? 2 : 0;
            tv0VarA.b();
            ((uv0) tv0VarA.g).z(i4);
            uv0 uv0Var = (uv0) tv0VarA.c();
            synchronized (cv0Var) {
                if (cv0Var.c) {
                    try {
                        yw0 yw0Var2 = cv0Var.b;
                        vw0 vw0Var = (vw0) ((zw0) yw0Var2.g).z().r();
                        vw0Var.b();
                        ((ww0) vw0Var.g).B(uv0Var);
                        yw0Var2.b();
                        ((zw0) yw0Var2.g).F((ww0) vw0Var.c());
                    } catch (NullPointerException e3) {
                        vc3.C.h.d("AdMobClearcutLogger.modify", e3);
                    }
                }
            }
        }
        cv0Var.b(10004);
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        s90.g0(sQLiteDatabase, "failed_requests");
        s90.g0(sQLiteDatabase, "total_requests");
        s90.g0(sQLiteDatabase, "completed_requests");
        return null;
    }

    public void c(int i) {
        hn.M(!this.f);
        ((SparseBooleanArray) this.g).append(i, true);
    }

    public cc3 d() {
        hn.M(!this.f);
        this.f = true;
        return new cc3((SparseBooleanArray) this.g);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00de  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        List listUnmodifiableList;
        List listAsList;
        ArrayList arrayList;
        Iterator it;
        gv0 gv0VarZ;
        int i;
        int i2;
        int i3;
        pw0 pw0Var;
        yv1 yv1Var = (yv1) this.g;
        rj1 rj1Var = (rj1) obj;
        if (((h73) yv1Var.a).s()) {
            return;
        }
        Bundle bundle = rj1Var.a;
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listUnmodifiableList = Collections.EMPTY_LIST;
            }
            arrayList = new ArrayList();
            it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        pw0Var = pw0.BANNER;
                        break;
                    case "native":
                        pw0Var = pw0.NATIVE_APP_INSTALL;
                        break;
                    case "rewarded":
                        pw0Var = pw0.REWARD_BASED_VIDEO_AD;
                        break;
                    case "interstitial":
                        pw0Var = pw0.INTERSTITIAL;
                        break;
                    default:
                        pw0Var = pw0.AD_FORMAT_TYPE_UNSPECIFIED;
                        break;
                }
                arrayList.add(pw0Var);
            }
            mv0 mv0Var = (mv0) yv1.h.get(ej1.q("network", ej1.q("device", bundle)).getInt("active_network_state", -1), mv0.UNSPECIFIED);
            gv0VarZ = hv0.z();
            i = bundle.getInt("cnt", -2);
            i2 = bundle.getInt("gnt", 0);
            i3 = 2;
            if (i == -1) {
                yv1Var.g = 2;
            } else {
                yv1Var.g = 1;
                if (i != 0) {
                    gv0VarZ.b();
                    ((hv0) gv0VarZ.g).A(2);
                } else if (i != 1) {
                    gv0VarZ.b();
                    ((hv0) gv0VarZ.g).A(1);
                } else {
                    gv0VarZ.b();
                    ((hv0) gv0VarZ.g).A(3);
                }
                switch (i2) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        i3 = 3;
                        break;
                    case 13:
                        i3 = 4;
                        break;
                    default:
                        i3 = 1;
                        break;
                }
                gv0VarZ.b();
                ((hv0) gv0VarZ.g).B(i3);
            }
            hv0 hv0Var = (hv0) gv0VarZ.c();
            boolean z = this.f;
            db2 db2Var = new db2();
            db2Var.g = this;
            db2Var.f = z;
            db2Var.h = arrayList;
            db2Var.i = hv0Var;
            db2Var.j = mv0Var;
            ((us2) yv1Var.b).p(db2Var);
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r3.equals("banner")) {
                        pw0Var = pw0.BANNER;
                    } else {
                        pw0Var = pw0.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case -1052618729:
                    if (!r3.equals("native")) {
                        pw0Var = pw0.NATIVE_APP_INSTALL;
                    } else {
                        pw0Var = pw0.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case -239580146:
                    if (!r3.equals("rewarded")) {
                        pw0Var = pw0.REWARD_BASED_VIDEO_AD;
                    } else {
                        pw0Var = pw0.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case 604727084:
                    if (!r3.equals("interstitial")) {
                        pw0Var = pw0.INTERSTITIAL;
                    } else {
                        pw0Var = pw0.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                default:
                    pw0Var = pw0.AD_FORMAT_TYPE_UNSPECIFIED;
                    break;
            }
            arrayList.add(pw0Var);
        }
        mv0 mv0Var2 = (mv0) yv1.h.get(ej1.q("network", ej1.q("device", bundle)).getInt("active_network_state", -1), mv0.UNSPECIFIED);
        gv0VarZ = hv0.z();
        i = bundle.getInt("cnt", -2);
        i2 = bundle.getInt("gnt", 0);
        i3 = 2;
        if (i == -1) {
            yv1Var.g = 2;
        } else {
            yv1Var.g = 1;
            if (i != 0) {
                gv0VarZ.b();
                ((hv0) gv0VarZ.g).A(2);
            } else if (i != 1) {
                gv0VarZ.b();
                ((hv0) gv0VarZ.g).A(1);
            } else {
                gv0VarZ.b();
                ((hv0) gv0VarZ.g).A(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 4;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            gv0VarZ.b();
            ((hv0) gv0VarZ.g).B(i3);
        }
        hv0 hv0Var2 = (hv0) gv0VarZ.c();
        boolean z2 = this.f;
        db2 db2Var2 = new db2();
        db2Var2.g = this;
        db2Var2.f = z2;
        db2Var2.h = arrayList;
        db2Var2.i = hv0Var2;
        db2Var2.j = mv0Var2;
        ((us2) yv1Var.b).p(db2Var2);
    }

    public Object f(Optional optional) throws in0, ln0 {
        long j;
        jn0 jn0Var;
        Object objOf;
        long j2;
        ko0 ko0Var = (ko0) this.g;
        try {
            try {
                long j3 = 2;
                if (this.f) {
                    j = 2;
                } else {
                    String strA = wn0.a("BkCyvAwRMTm0TkOZyDYQMHRR/BfGWZQu16Q1Ljk3pdYDZK5S");
                    try {
                        HashMap map = jo0.a;
                        um0 um0Var = new um0(9, false);
                        um0Var.m(yn0.f, qo0.f(tn0.s));
                        um0Var.m(yn0.g, ue0.o(0L));
                        um0Var.m(yn0.h, ue0.o(1L));
                        um0Var.m(yn0.i, ue0.o(2L));
                        um0Var.m(yn0.j, ue0.o(3L));
                        um0Var.m(yn0.k, ue0.o(4L));
                        um0Var.m(yn0.l, ue0.o(7L));
                        um0Var.m(yn0.m, ue0.o(-1L));
                        um0Var.m(yn0.n, ue0.o(-2L));
                        um0Var.m(yn0.o, qo0.f(pn0.b));
                        um0Var.m(yn0.p, qo0.f(pn0.d));
                        um0Var.m(yn0.q, qo0.f(pn0.j));
                        um0Var.m(yn0.r, qo0.f(pn0.k));
                        um0Var.m(yn0.s, qo0.f(pn0.n));
                        um0Var.m(yn0.t, qo0.f(tn0.n));
                        um0Var.m(yn0.u, qo0.f(pn0.f));
                        um0Var.m(yn0.v, qo0.f(pn0.g));
                        um0Var.m(yn0.w, qo0.f(pn0.h));
                        um0Var.m(yn0.x, qo0.f(pn0.i));
                        um0Var.m(yn0.y, qo0.f(tn0.h));
                        um0Var.m(yn0.z, qo0.f(tn0.j));
                        um0Var.m(yn0.B, qo0.f(pn0.o));
                        um0Var.m(yn0.C, qo0.f(pn0.p));
                        um0Var.m(yn0.D, qo0.f(pn0.s));
                        um0Var.m(yn0.E, qo0.f(pn0.t));
                        um0Var.m(yn0.F, qo0.f(pn0.u));
                        um0Var.m(yn0.G, qo0.f(pn0.v));
                        um0Var.m(yn0.H, qo0.f(tn0.b));
                        um0Var.m(yn0.I, qo0.f(tn0.d));
                        um0Var.m(yn0.J, qo0.f(tn0.e));
                        um0Var.m(yn0.K, qo0.f(tn0.f));
                        um0Var.m(yn0.L, qo0.f(tn0.k));
                        um0Var.m(yn0.M, qo0.f(tn0.l));
                        um0Var.m(yn0.N, qo0.f(tn0.p));
                        um0Var.m(yn0.O, qo0.f(tn0.q));
                        um0Var.m(yn0.P, qo0.f(tn0.u));
                        um0Var.m(yn0.Q, qo0.f(tn0.v));
                        um0Var.m(yn0.R, qo0.f(vn0.b));
                        um0Var.m(yn0.S, qo0.f(vn0.d));
                        um0Var.m(yn0.Z, qo0.f(vn0.e));
                        um0Var.m(yn0.T, qo0.f(vn0.j));
                        um0Var.m(yn0.U, qo0.f(vn0.k));
                        um0Var.m(yn0.V, qo0.f(vn0.n));
                        um0Var.m(yn0.W, qo0.f(vn0.q));
                        um0Var.m(yn0.X, qo0.f(pn0.q));
                        um0Var.m(yn0.Y, qo0.f(vn0.l));
                        um0Var.m(yn0.a0, qo0.f(pn0.l));
                        um0Var.m(yn0.b0, qo0.f(vn0.g));
                        um0Var.m(yn0.c0, qo0.f(vn0.h));
                        um0Var.m(yn0.A, qo0.f(tn0.i));
                        um0Var.m(yn0.d0, qo0.f(vn0.p));
                        um0Var.m(yn0.e0, qo0.f(tn0.m));
                        um0Var.m(yn0.f0, qo0.f(vn0.o));
                        um0Var.m(yn0.g0, qo0.f(tn0.c));
                        um0Var.m(yn0.h0, qo0.f(vn0.c));
                        um0Var.m(yn0.i0, qo0.f(pn0.r));
                        um0Var.m(yn0.j0, qo0.f(vn0.m));
                        um0Var.m(yn0.k0, qo0.f(pn0.e));
                        um0Var.m(yn0.l0, qo0.f(vn0.f));
                        um0Var.m(yn0.m0, qo0.f(tn0.t));
                        um0Var.m(yn0.n0, qo0.f(pn0.c));
                        um0Var.m(yn0.o0, qo0.f(vn0.i));
                        um0Var.m(yn0.p0, qo0.f(tn0.o));
                        um0Var.m(yn0.q0, qo0.f(pn0.m));
                        um0Var.m(yn0.r0, qo0.f(tn0.r));
                        um0Var.m(yn0.s0, qo0.f(tn0.g));
                        vk2 vk2VarS = um0Var.s();
                        long j4 = -1;
                        while (j4 >= -82) {
                            long j5 = j3;
                            yn0 yn0Var = (yn0) map.get(Long.valueOf(j4));
                            if (yn0Var == null) {
                                StringBuilder sb = new StringBuilder(String.valueOf(j4).length() + 36);
                                sb.append(strA);
                                sb.append(j4);
                                throw new na(sb.toString());
                            }
                            ko0Var.a.k((qo0) vk2VarS.get(yn0Var));
                            j4--;
                            j3 = j5;
                        }
                        j = j3;
                        for (int i = 82; i < 1159; i++) {
                            ko0Var.a.k(qo0.a(null));
                        }
                        this.f = true;
                    } catch (ho0 e) {
                        throw new ln0(kn0.g, e);
                    }
                }
                g2 g2Var = ko0Var.c;
                try {
                    g2 g2Var2 = ko0Var.c;
                    g2Var.e(0L);
                    g2Var.i = new ue0(3);
                    String strA2 = wn0.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo");
                    String strA3 = wn0.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=");
                    try {
                        int iK = g2Var2.k();
                        int i2 = ((iK & 65535) << 16) >> 16;
                        int i3 = (((iK >> 16) & 65535) << 16) >> 16;
                        if (i2 != -14426) {
                            throw new in0(strA2.concat(String.format(wn0.a("e1Hk+x0="), Short.valueOf((short) i2))));
                        }
                        if (i3 != 5) {
                            throw new in0(strA3.concat(String.format(wn0.a("e1Hk+x0="), Short.valueOf((short) i3))));
                        }
                        String strA4 = wn0.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1");
                        try {
                            int iK2 = g2Var2.k();
                            if (iK2 != 1182321202) {
                                throw new in0(strA4.concat(String.format(wn0.a("e1Hk9x0="), Integer.valueOf(iK2))));
                            }
                            try {
                                int[] iArr = {g2Var2.k()};
                                int[] iArr2 = hn0.a;
                                zf0 zf0Var = (zf0) g2Var2.j;
                                int i4 = iArr[0];
                                zf0Var.getClass();
                                g2Var2.i = new um0(new e3(i4, 6, iArr2));
                                try {
                                    g2Var2.e(96L);
                                    qk2 qk2Var = nn0.a;
                                    Optional.empty();
                                    Object objOrElseGet = optional.orElseGet(co0.c);
                                    qo0 qo0VarG = objOrElseGet instanceof qo0 ? (qo0) objOrElseGet : qo0.g(objOrElseGet);
                                    e3 e3Var = ko0Var.a;
                                    e3Var.k(qo0VarG);
                                    e3Var.k(qo0.a(null));
                                    zy1 zy1Var = ko0Var.b;
                                    zy1Var.m(0L, 0L, e3Var.g);
                                    while (!((ArrayDeque) zy1Var.g).isEmpty()) {
                                        g2 g2Var3 = ko0Var.c;
                                        long jF = g2Var3.f();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        objOf = ko0Var.a.o(g2Var3.j()).p().apply(ko0Var);
                                                    } catch (Throwable unused) {
                                                        jn0Var = jn0.B;
                                                        objOf = Optional.of(jn0Var);
                                                    }
                                                } catch (mo0 unused2) {
                                                    jn0Var = jn0.i;
                                                }
                                            } catch (go0 unused3) {
                                                jn0Var = jn0.h;
                                            }
                                        } catch (bo0 unused4) {
                                            jn0Var = jn0.A;
                                        }
                                        Optional optional2 = (Optional) objOf;
                                        if (optional2.isPresent()) {
                                            if (!nn0.a.contains(optional2.get())) {
                                                throw new ln0(kn0.m, (jn0) optional2.get(), jF);
                                            }
                                            Object obj = optional2.get();
                                            long jF2 = ko0Var.c.f();
                                            do {
                                                try {
                                                    j2 = ko0Var.b.r().c;
                                                    Optional optionalA = ko0Var.a();
                                                    if (optionalA.isPresent() && optionalA.get() == jn0.C) {
                                                        throw new ln0(kn0.m, (jn0) obj, jF2);
                                                    }
                                                    if (optionalA.isPresent()) {
                                                        throw new ln0(kn0.m, (jn0) optionalA.get(), jF2);
                                                    }
                                                } catch (fo0 unused5) {
                                                    throw new ln0(kn0.m, (jn0) obj, jF2);
                                                }
                                            } while (j2 != j);
                                        }
                                    }
                                    try {
                                        e3 e3Var2 = ko0Var.a;
                                        qo0 qo0VarN = e3Var2.n();
                                        e3Var2.n();
                                        return qo0VarN.h();
                                    } catch (go0 e2) {
                                        throw new ln0(kn0.k, e2);
                                    } catch (mo0 e3) {
                                        throw new ln0(kn0.l, e3);
                                    }
                                } catch (ao0 e4) {
                                    e = e4;
                                    throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
                                } catch (bo0 e5) {
                                    e = e5;
                                    throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
                                }
                            } catch (bo0 e6) {
                                throw new ln0(kn0.j, e6);
                            }
                        } catch (bo0 e7) {
                            throw new in0(wn0.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e7);
                        }
                    } catch (bo0 e8) {
                        throw new in0(wn0.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), e8);
                    }
                } catch (ao0 e9) {
                    e = e9;
                    throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
                } catch (bo0 e10) {
                    e = e10;
                    throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
                }
            } catch (eo0 e11) {
                throw new ln0(kn0.i, e11);
            }
        } catch (ho0 e12) {
            throw new ln0(kn0.h, e12);
        }
    }

    public Object g(long j, Optional optional) throws in0, ln0 {
        jn0 jn0Var;
        Object objOf;
        long j2;
        ko0 ko0Var = (ko0) this.g;
        try {
            if (!this.f) {
                a();
            }
            g2 g2Var = ko0Var.c;
            try {
                g2 g2Var2 = ko0Var.c;
                g2Var.e(0L);
                g2Var.i = new ue0(false);
                try {
                    int iK = g2Var2.k();
                    int i = ((iK & 65535) << 16) >> 16;
                    int i2 = (((iK >> 16) & 65535) << 16) >> 16;
                    if (i != -14426) {
                        throw new in0(wn0.a("Ake3rgkWMjm/WV6IwjgYPC5W5wzEVsBo").concat(String.format(wn0.a("e1Hk+x0="), Short.valueOf((short) i))));
                    }
                    if (i2 != 5) {
                        throw new in0(wn0.a("Ake3rgkWMjm/WV6IwjgYPC5A+hHdWNcn1PY=").concat(String.format(wn0.a("e1Hk+x0="), Short.valueOf((short) i2))));
                    }
                    int i3 = 9;
                    int[] iArr = {171029949, 1356422403, 1913211838, 215266853, 506454572, 1309457854, 56236614, 1696779465, 30245415};
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    int i6 = iArr[2];
                    int i7 = iArr[3];
                    int iE = (iArr[7] % 30245415) ^ ec.e((i5 & (~i4)) | i6, (i4 & i7) | iArr[4], iArr[5], iArr[6]);
                    try {
                        int iK2 = g2Var2.k();
                        if (iK2 != iE) {
                            throw new in0(wn0.a("HkeprgsbOny5AEiU1TIfNmpVqAjMRcch17g1").concat(String.format(wn0.a("e1Hk9x0="), Integer.valueOf(iK2))));
                        }
                        try {
                            int[] iArr2 = {g2Var2.k()};
                            int[] iArr3 = hn0.a;
                            zf0 zf0Var = (zf0) g2Var2.j;
                            int i8 = iArr2[0];
                            zf0Var.getClass();
                            g2Var2.i = new um0(new e3(i8, 6, iArr3));
                            try {
                                g2Var2.e(j);
                                qk2 qk2Var = nn0.a;
                                Optional.empty();
                                Object objOrElseGet = optional.orElseGet(co0.c);
                                qo0 qo0VarG = objOrElseGet instanceof qo0 ? (qo0) objOrElseGet : qo0.g(objOrElseGet);
                                e3 e3Var = ko0Var.a;
                                e3Var.k(qo0VarG);
                                e3Var.k(qo0.a(null));
                                zy1 zy1Var = ko0Var.b;
                                zy1Var.m(0L, 0L, e3Var.g);
                                while (!((ArrayDeque) zy1Var.g).isEmpty()) {
                                    g2 g2Var3 = ko0Var.c;
                                    long jF = g2Var3.f();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    objOf = ko0Var.a.o(g2Var3.j()).p().apply(ko0Var);
                                                } catch (Throwable unused) {
                                                    jn0Var = jn0.B;
                                                    objOf = Optional.of(jn0Var);
                                                }
                                            } catch (mo0 unused2) {
                                                jn0Var = jn0.i;
                                            }
                                        } catch (go0 unused3) {
                                            jn0Var = jn0.h;
                                        }
                                    } catch (bo0 unused4) {
                                        jn0Var = jn0.A;
                                    }
                                    Optional optional2 = (Optional) objOf;
                                    if (optional2.isPresent()) {
                                        if (!nn0.a.contains(optional2.get())) {
                                            throw new ln0(kn0.m, (jn0) optional2.get(), jF);
                                        }
                                        Object obj = optional2.get();
                                        long[] jArr = new long[i3];
                                        // fill-array-data instruction
                                        jArr[0] = 1598171894;
                                        jArr[1] = 600979209;
                                        jArr[2] = 180618323;
                                        jArr[3] = 2704454472L;
                                        jArr[4] = 3601187955L;
                                        jArr[5] = 4055661621L;
                                        jArr[6] = 545343058;
                                        jArr[7] = 1815320763;
                                        jArr[8] = 988992210;
                                        long j3 = jArr[0];
                                        long j4 = jArr[1];
                                        long j5 = jArr[2];
                                        long j6 = jArr[3];
                                        long j7 = jArr[4];
                                        long j8 = jArr[5];
                                        long j9 = jArr[6];
                                        long j10 = jArr[7];
                                        zy1 zy1Var2 = zy1Var;
                                        long j11 = (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + j9;
                                        long j12 = j10 % 988992210;
                                        long jF2 = ko0Var.c.f();
                                        do {
                                            try {
                                                j2 = ko0Var.b.r().c;
                                                Optional optionalA = ko0Var.a();
                                                if (optionalA.isPresent() && optionalA.get() == jn0.C) {
                                                    throw new ln0(kn0.m, (jn0) obj, jF2);
                                                }
                                                if (optionalA.isPresent()) {
                                                    throw new ln0(kn0.m, (jn0) optionalA.get(), jF2);
                                                }
                                            } catch (fo0 unused5) {
                                                throw new ln0(kn0.m, (jn0) obj, jF2);
                                            }
                                        } while (j2 != (j11 ^ j12));
                                        zy1Var = zy1Var2;
                                        i3 = 9;
                                    }
                                }
                                try {
                                    e3 e3Var2 = ko0Var.a;
                                    qo0 qo0VarN = e3Var2.n();
                                    e3Var2.n();
                                    return qo0VarN.h();
                                } catch (go0 e) {
                                    throw new ln0(kn0.k, e);
                                } catch (mo0 e2) {
                                    throw new ln0(kn0.l, e2);
                                }
                            } catch (ao0 e3) {
                                e = e3;
                                throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
                            } catch (bo0 e4) {
                                e = e4;
                                throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
                            }
                        } catch (bo0 e5) {
                            throw new ln0(kn0.j, e5);
                        }
                    } catch (bo0 e6) {
                        throw new in0(wn0.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), (Throwable) e6);
                    }
                } catch (bo0 e7) {
                    throw new in0(wn0.a("BkCyvAwRMTm/WV6IwjgYPC5Y7R/NUsZm"), (Throwable) e7);
                }
            } catch (ao0 e8) {
                e = e8;
                throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
            } catch (bo0 e9) {
                e = e9;
                throw new AssertionError(wn0.a("CEiv6BFfPnitUE+D"), e);
            }
        } catch (eo0 e10) {
            throw new ln0(kn0.i, e10);
        } catch (ho0 e11) {
            throw new ln0(kn0.h, e11);
        }
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        jn.M("Failed to get signals bundle");
    }

    public /* synthetic */ mn0(Object obj, boolean z) {
        this.f = z;
        this.g = obj;
    }
}
