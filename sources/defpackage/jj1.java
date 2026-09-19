package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class jj1 implements r63 {
    public final /* synthetic */ int a = 4;
    public final v63 b;
    public final v63 c;
    public final v63 d;
    public final v63 e;
    public final v63 f;
    public final v63 g;
    public final v63 h;

    public jj1(s63 s63Var, q63 q63Var, q63 q63Var2, q63 q63Var3, s63 s63Var2, q63 q63Var4, q63 q63Var5) {
        this.b = s63Var;
        this.e = q63Var;
        this.f = q63Var2;
        this.c = q63Var3;
        this.d = s63Var2;
        this.g = q63Var4;
        this.h = q63Var5;
    }

    public hx1 a() {
        return new hx1((pf1) ((s63) this.c).a, (Context) ((q63) this.d).c(), (Executor) this.b.c(), (jr1) ((q63) this.e).c(), ((yj1) this.h).a(), (wh2) ((q63) this.f).c(), (cs1) ((q63) this.g).c());
    }

    @Override // defpackage.v63
    public final Object c() {
        int i = this.a;
        v63 v63Var = this.h;
        v63 v63Var2 = this.g;
        v63 v63Var3 = this.d;
        v63 v63Var4 = this.c;
        v63 v63Var5 = this.f;
        v63 v63Var6 = this.e;
        v63 v63Var7 = this.b;
        switch (i) {
            case 0:
                return new ij1(((xe1) v63Var7).a(), ((yj1) v63Var).a(), ((ef1) v63Var4).a(), ((ve1) v63Var3).c(), (dt1) v63Var6.c(), (e72) v63Var5.c(), (qt1) v63Var2.c());
            case 1:
                return new zr1(((xe1) v63Var7).a(), (q52) v63Var4.c(), (es1) v63Var3.c(), ((ti1) v63Var5).b(), ((ti1) v63Var2).a(), (bw1) v63Var6.c(), (String) ((r63) v63Var).c());
            case 2:
                return new cs1(((xe1) v63Var7).a(), (hs1) v63Var4.c(), ((ff1) v63Var3).c(), ((yj1) v63Var).a(), (String) ((q63) v63Var2).c(), (String) v63Var6.c(), (zq0) v63Var5.c());
            case 3:
                return a();
            case 4:
                hf1 hf1Var = (hf1) ((s63) v63Var3).a;
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new vx1(hf1Var, ya1Var, ((i91) v63Var6).b(), (t52) v63Var7.c(), (xq1) ((q63) v63Var5).c(), (cs1) ((q63) v63Var2).c(), ((ef1) v63Var4).a(), (Context) ((q63) v63Var).c(), new ue0(16));
            case 5:
                return new u32((if1) v63Var7.c(), (Context) ((s63) v63Var6).a, (String) ((s63) v63Var5).a, (p32) ((q63) v63Var2).c(), (o32) ((q63) v63Var).c(), ((ef1) v63Var4).a(), (es1) v63Var3.c());
            case 6:
                return new v32((Context) ((s63) v63Var3).a, (Executor) v63Var7.c(), (kb3) ((s63) v63Var6).a, (if1) v63Var4.c(), (nz1) ((q63) v63Var5).c(), (pz1) ((q63) v63Var2).c(), new h52(), (am1) ((q63) v63Var).c());
            case 7:
                return new ke2((ExecutorService) v63Var7.c(), q63.b((q63) v63Var5), q63.b(v63Var4), (tg2) v63Var3.c(), q63.b((q63) v63Var2), (wc2) v63Var, (vc2) v63Var6.c());
            case 8:
                Context context = (Context) v63Var7.c();
                ExecutorService executorService = (ExecutorService) v63Var4.c();
                re2 re2Var = (re2) v63Var3.c();
                bf2 bf2Var = (bf2) ((q63) v63Var).c();
                File file = (File) v63Var6.c();
                dh2 dh2Var = (dh2) v63Var5.c();
                vc2 vc2Var = (vc2) v63Var2.c();
                bk2 bk2VarH = bk2.h(new df2("BhNDAdNbKVCXLou3UwS6SQycA6O/T9ZMbr2NWffNFtsRs3WScUuYHsaYRJ0jHvCA", "oaC5CLMjwUmi/i48MFPdrATPzdM8HcSPBi81Io4IqyU=", Context.class), new df2("dFQH+5qiD2PRdi0XHMSOoNm+a3fekCOGUzmH+eYRmk9bJvOb468Cs8O4aRQ5LdYP", "cV7R50f2/HQumOgCDB4L1ZcSwVOfPPdtbjhx11w36hE=", new Class[0]), new df2("xLMBD0ZYDeFbDZVCzCownSP8NNmORP0EKF5jeEnOGlb2W22XICiCfQYSI28gi51p", "CL6HTaJ4+bHVCQXLR1XCftwOp39gWYfgPib+AnvHUWA=", NetworkCapabilities.class, Long.class, Long.class), new df2("By5K9EmVfikEcCFMOZQd1jxZLLuKkdFWcNBLbmtQ/cGwaIFZzYRhON9QKnCD3h+X", "jO4sZLvDsqH0XT1pMychedS7fP8lDaqZlRwqYI2S90Y=", String.class), new df2("71irZxeyztMVPxtkZNjCXCWzc9uBzzqfxPgw1LkoaIGD1YWtoRaLj8ZtqyMHro2I", "sazFFsabItlse3qDY43b32ZnLCjQJ0+CJQYLaEeKmSw=", View.class, Activity.class), new df2("P6F0ZRwWAQfQFwxv0Pq3Kr7GsgVJK2iuMjcPK+Aq3kgEIqqz95IgzklzBsNVE1/z", "noWWhxc3WlXlb4cqOg7NtD3uZWHj+L+uVXJvY7XilyA=", DisplayMetrics.class, View.class), new df2("lJ67yAwBUtoZhasVqN11g6g6opAmTxjVxzUKxhl0fOhTr4nQH4cVWV7NJy0RD49z", "0isRm8IoYsyXMQyBCJPbREn4r5FwCMP2Q3k9zoXRqyk=", Long[].class, Integer.class), new df2("Zh6cd+aDndZV+YUcVHG1KoZXWtL97j2QmZXbwOqvXvMv7NRw9MmD/Gx8wRyupV8R", "kj+4OypsnIcMTfpnmlGzqqY0pqeQ7F3FRQZTzB0M60E=", new Class[0]), new df2("zRITP136LTX4rFLknKK5s+BdzyKXJ24gjaP1ECV594x04Hyj3q+IVU95/J2vSCm1", "E6K+C1ogZN29OFWU2j1wUPRhMI7Lv3qBcqHzi1vCWW4=", Context.class, Integer.class), new df2("3U4DEAJT9Pq66npH/ZEsiPizUaU6oaGuzbq27Rp3Iz/R6ssq6OsViFqc+1XsG+SQ", "oHImj5OTIs8LNvX9EwNQkQ3bSJ9XioOM1m8VTLsnF8I=", Integer.class, Context.class, Boolean.class), new df2("yl2V2fIFd/+gtM2i3wtw7rRydnC7INCVtpRFdnYEC9BkEYS1KI4o6evRDqm9gjRN", "/ngo8an629JW3IpM1KyGjEthGKpic0JTOThCbrYq6ZE=", Context.class), new df2("fPyGoeDuTUuDJV03GsNFpCGRO2J3Ui8HA6QvnuqOeQaxvLcgOY5Y2sf90BXpAioC", "znAIQ1vWTnsSA3nf0QmMCBs/bj4g6mmUyXonbfu9VUs=", Context.class), new df2("gbI2a8ruQFsh7iJbKP5csiDrRqRaAG+o51RWglq6SF+q1HNUXOxpmDRR6GgQlE1Z", "C7gHksN/1NwyNvzCHdeBzJsOxB75cHtIeny2v2KpeXA=", MotionEvent.class, DisplayMetrics.class), new df2("TJcXhplO1c7oeAIzyyjGCjnhXIAfNaFNWGhya9KHb9++zv8J1h9atpUrZL1Yjg6v", "v7ewhEi0QRfAHjcos6RExS5aIOB6pcbb0aW+P30gIsQ=", MotionEvent.class, DisplayMetrics.class));
                dq.D(bk2VarH);
                return new cf2(context, executorService, re2Var, bf2Var, file, dh2Var, vc2Var.P(), bk2VarH);
            case 9:
                return new if2((hp0) ((s63) v63Var5).a, (cf2) v63Var7.c(), (Map) ((s63) v63Var2).a, (Context) v63Var4.c(), (dd2) ((s63) v63Var).a, (vc2) v63Var3.c(), (dh2) v63Var6.c());
            default:
                return new lg2((Context) v63Var7.c(), q63.b((q63) v63Var6), (ng2) ((q63) v63Var5).c(), (dh2) v63Var4.c(), (ExecutorService) v63Var3.c(), (fg2) ((q63) v63Var2).c(), (ga2) ((q63) v63Var).c());
        }
    }

    public jj1(xe1 xe1Var, q63 q63Var, q63 q63Var2, ti1 ti1Var, ti1 ti1Var2, q63 q63Var3, r63 r63Var) {
        this.b = xe1Var;
        this.c = q63Var;
        this.d = q63Var2;
        this.f = ti1Var;
        this.g = ti1Var2;
        this.e = q63Var3;
        this.h = r63Var;
    }

    public jj1(s63 s63Var, i91 i91Var, v63 v63Var, q63 q63Var, q63 q63Var2, v63 v63Var2, q63 q63Var3) {
        this.d = s63Var;
        this.e = i91Var;
        this.b = v63Var;
        this.f = q63Var;
        this.g = q63Var2;
        this.c = v63Var2;
        this.h = q63Var3;
    }

    public jj1(s63 s63Var, q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, wc2 wc2Var, s63 s63Var2) {
        this.b = s63Var;
        this.f = q63Var;
        this.c = q63Var2;
        this.d = q63Var3;
        this.g = q63Var4;
        this.h = wc2Var;
        this.e = s63Var2;
    }

    public jj1(xe1 xe1Var, q63 q63Var, ff1 ff1Var, yj1 yj1Var, q63 q63Var2, v63 v63Var, q63 q63Var3) {
        this.b = xe1Var;
        this.c = q63Var;
        this.d = ff1Var;
        this.h = yj1Var;
        this.g = q63Var2;
        this.e = v63Var;
        this.f = q63Var3;
    }

    public jj1(s63 s63Var, q63 q63Var, s63 s63Var2, s63 s63Var3, q63 q63Var2, q63 q63Var3, q63 q63Var4) {
        this.d = s63Var;
        this.b = q63Var;
        this.e = s63Var2;
        this.c = s63Var3;
        this.f = q63Var2;
        this.g = q63Var3;
        this.h = q63Var4;
    }

    public jj1(s63 s63Var, q63 q63Var, s63 s63Var2, s63 s63Var3, s63 s63Var4, s63 s63Var5, q63 q63Var2) {
        this.f = s63Var;
        this.b = q63Var;
        this.g = s63Var2;
        this.c = s63Var3;
        this.h = s63Var4;
        this.d = s63Var5;
        this.e = q63Var2;
    }

    public jj1(s63 s63Var, q63 q63Var, v63 v63Var, q63 q63Var2, yj1 yj1Var, q63 q63Var3, q63 q63Var4) {
        this.c = s63Var;
        this.d = q63Var;
        this.b = v63Var;
        this.e = q63Var2;
        this.h = yj1Var;
        this.f = q63Var3;
        this.g = q63Var4;
    }

    public jj1(s63 s63Var, s63 s63Var2, q63 q63Var, q63 q63Var2, q63 q63Var3, q63 q63Var4, s63 s63Var3) {
        this.b = s63Var;
        this.c = s63Var2;
        this.d = q63Var;
        this.h = q63Var2;
        this.e = q63Var3;
        this.f = q63Var4;
        this.g = s63Var3;
    }

    public jj1(s63 s63Var, s63 s63Var2, s63 s63Var3, q63 q63Var, q63 q63Var2, ef1 ef1Var, q63 q63Var3) {
        this.b = s63Var;
        this.e = s63Var2;
        this.f = s63Var3;
        this.g = q63Var;
        this.h = q63Var2;
        this.c = ef1Var;
        this.d = q63Var3;
    }

    public jj1(v63 v63Var, yj1 yj1Var, v63 v63Var2, v63 v63Var3, v63 v63Var4, v63 v63Var5, v63 v63Var6) {
        this.b = v63Var;
        this.h = yj1Var;
        this.c = v63Var2;
        this.d = v63Var3;
        this.e = v63Var4;
        this.f = v63Var5;
        this.g = v63Var6;
    }
}
