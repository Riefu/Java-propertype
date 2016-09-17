package actual;

import base.type.Propertype;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Administrator on 2016/9/16.
 */
public class Facotry<T extends Propertype> {


    private  T t;


    public T getInstance(Class<T> tClass) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Method clone = tClass.getMethod("clone", null);
        T instance = (T) clone.invoke(tClass.newInstance(), null);
        return instance;
    }


    public List<T> clone(Class<T>... tClass) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException, ClassNotFoundException {

        List<T> list =new ArrayList<>();

        for (Class<T> tclass2:
             tClass) {
            T instance = this.getInstance(tclass2);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(instance);

            ByteArrayInputStream bai = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream objectInputStream  = new ObjectInputStream(bai);
            list.add((T)objectInputStream.readObject());
        }

        return list;
    }
}
