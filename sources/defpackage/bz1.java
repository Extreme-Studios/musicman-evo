package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bz1 implements h42, hn2, zz2, w23, ii2, hp1 {
    public final Object f;

    public bz1(hm1 hm1Var, y91 y91Var, Context context, View view, Activity activity, String str, HashMap map, hp0 hp0Var, dd2 dd2Var) {
        s63 s63VarA = s63.a(dd2Var);
        s63 s63VarB = s63.b(str);
        s63 s63VarA2 = s63.a(hp0Var);
        q63 q63Var = (q63) y91Var.h;
        s63 s63Var = (s63) hm1Var.b;
        q63 q63Var2 = (q63) hm1Var.i;
        kf2 kf2Var = new kf2(0, q63Var, q63Var2, s63VarA2, s63Var);
        j42 j42Var = new j42(s63VarA2, q63Var, q63Var2, 2);
        s63 s63VarA3 = s63.a(map);
        q63 q63Var3 = (q63) y91Var.h;
        q63 q63Var4 = (q63) hm1Var.i;
        hf2 hf2Var = new hf2(s63VarA2, q63Var3, s63VarA3, q63Var4);
        kf2 kf2Var2 = new kf2(1, q63Var3, q63Var4, s63VarA2, (s63) hm1Var.f);
        ff2 ff2Var = new ff2(s63VarA2, q63Var3, s63VarA, s63VarA3, q63Var4, 1);
        j42 j42Var2 = new j42(s63VarA2, q63Var3, q63Var4, 3);
        s63 s63VarA4 = s63.a(context);
        q63 q63Var5 = (q63) y91Var.h;
        q63 q63Var6 = (q63) hm1Var.i;
        yn1 yn1Var = new yn1(s63VarA2, q63Var5, s63VarA, s63VarA4, s63VarA3, q63Var6);
        s63 s63Var2 = (s63) hm1Var.b;
        s63 s63Var3 = (s63) hm1Var.f;
        jj1 jj1Var = new jj1(s63VarA2, q63Var5, s63VarA3, s63Var2, s63VarA, s63Var3, q63Var6);
        kf2 kf2Var3 = new kf2(2, q63Var5, q63Var6, s63VarA2, s63Var2);
        u91 u91Var = new u91(s63VarA2, q63Var5, s63VarA3, s63Var2, q63Var6, 23);
        hf2 hf2Var2 = new hf2(s63VarA2, s63VarA3, s63Var3, q63Var6);
        int i = w63.c;
        ArrayList arrayList = new ArrayList(11);
        List list = Collections.EMPTY_LIST;
        arrayList.add(kf2Var);
        arrayList.add(j42Var);
        arrayList.add(hf2Var);
        arrayList.add(kf2Var2);
        arrayList.add(ff2Var);
        arrayList.add(j42Var2);
        arrayList.add(yn1Var);
        arrayList.add(jj1Var);
        arrayList.add(kf2Var3);
        arrayList.add(u91Var);
        arrayList.add(hf2Var2);
        w63 w63Var = new w63(arrayList, list);
        s63 s63VarB2 = s63.b(view);
        s63 s63VarB3 = s63.b(activity);
        q63 q63Var7 = (q63) y91Var.h;
        q63 q63Var8 = (q63) hm1Var.i;
        ff2 ff2Var2 = new ff2(s63VarA2, q63Var7, s63VarB2, s63VarB3, q63Var8, 0);
        q63 q63VarA = q63.a(new rs1(s63VarA4, 7));
        qf2 qf2Var = new qf2(s63VarA2, q63Var7, q63VarA, s63VarB2, q63Var8);
        ArrayList arrayList2 = new ArrayList(11);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(kf2Var);
        arrayList2.add(j42Var);
        arrayList2.add(kf2Var2);
        arrayList2.add(ff2Var2);
        arrayList2.add(qf2Var);
        arrayList2.add(ff2Var);
        arrayList2.add(j42Var2);
        arrayList2.add(yn1Var);
        arrayList2.add(jj1Var);
        arrayList2.add(kf2Var3);
        arrayList2.add(u91Var);
        w63 w63Var2 = new w63(arrayList2, list2);
        qf2 qf2Var2 = new qf2(s63VarA2, (q63) y91Var.h, s63VarA3, q63VarA, (q63) hm1Var.i);
        ArrayList arrayList3 = new ArrayList(12);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(kf2Var);
        arrayList3.add(j42Var);
        arrayList3.add(kf2Var2);
        arrayList3.add(ff2Var2);
        arrayList3.add(qf2Var);
        arrayList3.add(ff2Var);
        arrayList3.add(j42Var2);
        arrayList3.add(yn1Var);
        arrayList3.add(jj1Var);
        arrayList3.add(kf2Var3);
        arrayList3.add(u91Var);
        arrayList3.add(qf2Var2);
        this.f = q63.a(new th1((q63) hm1Var.j, (q63) hm1Var.l, (q63) y91Var.h, s63VarA, s63VarB, s63VarA2, w63Var, w63Var2, new w63(arrayList3, list3), (q63) hm1Var.i));
    }

    public static bz1 c(vh2 vh2Var) {
        return new bz1(new j52(vh2Var));
    }

    @Override // defpackage.ii2
    public /* synthetic */ Object a() {
        return (zf3) this.f;
    }

    @Override // defpackage.hp1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo6b(Object obj) {
        i61 i61Var = (i61) this.f;
        ((r93) obj).k(i61Var);
        int i = i61Var.a;
    }

    public void d(int i, long j, q82 q82Var, String str) {
        us2 us2VarA = ((es1) this.f).a();
        us2VarA.s("action", "start_preload");
        us2VarA.s("sp_ts", Long.toString(j));
        us2VarA.s("ad_format", q82Var.a());
        us2VarA.s("ad_unit_id", q82Var.a);
        us2VarA.s("pid", q82Var.c);
        us2VarA.s("max_ads", Integer.toString(i));
        us2VarA.s("pv", str);
        us2VarA.t();
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        ((ch2) this.f).c();
    }

    @Override // defpackage.w23
    public boolean f(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((w23[]) this.f)[i].f(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h42
    public /* synthetic */ mf1 g(g42 g42Var) {
        return ((s42) this.f).b(g42Var);
    }

    @Override // defpackage.w23
    public f33 h(Class cls) {
        for (int i = 0; i < 2; i++) {
            w23 w23Var = ((w23[]) this.f)[i];
            if (w23Var.f(cls)) {
                return w23Var.h(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public void i(Exception exc) {
        s90.b0("MediaCodecAudioRenderer", "Audio sink error", exc);
        un1 un1Var = ((rb3) this.f).E0;
        Handler handler = (Handler) un1Var.g;
        if (handler != null) {
            handler.post(new ra3(un1Var, exc, 5));
        }
    }

    public void j(EnumMap enumMap, long j) {
        us2 us2VarA = ((es1) this.f).a();
        us2VarA.s("action", "start_preload");
        us2VarA.s("sp_ts", Long.toString(j));
        us2VarA.s("pv", "1");
        for (h2 h2Var : enumMap.keySet()) {
            String strValueOf = String.valueOf(h2Var.name().toLowerCase(Locale.ENGLISH));
            us2VarA.s(strValueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(h2Var)).intValue()));
        }
        us2VarA.t();
    }

    public void k(int i, int i2, long j, Long l, String str, q82 q82Var, String str2) {
        us2 us2VarA = ((es1) this.f).a();
        us2VarA.s("plaac_ts", Long.toString(j));
        us2VarA.s("max_ads", Integer.toString(i));
        us2VarA.s("cache_size", Integer.toString(i2));
        us2VarA.s("action", "is_ad_available");
        if (q82Var != null) {
            us2VarA.s("ad_unit_id", q82Var.a);
            us2VarA.s("pid", q82Var.c);
            us2VarA.s("ad_format", q82Var.a());
        }
        if (l != null) {
            us2VarA.s("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            us2VarA.s("gqi", str);
        }
        us2VarA.s("pv", str2);
        us2VarA.t();
    }

    @Override // defpackage.zz2
    public Object l(String str) {
        c03 c03Var = (c03) this.f;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            Provider provider = Security.getProvider(strArr[i2]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return c03Var.a(str, (Provider) obj);
            } catch (Exception unused) {
            }
        }
        return c03Var.a(str, null);
    }

    public List m(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itF = ((hi2) this.f).f(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            gi2 gi2Var = (gi2) itF;
            if (!gi2Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) gi2Var.next());
        }
    }

    public void n(long j, int i, int i2, String str, q82 q82Var, String str2) {
        us2 us2VarA = ((es1) this.f).a();
        us2VarA.s("ppla_ts", Long.toString(j));
        us2VarA.s("ad_format", q82Var.a());
        us2VarA.s("ad_unit_id", q82Var.a);
        us2VarA.s("pid", q82Var.c);
        us2VarA.s("max_ads", Integer.toString(i));
        us2VarA.s("cache_size", Integer.toString(i2));
        us2VarA.s("action", "poll_ad");
        if (str != null) {
            us2VarA.s("gqi", str);
        }
        us2VarA.s("pv", str2);
        us2VarA.t();
    }

    public void o(long j, q82 q82Var, fu1 fu1Var, int i, int i2, String str) {
        us2 us2VarA = ((es1) this.f).a();
        us2VarA.s("action", "pftla");
        us2VarA.s("pftlat_ts", Long.toString(j));
        us2VarA.s("pftlaec", Integer.toString(fu1Var.f));
        us2VarA.s("ad_format", q82Var.a());
        us2VarA.s("max_ads", Integer.toString(i));
        us2VarA.s("cache_size", Integer.toString(i2));
        us2VarA.s("ad_unit_id", q82Var.a);
        us2VarA.s("pid", q82Var.c);
        us2VarA.s("pv", str);
        us2VarA.t();
    }

    public void p(String str, long j, String str2, String str3, h2 h2Var, int i, int i2, int i3) {
        us2 us2VarA = ((es1) this.f).a();
        us2VarA.s("action", str);
        us2VarA.s("pat", Long.toString(j));
        us2VarA.s("ad_format", h2Var.name().toLowerCase(Locale.ENGLISH));
        us2VarA.s("max_ads", Integer.toString(i));
        us2VarA.s("cache_size", Integer.toString(i2));
        us2VarA.s("pas", Integer.toString(i3));
        us2VarA.s("pv", "2");
        us2VarA.s("ad_unit_id", str3);
        us2VarA.s("pid", str2);
        us2VarA.t();
    }

    public void q(String str, String str2, long j, int i, int i2, String str3, q82 q82Var, String str4) {
        us2 us2VarA = ((es1) this.f).a();
        us2VarA.s(str2, Long.toString(j));
        if (q82Var != null) {
            us2VarA.s("ad_unit_id", q82Var.a);
            us2VarA.s("ad_format", q82Var.a());
            us2VarA.s("pid", q82Var.c);
        }
        us2VarA.s("action", str);
        if (str3 != null) {
            us2VarA.s("gqi", str3);
        }
        if (i >= 0) {
            us2VarA.s("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            us2VarA.s("cache_size", Integer.toString(i2));
        }
        us2VarA.s("pv", str4);
        us2VarA.t();
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        ch2 ch2Var = (ch2) this.f;
        ch2Var.b(th);
        ch2Var.c();
    }

    public /* synthetic */ bz1(q93 q93Var, i61 i61Var) {
        this.f = i61Var;
    }

    public bz1() {
        this.f = bk2.m(new Object[]{1, 5}, 2);
    }

    public /* synthetic */ bz1(Object obj) {
        this.f = obj;
    }

    public bz1(dh2 dh2Var, ch2 ch2Var) {
        this.f = ch2Var;
        Objects.requireNonNull(dh2Var);
    }
}
