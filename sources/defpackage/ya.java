package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public class ya extends Dialog implements mo, bz {
    public oo f;
    public final un1 g;
    public final uu h;

    public ya(Context context, int i) {
        super(context, i);
        this.g = new un1(new az(this, new oa(2, this)));
        this.h = new uu(new x1(4, this));
    }

    public static void a(ya yaVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.bz
    public final z61 b() {
        return (z61) this.g.h;
    }

    public final void c() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.mo
    public final oo e() {
        oo ooVar = this.f;
        if (ooVar != null) {
            return ooVar;
        }
        oo ooVar2 = new oo(this);
        this.f = ooVar2;
        return ooVar2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.h.a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            uu uuVar = this.h;
            uuVar.getClass();
            uuVar.e = onBackInvokedDispatcher;
            uuVar.b(uuVar.g);
        }
        this.g.k(bundle);
        oo ooVar = this.f;
        if (ooVar == null) {
            ooVar = new oo(this);
            this.f = ooVar;
        }
        ooVar.d(eo.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.g.m(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        oo ooVar = this.f;
        if (ooVar == null) {
            ooVar = new oo(this);
            this.f = ooVar;
        }
        ooVar.d(eo.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        oo ooVar = this.f;
        if (ooVar == null) {
            ooVar = new oo(this);
            this.f = ooVar;
        }
        ooVar.d(eo.ON_DESTROY);
        this.f = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.setContentView(view, layoutParams);
    }
}
