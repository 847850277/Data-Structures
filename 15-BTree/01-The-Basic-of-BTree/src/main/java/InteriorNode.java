import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengpeng
 * @date 2021-10-12 17:46
 * 内部节点
 **/
public class InteriorNode extends Node{

    private List<Integer> listKeys;			//存放查找键
    private List<Integer> listPointers;		//存放指向下一层Node的指针


    public InteriorNode() {
        listKeys = new ArrayList<Integer>();
        listPointers = new ArrayList<Integer>();
        setParentPoint(null);
    }

    //找到Key所在的子节点的块的Id
    public int getChildNodeId(int key){
        int i;
        for(i=0;i<listKeys.size();i++){		//因为listKeys是排好序的，故可以这样寻找子节点的Id
            if(key < listKeys.get(i)){   	//
                break;
            }
        }
        return listPointers.get(i);
    }

    //寻找该块中待插入newKey的位置index
    public int getInsertPosition(int newKey){
        int index;
        for(index=0;index<listKeys.size();index++){
            if(newKey<listKeys.get(index)){
                break;
            }
        }
        return index;
    }






















    public List<Integer> getListKeys() {
        return listKeys;
    }


    public void setListKeys(List<Integer> listKeys) {
        this.listKeys = listKeys;
    }


    public List<Integer> getListPointers() {
        return listPointers;
    }


    public void setListPointers(List<Integer> listPointers) {
        this.listPointers = listPointers;
    }


}