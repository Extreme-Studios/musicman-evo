package defpackage;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.extremestudios.musicmanevo.FolderListActivity;
import com.extremestudios.musicmanevo.MainActivity;
import com.extremestudios.musicmanevo.SettingsActivity;
import com.extremestudios.musicmanevo.SongListActivity;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oi extends BaseAdapter {
    public final /* synthetic */ int a;
    public final androidx.appcompat.app.AppCompatActivity b;
    public final Object c;

    public oi(SettingsActivity settingsActivity, String[] strArr) {
        strArr.getClass();
        this.a = 2;
        this.b = settingsActivity;
        this.c = strArr;
    }

    public static void a(ImageView imageView, SongListActivity songListActivity) {
        imageView.setImageResource(R.drawable.ic_media_play);
        imageView.setColorFilter(songListActivity.getColor(com.extremestudios.musicmanevo.R.color.neon_purple));
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        switch (this.a) {
            case 0:
                return ((List) this.c).size();
            case 1:
                return ((String[]) this.c).length;
            case 2:
                return ((String[]) this.c).length;
            default:
                return ((List) this.c).size();
        }
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        switch (this.a) {
            case 0:
                return ((List) this.c).get(i);
            case 1:
                return ((String[]) this.c)[i];
            case 2:
                return ((String[]) this.c)[i];
            default:
                return ((List) this.c).get(i);
        }
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        switch (this.a) {
            case 0:
                return i;
            case 1:
                return i;
            case 2:
                return i;
            default:
                return ((j10) ((List) this.c).get(i)).a;
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = this.a;
        Object obj = this.c;
        androidx.appcompat.app.AppCompatActivity c4Var = this.b;
        switch (i2) {
            case 0:
                if (view == null) {
                    view = LayoutInflater.from((FolderListActivity) c4Var).inflate(com.extremestudios.musicmanevo.R.layout.item_folder, viewGroup, false);
                }
                lv lvVar = (lv) ((List) obj).get(i);
                TextView textView = (TextView) view.findViewById(com.extremestudios.musicmanevo.R.id.tv_folder_name);
                TextView textView2 = (TextView) view.findViewById(com.extremestudios.musicmanevo.R.id.tv_folder_path);
                textView.setText((CharSequence) lvVar.g);
                textView2.setText((CharSequence) lvVar.f);
                return view;
            case 1:
                if (view == null) {
                    view = LayoutInflater.from((MainActivity) c4Var).inflate(com.extremestudios.musicmanevo.R.layout.item_menu, viewGroup, false);
                }
                ((TextView) view.findViewById(com.extremestudios.musicmanevo.R.id.menu_item_text)).setText(((String[]) obj)[i]);
                return view;
            case 2:
                if (view == null) {
                    view = LayoutInflater.from((SettingsActivity) c4Var).inflate(com.extremestudios.musicmanevo.R.layout.item_menu, viewGroup, false);
                }
                ((TextView) view.findViewById(com.extremestudios.musicmanevo.R.id.menu_item_text)).setText(((String[]) obj)[i]);
                return view;
            default:
                SongListActivity songListActivity = (SongListActivity) c4Var;
                if (view == null) {
                    view = LayoutInflater.from(songListActivity).inflate(com.extremestudios.musicmanevo.R.layout.item_song, viewGroup, false);
                }
                j10 j10Var = (j10) ((List) obj).get(i);
                TextView textView3 = (TextView) view.findViewById(com.extremestudios.musicmanevo.R.id.tv_song_title);
                TextView textView4 = (TextView) view.findViewById(com.extremestudios.musicmanevo.R.id.tv_artist_name);
                ImageView imageView = (ImageView) view.findViewById(com.extremestudios.musicmanevo.R.id.img_album_art);
                String str = j10Var.b;
                textView3.setText(str);
                textView4.setText(j10Var.c);
                if (songListActivity.G) {
                    a(imageView, songListActivity);
                    return view;
                }
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = songListActivity.getContentResolver().openFileDescriptor(j10Var.g, "r");
                    k50 k50Var = null;
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                            if (bitmapDecodeFileDescriptor != null) {
                                imageView.setImageBitmap(bitmapDecodeFileDescriptor);
                                imageView.setColorFilter((ColorFilter) null);
                            } else {
                                imageView.getClass();
                                a(imageView, songListActivity);
                            }
                            parcelFileDescriptorOpenFileDescriptor.close();
                            k50Var = k50.a;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                dq.i(parcelFileDescriptorOpenFileDescriptor, th);
                                throw th2;
                            }
                        }
                    }
                    if (k50Var == null) {
                        imageView.getClass();
                        a(imageView, songListActivity);
                    }
                } catch (FileNotFoundException unused) {
                    Log.d("SongAdapter", "Album art not found for ".concat(str));
                    imageView.getClass();
                    a(imageView, songListActivity);
                } catch (Exception e) {
                    Log.e("SongAdapter", "Error loading album art for " + str + ": " + e.getMessage(), e);
                    imageView.getClass();
                    a(imageView, songListActivity);
                }
                return view;
        }
    }

    public oi(FolderListActivity folderListActivity, List list) {
        list.getClass();
        this.a = 0;
        this.b = folderListActivity;
        this.c = list;
    }

    public oi(SongListActivity songListActivity, List list) {
        list.getClass();
        this.a = 3;
        this.b = songListActivity;
        this.c = list;
    }

    public oi(MainActivity mainActivity, String[] strArr) {
        strArr.getClass();
        this.a = 1;
        this.b = mainActivity;
        this.c = strArr;
    }
}
