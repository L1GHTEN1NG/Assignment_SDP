//Еще один вид фильма, в данном случае 3д. Который заимствует у интерфейса муви.
public class TRI_DMovie {
    //Ячейка для тайтла
    private String title;

    //Конструктор для фильма
    public TRI_DMovie(String title) {
        this.title = title;
    }

    //Геттер для вывода тайтла
    public String getTitle() {
        return title;
    }

    //Геттер для вывода типа фильма
    public String getType() {
        return "3D";
    }
}
