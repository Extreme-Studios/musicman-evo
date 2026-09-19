package defpackage;

import android.media.MediaPlayer;
import android.media.audiofx.PresetReverb;
import android.view.View;
import android.widget.AdapterView;
import com.extremestudios.musicmanevo.SoundEffectsActivity;

/* JADX INFO: loaded from: classes.dex */
public final class yo implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ yo(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        yf yfVar;
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                if (i != -1 && (yfVar = ((fp) obj).h) != null) {
                    yfVar.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                MediaPlayer mediaPlayer = xs.a;
                short sShortValue = ((SoundEffectsActivity) obj).D[i].shortValue();
                xs.m = sShortValue;
                try {
                    PresetReverb presetReverb = xs.e;
                    if (presetReverb != null) {
                        presetReverb.setPreset(sShortValue);
                        presetReverb.setEnabled(true);
                    }
                    MediaPlayer mediaPlayer2 = xs.a;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.setAuxEffectSendLevel(sShortValue == 0 ? 0.0f : 1.0f);
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
