package Pk2;

import java.util.ArrayList;
import java.util.Map;

public abstract class PezzoDama extends PezzoScacchi{

    public abstract ArrayList<Integer> getMoves(Map<Integer, Damabotton> griglia, Integer I);
    public abstract ArrayList<Integer> getMoreMoves(Integer i, Map<Integer, Damabotton> griglia);

}
