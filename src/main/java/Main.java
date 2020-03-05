import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<GroupDTO> listSource = addData();
        List<GroupDTO> sumResult = getListAfterSumChildResult(listSource);
        List<GroupDTO> listTree = createTree(listSource);
        String json = new Gson().toJson(listTree);
        System.out.println(json);
    }

    // Create tree
    public static List<GroupDTO> createTree(List<GroupDTO> listSource) {
        List<GroupDTO> result = new ArrayList<>();
        for (GroupDTO groupDTO : listSource) {
            if (groupDTO.getParent() == null) {
                List<GroupDTO> listChild = addChild(groupDTO, listSource);
                groupDTO.setChild(listChild);

                result.add(groupDTO);
            }
        }
        return result;
    }


    // make child to of  root
    public static List<GroupDTO> addChild(GroupDTO root, List<GroupDTO> listSource) {

        List<GroupDTO> listChild = new ArrayList<>();
        listSource.forEach(p -> {
                    if (p.getParent() == root.getId()) {
                        listChild.add(p);
                    }

                }
        );
        root.setChild(listChild);
        for (GroupDTO child : listChild) {
            addChild(child, listSource);
        }
        return listChild;
    }

    public static List<GroupDTO> getListAfterSumChildResult(List<GroupDTO> listSource) {
        List<GroupDTO> result = new ArrayList<>();
        for (GroupDTO groupDTO : listSource) {
            if (groupDTO.getParent() == null) {
                GroupDTO root = sumForOneRoot(groupDTO, listSource);
                result.add(root);
            }
        }
        return result;
    }

    // sum one root
    public static GroupDTO sumForOneRoot(GroupDTO root, List<GroupDTO> lst) {
        for (GroupDTO groupDTO : lst) {
            if (groupDTO.getParent() != null) {
                if (groupDTO.getParent() == root.getId()) {
                    root.setTotal(sumForOneRoot(groupDTO, lst).getTotal() + root.getTotal() + 1);
                }
            }
        }
        return root;
    }

    public static List<GroupDTO> addData() {
//        Check check = new Check(1l, 0, null);
        GroupDTO check1 = new GroupDTO(1l, 0, null);
        GroupDTO check2 = new GroupDTO(2l, 0, 1l);
        GroupDTO check3 = new GroupDTO(3l, 0, 1l);
        GroupDTO check4 = new GroupDTO(4l, 0, 3l);
        GroupDTO check5 = new GroupDTO(5l, 0, 3l);


        GroupDTO check1s = new GroupDTO(6l, 0, 2l);
        GroupDTO check2s = new GroupDTO(7l, 0, 2l);
        GroupDTO check3s = new GroupDTO(8l, 0, 4l);
        GroupDTO check4s = new GroupDTO(9l, 0, null);
        GroupDTO check5s = new GroupDTO(10l, 0, 9l);


        List<GroupDTO> lstCheck = new ArrayList<GroupDTO>();
//        lstCheck.add(check);
        lstCheck.add(check1);
        lstCheck.add(check2);
        lstCheck.add(check3);
        lstCheck.add(check4);
        lstCheck.add(check5);
//        lstCheck.add(check);
        lstCheck.add(check1s);
        lstCheck.add(check2s);
        lstCheck.add(check3s);
        lstCheck.add(check4s);
        lstCheck.add(check5s);
        return lstCheck;

    }

    // ham de quy de tinh ra check can tinh


}