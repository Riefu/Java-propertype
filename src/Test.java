import actual.Facotry;
import actual.FunctionInterface;
import base.type.Propertype;
import child.type.ChildType1;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by Administrator on 2016/9/16.
 */
public class Test {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {

        Facotry facotry = new Facotry();
        List<Propertype> clone = facotry.clone(ChildType1.class, ChildType1.class, ChildType1.class);
        FunctionInterface<Propertype> function =Propertype::doSomeThing;
        clone.forEach(entity->{
            function.test(entity);
        });
    }
}
