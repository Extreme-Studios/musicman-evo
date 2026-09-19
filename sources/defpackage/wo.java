package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.extremestudios.musicmanevo.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wo extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ xo b;

    public wo(xo xoVar) {
        this.b = xoVar;
        a();
    }

    public final void a() {
        rr rrVar = this.b.h;
        ur urVar = rrVar.v;
        if (urVar != null) {
            rrVar.i();
            ArrayList arrayList = rrVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ur) arrayList.get(i)) == urVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ur getItem(int i) {
        xo xoVar = this.b;
        rr rrVar = xoVar.h;
        rrVar.i();
        ArrayList arrayList = rrVar.j;
        xoVar.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (ur) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        xo xoVar = this.b;
        rr rrVar = xoVar.h;
        rrVar.i();
        int size = rrVar.j.size();
        xoVar.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((is) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
