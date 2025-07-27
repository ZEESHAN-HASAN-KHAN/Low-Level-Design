import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String id;
    private String name;
    private List<SplitBill> splitBillList;
    private Group groups;

    public User(String id, String name) {
        this.id = "USER"+ UUID.randomUUID().toString();
        this.name = name;
        this.splitBillList=new ArrayList<>();
        this.groups=null;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SplitBill> getSplitBillList() {
        return splitBillList;
    }

    public void setSplitBillList(List<SplitBill> splitBillList) {
        this.splitBillList = splitBillList;
    }

    public Group getGroups() {
        return groups;
    }

    public void setGroups(Group groups) {
        this.groups = groups;
    }
}
