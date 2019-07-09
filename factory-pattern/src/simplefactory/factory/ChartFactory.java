package simplefactory.factory;

import simplefactory.impl.HistogramChart;
import simplefactory.impl.LineChart;
import simplefactory.impl.PieChart;
import simplefactory.itfc.Chart;

/**
 * 图表工厂类
 */
public class ChartFactory {
    /**
     * 静态工厂方法
     *
     * @param arg 参数
     * @return 具体图表类
     */
    public static Chart getChart(String arg) {
        Chart chart = null;
        if (arg.equalsIgnoreCase("histogramchart")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图");
        } else if (arg.equalsIgnoreCase("piechart")) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图");
        } else if (arg.equalsIgnoreCase("linechart")) {
            chart = new LineChart();
            System.out.println("初始化设置折线图");
        }
        return chart;
    }
}
