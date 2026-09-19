package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class hk extends o70 {
    public final ViewGroup g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(kj kjVar, ViewGroup viewGroup, int i) {
        super(kjVar, "Attempting to use <fragment> tag to add fragment " + kjVar + " to container " + viewGroup);
        switch (i) {
            case 1:
                kjVar.getClass();
                super(kjVar, "Attempting to add fragment " + kjVar + " to container " + viewGroup + " which is not a FragmentContainerView");
                this.g = viewGroup;
                break;
            default:
                this.g = viewGroup;
                break;
        }
    }
}
