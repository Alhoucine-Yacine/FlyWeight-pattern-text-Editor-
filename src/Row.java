import java.util.ArrayList;

/**
 * Created by JUV on 13/12/2018.
 */
public class Row extends Glyph {

    private ArrayList<GlyphContext> characterArrayList;

    public Row() {
        this.characterArrayList = new ArrayList<>();
    }

    public void add(GlyphContext glyphContext){
        characterArrayList.add(glyphContext);
    }

    @Override
    public void draw(GlyphContext glyphContext) {
        System.out.println();
        for (GlyphContext gC: characterArrayList)
            gC.draw(glyphContext);


    }

    @Override
    public void intersects(Point point, GlyphContext glyphContext) {

    }

}
