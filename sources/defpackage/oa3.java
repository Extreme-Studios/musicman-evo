package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class oa3 extends AudioDeviceCallback {
    public final /* synthetic */ qx1 a;

    public /* synthetic */ oa3(qx1 qx1Var) {
        this.a = qx1Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        qx1 qx1Var = this.a;
        qx1Var.b(na3.a((Context) qx1Var.g, (qk1) qx1Var.o, (AudioDeviceInfo) qx1Var.n));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        qx1 qx1Var;
        String str = qz1.a;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            qx1Var = this.a;
            if (i >= length) {
                break;
            }
            if (Objects.equals(audioDeviceInfoArr[i], (AudioDeviceInfo) qx1Var.n)) {
                qx1Var.n = null;
                break;
            }
            i++;
        }
        qx1Var.b(na3.a((Context) qx1Var.g, (qk1) qx1Var.o, (AudioDeviceInfo) qx1Var.n));
    }
}
