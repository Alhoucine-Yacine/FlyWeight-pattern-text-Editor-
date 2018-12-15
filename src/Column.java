import java.util.ArrayList;

/**
 * Created by JUV on 13/12/2018.
 */
public class Column extends Glyph {
    private ArrayList<Row> rowArrayList;

    public Column() {
        this.rowArrayList = new ArrayList<>();
    }

    public void addRow(Row row){
        rowArrayList.add(row);
    }

    @Override
    public void draw(GlyphContext glyphContext) {
        System.out.print("\nnew Page :");
        for (Row row : rowArrayList)
            row.draw(null);
    }

    @Override
    public void intersects(Point point, GlyphContext glyphContext) {

    }

}
