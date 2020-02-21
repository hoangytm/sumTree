import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<GroupDTO> lstCheck = addData();
        for (GroupDTO checkVariable : lstCheck) {

            // chi truyen vao node goc, con node con se tu tinh bang de quy
            if (checkVariable.getParent() == null) {

                sum(checkVariable, lstCheck);

                System.out.println("Hello ");
            }
        }
        System.out.println("test");
    }


    public static GroupDTO sum(GroupDTO groupDTO, List<GroupDTO> lst) {
        for (GroupDTO check : lst) {
            if (check.getParent() != null) {
                if (check.getParent() == groupDTO.getId()) {
                    groupDTO.setTotal(sum(check, lst).getTotal() + groupDTO.getTotal() + 1);
                }
            }
        }
        return groupDTO;
    }

    public static List<GroupDTO> addData() {
//        Check check = new Check(1l, 0, null);
        GroupDTO check1 = new GroupDTO(1l, 0, null);
        GroupDTO check2 = new GroupDTO(2l, 0, 1l);
        GroupDTO check3 = new GroupDTO(3l, 0, 2l);
//        Check check4 = new Check(4l, 0, 1l);
        GroupDTO check5 = new GroupDTO(5l, 0, 3l);


        GroupDTO check1s = new GroupDTO(6l, 0, null);
        GroupDTO check2s = new GroupDTO(7l, 0, 5l);
        GroupDTO check3s = new GroupDTO(53l, 0, null);
        GroupDTO check4s = new GroupDTO(71l, 0, null);
        GroupDTO check5s = new GroupDTO(73l, 0, null);


        List<GroupDTO> lstCheck = new ArrayList<GroupDTO>();
//        lstCheck.add(check);
        lstCheck.add(check1);
        lstCheck.add(check2);
        lstCheck.add(check3);
//        lstCheck.add(check4);
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