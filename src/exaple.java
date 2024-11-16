public class exaple {

    class  car{
         int speed;
         String nameOfCar , color;
         void Show(){
             System.out.println("Car is Drivingd");
         }
    }

    public  class Main{
        public  void main(String[] args) {
            car mycar = new car();
            mycar.color = "red";
            mycar.speed = 100;
            mycar.nameOfCar = "rangeover ";
            mycar.Show();

        }

    }

}

