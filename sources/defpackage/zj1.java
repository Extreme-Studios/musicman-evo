package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class zj1 extends jt0 implements lu1 {
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final long k;
    public final String l;
    public final yw1 m;
    public final Bundle n;
    public final double o;

    /* JADX WARN: Code duplicated, block: B:32:0x0090  */
    public zj1(x42 x42Var, String str, yw1 yw1Var, z42 z42Var, String str2) {
        String str3;
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
        String string = null;
        this.g = x42Var == null ? null : x42Var.b0;
        this.h = str2;
        this.i = z42Var == null ? null : z42Var.b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && x42Var != null) {
            try {
                string = x42Var.v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f = string != null ? string : str;
        this.j = yw1Var.a;
        this.m = yw1Var;
        this.o = x42Var == null ? 0.0d : x42Var.z0;
        vc3.C.k.getClass();
        this.k = System.currentTimeMillis() / 1000;
        ix0 ix0Var = lx0.f7;
        tu0 tu0Var = tu0.e;
        if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue() || z42Var == null) {
            this.n = new Bundle();
        } else {
            this.n = z42Var.k;
        }
        if (((Boolean) tu0Var.c.a(lx0.Z9)).booleanValue() && z42Var != null) {
            str3 = z42Var.i;
            str3 = TextUtils.isEmpty(str3) ? "" : str3;
        }
        this.l = str3;
    }

    public static lu1 B3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof lu1 ? (lu1) iInterfaceQueryLocalInterface : new ft1(iBinder);
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(this.f);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString(this.g);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(this.j);
                return true;
            case 4:
                ee3 ee3VarF = f();
                parcel2.writeNoException();
                kt0.d(parcel2, ee3VarF);
                return true;
            case 5:
                parcel2.writeNoException();
                kt0.d(parcel2, this.n);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString(this.h);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.lu1
    public final String b() {
        return this.f;
    }

    @Override // defpackage.lu1
    public final String d() {
        return this.g;
    }

    @Override // defpackage.lu1
    public final List e() {
        return this.j;
    }

    @Override // defpackage.lu1
    public final ee3 f() {
        yw1 yw1Var = this.m;
        if (yw1Var != null) {
            return yw1Var.f;
        }
        return null;
    }

    @Override // defpackage.lu1
    public final String g() {
        return this.h;
    }

    @Override // defpackage.lu1
    public final Bundle j() {
        return this.n;
    }
}
