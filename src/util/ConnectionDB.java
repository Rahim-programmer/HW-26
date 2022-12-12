package util;

public interface ConnectionDB {
    void closeConnect();
    void openConnect();
    void testConnect();
    void readIndex();
    void recordKey();
    void readOneRecordKey();
    void readSomeDatabase();
    void findNumberDatabase();
    void entryDatabase();
    void updateValueIndex();
    void updateEntryContentKey();
}
