package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class la0 extends x90 implements bm, cm {
    public static final t90 n = ma0.a;
    public final Context g;
    public final Handler h;
    public final t90 i;
    public final Set j;
    public final es0 k;
    public n00 l;
    public ba0 m;

    public la0(Context context, za0 za0Var, es0 es0Var) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.g = context;
        this.h = za0Var;
        this.k = es0Var;
        this.j = (Set) es0Var.f;
        this.i = n;
    }

    @Override // defpackage.bm
    public final void T(int i) {
        this.l.o();
    }

    @Override // defpackage.cm
    public final void U(db dbVar) {
        this.m.a(dbVar);
    }

    @Override // defpackage.bm
    public final void Y() {
        GoogleSignInAccount googleSignInAccountA;
        n00 n00Var = this.l;
        n00Var.getClass();
        int i = 12;
        boolean z = false;
        try {
            n00Var.A.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = n00Var.c;
                ReentrantLock reentrantLock = d20.c;
                dq.f(context);
                ReentrantLock reentrantLock2 = d20.c;
                reentrantLock2.lock();
                try {
                    if (d20.d == null) {
                        d20.d = new d20(context.getApplicationContext());
                    }
                    d20 d20Var = d20.d;
                    reentrantLock2.unlock();
                    String strA = d20Var.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(strA).length());
                        sb.append("googleSignInAccount:");
                        sb.append(strA);
                        String strA2 = d20Var.a(sb.toString());
                        if (strA2 != null) {
                            try {
                                googleSignInAccountA = GoogleSignInAccount.a(strA2);
                            } catch (JSONException unused) {
                                googleSignInAccountA = null;
                            }
                        }
                    }
                    googleSignInAccountA = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountA = null;
            }
            Integer num = n00Var.C;
            dq.f(num);
            ab0 ab0Var = new ab0(2, account, num.intValue(), googleSignInAccountA);
            oa0 oa0Var = (oa0) n00Var.t();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(oa0Var.h);
            int i2 = ga0.a;
            parcelObtain.writeInt(1);
            int iW = s90.w(parcelObtain, 20293);
            s90.P(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            s90.p(parcelObtain, 2, ab0Var, 0);
            s90.J(parcelObtain, iW);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                oa0Var.g.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.h.post(new in2(this, new va0(1, new db(8, null), null), i, z));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
