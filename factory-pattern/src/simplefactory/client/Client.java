package simplefactory.client;

import simplefactory.factory.ChartFactory;
import simplefactory.itfc.Chart;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("piechart");
        chart.display();
    }
}
