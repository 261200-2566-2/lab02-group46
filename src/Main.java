public class Main {
    public static void main(String[] args) {

        AirPurifier A = new AirPurifier();
        A.setBrand("Mixiao");
        A.setModel("DEZ13579");
        A.setColor("White");
        A.setFilter_type("cotton");
        A.setFilter_life(100);
        A.turnOn();
        A.setMode("high");
        A.display();
        System.out.println(AirPurifier.getModelCount());
        System.out.println(AirPurifier.mostPopularModel());

    }
}

//อธิบายฟังก์ชันบางส่วนเพิ่มเติม
//เมื่อทำการturnOn จะทำการสุ่มตัวเลข Airquality เป็นการจำลองการวัดคุณภาพอากาศณขณะนั้น
//แต่เมื่อทำการturnOff ค่า Airqualtity เป็น 0
//เมื่อทำการถามหาค่าModelCountจะทำการสุ่มเลขModelCountให้
//การsetMode ได้ 4 แบบ low medium high off
//--------------อ้างอิง---------------------
//ได้มีการอ้างอิงโค้ดจากslide lec02
//ได้แนวไอเดียบางส่วนมาจาก ChatGPT ในการออกแบบแต่มีการนำมาปรับให้เป็นโค้ดตัวเอง