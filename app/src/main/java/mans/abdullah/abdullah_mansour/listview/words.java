package mans.abdullah.abdullah_mansour.listview;

// java class with data that i want to display in list item
public class words {
    private String name,desc;

    public words(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
