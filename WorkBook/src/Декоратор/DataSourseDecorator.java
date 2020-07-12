package Декоратор;

public class DataSourseDecorator implements DataSourse {

    private DataSourseDecorator wrappee;

    DataSourseDecorator(DataSourse sourse){
        this.wrappee = (DataSourseDecorator) sourse;
    }

    public void writeData(String data) {
        wrappee.writeData(data);
    }

    public String readData() {
        return wrappee.readData();
    }
}
