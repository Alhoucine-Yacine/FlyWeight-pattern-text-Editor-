/**
 * Created by JUV on 13/12/2018.
 */
public abstract class Glyph {
    public abstract void draw(GlyphContext context);
    public abstract void intersects(Point point, GlyphContext context);


}
