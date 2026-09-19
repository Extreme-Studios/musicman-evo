package defpackage;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
public final class q52 {
    public final Pattern a;

    public q52() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) tu0.e.c.a(lx0.i7));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.a = patternCompile;
    }
}
