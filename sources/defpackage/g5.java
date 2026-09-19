package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public final class g5 extends EditText implements av {
    public final ts2 f;
    public final i6 g;
    public final us2 h;
    public final s30 i;
    public final vg2 j;
    public f5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        x30.a(context);
        t30.a(getContext(), this);
        ts2 ts2Var = new ts2(this);
        this.f = ts2Var;
        ts2Var.d(attributeSet, R.attr.editTextStyle);
        i6 i6Var = new i6(this);
        this.g = i6Var;
        i6Var.f(attributeSet, R.attr.editTextStyle);
        i6Var.b();
        us2 us2Var = new us2(2, false);
        us2Var.g = this;
        this.h = us2Var;
        this.i = new s30();
        vg2 vg2Var = new vg2(this, 2);
        this.j = vg2Var;
        vg2Var.j(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerI = vg2Var.i(keyListener);
        if (keyListenerI == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerI);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private f5 getSuperCaller() {
        if (this.k == null) {
            this.k = new f5(this);
        }
        return this.k;
    }

    @Override // defpackage.av
    public final sb a(sb sbVar) {
        this.i.getClass();
        return s30.a(this, sbVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.a();
        }
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return yd.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            return ts2Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            return ts2Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        us2 us2Var;
        if (Build.VERSION.SDK_INT >= 28 || (us2Var = this.h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) us2Var.h;
        return textClassifier == null ? c6.a((TextView) us2Var.g) : textClassifier;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[PHI: r1
  0x0056: PHI (r1v9 java.lang.String[]) = (r1v4 java.lang.String[]), (r1v10 java.lang.String[]) binds: [B:30:0x0069, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        String[] strArrE;
        String[] stringArray;
        InputConnection cnVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        i6.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        hn.o(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && (i = Build.VERSION.SDK_INT) <= 30 && (strArrE = w60.e(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = strArrE;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrE);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrE);
            }
            an anVar = new an(this);
            if (i >= 25) {
                cnVar = new bn(inputConnectionOnCreateInputConnection, anVar);
            } else {
                String[] strArr = v51.g;
                if (i >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    cnVar = new cn(inputConnectionOnCreateInputConnection, anVar);
                }
            }
            inputConnectionOnCreateInputConnection = cnVar;
        }
        return this.j.k(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && w60.e(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = o5.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        qb qbVar;
        pb pbVar;
        int i2;
        zy1 zy1Var;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || w60.e(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                zy1Var = new zy1(primaryClip, 1);
            } else {
                qbVar = new qb();
                qbVar.g = primaryClip;
                qbVar.h = 1;
            }
            if (i == 16908322) {
                pbVar = qbVar;
                pbVar = zy1Var;
                i2 = 0;
            } else {
                pbVar = qbVar;
                pbVar = zy1Var;
                i2 = 1;
            }
            pbVar.j(i2);
            w60.g(this, pbVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(yd.r(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.j.l(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.j.i(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ts2 ts2Var = this.f;
        if (ts2Var != null) {
            ts2Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        i6 i6Var = this.g;
        i6Var.l(colorStateList);
        i6Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        i6 i6Var = this.g;
        i6Var.m(mode);
        i6Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        i6 i6Var = this.g;
        if (i6Var != null) {
            i6Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        us2 us2Var;
        if (Build.VERSION.SDK_INT >= 28 || (us2Var = this.h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            us2Var.h = textClassifier;
        }
    }
}
