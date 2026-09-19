package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class es extends yf {
    public final int r;
    public final int s;
    public tr t;
    public ur u;

    public es(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.r = 21;
            this.s = 22;
        } else {
            this.r = 22;
            this.s = 21;
        }
    }

    @Override // defpackage.yf, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        or orVar;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                orVar = (or) headerViewListAdapter.getWrappedAdapter();
            } else {
                orVar = (or) adapter;
                headersCount = 0;
            }
            ur item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= orVar.getCount()) ? null : orVar.getItem(i);
            ur urVar = this.u;
            if (urVar != item) {
                rr rrVar = orVar.a;
                if (urVar != null) {
                    this.t.g(rrVar, urVar);
                }
                this.u = item;
                if (item != null) {
                    this.t.j(rrVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.s) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (or) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (or) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(tr trVar) {
        this.t = trVar;
    }

    @Override // defpackage.yf, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
