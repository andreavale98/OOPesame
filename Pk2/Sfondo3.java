package Pk2;

import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.Map;


public class Sfondo3 extends PezzoScacchi{


    {
        try {
            this.img = ImageIO.read(Pedone.class.getResource("../Immagini/Sfondo3.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public ArrayList<Integer> getMoves(Integer I, Map<Integer, NWbotton> griglia) {
        return null;
    }
}
