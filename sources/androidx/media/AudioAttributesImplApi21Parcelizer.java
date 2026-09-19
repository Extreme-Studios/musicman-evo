package androidx.media;

import android.media.AudioAttributes;
import defpackage.e60;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(e60 e60Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) e60Var.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = e60Var.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, e60 e60Var) {
        e60Var.getClass();
        e60Var.k(audioAttributesImplApi21.a, 1);
        e60Var.j(audioAttributesImplApi21.b, 2);
    }
}
