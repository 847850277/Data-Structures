import lombok.Data;

/**
 * @author zhengpeng
 * @date 2021-10-12 17:43
 **/
@Data
public class Node {

    private int id;					//每个块有一个Id，表示该块的地址，这里模拟Id为树listTreeNode中该节点的下标
    private Integer parentPoint;	//每个块都有一个指向父节点的指针，若该指针为null，则表明该节点为父节点

}
