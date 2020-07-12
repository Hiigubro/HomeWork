package Декоратор;

import java.io.File;

public class FileDataSourse implements DataSourse {
    private String name;

    public FileDataSourse(String name){
        this.name = name;
    }

    @Override
    public void writeData(String data) {
    }

    @Override
    public String readData() {
        return null;
    }
}
