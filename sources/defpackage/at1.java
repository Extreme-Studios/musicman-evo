package defpackage;

import android.os.Parcel;
import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class at1 extends jt0 implements w21 {
    public final /* synthetic */ Object f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ a72 i;
    public final /* synthetic */ cb1 j;
    public final /* synthetic */ dt1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at1(long j, Object obj, String str, cb1 cb1Var, dt1 dt1Var, a72 a72Var) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f = obj;
        this.g = str;
        this.h = j;
        this.i = a72Var;
        this.j = cb1Var;
        Objects.requireNonNull(dt1Var);
        this.k = dt1Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            b();
        } else {
            if (i != 3) {
                return false;
            }
            String string = parcel.readString();
            kt0.f(parcel);
            B3(string);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void B3(String str) {
        synchronized (this.f) {
            dt1 dt1Var = this.k;
            String str2 = this.g;
            vc3.C.k.getClass();
            dt1Var.d(str2, (int) (SystemClock.elapsedRealtime() - this.h), str, false);
            dt1Var.l.c(str2, "error");
            dt1Var.o.s(str2, "error");
            e72 e72Var = dt1Var.p;
            a72 a72Var = this.i;
            a72Var.k(str);
            a72Var.b(false);
            e72Var.b(a72Var.m());
            this.j.b(Boolean.FALSE);
        }
    }

    public final void b() {
        synchronized (this.f) {
            dt1 dt1Var = this.k;
            String str = this.g;
            vc3.C.k.getClass();
            dt1Var.d(str, (int) (SystemClock.elapsedRealtime() - this.h), "", true);
            dt1Var.l.b(str);
            dt1Var.o.w(str);
            e72 e72Var = dt1Var.p;
            a72 a72Var = this.i;
            a72Var.b(true);
            e72Var.b(a72Var.m());
            this.j.b(Boolean.TRUE);
        }
    }
}
