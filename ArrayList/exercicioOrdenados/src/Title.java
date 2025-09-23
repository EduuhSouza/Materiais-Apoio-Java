public class Title implements Comparable<Title>{
    public String name;

    public Title(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Title names) {
        return this.name.compareTo(names.name);
    }
}
