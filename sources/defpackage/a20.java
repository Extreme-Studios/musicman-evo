package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.extremestudios.musicmanevo.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class a20 {
    public final int a;
    public final a00 b;
    public final int[][] c;
    public final a00[] d;

    public a20(g2 g2Var) {
        this.a = g2Var.g;
        this.b = (a00) g2Var.h;
        this.c = (int[][]) g2Var.i;
        this.d = (a00[]) g2Var.j;
    }

    public static void a(g2 g2Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = kw.i;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                a00 a00VarA = a00.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new f(0.0f)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i);
                int i4 = g2Var.g;
                if (i4 == 0 || iArrTrimStateSet.length == 0) {
                    g2Var.h = a00VarA;
                }
                int[][] iArr3 = (int[][]) g2Var.i;
                if (i4 >= iArr3.length) {
                    int i5 = i4 + 10;
                    int[][] iArr4 = new int[i5][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i4);
                    g2Var.i = iArr4;
                    a00[] a00VarArr = new a00[i5];
                    System.arraycopy((a00[]) g2Var.j, 0, a00VarArr, 0, i4);
                    g2Var.j = a00VarArr;
                }
                int[][] iArr5 = (int[][]) g2Var.i;
                int i6 = g2Var.g;
                iArr5[i6] = iArrTrimStateSet;
                ((a00[]) g2Var.j)[i6] = a00VarA;
                g2Var.g = i6 + 1;
            }
        }
    }
}
