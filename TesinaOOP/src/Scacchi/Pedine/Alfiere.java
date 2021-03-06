package Scacchi.Pedine;

import Utils.NWbotton;

import javax.imageio.ImageIO;
import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class Alfiere extends PezzoScacchi {
        private final String color;
        private Image img;

    @Override
    public String toString() {
        return "Alfiere";
    }

    public String getColor() {
            return color;
        }

        public Image getImg() {
            return img;
        }

        public Alfiere(String color) {
            this.color = color;
            {
                try {
                    if (color.equalsIgnoreCase("black") )
                        this.img = ImageIO.read(Objects.requireNonNull(Alfiere.class.getResource("/Immagini/AlfiereNero.png")));
                    else
                        this.img= ImageIO.read(Objects.requireNonNull(Alfiere.class.getResource("/Immagini/AlfiereBianco.png")));

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        public ArrayList<Integer> getMoves(Integer I, Map<Integer, NWbotton> griglia) {
            ArrayList<Integer> out = new ArrayList<>();
            int i=I;
            while (i%8!=0 && i/8!=7) // diagonale in basso a SX
            {
                i += 7;
                if(griglia.get(i).getPezzo()!=null) {     //controllo che non ci sia un pezzo
                    break;
                }
                if (I != i)
                    out.add(i);
            }
            if(griglia.get(i).getPezzo()!=null && griglia.get(i).getPezzo().getColor()!=this.color)  //controllo che il pezzo sia avversario o meno e che sia diverso da null
                out.add(i);
            i=I;
            while (i%8!=7 && i/8!=7) //diagonale in basso a dx
            {
                i+=9;
                if((griglia.get(i).getPezzo()!=null))
                {
                    break;
                }
                if(I!=i)
                    out.add(i);
            }
            if(griglia.get(i).getPezzo()!=null && griglia.get(i).getPezzo().getColor()!=this.color)
                  out.add(i);
            i=I;

            while (i%8!=0 && i/8!=0) //diagonale in alto a sx
            {
                i-=9;
                if(griglia.get(i).getPezzo()!=null)  {
                    break;
                }
                if(I!=i)
                    out.add(i);
            }
            if(griglia.get(i).getPezzo()!=null && griglia.get(i).getPezzo().getColor()!=this.color)
                  out.add(i);
            i=I;

            while (i%8!=7 && i/8!=0) //diagonale in alto a dx
            {
                i-=7;
                if(griglia.get(i).getPezzo()!=null)  {
                    break;
                }
                if(I!=i)
                    out.add(i);
            }
            if(griglia.get(i).getPezzo()!=null && griglia.get(i).getPezzo().getColor()!=this.color)
                  out.add(i);


            return out;
        }
    }

