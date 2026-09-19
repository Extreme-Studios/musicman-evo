package defpackage;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class eh extends ng {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public eh(EditText editText) {
        this.b = new WeakReference(editText);
    }

    @Override // defpackage.ng
    public void a() {
        switch (this.a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // defpackage.ng
    public final void b() {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                fh.a((EditText) weakReference.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) weakReference.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    public eh(SwitchCompat switchCompat) {
        this.b = new WeakReference(switchCompat);
    }
}
