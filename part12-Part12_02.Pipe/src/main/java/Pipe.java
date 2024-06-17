import java.util.ArrayList;

public class Pipe<T> {
    ArrayList<T> t;

    public Pipe() {
        this.t = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        t.add(value);
    }

    public T takeFromPipe(){
            if (t.isEmpty()){
                return null;
    }
            T val = this.t.get(0);
            this.t.remove(0);
            return val;

    }

    public boolean isInPipe(){
        if(t.isEmpty()){
            return false;
        }
        return true;
    }

}
