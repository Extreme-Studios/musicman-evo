package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class ch extends ss0 {
    public final TextView q;
    public final yg r;
    public boolean s = true;

    public ch(TextView textView) {
        this.q = textView;
        this.r = new yg(textView);
    }

    @Override // defpackage.ss0
    public final InputFilter[] j(InputFilter[] inputFilterArr) {
        if (!this.s) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof yg) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            yg ygVar = this.r;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = ygVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == ygVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.ss0
    public final boolean q() {
        return this.s;
    }

    @Override // defpackage.ss0
    public final void u(boolean z) {
        if (z) {
            TextView textView = this.q;
            textView.setTransformationMethod(w(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.ss0
    public final void v(boolean z) {
        this.s = z;
        TextView textView = this.q;
        textView.setTransformationMethod(w(textView.getTransformationMethod()));
        textView.setFilters(j(textView.getFilters()));
    }

    @Override // defpackage.ss0
    public final TransformationMethod w(TransformationMethod transformationMethod) {
        if (this.s) {
            return ((transformationMethod instanceof gh) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new gh(transformationMethod);
        }
        return transformationMethod instanceof gh ? ((gh) transformationMethod).f : transformationMethod;
    }
}
