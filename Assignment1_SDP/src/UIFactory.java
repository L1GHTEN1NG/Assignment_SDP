//Абстрактный интерфейс UI фабрики
public interface UIFactory {
    //Создание кнопки
    Button createButton();
    //Создание текстого поля
    TextField createTextField();
}