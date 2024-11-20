package A0;

import Q.AbstractC1394p;

/* loaded from: classes.dex */
public abstract class m extends Exception {
    protected m() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str) {
        super(str);
        AbstractC1394p.g(str, "Detail message must not be empty");
    }
}