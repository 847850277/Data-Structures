package imp1;


/**
 * @author zhengpeng
 * @date 2021-10-13 11:23
 **/
public class BTreeTest {


    public static void main(String[] args) {

        BTree bTree = new BTree(3);
        //初始化数据
        //{5,13,9,12,16,7,11,23,2,91, 10};	//数据库，只保存了键
        bTree.add(5);
        bTree.add(3);
        bTree.add(9);
        bTree.add(12);
        bTree.add(16);
        bTree.add(7);
        bTree.add(23);
        bTree.add(2);
        bTree.add(91);
        bTree.add(10);
        System.out.println("btee:" + bTree);


    }

}
