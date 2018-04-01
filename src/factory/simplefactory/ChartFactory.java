package factory.simplefactory;

import factory.simplefactory.charts.BarChart;
import factory.simplefactory.charts.Chart;
import factory.simplefactory.charts.LineChart;
import factory.simplefactory.charts.PieChart;

public class ChartFactory {

	public static Chart createChart(ChartType chartType) {
		
		if (chartType == null) {
			throw new IllegalArgumentException("Chart type is null");
		}
		
		switch (chartType) {
			case BAR:
				return new BarChart();
			case LINE:
				return new LineChart();
			case PIE:
				return new PieChart();
			default:
				throw new IllegalArgumentException("Illegal chart type: " + chartType);
		}
	}
}
