import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import utils.Constants;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Nbu {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String data = Constants.jsonData;

        Type type = new TypeToken<ArrayList<CourseModel>>() {
        }.getType();

        ArrayList<CourseModel> courseList = gson.fromJson(data, type);

        for (CourseModel course : courseList) {
            System.out.println("1 " + course.code + " = " + course.cb_price + " so'm");
        }

//        ArrayList<CourseModel> myCourseList = new ArrayList<>();
//        myCourseList.add(new CourseModel("UAE Dirham", "AED", "2978.51", "", "", "02\\/28\\/2023"));
//        myCourseList.add(new CourseModel("UAE Dirham", "AED", "2978.51", "", "", "02\\/28\\/2023"));
//        myCourseList.add(new CourseModel("UAE Dirham", "AED", "2978.51", "", "", "02\\/28\\/2023"));
//        myCourseList.add(new CourseModel("UAE Dirham", "AED", "2978.51", "", "", "02\\/28\\/2023"));
//
//        String json = gson.toJson(myCourseList);
//        System.out.println(json);
    }
}
