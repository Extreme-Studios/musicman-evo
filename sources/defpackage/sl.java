package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class sl extends f0 {
    public static final Parcelable.Creator<sl> CREATOR = new b42(14);
    public static final Scope[] t = new Scope[0];
    public static final ei[] u = new ei[0];
    public final int f;
    public final int g;
    public final int h;
    public String i;
    public IBinder j;
    public Scope[] k;
    public Bundle l;
    public Account m;
    public ei[] n;
    public ei[] o;
    public final boolean p;
    public final int q;
    public boolean r;
    public final String s;

    public sl(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, ei[] eiVarArr, ei[] eiVarArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? t : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        ei[] eiVarArr3 = u;
        ei[] eiVarArr4 = eiVarArr == null ? eiVarArr3 : eiVarArr;
        eiVarArr3 = eiVarArr2 != null ? eiVarArr2 : eiVarArr3;
        this.f = i;
        this.g = i2;
        this.h = i3;
        if ("com.google.android.gms".equals(str)) {
            this.i = "com.google.android.gms";
        } else {
            this.i = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = d1.g;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                lm ue3Var = iInterfaceQueryLocalInterface instanceof lm ? (lm) iInterfaceQueryLocalInterface : new ue3(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        ue3 ue3Var2 = (ue3) ue3Var;
                        Parcel parcelT = ue3Var2.T(ue3Var2.U(), 2);
                        Account account3 = (Account) o91.a(parcelT, Account.CREATOR);
                        parcelT.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.j = iBinder;
            account2 = account;
        }
        this.m = account2;
        this.k = scopeArr2;
        this.l = bundle2;
        this.n = eiVarArr4;
        this.o = eiVarArr3;
        this.p = z;
        this.q = i4;
        this.r = z2;
        this.s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b42.a(this, parcel, i);
    }
}
