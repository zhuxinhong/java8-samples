package stream;

/**
 * Created by zhuxh on 16/12/29.
 */
public class User {

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.email = name + "@qiyi.com";
    }

    public User(Integer id, String name, Integer sex) {
        this(id, name);
        this.sex = sex;
    }

    private Integer id;

    private String name;

    private String email;

    private Integer sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
