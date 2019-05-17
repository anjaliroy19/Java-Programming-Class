//calculate cost of carpet
public class RoomCarpet {

    private RoomDimension roomDimensions;
    private double costOfCarpet;

    public RoomCarpet(RoomDimension roomDimensions, double costOfCarpet) {
        super();
        this.roomDimensions = roomDimensions;
        this.costOfCarpet = costOfCarpet;
    }
    //get the entire cost of the carpet 
    public double getTotalCost() {
        return costOfCarpet * roomDimensions.getArea();
    }

    public String toString() {
        return "RoomCarpet [roomDimensions=" + roomDimensions
                + ", costOfCarpet=" + costOfCarpet + ", "
                        + "total cost=" + getTotalCost() + "]";
    }

}