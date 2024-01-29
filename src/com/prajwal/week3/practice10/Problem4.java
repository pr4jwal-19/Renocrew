package com.prajwal.week3.practice10;

class EkClass{
    int ekVariable;
    int dusraVariable;

    // one way of doing it
    public EkClass(int ekAlagNaamKaVariable) {
        ekVariable = ekAlagNaamKaVariable;
    }
    // another way of doing using this keyword
    public EkClass(int ekVariable,int dusraVariable){
        this.ekVariable = ekVariable;
        this.dusraVariable = dusraVariable;
    }

    public int getEkVariable() {
        return ekVariable;
    }

    public int getDusraVariable() {
        return dusraVariable;
    }
}
class DusraClass extends EkClass{
    int teesraVariable;
    // yaha pe error aayega kyu ki ye by default uske
    // parent class ke default constructor ko call karega jo ki hai hi nahi
    // isliye super keyword use karegee
    public DusraClass(int teesraVariable){
        super(teesraVariable);
        this.teesraVariable = teesraVariable;
    }

    public int getTeesraVariable() {
        return teesraVariable;
    }
}
public class Problem4 {
    public static void main(String[] args) {
        EkClass ekClass = new EkClass(12,23);
        System.out.println("Pahile variable ki value: "
                +ekClass.getEkVariable()+"\nDusre variable ki value: "
                + ekClass.getDusraVariable());
        DusraClass dc = new DusraClass(34);
        System.out.println("Teesre variable ki value: "+dc.getTeesraVariable());
    }
}
