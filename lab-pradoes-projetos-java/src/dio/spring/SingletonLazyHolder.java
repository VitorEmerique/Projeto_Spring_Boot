package dio.spring;

public class SingletonLazyHolder {
    private  static  class IntanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }


    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return IntanceHolder.instancia;
    }
}
