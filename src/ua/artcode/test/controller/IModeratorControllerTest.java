package ua.artcode.test.controller;

import ua.artcode.controler.IModeratorController;
import ua.artcode.controler.IModeratorControllerImp;
import ua.artcode.db.AppDBImpl;
import ua.artcode.db.IAppDB;
import ua.artcode.model.*;

public class IModeratorControllerTest {


    //TODO test
    static IAppDB copyAppDB = new AppDBImpl();
    IModeratorController iModeratorController = new IModeratorControllerImp(copyAppDB);

    public static void main(String[] args) {

        Service service = new Service("Телефония", "настройка телефонной связи");
        copyAppDB.addService(service);

        Service service1 = new Service("Телефония", "настройка телефонной связи");
        copyAppDB.addService(service1);

        Service service2 = new Service("IT", "настройка компьютерной сети");
        copyAppDB.addService(service2);

        Service service3 = new Service("оповещение", "установка оповешение в офисе");
        copyAppDB.addService(service3);

        Moderator moderator = new Moderator("Andrey", "a.webears@gmail.com","2329382","123456", "moderator");

        Company company1 = copyAppDB.addCompany("Рога&Копыта", "Kiev", "descriptionCompany");
        company1.setModerator(moderator);
        company1.addService(service);
        company1.addService(service1);
        //System.out.println(moderator.getServices());        ;

        Company company2 = copyAppDB.addCompany("ЧП Туалет", "Kiev", "новый вид продвинутых компани");
        company2.setModerator(moderator);
        company2.addService(service2);
        company2.addService(service3);

        Worker worker = copyAppDB.addWorker("Rab", "rab@gmail.com", "3049349", "2344", "wewew", "Worker");
        worker.setCompany(company1);

        Worker worker1 = copyAppDB.addWorker("Ivko", "ivko@gmail.com", "34549349", "87844", "Разноробочий", "Worker");
        worker1.setCompany(company1);

        Worker worker2 = copyAppDB.addWorker("Narkosha", "narkosha@gmail.com", "3459349", "78744", "Разноробочий", "Worker");
        worker2.setCompany(company1);

        Client client1 = copyAppDB.addClient("Anya", "anya@gmail.com", "343434", "2783", "client");

        Client client2 = copyAppDB.addClient("Yula", "yulya@gmail.com", "67634", "23423", "client");

        Order order1 = new Order(2, service, client1, "настроить АТС Панасоник");
        Order order2 = new Order(4, service3, client2, "настроить АТС Панасоник");



        //тестирование метода регистрации
        //testRegister(moderator);
        //testAddCompany(company1);
        //testEditCompany(company1);
        //testFindCompany(company1);
        //testRemoveCompany(company);
        //testAddService(company, service);
        //testRemoveService(service3);
        //testChooseService(service1, service2, service3);
        //testCreateWorker(worker);
        //testAddWorkerToCompany(company, worker);
        //testAsignOrderWorker(order, worker);
        //метод нуждается в доработке
        // testGetOwnWorkersInCompany(company, worker1, worker2);
        //testAsignServiceWorker(service, worker1);
        //testAsignServiceWorker(service, worker1);
    }


/*
    static void testRegister(Moderator moderator){

        System.out.println("Проверка метода Moderator register");
        IModeratorController iModeratorControllerImp = new IModeratorControllerImp(copyAppDB);
        // проверка создания обьекта с указанными параметрами
        Moderator excepted = moderator;
        Moderator practical = iModeratorControllerImp.register(moderator.getFullname(), moderator.getEmail(), moderator.getPhone(), moderator.getPass(), moderator.getRole());

        boolean res1 = excepted.getFullname().equals(practical.getFullname()) &&
                excepted.getEmail().equals(practical.getEmail()) &&
                excepted.getPhone().equals(practical.getPhone()) &&
                excepted.getPass().equals(practical.getPass()) &&
                excepted.getRole().equals(practical.getRole());



        // Проверка на указание пустого поля имени, эмейла, телефона, пароля или роли
        Moderator excepted1 = null;
        Moderator pract0 = iModeratorControllerImp.register("","a.webears@gmail.com","2329382","123456", "moderator");
        Moderator pract1 = iModeratorControllerImp.register("Andrey","","2329382","123456", "ssd");
        Moderator pract2 = iModeratorControllerImp.register("Andrey","a.webears@gmail.com","","123456", "moderator");
        Moderator pract3 = iModeratorControllerImp.register("Andrey","a.webears@gmail.com","2329382","", "moderator");
        Moderator pract4 = iModeratorControllerImp.register("Andrey","a.webears@gmail.com","2329382","reree", "");

        boolean res2 = pract0 == null &&
                pract1 == null &&
                pract2 == null &&
                pract3 == null &&
                pract4 == null;

        System.out.printf("Result %s, test %s",
                res1, "metod register\n");
        System.out.printf("Result %s test %s",
                res2, " metod register for empty String parameter\n");
    }

    static void testAddCompany(Company company){
        System.out.println("Проверка метода AddCompany");
        // запись айди тестовой компании
        long id = company.getId();
        // Запись тестовой компании в базу
        Company practical = copyAppDB.addCompany(company);
        // Получение тестовой компании с базы
        Company expected = copyAppDB.getCompany(id);
        //сравнение названий компаний
        boolean res = expected.getNameCompany().equals(practical.getNameCompany());
        // Вывод результата сравнения на экран
        System.out.printf("Result: %s, test: %s, expected: %s, practical: %s\n",
                res, " metod addCompany", expected.toString(), practical.toString());

        //Негативный тест компании
        Company testCompany = null;
        // Запись тестовой компании в базу
        expected = copyAppDB.addCompany(testCompany);
        if(expected==null){
            res = true;
        } else res = false;
        // Вывод результата сравнения на экран
        System.out.printf("Result: %s, test: %s, expected: %s\n",
                res, " for null exception ", expected != null ? expected.toString() : "null");

    }


    static void testEditCompany(Company company1){

        System.out.println("Проверка метода EditCompany");

        IModeratorController iModeratorController = new IModeratorControllerImp(copyAppDB);

        String oldName = company1.getNameCompany();
        long id = company1.getId();

        Company newCompany = iModeratorController.editCompany(company1.getId(), "Bowls");
        boolean res = true;
        if (newCompany != null) {
            res = copyAppDB.getCompany(id).getNameCompany().equals(oldName);
        }
        System.out.printf("Result: %s, test: %s, expected: %s, practical %s\n",
                !res, " metod editCompany", "Bowls", newCompany != null ? newCompany.getNameCompany() : "null");
    }

    static void testFindCompany(Company company){

        System.out.println("Проверка метода FindCompany");

        Company findCompany = copyAppDB.findCompany(company.getNameCompany());

        System.out.printf("Result %s test %s expected %s practical %s\n",
                findCompany == company, " metod finfCompany ", company.getNameCompany(), findCompany != null ? findCompany.getNameCompany(): "null");

    }

    static void testRemoveCompany(Company company){
        IModeratorController iModeratorController = new IModeratorControllerImp(copyAppDB);
        boolean expected = true;
        boolean practical = iModeratorController.removeCompany(company.getId());

        System.out.printf("Result %s test %s expected %s practical %s\n",
                expected == practical, " metod removeCompany", expected, practical);


    }



*/
/*static void testAddService(Company company, Service service){
        IModeratorController iModeratorController = new IModeratorControllerImp(copyAppDB);
        boolean expected = true;
        boolean practical = iModeratorController.addService(company, service);

        System.out.printf("Result %s test %s expected %s practical %s\n",
                expected == practical, " metod addService", expected, practical);

        Service testService = null;
        boolean expected1 = false;
        boolean practical1 = iModeratorController.addService(company.getId(), testService);
        System.out.printf("Result %s test %s expected %s practical %s\n",
                expected1 == practical1, " metod addService for null", expected1, practical1);

    }*//*


    */
/*static void testRemoveService(Service service){
        IModeratorController iModeratorController = new IModeratorControllerImp(copyAppDB);
        String oldName = service.getNameService();
        long id = service.getId();
        // результат метода удаления сервиса
        boolean res1 = iModeratorController.removeService(service.getId());
        boolean res2 = true;
        // проверка удалился ли сервис путем сверки имени по индексу
        if (service != null){
                 if (oldName.equals(service.getNameService())) {
                     res2 = false;
                 }
        }

        boolean res = res1 && res2;

        System.out.printf("Result %s test %s expected %s practical %s\n",
                res, " metod AsignOrderWorker ", "true", res);

    }*//*


    static void testChooseService(Service service1, Service service2, Service service3){
        IModeratorController iModeratorController = new IModeratorControllerImp(copyAppDB);
        Service[] testArray = iModeratorController.chooseService(service1, service2, service3);
        boolean result;
        if (testArray != null) {
            int size = testArray.length;
            boolean[] res = new boolean[size];
            for (int i = 0; i < testArray.length; i++) {
                if (testArray != null) {
                    res[i] = service1.equals(testArray[i]);
                } else res[i] = false;
            }
            result = res[0] &&
                    res[1] &&
                    res[2];

        } else result = false;
        System.out.printf("Result %s test %s expected %s practical %s\n",
                result, " metod chooseservice ", "true", result);
    }


    static void testCreateWorker(User worker){
        IModeratorController iModeratorController = new IModeratorControllerImp(copyAppDB);
        // проверка создания обьекта с указанными параметрами
        User excepted = worker;
        boolean res1;
        User practical = iModeratorController.createWorker(worker.getFullname(), worker.getEmail(), worker.getPhone(), worker.getPass());
        if (practical == null){
            res1 = false;
        } else {
            res1 = excepted.getFullname().equals(practical.getFullname()) &&
                    excepted.getEmail().equals(practical.getEmail()) &&
                    excepted.getPhone().equals(practical.getPhone()) &&
                    excepted.getPass().equals(practical.getPass());
        }


        // Проверка на указание пустого поля имени, эмейла, телефона, пароля или роли
        //User excepted1 = null;
        User pract0 = iModeratorController.createWorker("","a.webears@gmail.com","2329382","123456");
        User pract1 = iModeratorController.createWorker("Andrey","","2329382","123456");
        User pract2 = iModeratorController.createWorker("Andrey","a.webears@gmail.com","","123456");
        User pract3 = iModeratorController.createWorker("Andrey","a.webears@gmail.com","2329382","");

        boolean res2 = pract0 == null &&
                pract1 == null &&
                pract2 == null &&
                pract3 == null;

        System.out.printf("Result %s, test %s",
                res1, "metod createWorker\n");
        System.out.printf("Result %s test %s",
                res2, " metod createWorker for empty String parameter\n");
    }

    static void testAddWorkerToCompany(Company company, User worker){
        IModeratorController iModeratorController = new IModeratorControllerImp(copyAppDB);
        boolean res = iModeratorController.addWorkerToCompany(company.getId(), worker.getId());

        System.out.printf("Result %s test %s expected %s practical %s\n",
                res, " metod AsignOrderWorker ", "true", res);

    }

    static void testAsignOrderWorker(Order order, User worker){
        IModeratorController iModeratorController = new IModeratorControllerImp(copyAppDB);
        Worker workerWithOrder = iModeratorController.asignOrderWorker(order, worker.getId());
        boolean res = false;
        if (workerWithOrder != null) {
            Order[] ordersWorker = new Order[workerWithOrder.getOrders().length];
            ordersWorker = workerWithOrder.getOrders();
            // проверка добавился ли заказ в список заказов работника, путем сверки номера ордера с номерами ордеров что в списке у работника
            for (int i = 0; i < ordersWorker.length; i++) {
                if (ordersWorker[i].getNumberOrder().equals(order.getNumberOrder())){
                    res = true;
                }
            }

        }


        System.out.printf("Result %s test %s expected %s practical %s\n",
                res, " metod AsignOrderWorker ", "true", res);

    }



    // не проверен, нуждается в доработке
   */
/* static void testGetOwnWorkersInCompany(Company company, Worker worker1, Worker worker2){

        Worker [] arrayWorker = new Worker[2];
        arrayWorker = iModeratorController.getOwnWorkersInCompany(company.getId());
        boolean result  = false;
        if (arrayWorker != null){
            boolean [] res = new boolean[arrayWorker.length];
            for (int i = 0; i < arrayWorker.length; i++) {
                res[i] = worker1.equals(arrayWorker[i]);
            }

            result = res [0] &&
                        res [1];

        }

        System.out.printf("Result %s test %s expected %s practical %s\n",
                result, " metod getOwnWorkers ", "true", result);
    }*//*



    static void testAsignServiceWorker(Service service, Worker worker){
        IModeratorController iModeratorController = new IModeratorControllerImp(copyAppDB);
        boolean res = iModeratorController.asignServiceWorker(service, worker);

        // проверка, назначе ли сервису работник
      */
/* boolean res2 = false;
       Service [] testService = worker.getService();
        for (int i = 0; i < testService.length; i++) {
            if (testService.equals(worker.getService())) {
                res2 = true;
                break;
            }
        }*//*


        System.out.printf("Result %s test %s expected %s practical %s\n",
                res, " metod testAsignServiceWorker ", "true", res);

    }
*/


}
