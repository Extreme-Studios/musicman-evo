package defpackage;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class of3 implements zh2 {
    public final /* synthetic */ zf3 f;
    public final /* synthetic */ sf3 g;

    public /* synthetic */ of3(zf3 zf3Var, sf3 sf3Var) {
        this.f = zf3Var;
        this.g = sf3Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:77:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.zh2
    public final boolean b(Object obj) {
        md mdVar;
        boolean zCanBeSpatialized;
        md mdVar2;
        de3 de3Var = (de3) obj;
        if (!this.g.A) {
            return true;
        }
        zf3 zf3Var = this.f;
        Boolean bool = zf3Var.i;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        int i = de3Var.E;
        String str = de3Var.m;
        if (i == -1 || i <= 2) {
            return true;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        if (Build.VERSION.SDK_INT >= 32 || (mdVar2 = zf3Var.g) == null || !mdVar2.f) {
                            return true;
                        }
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        if (Build.VERSION.SDK_INT >= 32) {
                            return true;
                        }
                        return true;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        if (Build.VERSION.SDK_INT >= 32) {
                            return true;
                        }
                        return true;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        if (Build.VERSION.SDK_INT >= 32) {
                            return true;
                        }
                        return true;
                    }
                    break;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (mdVar = zf3Var.g) != null && mdVar.f) {
            Spatializer spatializer = (Spatializer) mdVar.g;
            spatializer.getClass();
            if (m0.c(spatializer).isAvailable()) {
                Spatializer spatializer2 = (Spatializer) zf3Var.g.g;
                spatializer2.getClass();
                if (m0.c(spatializer2).isEnabled()) {
                    md mdVar3 = zf3Var.g;
                    qk1 qk1Var = zf3Var.h;
                    mdVar3.getClass();
                    int i2 = de3Var.E;
                    if (Objects.equals(str, "audio/eac3-joc")) {
                        if (i2 == 16) {
                            i2 = 12;
                        }
                    } else if (Objects.equals(str, "audio/iamf")) {
                        if (i2 == -1) {
                            i2 = 6;
                        }
                    } else if (Objects.equals(str, "audio/ac4") && (i2 == 18 || i2 == 21)) {
                        i2 = 24;
                    }
                    int iB = qz1.b(i2);
                    if (iB == 0) {
                        zCanBeSpatialized = false;
                    } else {
                        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iB);
                        int i3 = de3Var.F;
                        if (i3 != -1) {
                            channelMask.setSampleRate(i3);
                        }
                        Spatializer spatializer3 = (Spatializer) mdVar3.g;
                        spatializer3.getClass();
                        zCanBeSpatialized = m0.c(spatializer3).canBeSpatialized(qk1Var.a(), channelMask.build());
                    }
                    if (zCanBeSpatialized) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
