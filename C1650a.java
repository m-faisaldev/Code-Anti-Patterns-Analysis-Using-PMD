package a1;

import java.util.List;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1650a extends AbstractC1661l {

    /* renamed from: a, reason: collision with root package name */
    private final String f13978a;

    /* renamed from: b, reason: collision with root package name */
    private final List f13979b;

    C1650a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f13978a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f13979b = list;
    }

    @Override // a1.AbstractC1661l
    public List b() {
        return this.f13979b;
    }

    @Override // a1.AbstractC1661l
    public String c() {
        return this.f13978a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1661l)) {
            return false;
        }
        AbstractC1661l abstractC1661l = (AbstractC1661l) obj;
        return this.f13978a.equals(abstractC1661l.c()) && this.f13979b.equals(abstractC1661l.b());
    }

    public int hashCode() {
        return ((this.f13978a.hashCode() ^ 1000003) * 1000003) ^ this.f13979b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f13978a + ", usedDates=" + this.f13979b + "}";
    }
}