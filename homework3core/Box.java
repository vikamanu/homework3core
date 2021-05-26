package homework3core;

import java.util.ArrayList;

public class Box<T extends Fruit>{
    private ArrayList box = new ArrayList<>();
    private ArrayList<T> list;
    public Box(){
        this.list = new ArrayList<>();
    }

    public float getWeight(){
        float weight = 0.0f;
        for (T o : list) {
            weight += o.getWeight();
        }
        return weight;
    }
    public boolean compare(Box myBox) {
        if(getWeight() == myBox.getWeight()) return true;
        return false;
    }
    public void pourTo(Box <T>myBox){
        myBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int amount){
        for(int i=0;i<amount;i++){
            box.add(fruit);
        }
    }
    }

