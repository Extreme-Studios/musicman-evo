package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class mm0 implements Comparable {
    public final sm0 f;
    public final int g;
    public final String h;
    public final int i;
    public final Object j;
    public final om0 k;
    public Integer l;
    public nm0 m;
    public boolean n;
    public dm0 o;
    public y91 p;
    public final pt q;

    public mm0(int i, String str, om0 om0Var) {
        Uri uri;
        String host;
        this.f = sm0.c ? new sm0() : null;
        this.j = new Object();
        int iHashCode = 0;
        this.n = false;
        this.o = null;
        this.g = i;
        this.h = str;
        this.k = om0Var;
        pt ptVar = new pt();
        ptVar.a = 2500;
        this.q = ptVar;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.i = iHashCode;
    }

    public final void a(String str) {
        if (sm0.c) {
            this.f.a(str, Thread.currentThread().getId());
        }
    }

    public final void b(String str) {
        nm0 nm0Var = this.m;
        if (nm0Var != null) {
            HashSet hashSet = (HashSet) nm0Var.b;
            synchronized (hashSet) {
                hashSet.remove(this);
            }
            ArrayList arrayList = (ArrayList) nm0Var.i;
            synchronized (arrayList) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            nm0Var.c();
        }
        if (sm0.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new oc0(this, str, id));
                return;
            }
            sm0 sm0Var = this.f;
            sm0Var.a(str, id);
            sm0Var.b(toString());
        }
    }

    public final void c() {
        nm0 nm0Var = this.m;
        if (nm0Var != null) {
            nm0Var.c();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.l.intValue() - ((mm0) obj).l.intValue();
    }

    public final String d() {
        int i = this.g;
        String str = this.h;
        if (i == 0) {
            return str;
        }
        String string = Integer.toString(1);
        return ec.n(new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length()), string, "-", str);
    }

    public Map e() {
        return Collections.EMPTY_MAP;
    }

    public byte[] f() {
        return null;
    }

    public final boolean g() {
        boolean z;
        synchronized (this.j) {
            z = this.n;
        }
        return z;
    }

    public abstract md h(km0 km0Var);

    public abstract void i(Object obj);

    public final void j(md mdVar) {
        y91 y91Var;
        List list;
        synchronized (this.j) {
            y91Var = this.p;
        }
        if (y91Var != null) {
            dm0 dm0Var = (dm0) mdVar.h;
            if (dm0Var != null) {
                if (dm0Var.e >= System.currentTimeMillis()) {
                    String strD = d();
                    synchronized (y91Var) {
                        list = (List) ((HashMap) y91Var.g).remove(strD);
                    }
                    if (list != null) {
                        if (tm0.a) {
                            tm0.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strD);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((s70) y91Var.j).N((mm0) it.next(), mdVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            y91Var.y(this);
        }
    }

    public final void k() {
        y91 y91Var;
        synchronized (this.j) {
            y91Var = this.p;
        }
        if (y91Var != null) {
            y91Var.y(this);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.i));
        synchronized (this.j) {
        }
        Integer num = this.l;
        String str = this.h;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb = new StringBuilder(strConcat.length() + length + 5 + 8 + length2);
        ec.x(sb, "[ ] ", str, " ", strConcat);
        sb.append(" NORMAL ");
        sb.append(num);
        return sb.toString();
    }
}
