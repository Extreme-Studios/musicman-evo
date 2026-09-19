package defpackage;

import android.view.View;
import com.extremestudios.musicmanevo.FolderListActivity;
import com.extremestudios.musicmanevo.SettingsActivity;
import com.extremestudios.musicmanevo.SongListActivity;
import com.extremestudios.musicmanevo.SoundEffectsActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mi implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ c4 g;

    public /* synthetic */ mi(c4 c4Var, int i) {
        this.f = i;
        this.g = c4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        c4 c4Var = this.g;
        switch (i) {
            case 0:
                int i2 = FolderListActivity.E;
                ((FolderListActivity) c4Var).finish();
                break;
            case 1:
                int i3 = SettingsActivity.E;
                ((SettingsActivity) c4Var).finish();
                break;
            case 2:
                int i4 = SongListActivity.F;
                ((SongListActivity) c4Var).finish();
                break;
            default:
                int i5 = SoundEffectsActivity.E;
                ((SoundEffectsActivity) c4Var).finish();
                break;
        }
    }
}
