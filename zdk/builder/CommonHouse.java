package zdk.builder;

public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        house.setBasic("5m");
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        house.setWall("20cm");
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        house.setRoofed("20cm");
        System.out.println("普通房子封屋顶");
    }
}
