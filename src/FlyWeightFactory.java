import java.util.ArrayList;

/**
 * Created by JUV on 13/12/2018.
 */
public class  FlyWeightFactory {

    private static ArrayList<Character> characterArray;



    public FlyWeightFactory() {
        characterArray = new ArrayList<>();

    }

    public static Row getRow(){
        return new Row();
    }


    public static Column getColumn(){
        return new Column();
    }




    public static GlyphContext getCharacter(char currentChar, String font){

        for (Character character : characterArray) {
            if(character.getChar() == currentChar){
                System.out.print("got instance of character from flyWeights Pool : " + currentChar +"\n");
                return new GlyphContext(character,font);
            }
        }

        Character character = new Character(currentChar);
        characterArray.add(character);
        System.out.print("Created new instance of character : "+ currentChar +"\n");
        return 	new GlyphContext(character,font);
    }


}
