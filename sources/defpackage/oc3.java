package defpackage;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class oc3 extends es2 {
    public final int f;

    public oc3(IllegalStateException illegalStateException, pc3 pc3Var) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(pc3Var == null ? null : pc3Var.a)), illegalStateException);
        if (illegalStateException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) illegalStateException;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.f = errorCode;
    }
}
