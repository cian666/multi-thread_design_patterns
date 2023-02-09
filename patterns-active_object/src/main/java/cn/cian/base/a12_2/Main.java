package cn.cian.base.a12_2;

import cn.cian.base.a12_2.activeObject.ActiveObject;
import cn.cian.base.a12_2.activeObject.ActiveObjectFactory;

public class Main {
    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new AddClientThread("Add", activeObject).start();
        new MakerClientThread("Maker", activeObject).start();
        new DisplayClientThread("Display", activeObject).start();
    }
}
