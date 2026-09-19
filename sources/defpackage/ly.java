package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ly extends oy implements Iterator {
    public my f;
    public my g;
    public final /* synthetic */ int h;

    public ly(my myVar, my myVar2, int i) {
        this.h = i;
        this.f = myVar2;
        this.g = myVar;
    }

    @Override // defpackage.oy
    public final void a(my myVar) {
        my myVar2;
        my myVarB = null;
        if (this.f == myVar && myVar == this.g) {
            this.g = null;
            this.f = null;
        }
        my myVar3 = this.f;
        if (myVar3 == myVar) {
            switch (this.h) {
                case 0:
                    myVar2 = myVar3.i;
                    break;
                default:
                    myVar2 = myVar3.h;
                    break;
            }
            this.f = myVar2;
        }
        my myVar4 = this.g;
        if (myVar4 == myVar) {
            my myVar5 = this.f;
            if (myVar4 != myVar5 && myVar5 != null) {
                myVarB = b(myVar4);
            }
            this.g = myVarB;
        }
    }

    public final my b(my myVar) {
        switch (this.h) {
            case 0:
                return myVar.h;
            default:
                return myVar.i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        my myVar = this.g;
        my myVar2 = this.f;
        this.g = (myVar == myVar2 || myVar2 == null) ? null : b(myVar);
        return myVar;
    }
}
