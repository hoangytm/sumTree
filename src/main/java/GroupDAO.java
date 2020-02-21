/**
 * @author PhanHoang
 * 2/20/2020
 */
public class GroupDAO {
    private  Long id;
    private  int total;
    private Long parent;

    public GroupDAO(Long id, int total, Long parentId) {
        this.id = id;
        this.total = total;
        this.parent = parentId;
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
}
