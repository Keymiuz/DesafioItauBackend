package desafio.itau.springboot.dto;

import java.util.DoubleSummaryStatistics;

public class EstatisticsDto {
    private long count;
    private double avg;
    private double sum;
    private double max;
    private double min;

    public EstatisticsDto(DoubleSummaryStatistics stats){
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.min = stats.getMin();
        this.max = stats.getMax();
    }

    public long getCount() {
        return count;
    }

    public double getAvg() {
        return avg;
    }

    public double getSum() {
        return sum;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }
}