package Patryk.company;

import Patryk.company.builder.House;
import Patryk.company.factory.*;
import Patryk.company.stream.Streams;

public class Main {

    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<Integer>();
//        list1.add(5);
//        list1.add(60);
//        list1.add(10);
//        list1.add(1);
//        list1.add(200);
//        list1.add(22);
//        list1.add(66);
//        list1.add(666);
//        list1.add(555);
//        list1.add(92);
//        list1.add(15);
//        list1.add(20);
//        list1.add(20);
//        list1.add(20);
//        list1.add(50);
//
//        list1.sort(Comparator.naturalOrder());
//
//        for (Integer int1:list1){
//            System.out.println(int1);
//        }

//        CodingBat codingBat = new CodingBat("catxxdogxxxdog");
//
//        System.out.println("dfbdf"+20+20);
//        System.out.println(20+20+"fbfdbd");

//        a classsss = new b();
//        b calzxcxzc = new b();
////
//        System.out.println(classsss.getName());
//        System.out.println(calzxcxzc.getName());

//        Fibonacci fibonacci = new Fibonacci();
//        System.out.println(fibonacci.tribonacci(8));
//
//        String pin = "";
//        for (int i=0; i< 20; i++){
//            pin = pin + Math.random();
//        }
//
//        System.out.println(pin);

        char numb = (int) '6';

//        MakingAnagrams makingAnagrams = new MakingAnagrams();
//        System.out.println(makingAnagrams.makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
//        System.out.println(makingAnagrams.makeAnagram("cde", "abc"));


//        MinAbsoluteDiff minAbsoluteDiff = new MinAbsoluteDiff();
//        List<Integer> newList = new ArrayList<>();
//        newList.add(3);
//        newList.add(-7);
//        newList.add(0);
//        System.out.println(minAbsoluteDiff.minimumAbsoluteDifference(newList));

//        Car car1 = new AirConditioning(new i20(new BasicCar()));
//        Car car2 = new AirConditioning(new i30(new BasicCar()));
//
//        System.out.println(car1.price() + " " + car1.description());
//
//        System.out.println(car2.price() + " " + car2.description());


//        MakingAnagrams makingAnagrams = new MakingAnagrams();
//        System.out.println(makingAnagrams.makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));

//        ReverseList reverseList = new ReverseList();
//
//        List<Integer> listaaa = new ArrayList<>();
//        listaaa.add(1);
//        listaaa.add(4);
//        listaaa.add(3);
//        listaaa.add(2);
//
//        for(int i : reverseList.reverseListMethod(listaaa)){
//            System.out.println(i + " ");
//        }

//        List<Integer> listaaa = new ArrayList<>();
//        listaaa.add(1);
//        listaaa.add(2);
//        listaaa.add(3);
//        listaaa.add(4);
//        listaaa.add(5);
//
//        LeftRotation leftRotation = new LeftRotation();
//
//        for (int i : leftRotation.rotateLeft(4,listaaa)){
//            System.out.print(i + ", ");
//        }

//        FlippingBits flippingBits = new FlippingBits();
//
////        System.out.println(flippingBits.flippingBits(3));
//        System.out.println(flippingBits.flippingBits(2147483647L));
//        System.out.println();
//        System.out.println(flippingBits.flippingBits(1L));
//        System.out.println();
//        System.out.println(flippingBits.flippingBits(0L));



//        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);
//
//        TextMessage textMessage = new TextMessage();
//        MobileAPP mobileAPP = new MobileAPP();
//        Email email = new Email();
//
//        order.registerObserver(textMessage);
//        order.registerObserver(mobileAPP);
//        order.registerObserver(email);
//        order.notifyObserver();
//        System.out.println("--------------------------------");
//        order.changeOrderStatus(OrderStatus.WYSLANE);
//        System.out.println("--------------------------------");
//        order.unregisterObserver(email);
//        order.changeOrderStatus(OrderStatus.ODEBRANE);
//        System.out.println("--------------------------------");
//        order.registerObserver(email);
//        order.notifyObserver();


//        GameEngine engine = GameEngine.getInstance();
//        GameEngine engine1 = GameEngine.getInstance();
//
//        System.out.println(engine==engine1);
//
//        System.out.println(new Long(42).equals(42L));

//        MaxSum maxSum = new MaxSum();
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(5);
//        list.add(9);
//        list.add(7);
//        list.add(11);
//        System.out.println(maxSum.findMaxSum(list));


//        Hobbies hobbies = new Hobbies();
//        hobbies.add("Steve", "Fashion", "Piano", "Reading");
//        hobbies.add("Patty", "Drama", "Magic", "Pets");
//        hobbies.add("Chad", "Puzzles", "Pets", "Yoga");
//
//        System.out.println(Arrays.toString(hobbies.findAllHobbyists("Yoga").toArray()));


//        House house = new House("walls", "floors", "rooms", "roof", "windows", "doors");
        House house = new House.HouseBuilder()
                .buildWalls("waal")
                .buildFloors("floo")
                .buildRoof("roof")
                .buildDoors("doo")
                .buildWindows("win")
                .build();

        System.out.println(house);



        Factory factory = new UnitFactory();
        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);

        System.out.println("---------------------------");
        new Streams().namesPrinterStreams();
        System.out.println("---------------------------");

    }
}
