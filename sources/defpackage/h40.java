package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h40 extends ss0 {
    public final /* synthetic */ int q;
    public boolean r;
    public int s;
    public final /* synthetic */ Object t;

    public h40(i70 i70Var) {
        this.q = 1;
        this.t = i70Var;
        this.r = false;
        this.s = 0;
    }

    @Override // defpackage.j70
    public final void a() {
        int i = this.q;
        Object obj = this.t;
        switch (i) {
            case 0:
                if (!this.r) {
                    ((i40) obj).a.setVisibility(this.s);
                }
                break;
            default:
                int i2 = this.s + 1;
                this.s = i2;
                i70 i70Var = (i70) obj;
                if (i2 == i70Var.a.size()) {
                    j70 j70Var = i70Var.d;
                    if (j70Var != null) {
                        j70Var.a();
                    }
                    this.s = 0;
                    this.r = false;
                    i70Var.e = false;
                }
                break;
        }
    }

    @Override // defpackage.ss0, defpackage.j70
    public void b() {
        switch (this.q) {
            case 0:
                this.r = true;
                break;
        }
    }

    @Override // defpackage.ss0, defpackage.j70
    public final void c() {
        int i = this.q;
        Object obj = this.t;
        switch (i) {
            case 0:
                ((i40) obj).a.setVisibility(0);
                break;
            default:
                if (!this.r) {
                    this.r = true;
                    j70 j70Var = ((i70) obj).d;
                    if (j70Var != null) {
                        j70Var.c();
                    }
                    break;
                }
                break;
        }
    }

    public h40(i40 i40Var, int i) {
        this.q = 0;
        this.t = i40Var;
        this.s = i;
        this.r = false;
    }
}
