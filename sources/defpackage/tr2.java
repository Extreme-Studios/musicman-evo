package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class tr2 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[6];
        System.arraycopy(ec.a, 0, iArr, 0, 6);
        int[] iArr2 = new int[iArr.length];
        b = iArr2;
        try {
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr3 = new int[yw2.values().length];
        a = iArr3;
        try {
            iArr3[1] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[2] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[3] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[4] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
