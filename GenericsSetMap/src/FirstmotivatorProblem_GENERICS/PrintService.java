package FirstmotivatorProblem_GENERICS;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Type> {
    List<Type> list = new ArrayList<>();

    public void addValue(Type value){
        list.add(value);
    }

    public Type fist(){
        if(list.isEmpty()){
            throw new IllegalStateException("List is Empty");
        }
        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("," + list.get(i));
        }
        System.out.print("]");
    }
}
