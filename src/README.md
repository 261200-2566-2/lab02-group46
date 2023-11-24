### instance variables
- private String brand;
- private String model;
- private String color;
- private String filter_type;
- private String power;
- private int filter_life;
- private int airquality;

### instance methods
- public public void turnOn() {power = "on";}
    - print เปิด
- public void turnOff() {power = "off";}
    - print ปิด
- private void generateRandomAirquality()
    - สุ่มค่า Airquality
- private int generateRandomModelCount()
    - สุ่มค่า ModelCount
- public void display()
    - print ข้อความแสดงผลบนหน้าจอ
- public void setMode(String mode)
    - ตั้งค่าโหมด "Low", "Medium", "High"
- public void setBrand(String brand)
    - set ชื่อ brand
- public void setModel(String model)
    - set ชื่อ model
- public void setColor(String color)
    - set สี
- public void setFilter_type(String filter_type)
    - set ชนิดของที่กรอง
- public void setFilter_life(int filter_life)
    - set อายุการใช้งานของที่กรอง


### class variables
- private static int modelCount;

### class methods
- public static int getModelCount()
    - คืนค่า modelCount
- public static String mostPopularModel()
    - คืนค่า model ยอดนิยม