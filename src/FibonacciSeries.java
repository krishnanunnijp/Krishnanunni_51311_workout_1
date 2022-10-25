public class FibonacciSeries {
    private int limit;
    private String series;

    FibonacciSeries(int limit) {
        this.limit = limit;
        this.series = generateSeries();
    }

    private int generateNthNum(int limit) {
        if (limit == 0) {
            return 0;
        } else if (limit == 1) {
            return 1;
        } else {
            return generateNthNum(limit - 1) + generateNthNum(limit - 2);
        }
    }

    private String generateSeries() {
        String series = "";
        for (int i = 0; i < this.limit; i++) {
            series = series + " " + generateNthNum(i);
        }
        return series;
    }

    public String getSeries() {
        return series;
    }


}

