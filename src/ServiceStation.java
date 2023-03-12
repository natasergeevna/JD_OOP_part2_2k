public class ServiceStation implements WeServe{
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            weServe(car);
            car.checkEngine();
        } else if (truck != null) {
            weServe(truck);
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            weServe(bicycle);
        }
    }

    @Override
    public void weServe(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }
}
