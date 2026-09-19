package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class fh implements TextWatcher {
    public final EditText f;
    public eh g;
    public boolean h = true;

    public fh(EditText editText) {
        this.f = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            qg qgVarA = qg.a();
            if (editableText == null) {
                length = 0;
            } else {
                qgVarA.getClass();
                length = editableText.length();
            }
            qgVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.f;
        if (editText.isInEditMode() || !this.h || qg.k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = qg.a().b();
        if (iB != 0) {
            if (iB == 1) {
                qg.a().e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        qg qgVarA = qg.a();
        if (this.g == null) {
            this.g = new eh(editText);
        }
        qgVarA.f(this.g);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
