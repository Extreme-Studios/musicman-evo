package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wc3 extends Exception {
    public final String f;
    public final pc3 g;
    public final String h;

    public wc3(de3 de3Var, ad3 ad3Var, int i) {
        String string = de3Var.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25 + string.length());
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(string);
        String string2 = sb.toString();
        String str = de3Var.m;
        int iAbs = Math.abs(i);
        this(string2, ad3Var, str, null, ec.j(new StringBuilder(String.valueOf(iAbs).length() + 60), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", iAbs));
    }

    public wc3(String str, Throwable th, String str2, pc3 pc3Var, String str3) {
        super(str, th);
        this.f = str2;
        this.g = pc3Var;
        this.h = str3;
    }
}
