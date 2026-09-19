package defpackage;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.extremestudios.musicmanevo.EqualizerActivity;
import com.extremestudios.musicmanevo.FolderListActivity;
import com.extremestudios.musicmanevo.MainActivity;
import com.extremestudios.musicmanevo.PlayerActivity;
import com.extremestudios.musicmanevo.SettingsActivity;
import com.extremestudios.musicmanevo.SongListActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ c4 g;

    public /* synthetic */ ni(c4 c4Var, int i) {
        this.f = i;
        this.g = c4Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.f;
        c4 c4Var = this.g;
        switch (i2) {
            case 0:
                FolderListActivity folderListActivity = (FolderListActivity) c4Var;
                int i3 = FolderListActivity.E;
                Intent intent = new Intent(folderListActivity, (Class<?>) SongListActivity.class);
                intent.putExtra("FOLDER_PATH", (String) ((lv) folderListActivity.D.get(i)).f);
                intent.putExtra("FOLDER_NAME", (String) ((lv) folderListActivity.D.get(i)).g);
                folderListActivity.startActivity(intent);
                break;
            case 1:
                MainActivity mainActivity = (MainActivity) c4Var;
                String[] strArr = mainActivity.D;
                String str = strArr[i];
                if (jn.b(str, "Folders")) {
                    mainActivity.startActivity(new Intent(mainActivity, (Class<?>) FolderListActivity.class));
                } else if (!jn.b(str, "All Songs")) {
                    Toast.makeText(mainActivity, strArr[i] + " clicked", 0).show();
                } else {
                    mainActivity.startActivity(new Intent(mainActivity, (Class<?>) SongListActivity.class));
                }
                break;
            case 2:
                SettingsActivity settingsActivity = (SettingsActivity) c4Var;
                if (jn.b(settingsActivity.D[i], "Equalizer")) {
                    settingsActivity.startActivity(new Intent(settingsActivity, (Class<?>) EqualizerActivity.class));
                }
                break;
            default:
                SongListActivity songListActivity = (SongListActivity) c4Var;
                int i4 = SongListActivity.F;
                Intent intent2 = new Intent(songListActivity, (Class<?>) PlayerActivity.class);
                intent2.putExtra("SONG_INDEX", i);
                songListActivity.startActivity(intent2);
                break;
        }
    }
}
