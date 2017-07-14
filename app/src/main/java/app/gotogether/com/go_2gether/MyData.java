package app.gotogether.com.go_2gether;

/**
 * Created by user on 2017-07-14.
 */

// 팀원목록 임시 리스트뷰

public class MyData {

    private String num;
    private String name;

    public MyData(String num, String name) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String phone) {
        this.num = num;
    }

}
