import java.util.List;

/**
 * @author PhanHoang
 * 2/20/2020
 */
public class GroupDTO {
    private  Long id;
    private  int total;
    private Long parent;
    private List<GroupDTO> child;

    public GroupDTO(Long id, int total, Long parentId) {
        this.id = id;
        this.total = total;
        this.parent = parentId;
    }
    public GroupDTO(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public List<GroupDTO> getChild() {
        return child;
    }

    public void setChild(List<GroupDTO> child) {
        this.child = child;
    }
}
