//Фабрика темной темы, которая взаимствует от интерфейса UI фабрики
class DarkThemeFactory implements UIFactory {
    //Ее метод создания кнопки
    public Button createButton() {
        return new DarkThemeButton();
    }

    //Ее метод создания текстого поля
    public TextField createTextField() {
        return new DarkThemeTextField();
    }
}