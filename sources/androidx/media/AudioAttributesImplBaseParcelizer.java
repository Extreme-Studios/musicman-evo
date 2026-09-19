package androidx.media;

import defpackage.e60;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(e60 e60Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = 0;
        audioAttributesImplBase.b = 0;
        audioAttributesImplBase.c = 0;
        audioAttributesImplBase.d = -1;
        audioAttributesImplBase.a = e60Var.f(0, 1);
        audioAttributesImplBase.b = e60Var.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = e60Var.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = e60Var.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, e60 e60Var) {
        e60Var.getClass();
        e60Var.j(audioAttributesImplBase.a, 1);
        e60Var.j(audioAttributesImplBase.b, 2);
        e60Var.j(audioAttributesImplBase.c, 3);
        e60Var.j(audioAttributesImplBase.d, 4);
    }
}
