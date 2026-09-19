package defpackage;

import android.media.audiofx.BassBoost;
import android.widget.CompoundButton;
import com.extremestudios.musicmanevo.EqualizerActivity;
import com.extremestudios.musicmanevo.SoundEffectsActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        BassBoost bassBoost;
        BassBoost bassBoost2;
        switch (this.a) {
            case 0:
                int i = EqualizerActivity.M;
                compoundButton.getClass();
                xs.j = z;
                try {
                    BassBoost bassBoost3 = xs.c;
                    if (bassBoost3 != null) {
                        bassBoost3.setEnabled(z);
                    }
                    if (z && (bassBoost = xs.c) != null) {
                        bassBoost.setStrength((short) 1000);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                int i2 = SoundEffectsActivity.E;
                compoundButton.getClass();
                xs.j = z;
                try {
                    BassBoost bassBoost4 = xs.c;
                    if (bassBoost4 != null) {
                        bassBoost4.setEnabled(z);
                    }
                    if (z && (bassBoost2 = xs.c) != null) {
                        bassBoost2.setStrength((short) 1000);
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
