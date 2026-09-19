package com.extremestudios.musicmanevo;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import defpackage.a23;
import defpackage.c4;
import defpackage.dq;
import defpackage.jn;
import defpackage.lh;
import defpackage.lv;
import defpackage.mi;
import defpackage.ni;
import defpackage.oi;
import defpackage.ts;
import defpackage.x9;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class FolderListActivity extends c4 {
    public static final /* synthetic */ int E = 0;
    public ListView C;
    public List D = lh.f;

    @Override // defpackage.c4, defpackage.xa, defpackage.wa, android.app.Activity
    public final void onCreate(Bundle bundle) throws IOException {
        File parentFile;
        List listAsList;
        super.onCreate(bundle);
        setContentView(R.layout.activity_folder_list);
        View viewFindViewById = findViewById(R.id.folder_listview);
        viewFindViewById.getClass();
        this.C = (ListView) viewFindViewById;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor cursorQuery = getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_data"}, "is_music != 0", null, null);
        if (cursorQuery != null) {
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndexOrThrow);
                    if (string != null && (parentFile = new File(string).getParentFile()) != null) {
                        linkedHashMap.put(parentFile.getAbsolutePath(), parentFile.getName());
                    }
                }
                cursorQuery.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    dq.i(cursorQuery, th);
                    throw th2;
                }
            }
        }
        int size = linkedHashMap.size();
        List listG = lh.f;
        if (size != 0) {
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    arrayList.add(new lv(entry.getKey(), entry.getValue()));
                    do {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new lv(entry2.getKey(), entry2.getValue()));
                    } while (it.hasNext());
                    listG = arrayList;
                } else {
                    listG = a23.g(new lv(entry.getKey(), entry.getValue()));
                }
            }
        }
        ts tsVar = new ts(0);
        if (listG.size() <= 1) {
            listAsList = x9.J(listG);
        } else {
            Object[] array = listG.toArray(new Object[0]);
            array.getClass();
            if (array.length > 1) {
                Arrays.sort(array, tsVar);
            }
            listAsList = Arrays.asList(array);
            listAsList.getClass();
        }
        this.D = listAsList;
        oi oiVar = new oi(this, this.D);
        ListView listView = this.C;
        if (listView == null) {
            jn.k("folderListView");
            throw null;
        }
        listView.setAdapter((ListAdapter) oiVar);
        findViewById(R.id.btn_back_folder).setOnClickListener(new mi(this, 0));
        ListView listView2 = this.C;
        if (listView2 != null) {
            listView2.setOnItemClickListener(new ni(this, 0));
        } else {
            jn.k("folderListView");
            throw null;
        }
    }
}
