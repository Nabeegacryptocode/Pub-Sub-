package tryObserver;

class Customer extends Observer{
    Customer(Store store,String name){
        this.store = store;
        this.name = name;


    }
    void register(Observer o){
        this.store.register( o);
    }
    void unregister(Observer o ){
        this.store.unregister(o);
    }

    @Override
    public void update(float discount) {
        store.discount = discount;
        System.out.println(name + " your discount at  "+ store.name +" is " +  + discount);

    }

}
class main {
    public static void main (String args []){
        Store store1 = new Store("Macys",7);
        Store store2 = new Store("Claires",98 );

        Customer cust1 = new Customer(store1, "Dave");
        Customer cust2 = new Customer(store2,"kwame");

        store1.register(cust1);
        store2.register(cust2);
        cust1.update(6);
    }
}


