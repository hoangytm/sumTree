import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<GroupDAO> lstCheck = addData();

//        List<GroupDAO> consts = lstCheck.stream().skip(0).collect(Collectors.toList());
//        List<GroupDAO> result = lstCheck.stream().skip(0).collect(Collectors.toList());




        for (GroupDAO checkVariable : lstCheck) {
            if (checkVariable.getParent() == null) {

                sum(checkVariable, lstCheck);

                System.out.println("Hello ");
            }
        }
        System.out.println("test");
    }

    public static GroupDAO sum(GroupDAO groupDAO, List<GroupDAO> lst) {
        for (GroupDAO check : lst) {
            if (check.getParent() != null) {
                if (check.getParent() == groupDAO.getId()) {
                    groupDAO.setTotal(sum(check, lst).getTotal() + groupDAO.getTotal() + 1);
                }
            }
        }
        return groupDAO;
    }

    public static List<GroupDAO> addData() {
//        Check check = new Check(1l, 0, null);
        GroupDAO check1 = new GroupDAO(1l, 0, null);
        GroupDAO check2 = new GroupDAO(2l, 0, 1l);
        GroupDAO check3 = new GroupDAO(3l, 0, 2l);
//        Check check4 = new Check(4l, 0, 1l);
        GroupDAO check5 = new GroupDAO(5l, 0, 3l);


        GroupDAO check1s = new GroupDAO(6l, 0, null);
        GroupDAO check2s = new GroupDAO(7l, 0, 5l);
        GroupDAO check3s = new GroupDAO(53l, 0, null);
        GroupDAO check4s = new GroupDAO(71l, 0, null);
        GroupDAO check5s = new GroupDAO(73l, 0, null);


        List<GroupDAO> lstCheck = new ArrayList<GroupDAO>();
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