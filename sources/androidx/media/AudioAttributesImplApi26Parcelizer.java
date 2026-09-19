package androidx.media;

import android.media.AudioAttributes;
import defpackage.e60;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(e60 e60Var) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) e60Var.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = e60Var.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, e60 e60Var) {
        e60Var.getClass();
        e60Var.k(audioAttributesImplApi26.a, 1);
        e60Var.j(audioAttributesImplApi26.b, 2);
    }
}
