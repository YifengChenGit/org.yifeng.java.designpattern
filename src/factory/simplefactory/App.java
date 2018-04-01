package factory.simplefactory;

public class App {

	public static void main(String[] args) {
		
		for (ChartType chartType : ChartType.values()) {
			System.out.println("Chart Type: " + chartType);
			ChartFactory.createChart(chartType).display();
		}
	}
}
