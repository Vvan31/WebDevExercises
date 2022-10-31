package Lab_6;

import java.util.Collections;

class FindMax <T>{

    T obj;

    public FindMax(T obj){
        this.obj = obj;
    }

    public T getObject(){
        return this.obj;
    }

     public static <T> T array_max(T data[], T n) {
        //body of code
        // Collections.sort(obj);
        n = Collections.max(data);
        return n;
        
    }
}