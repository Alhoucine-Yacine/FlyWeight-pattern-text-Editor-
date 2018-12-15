/**
 * Created by JUV on 13/12/2018.
 */
public class Client {


    public static void main(String args[]){
        FlyWeightFactory flyWeightFactory=new FlyWeightFactory();
        GlyphContext glyphContext = null;
        Column column=flyWeightFactory.getColumn();
        Row row=flyWeightFactory.getRow();
        Row row1=flyWeightFactory.getRow();
        column.addRow(row);
        column.addRow(row1);

        Character character;
        row.add(flyWeightFactory.getCharacter(('H'),"font1"));
        row.add(flyWeightFactory.getCharacter(('E'),"font1"));
        row.add(flyWeightFactory.getCharacter(('L'),"font1"));
        row.add(flyWeightFactory.getCharacter(('L'),"font1"));
        row.add(flyWeightFactory.getCharacter(('O'),"font1"));

        row1.add(flyWeightFactory.getCharacter(('W'),"font1"));
        row1.add(flyWeightFactory.getCharacter(('O'),"font2"));
        row1.add(flyWeightFactory.getCharacter(('R'),"font1"));
        row1.add(flyWeightFactory.getCharacter(('L'),"font5"));
        row1.add(flyWeightFactory.getCharacter(('D'),"font1"));
        row1.add(flyWeightFactory.getCharacter(('!'),"font26"));
        row1.add(flyWeightFactory.getCharacter(('!'),"font1"));


        column.draw(glyphContext);



    }
}
