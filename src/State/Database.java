package State;

import util.ConnectionDB;

public class Database implements ConnectionDB{

    private boolean isOpenConnection;
    @Override
    public void closeConnect() {
        System.out.print("Закрыто соединение с базой данных");
        isOpenConnection = false;
    }

    @Override
    public void openConnect() {
        System.out.println("Открыто соединение с базой данных");
        isOpenConnection = true;
    }

    @Override
    public boolean testConnect() {
        System.out.println("Проверить есть ли соединение с базой");
        return isOpenConnection;
    }

    @Override
    public void readIndex() {
        System.out.println("Считать одну запись (строку) по индексу");

    }

    @Override
    public void recordKey() {
        System.out.println("Проверить есть ли запись по такому-то ключу");
    }

    @Override
    public void readOneRecordKey() {
        System.out.println("Считать одну запись по ключу");
    }

    @Override
    public void readSomeDatabase() {
        System.out.println("Считать из базы некоторый набор записей");
    }

    @Override
    public void findNumberDatabase() {
        System.out.println("Узнать количество записей в базе");
    }

    @Override
    public void entryDatabase() {
        System.out.println("Добавить запись в базу");
    }

    @Override
    public void updateValueIndex() {
        System.out.println("Обновить значение записи по индексу");
    }

    @Override
    public void updateEntryContentKey() {
        System.out.println("Обновить содержимое записи по ключу");
    }

}
