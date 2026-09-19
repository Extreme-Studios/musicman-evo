package androidx.media;

import defpackage.e60;
import defpackage.g60;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(e60 e60Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        g60 g60VarH = audioAttributesCompat.a;
        if (e60Var.e(1)) {
            g60VarH = e60Var.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) g60VarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, e60 e60Var) {
        e60Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        e60Var.i(1);
        e60Var.l(audioAttributesImpl);
    }
}
