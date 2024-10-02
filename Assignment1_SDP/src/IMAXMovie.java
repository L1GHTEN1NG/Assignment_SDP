//Еще один вид фильма, в данном случае аймакс. Который заимствует у интерфейса муви.
class IMAXMovie implements Movie {
    //Ячейка для тайтла
    private String title;

    //Конструктор для фильма
    public IMAXMovie(String title) {
        this.title = title;
    }

    //Геттер для вывода тайтла
    public String getTitle() {
        return title;
    }

    //Геттер для вывода типа фильма
    public String getType() {
        return "IMAX";
    }
}