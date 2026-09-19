package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class bn extends InputConnectionWrapper {
    public final /* synthetic */ an a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(InputConnection inputConnection, an anVar) {
        super(inputConnection, false);
        this.a = anVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        zy1 zy1Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            zy1Var = new zy1(5, new dn(inputContentInfo));
        }
        if (this.a.a(zy1Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
