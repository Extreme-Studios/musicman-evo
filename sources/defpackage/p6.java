package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class p6 extends o6 {
    @Override // defpackage.o6, defpackage.q6
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.q6
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
