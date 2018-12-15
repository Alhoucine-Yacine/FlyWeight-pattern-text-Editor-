/**
 * Created by JUV on 13/12/2018.
 */
public class Character extends Glyph {
    public int codeChar;

    public Character(char character) {
        this.codeChar = (int)character;
    }

    public char getChar(){
        return (char)this.codeChar;
    }


    @Override
    public void draw(GlyphContext glyphContext) {
        System.out.print(getChar());
    }

    @Override
    public void intersects(Point point, GlyphContext glyphContext) {

    }

}
