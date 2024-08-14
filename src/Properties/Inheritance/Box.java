package Properties.Inheritance;

public class Box {
    int l;
    int h;
    int w;

    Box(int h, int l, int w){
        this.h = h;
        this.l = l;
        this.w = w;

    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
