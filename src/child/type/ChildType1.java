package child.type;

import base.type.Propertype;

/**
 * @Auther:Riefu
 * @Time:2016-09-16
 */
public class ChildType1 implements Propertype {


    private  Thread thread;

    @Override
    public Propertype clone() {
        Propertype instance = new ChildType1();
        return instance;
    }

    @Override
    public void doSomeThing() {
        System.out.println(this.getClass());
    }
}
