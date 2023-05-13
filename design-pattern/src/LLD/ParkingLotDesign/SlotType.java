package LLD.ParkingLotDesign;

public enum SlotType {
    SMALL {
        public int getPriceForParking() {
            return price;
        }
        public void setPriceForParking(int price) {
            this.price = price;
        }
    }, 
    COMPACT {
        public int getPriceForParking() {
            return price;
        }
        public void setPriceForParking(int price) {
            this.price = price;
        }
    }, 
    MEDIUM {
        public int getPriceForParking() {
            return price;
        }
        public void setPriceForParking(int price) {
            this.price = price;
        }
    },LARGE {
        public int getPriceForParking() {
            return price;
        }
        public void setPriceForParking(int price) {
            this.price = price;
        }
    };
    protected int price;
    public abstract int getPriceForParking();
    public abstract void setPriceForParking(int price);
}
