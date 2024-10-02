//Фабрика светлой темы, которая взаимствует от интерфейса UI фабрики
class LightThemeFactory implements UIFactory {
    //Ее метод создания кнопки
    public Button createButton() {
        return new LightThemeButton();
    }

    //Ее метод создания текстого поля
    public TextField createTextField() {
        return new LightThemeTextField();
    }
}