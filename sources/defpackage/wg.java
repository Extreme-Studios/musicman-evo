package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class wg extends InputConnectionWrapper {
    public final TextView a;
    public final gm b;

    public wg(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        gm gmVar = new gm();
        super(inputConnection, false);
        this.a = textView;
        this.b = gmVar;
        if (qg.k != null) {
            qg qgVarA = qg.a();
            if (qgVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            mg mgVar = qgVarA.e;
            mgVar.getClass();
            Bundle bundle = editorInfo.extras;
            ms msVar = (ms) mgVar.c.g;
            int iA = msVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) msVar.d).getInt(iA + msVar.a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return gm.b(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return gm.b(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
