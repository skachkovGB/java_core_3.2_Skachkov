package lesson05_homework;

public class AppData {

        private String[] header;
        private int[][] data;

    public void setData(int[][] data) {
        this.data = data;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public String[] getHeader() {
        return header;
    }
}
