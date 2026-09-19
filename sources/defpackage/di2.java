package defpackage;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class di2 extends gi2 {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di2(CharSequence charSequence, Object obj, int i) {
        super(charSequence);
        this.k = i;
        this.l = obj;
    }

    @Override // defpackage.gi2
    public final int a(int i) {
        int i2 = this.k;
        Object obj = this.l;
        switch (i2) {
            case 0:
                CharSequence charSequence = this.h;
                int length = charSequence.length();
                hn.Q(i, length);
                while (i < length) {
                    if (((vh2) obj).a(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                Matcher matcher = (Matcher) ((w32) obj).g;
                if (matcher.find(i)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // defpackage.gi2
    public final int b(int i) {
        switch (this.k) {
            case 0:
                return i + 1;
            default:
                return ((Matcher) ((w32) this.l).g).end();
        }
    }
}
