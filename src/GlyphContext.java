/**
 * Created by JUV on 13/12/2018.
 */
public class GlyphContext extends Glyph {
    private Character character;
    private String font;

    public GlyphContext() {
    }

    public GlyphContext(Character character, String font) {
        this.character = character;
        this.font=font;
    }


    @Override
    public void draw(GlyphContext context) {
        character.draw(this);
    }

    @Override
    public void intersects(Point point, GlyphContext context) {

    }
}
