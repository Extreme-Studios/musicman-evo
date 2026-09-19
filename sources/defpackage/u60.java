package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class u60 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static sb b(View view, sb sbVar) {
        ContentInfo contentInfoF = sbVar.a.f();
        Objects.requireNonNull(contentInfoF);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoF ? sbVar : new sb(new kc2(contentInfoPerformReceiveContent));
    }
}
