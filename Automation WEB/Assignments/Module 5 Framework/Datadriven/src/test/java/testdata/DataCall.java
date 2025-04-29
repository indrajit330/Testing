package testdata;

public class DataCall {
	public static void main(String[] args) {
		ExcellReader e  = new ExcellReader("D:\\data.xlsx", "Sheet1");
		int row = e.rowCount();
		int col = e.colCount();
		String data = e.getData(row, col);
		System.out.println(data);
	}
}
