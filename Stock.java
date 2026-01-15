public class Stock{

    private String name;
    private double price;
    private double trend; //trend(going up or down)
    private double stability; //small "peaks"

    //bounding the price into certain range
    private double max;
    private double min;
    private double maxBound;
    private double minBound;

    public Stock(String name, double price, double trend, double stability, double max, double min, double maxBound,
            double minBound) {
        this.name = name;
        this.price = price;
        this.trend = trend;
        this.stability = stability;
        this.max = max;
        this.min = min;
        this.maxBound = maxBound;
        this.minBound = minBound;
    }

    static double random(double l,double r)
    {
        return l+(r-l)*Math.random();
    }

    public void update()
    {
        double newPrice=price;
        if(price>=max||price>maxBound&&Math.random()<(price-maxBound)/(max-maxBound)){
            trend-=(price-maxBound)/(max-maxBound)*Math.random()*trend;
        }
        else if(price<=min||price<minBound&&Math.random()<(minBound-price)/(minBound-min)){
            trend+=(minBound-price)/(minBound-min)*Math.random()*trend;
        }
        newPrice+=Math.random()*trend;
        newPrice+=random(-1,1)*stability;
        price=newPrice;
    }

    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
}