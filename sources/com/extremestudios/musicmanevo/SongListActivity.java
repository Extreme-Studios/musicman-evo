package com.extremestudios.musicmanevo;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import defpackage.c4;
import defpackage.dq;
import defpackage.j10;
import defpackage.jn;
import defpackage.lh;
import defpackage.mi;
import defpackage.ni;
import defpackage.oi;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class SongListActivity extends c4 {
    public static final /* synthetic */ int F = 0;
    public ListView C;
    public TextView D;
    public List E = lh.f;

    @Override // defpackage.c4, defpackage.xa, defpackage.wa, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        String str;
        String[] strArr;
        Throwable th;
        super.onCreate(bundle);
        setContentView(R.layout.activity_song_list);
        View viewFindViewById = findViewById(R.id.song_listview);
        viewFindViewById.getClass();
        this.C = (ListView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_song_list_title);
        viewFindViewById2.getClass();
        this.D = (TextView) viewFindViewById2;
        String stringExtra = getIntent().getStringExtra("FOLDER_PATH");
        String stringExtra2 = getIntent().getStringExtra("FOLDER_NAME");
        Throwable th2 = null;
        if (stringExtra2 != null) {
            TextView textView = this.D;
            if (textView == null) {
                jn.k("titleTv");
                throw null;
            }
            String upperCase = stringExtra2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            textView.setText(upperCase);
        }
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = getContentResolver();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        if (stringExtra != null) {
            String[] strArr2 = {stringExtra.concat("/%")};
            str = "is_music != 0 AND _data LIKE ?";
            strArr = strArr2;
        } else {
            str = "is_music != 0";
            strArr = null;
        }
        Cursor cursorQuery = contentResolver.query(uri, null, str, strArr, "title ASC");
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("title");
                int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("artist");
                int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("album");
                int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("duration");
                int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow("album_id");
                while (cursorQuery.moveToNext()) {
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    String string = cursorQuery.getString(columnIndexOrThrow2);
                    if (string == null) {
                        string = "Unknown Title";
                    }
                    String str2 = string;
                    String string2 = cursorQuery.getString(columnIndexOrThrow3);
                    if (string2 == null) {
                        string2 = "Unknown Artist";
                    }
                    String str3 = string2;
                    String string3 = cursorQuery.getString(columnIndexOrThrow4);
                    if (string3 == null) {
                        string3 = "Unknown Album";
                    }
                    String str4 = string3;
                    long j2 = cursorQuery.getLong(columnIndexOrThrow5);
                    long j3 = cursorQuery.getLong(columnIndexOrThrow6);
                    Throwable th3 = th2;
                    Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, j);
                    uriWithAppendedId.getClass();
                    Uri uriWithAppendedId2 = ContentUris.withAppendedId(Uri.parse("content://media/external/audio/albumart"), j3);
                    uriWithAppendedId2.getClass();
                    arrayList.add(new j10(j, str2, str3, str4, j2, uriWithAppendedId, uriWithAppendedId2));
                    th2 = th3;
                }
                th = th2;
                cursorQuery.close();
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    dq.i(cursorQuery, th4);
                    throw th5;
                }
            }
        } else {
            th = null;
        }
        this.E = arrayList;
        xs.h = arrayList;
        oi oiVar = new oi(this, this.E);
        ListView listView = this.C;
        if (listView == null) {
            jn.k("songListView");
            throw th;
        }
        listView.setAdapter((ListAdapter) oiVar);
        findViewById(R.id.btn_back).setOnClickListener(new mi(this, 2));
        ListView listView2 = this.C;
        if (listView2 != null) {
            listView2.setOnItemClickListener(new ni(this, 3));
        } else {
            jn.k("songListView");
            throw th;
        }
    }
}
