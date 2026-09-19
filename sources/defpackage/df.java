package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public class df extends kj implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final af W;
    public final bf X;
    public int Y;
    public int Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public boolean d0;
    public final zx e0;
    public Dialog f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;

    public df() {
        new q7(3, this);
        this.W = new af(0, this);
        this.X = new bf(this);
        this.Y = 0;
        this.Z = 0;
        this.a0 = true;
        this.b0 = true;
        this.c0 = -1;
        this.e0 = new zx(4, this);
        this.j0 = false;
    }

    public Dialog A() {
        if (xj.E(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new ya(y(), this.Z);
    }

    @Override // defpackage.kj
    public final i8 a() {
        return new cf(this, new cf(this));
    }

    @Override // defpackage.kj
    public final void n() {
        this.H = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.g0) {
            return;
        }
        if (xj.E(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.h0) {
            return;
        }
        this.h0 = true;
        this.i0 = false;
        Dialog dialog = this.f0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f0.dismiss();
        }
        this.g0 = true;
        if (this.c0 >= 0) {
            xj xjVarI = i();
            int i = this.c0;
            if (i < 0) {
                j7.p(ec.h("Bad id: ", i));
                return;
            } else {
                xjVarI.v(new wj(xjVarI, i), true);
                this.c0 = -1;
                return;
            }
        }
        s7 s7Var = new s7(i());
        s7Var.o = true;
        xj xjVar = this.w;
        if (xjVar == null || xjVar == s7Var.p) {
            s7Var.b(new ik(3, this));
            s7Var.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // defpackage.kj
    public final void p(Context context) {
        Object obj;
        super.p(context);
        bt btVar = this.R;
        btVar.getClass();
        bt.a("observeForever");
        zx zxVar = this.e0;
        mp mpVar = new mp(btVar, zxVar);
        py pyVar = btVar.b;
        my myVarA = pyVar.a(zxVar);
        if (myVarA != null) {
            obj = myVarA.g;
        } else {
            my myVar = new my(zxVar, mpVar);
            pyVar.i++;
            my myVar2 = pyVar.g;
            if (myVar2 == null) {
                pyVar.f = myVar;
                pyVar.g = myVar;
            } else {
                myVar2.h = myVar;
                myVar.i = myVar2;
                pyVar.g = myVar;
            }
            obj = null;
        }
        if (((mp) obj) == null) {
            mpVar.a(true);
        }
        if (this.i0) {
            return;
        }
        this.h0 = false;
    }

    @Override // defpackage.kj
    public final void q(Bundle bundle) {
        Parcelable parcelable;
        this.H = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.y.P(parcelable);
            xj xjVar = this.y;
            xjVar.E = false;
            xjVar.F = false;
            xjVar.L.g = false;
            xjVar.t(1);
        }
        xj xjVar2 = this.y;
        if (xjVar2.s < 1) {
            xjVar2.E = false;
            xjVar2.F = false;
            xjVar2.L.g = false;
            xjVar2.t(1);
        }
        new Handler();
        this.b0 = this.B == 0;
        if (bundle != null) {
            this.Y = bundle.getInt("android:style", 0);
            this.Z = bundle.getInt("android:theme", 0);
            this.a0 = bundle.getBoolean("android:cancelable", true);
            this.b0 = bundle.getBoolean("android:showsDialog", this.b0);
            this.c0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.kj
    public final void r() {
        this.H = true;
        Dialog dialog = this.f0;
        if (dialog != null) {
            this.g0 = true;
            dialog.setOnDismissListener(null);
            this.f0.dismiss();
            if (!this.h0) {
                onDismiss(this.f0);
            }
            this.f0 = null;
            this.j0 = false;
        }
    }

    @Override // defpackage.kj
    public final void s() {
        this.H = true;
        if (!this.i0 && !this.h0) {
            this.h0 = true;
        }
        bt btVar = this.R;
        btVar.getClass();
        bt.a("removeObserver");
        mp mpVar = (mp) btVar.b.b(this.e0);
        if (mpVar == null) {
            return;
        }
        mpVar.a(false);
    }

    @Override // defpackage.kj
    public final LayoutInflater t(Bundle bundle) {
        LayoutInflater layoutInflaterT = super.t(bundle);
        boolean z = this.b0;
        if (z && !this.d0) {
            if (z && !this.j0) {
                try {
                    this.d0 = true;
                    Dialog dialogA = A();
                    this.f0 = dialogA;
                    c4 c4Var = null;
                    if (this.b0) {
                        int i = this.Y;
                        if (i == 1 || i == 2) {
                            dialogA.requestWindowFeature(1);
                        } else if (i == 3) {
                            Window window = dialogA.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogA.requestWindowFeature(1);
                        }
                        mj mjVar = this.x;
                        if (mjVar != null) {
                            c4Var = mjVar.D;
                        }
                        if (c4Var != null) {
                            this.f0.setOwnerActivity(c4Var);
                        }
                        this.f0.setCancelable(this.a0);
                        this.f0.setOnCancelListener(this.W);
                        this.f0.setOnDismissListener(this.X);
                        this.j0 = true;
                    } else {
                        this.f0 = null;
                    }
                    this.d0 = false;
                } catch (Throwable th) {
                    this.d0 = false;
                    throw th;
                }
            }
            if (xj.E(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f0;
            if (dialog != null) {
                return layoutInflaterT.cloneInContext(dialog.getContext());
            }
        } else if (xj.E(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.b0) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterT;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterT;
    }

    @Override // defpackage.kj
    public final void u(Bundle bundle) {
        Dialog dialog = this.f0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.Y;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.Z;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.a0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.b0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.c0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.kj
    public final void v() {
        this.H = true;
        Dialog dialog = this.f0;
        if (dialog != null) {
            this.g0 = false;
            dialog.show();
            View decorView = this.f0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.kj
    public final void w() {
        this.H = true;
        Dialog dialog = this.f0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.kj
    public final void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.x(layoutInflater, viewGroup, bundle);
        if (this.f0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f0.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
