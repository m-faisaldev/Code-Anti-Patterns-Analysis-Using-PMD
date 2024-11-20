package a1;

/* renamed from: a1.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1659j {

    /* renamed from: a1.j$a */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f13995a;

        a(int i8) {
            this.f13995a = i8;
        }

        public int b() {
            return this.f13995a;
        }
    }

    a b(String str);
}