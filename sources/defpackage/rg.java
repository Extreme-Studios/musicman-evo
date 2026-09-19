package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class rg implements he {
    public final /* synthetic */ oo f;

    public rg(EmojiCompatInitializer emojiCompatInitializer, oo ooVar) {
        this.f = ooVar;
    }

    @Override // defpackage.he
    public final void e(mo moVar) {
        (Build.VERSION.SDK_INT >= 28 ? ab.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new t8(1), 500L);
        this.f.f(this);
    }
}
