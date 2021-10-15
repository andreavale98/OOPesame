package Pk2;

import javax.imageio.ImageIO;
import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

public class Pedone extends PezzoScacchi{

    private String color;
    private Image img;


    public Pedone(String color) {
        this.color = color;
        {
            try {
                if(this.color=="white") {
                    this.img = ImageIO.read(Pedone.class.getResource("../immagini_scacchi/PedoneBianco.png"));
                }
                else {
                    this.img = ImageIO.read(Pedone.class.getResource("../immagini_scacchi/PedoneNero.png"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Image getImg() {
        return img;
    }

    public String getColor() {
        return color;
    }



    @Override
    public ArrayList<Integer> getMoves(Integer I, Map<Integer, NWbotton> griglia) {
        ArrayList<Integer> out=new ArrayList<Integer>();
        if(this.color=="black"){
            out.add(I+8);
        }
        if(this.color=="white"){
            out.add(I-8);
        }
     /*   int h=0;
        for(Integer i: out){
            if(out.get(h)<0||out.get(h)>63){
                out.remove(h);
            }da controllare
        }*/
        return out;
    }
}