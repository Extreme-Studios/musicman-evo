package defpackage;

import com.extremestudios.musicmanevo.PlayerActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements cl {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g(dt dtVar, ct ctVar) {
        this.f = 1;
        this.g = dtVar;
    }

    @Override // defpackage.cl
    public final Object h(Object obj) {
        int i = this.f;
        k50 k50Var = k50.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return obj == ((w) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                ((dt) obj2).d(null);
                return k50Var;
            default:
                PlayerActivity playerActivity = (PlayerActivity) obj2;
                int i2 = PlayerActivity.Y;
                ((j10) obj).getClass();
                playerActivity.runOnUiThread(playerActivity::w);
                return k50Var;
        }
    }

    public /* synthetic */ g(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
