package net.braniumacademy.ex624;

public class Smartphone implements Comparable<Smartphone> {
    private String id;
    private String brand;
    private String name;
    private float price;
    private int year;
    private String screenSize;

    public Smartphone() {
    }

    public Smartphone(String id, String brand, String name,
                      float price, int year, String screenSize)
            throws InvalidBrandNameException {
        this.id = id;
        this.setBrand(brand);
        this.name = name;
        this.price = price;
        this.year = year;
        this.screenSize = screenSize;
    }

    // sắp xếp theo mã thiết bị tăng dần
    @Override
    public int compareTo(Smartphone other) {
        return id.compareTo(other.id);
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) throws InvalidBrandNameException {
        if (checkBrandOK(brand)) {
            this.brand = brand;
        } else {
            this.brand = null;
            var msg = "Tên hãng không hợp lệ: " + brand;
            throw new InvalidBrandNameException(msg, brand);
        }
    }

    /**
     * kiểm tra xem tên hãng có trùng với danh sách cho trước hay không
     *
     * @param brand tên hãng nhập vào
     * @return true nếu tên hãng khớp với một hãng cho trước và false nếu
     * tên hãng không trùng với hãng cho trước nào
     */
    private boolean checkBrandOK(String brand) {
        String[] brands = {"apple", "samsung", "huawei",
                "xiaomi", "oppo", "vsmart"};
        for (var item : brands) {
            if (brand.toLowerCase().compareTo(item) == 0) {
                return true;
            }
        }
        return false; // hãng k hợp lệ
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final float getPrice() {
        return price;
    }

    public final void setPrice(float price) {
        this.price = price;
    }

    public final int getYear() {
        return year;
    }

    public final void setYear(int year) {
        this.year = year;
    }

    public final String getScreenSize() {
        return screenSize;
    }

    public final void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
