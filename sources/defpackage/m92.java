package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class m92 {
    public static final Pattern b = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final ArrayList a = new ArrayList();

    public final void a(View view, a92 a92Var) {
        l92 l92Var;
        if (view == null) {
            j7.p("FriendlyObstruction is null");
            return;
        }
        if (!b.matcher("Ad overlay").matches()) {
            j7.p("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                l92Var = null;
                break;
            } else {
                Object obj = arrayList.get(i);
                i++;
                l92Var = (l92) obj;
            }
        } while (l92Var.a.get() != view);
        if (l92Var == null) {
            arrayList.add(new l92(view, a92Var));
        }
    }
}
